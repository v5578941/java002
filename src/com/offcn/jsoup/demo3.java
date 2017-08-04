package com.offcn.jsoup;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class demo3 {

	public static void main(String[] args) throws IOException {
		Document doc1=Jsoup.parse(new File("d:\\aa.htm"), "UTF-8", "http://news.china.com/socialgd/10000169/20170626/30829845.html");
		//获取所有的href
		Elements  el1=doc1.select("a[href]");
		
		for(Element e1:el1){
			System.out.println("href:"+e1.attr("href"));
			System.out.println("text:"+e1.text());
		}
	}

}
