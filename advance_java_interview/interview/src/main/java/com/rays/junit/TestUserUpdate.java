package com.rays.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUserUpdate {

	@Test
	public void update() throws Exception {

		UserBean bean = UserModel.findByPk(1);

		bean.setName("rahul");
		bean.setSalary(100000);

		UserModel.update(bean);

		bean = UserModel.findByPk(1);
	
		assertEquals("ram", bean.getName());
	

	}
}
