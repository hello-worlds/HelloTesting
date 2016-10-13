package com.richasdy.HelloTesting.JUnit;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.richasdy.HelloTesting.JUnit.Hamcrest.TestCategory;
import com.richasdy.HelloTesting.JUnit.Hamcrest.TestCategory2;
import com.richasdy.HelloTesting.JUnit.Hamcrest.TestCategory3;
import com.richasdy.HelloTesting.JUnit.category.RegressionTests;

@RunWith(Categories.class)
@Categories.IncludeCategory(RegressionTests.class)
@Suite.SuiteClasses({TestCategory.class, TestCategory2.class, TestCategory3.class})

public class RegressionTestSuite {

}
