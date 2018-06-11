package com.kd.filedir.parse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class UrlFileDirScanner {
	
	static String url = "http://howto.unixdev.net/";
	static Document doc = null;

	public static void main(String[] args) {
		
		getAllFileDirs();
	}

	public static void getAllFileDirs() {
		
		try {
			System.out.println("uri : "+url);
			doc = Jsoup.connect(url).get();
			String temp=null;
			Elements elements = doc.select("tr td[class=right] a");
			System.out.println(elements);
			for (Element file : elements) {
				String str = file.attr("href");
				System.out.println("for element: "+str);
				if (!str.equalsIgnoreCase("/") && str.endsWith("/")) {
					if(temp != null && url.endsWith(temp)){
						url = url.split(temp)[0]+str;
						getAllFileDirs();
					}
					
					temp = str;
					System.out.println(str);
					url = url + temp;
				}
				doc = Jsoup.connect(url).get();
				System.out.println("uri : "+url);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
