package com.rays.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLifeCycle {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("-----------BeforeClass-------------");
    }

    @Before
    public void before() {
        System.out.println("------------Before----------");
    }

    @Test
    public void testOne() {
        System.out.println("---------------Test One------------");
    }

    @Test
    public void testTwo() {
        System.out.println("--------------Test Two-----------------");
    }

    @After
    public void after() {
        System.out.println("------------------After-------------------");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("------------------afterClass---------------------");
    }
}
