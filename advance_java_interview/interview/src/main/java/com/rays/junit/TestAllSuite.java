package com.rays.junit;

import junit.framework.TestSuite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    TestUserUpdate.class,
    TestUserDelete.class
})
public class TestAllSuite {
    
	
}

