package com.aaa.model;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.aaa.util.HibernateSessionFactory;


public class SellerTest {
	private Session session = null;
	
	@Test
	public void testSelectClauseSelf(){
		String hqlString = "select new Seller(s.name, s.tel, s.address) from Seller as s";
		Query query = session.createQuery(hqlString);
		List<Seller> sellers = query.list();
		for(Seller aSeller : sellers) {
			System.out.println(aSeller.getName());
			System.out.println(aSeller.getTel());
			System.out.println(aSeller.getAddress());
		}
	}
	
	@Test
	public void testSelectClauseMap(){
		String hql = "select new Map(s.name as name, s.tel as tel, s.address as address) from Seller as s";
		Query query = session.createQuery(hql);
		List<Map> maps = query.list();
		for(Map map : maps){
			System.out.println(map.get("name"));
			System.out.println(map.get("tel"));
			System.out.println(map.get("address"));
		}
	}
	
	/**
	 * 用list保存seller的name, tel, address
	 */
	@Test
	public void testSelectClauseList(){
		//"Seller"的"S"要大写，这指的不是sql表中的seller表，而是Seller.java中的类
		String hql = " select new List(s.name,s.tel,s.address) from Seller s ";
		Query query = session.createQuery(hql);
		List<List> lists = query.list();
		for(List list : lists) {
			System.out.println("name: " + list.get(0));
			System.out.println("name: " + list.get(1));
			System.out.println("name: " + list.get(2));
		}
	}
	
	/*
	 * 1.name 2.tel 3.address 4.star
	 */
	@Test
	public void testSelectClauseObjectArray(){
		String hql = " select s.name, s.tel, s.address, s.star from Seller s ";
		
		Query query = session.createQuery(hql);
		
		List<Object[]> list = query.list();
		
		for(Object[] objs : list){
			System.out.println("name:"+objs[0]);
			System.out.println("tel:"+objs[1]);
			System.out.println("address:"+objs[2]);
			System.out.println("star:"+objs[3]);
		}
	}
	
	@Test
	public void testFromClause(){
		String hql = " from Seller  as seller ";
		
		Query query = session.createQuery(hql);
		
		List<Seller> sellers = query.list();
		for(Seller seller : sellers){
			System.out.println("name:"+seller.getName());
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
