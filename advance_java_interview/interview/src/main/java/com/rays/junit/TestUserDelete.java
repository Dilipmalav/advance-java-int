package com.rays.junit;

import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TestUserDelete {

	@Test
	public void delete() throws Exception {
		
		UserModel.delete(5);

		UserBean bean = UserModel.findByPk(1);

		assertNull("user is not null", bean);
}
}
