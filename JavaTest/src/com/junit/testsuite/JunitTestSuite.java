package com.junit.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.core.comparable.ComparableTest;

@RunWith(Suite.class)
@SuiteClasses({
	ComparableTest.class
})
public class JunitTestSuite {
	
}
