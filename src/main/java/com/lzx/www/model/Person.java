
package com.lzx.www.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Person {
	
	private String name = "lzx";
	private int age = 30;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void request() {
		List<String> nextHostNames = new ArrayList<String>();
		String url = "http://www.baidu.com";
		try {
			Document doc=Jsoup.connect(url).get();
			System.out.println(doc);
			Elements elements=doc.getElementsByClass("path");
			for(Element element : elements) {
				nextHostNames.add(element.text());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (String str : nextHostNames) {
			System.out.println(str);
		}
		
	}
	
}
