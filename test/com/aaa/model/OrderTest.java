package com.aaa.model;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.aaa.util.HibernateSessionFactory;


public class OrderTest {
	private Session session = null;
	
	@Test
	public void testWhere1(){
		String hql = " from Orderform o where o.orderitems is not empty ";
		Query query = session.createQuery(hql);
		List<Orderform> orders = query.list();
		
		for(Orderform order : orders){
			System.out.println(order.getCustomer().getName());
			System.out.println(order.getAmount());
			System.out.println(order.getTradedate());
		}
	}

	@Before
	public void setUp() throws Exception {
		session = HibernateSessionFactory.getSession();
	}

	@After
	public void tearDown() throws Exception {
		session.close();
	}

}
