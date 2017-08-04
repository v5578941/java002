package com.offcn.jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class demo1 {

	public static void main(String[] args) throws IOException {
		// 从URL来获取内容，加载成Document对象
		Document doc=Jsoup.connect("http://www.ujiuye.com").get();
       //从document对象来选择对应的节点
		Element  el1=doc.getElementsByClass("newYjy").first();
		
		Elements ela=el1.getElementsByTag("a");
		
		for(Element link:ela){
			String title=link.attr("title");
			if(title!=null&&!title.equals("")){
				System.out.println("href:"+link.attr("href"));
				System.out.println("text:"+link.text());
			}
		}
	}

}
