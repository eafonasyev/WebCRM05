package com.eafonasyev.springvpourse.dao;
import com.eafonasyev.springvpourse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
public class CustomersDaoImpl implements  CustomersDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        //get current hibernate session
        Session session = sessionFactory.getCurrentSession();
        //create query
        Query<Customer> query = session.createQuery("from Customer",Customer.class);
        //execute query abd get result
        List<Customer> customers = query.getResultList();
        return customers;

    }
}
