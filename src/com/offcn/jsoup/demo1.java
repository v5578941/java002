package com.offcn.jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class demo1 {

	public static void main(String[] args) throws IOException {
		// ��URL����ȡ���ݣ����س�Document����
		Document doc=Jsoup.connect("http://www.ujiuye.com").get();
       //��document������ѡ���Ӧ�Ľڵ�
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
