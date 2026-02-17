package com.rays.junit;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import junit.framework.TestCase;

public class TestUserAdd extends TestCase{

	@Test
	public void testAdd() throws Exception {

		UserBean bean = new UserBean();
		bean.setId(1);
		bean.setName("rahul");
		bean.setSalary(5000);

		UserModel model = new UserModel();

		model.add(bean);

		bean = model.findByPk(1);

		assertNotNull(bean);
   

	}
}
