
package com.lzx.www.model;

import org.junit.Test;

import com.lzx.www.model.Person;

public class PersonTest {

	@Test
	public void test() {
		Person p = new Person();
		p.request("http://10.25.122.138:8080");
	}

}
