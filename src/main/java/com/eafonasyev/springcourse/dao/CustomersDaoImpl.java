package com.eafonasyev.springcourse.dao;
import com.eafonasyev.springcourse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomersDaoImpl implements  CustomersDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void deleteCustomer(int id) {
        //get current session
        Session session = sessionFactory.getCurrentSession();
//        Customer customer = session.get(Customer.class,id);
//        session.delete(customer);
        //create query and delete
        Query query = session.createQuery("delete from Customer where id = :customerId");
                query.setParameter("customerId",id);
                query.executeUpdate();
    }

    @Override
    public void saveCustomer(Customer customer) {

        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(customer);
    }

    @Override
    public List<Customer> getCustomers() {
        //get current hibernate session
        Session session = sessionFactory.getCurrentSession();
        //create query
        Query<Customer> query = session.createQuery("from Customer order by lastName",Customer.class);
        //execute query abd get result
        List<Customer> customers = query.getResultList();
        return customers;

    }

    @Override
    public Customer getCustomer(int id) {
        Session session = sessionFactory.getCurrentSession();
        Customer customer = session.get(Customer.class,id);
        return customer;
    }

}
