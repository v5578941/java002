package com.offcn.jsoup;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class demo2 {

	public static void main(String[] args) throws IOException {
		// 从URL来获取内容，加载成Document对象
		
				Document doc=Jsoup.connect("http://www.ujiuye.com").get();
				
		//获取所有的href
				Elements  el1=doc.select("a[href]");
				
				for(Element e1:el1){
					System.out.println("href:"+e1.attr("href"));
					System.out.println("text:"+e1.text());
				}
      //获取所有扩展名为jpg的图片
				Elements  el2= doc.select("img[src$=.jpg]");
		//获取h4后面的a
				Elements  el3=doc.select("h4>a");
				
				//li --->span
				Elements  el4=doc.select("li").select("span");
	}

}
