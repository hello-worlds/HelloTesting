package com.richasdy.HelloTesting.JUnit;

import org.jmock.Mockery;
import org.jmock.Expectations;

public class SampleMockObject extends TestCase {
	Mockery context = new Mockery();

	public void testSubReceivesMessage() {
	      // set up
	      final Sub sub = context.mock(Sub.class);

	      Pub pub = new Pub();
	      pub.add(sub);
	    
	      final String message = "message";
	      
	      // expectations
	      context.checking(new Expectations() {
	         oneOf (sub).receive(message);
	      });

	      // execute
	      pub.publish(message);
	      
	      // verify
	      context.assertIsSatisfied();
	   }
}
