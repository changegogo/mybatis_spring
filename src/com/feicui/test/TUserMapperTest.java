package com.feicui.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.feicui.mapper.ItemsMapper;
import com.feicui.mapper.TUserMapper;
import com.feicui.po.Items;
import com.feicui.po.TUser;
import com.feicui.po.TUserExample;
import com.feicui.po.TUserExample.Criteria;

public class TUserMapperTest {
	private ApplicationContext applicationContext;
	private TUserMapper tUserMapper;
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		tUserMapper = (TUserMapper) applicationContext.getBean("TUserMapper");
	}

	@Test
	public void testCountByExample() {
	}

	@Test
	public void testDeleteByExample() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		// 插入具有所有表字段的记录
		TUser tUser = new TUser();
		tUser.setUid(12);
		tUser.setUsername("代立旺");
		tUser.setPassword("455666");
		tUser.setTime(new Date());
		tUserMapper.insert(tUser);
	}

	@Test
	public void testInsertSelective() {
		// 插入具有若干表字段的记录
		TUser tUser = new TUser();
		tUser.setUsername("高丽君");
		tUserMapper.insertSelective(tUser);
	}

	@Test
	public void testSelectByExample() {
		// 自定义条件查询
		TUserExample tUserExample = new TUserExample();
		Criteria criteria = tUserExample.createCriteria();
		List<String> values = new ArrayList<String>();
		values.add("新数据");
		values.add("戴立");
		criteria.andUsernameIn(values);
		List<TUser> list = tUserMapper.selectByExample(tUserExample);
		System.out.println(list);
	}

	@Test
	public void testSelectByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByExampleSelective() {
		TUser tUser = new TUser();
		tUser.setPassword("wwwwwwwwww");
		TUserExample tUserExample = new TUserExample();
		Criteria createCriteria = tUserExample.createCriteria();
		createCriteria.andPasswordEqualTo("1111111");
		tUserMapper.updateByExampleSelective(tUser, tUserExample);
	}

	@Test
	public void testUpdateByExample() {
		TUser tUser = tUserMapper.selectByPrimaryKey(7);
		tUser.setUid(4);
		TUserExample example = new TUserExample();
		TUserExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo("新数据");
		tUserMapper.updateByExample(tUser, example);
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		TUser tUser = new TUser();
		tUser.setUid(4);
		tUser.setUsername("新数据");
		tUserMapper.updateByPrimaryKeySelective(tUser);
	}

	@Test
	public void testUpdateByPrimaryKey() {
		TUser tUser = tUserMapper.selectByPrimaryKey(4);
		tUser.setUsername("新数据123");
		tUserMapper.updateByPrimaryKey(tUser);
	}

}
