
package com.lzx.www.model;
import static org.junit.Assert.*;

import org.junit.Test;

import com.lzx.www.model.Person;

public class PersonTest {

	@Test
	public void test() {
		Person p = new Person();
		p.request("http://server2:8080");
		System.out.println("aaa");
	}

}
