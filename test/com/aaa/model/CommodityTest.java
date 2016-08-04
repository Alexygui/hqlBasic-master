package com.aaa.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.aaa.util.HibernateSessionFactory;

public class CommodityTest {
	private Session session = null;

	@Test
	public void myTest1() {
		String hqlString = "select new List(c.name, c.price, c.seller, c.category) from Commodity as c  where c.price > 10 and c.category like '%书%' order by c.seller asc, c.price desc, c.name asc";
		//  
		Query query = session.createQuery(hqlString);
		List<List> lists = query.list();
		for(List list : lists){
			System.out.println(list.get(0));
			System.out.println(list.get(1));
			System.out.println(((Seller)list.get(2)).getName());
			System.out.println(list.get(3));
		}
	}

	@Test
	public void testOrderby() {
		String hql = " from Commodity order by seller.id asc,price desc,name asc  ";
		Query query = session.createQuery(hql);
		List<Commodity> commodities = query.list();

		for (Commodity c : commodities) {
			System.out.println("name:" + c.getName());
			System.out.println("seller: " + c.getSeller().getId());
			System.out.println("price:" + c.getPrice());
			System.out.println("seller: " + c.getSeller().getName());
		}
	}

	@Test
	public void testWhere4() {
		String hql = " from Commodity c where c.price*5>3000 ";
		Query query = session.createQuery(hql);
		List<Commodity> commodities = query.list();

		for (Commodity c : commodities) {
			System.out.println("name:" + c.getName());
			System.out.println("price:" + c.getPrice() * 5);
		}
	}

	@Test
	public void testWhere3() {
		String hql = " from Commodity c where c.price<200 or c.price>3000 ";
		Query query = session.createQuery(hql);
		List<Commodity> commodities = query.list();

		for (Commodity c : commodities) {
			System.out.println("name:" + c.getName());
			System.out.println("price:" + c.getPrice());
		}
	}

	@Test
	public void testWhere2() {
		String hql = " from Commodity c where c.price between 100 and 5000 or c.category like '%脑%' or name like '%脑%' ";
		Query query = session.createQuery(hql);
		List<Commodity> commodities = query.list();

		for (Commodity c : commodities) {
			System.out.println("name:" + c.getName());
			System.out.println("category:" + c.getCategory());
			System.out.println("price:" + c.getPrice());
		}
	}

	@Test
	public void testWhere1() {
		String hql = " from Commodity c where c.price > 400 ";
		Query query = session.createQuery(hql);
		List<Commodity> commodities = query.list();

		for (Commodity c : commodities) {
			System.out.println("name:" + c.getName());
			System.out.println("price:" + c.getPrice());
		}
	}

	@Test
	public void testFromClause() {
		String hql = " from Commodity ";

		Query query = session.createQuery(hql);
		List<Commodity> commodities = query.list();

		for (Commodity c : commodities) {
			System.out.println("name:" + c.getName());
			// hibernate默认使用lazy懒加载状态，需要查询的的时候才查询外键
			System.out.println("seller's name :" + c.getSeller().getName());
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
