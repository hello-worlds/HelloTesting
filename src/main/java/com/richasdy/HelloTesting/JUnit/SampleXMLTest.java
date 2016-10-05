package com.richasdy.HelloTesting.JUnit;

import org.custommonkey.xmlunit.XMLTestCase;

public class SampleXMLTest extends XMLTestCase {
	// this test method compare two pieces of the XML
	@Test
	public void testForXMLEquality() throws Exception {
		String myControlXML = "<msg><uuid>0x00435A8C</uuid></msg>";
		String myTestXML = "<msg><localId>2376</localId></msg>";
		assertXMLEqual("Comparing test xml to control xml", myControlXML, myTestXML);
	}
}
