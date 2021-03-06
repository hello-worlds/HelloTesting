package com.richasdy.HelloTesting.JUnit;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.richasdy.HelloTesting.JUnit.Category.PerformanceTests;
import com.richasdy.HelloTesting.JUnit.Hamcrest.TestCategory;
import com.richasdy.HelloTesting.JUnit.Hamcrest.TestCategory2;
import com.richasdy.HelloTesting.JUnit.Hamcrest.TestCategory3;

@RunWith(Categories.class)
@Categories.IncludeCategory(PerformanceTests.class)
//Include multiple categories
//@Categories.IncludeCategory({PerformanceTests.class, RegressionTests.class})
@Suite.SuiteClasses({TestCategory.class, TestCategory2.class, TestCategory3.class})

public class PerformanceTestSuite {

}
