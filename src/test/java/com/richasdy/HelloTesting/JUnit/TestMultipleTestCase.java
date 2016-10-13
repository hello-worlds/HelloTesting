package com.richasdy.HelloTesting.JUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.richasdy.HelloTesting.JUnit.Hamcrest.TestExpectedExceptions;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestExpectedExceptions.class, //test case 1
        TestTimeout.class     //test case 2
})

public class TestMultipleTestCase {

}
