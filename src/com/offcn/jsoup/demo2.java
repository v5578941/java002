package com.offcn.jsoup;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class demo2 {

	public static void main(String[] args) throws IOException {
		// ��URL����ȡ���ݣ����س�Document����
		
				Document doc=Jsoup.connect("http://www.ujiuye.com").get();
				
		//��ȡ���е�href
				Elements  el1=doc.select("a[href]");
				
				for(Element e1:el1){
					System.out.println("href:"+e1.attr("href"));
					System.out.println("text:"+e1.text());
				}
      //��ȡ������չ��Ϊjpg��ͼƬ
				Elements  el2= doc.select("img[src$=.jpg]");
		//��ȡh4�����a
				Elements  el3=doc.select("h4>a");
				
				//li --->span
				Elements  el4=doc.select("li").select("span");
	}

}
