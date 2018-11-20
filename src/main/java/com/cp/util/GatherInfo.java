
package com.cp.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URL;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * GatherInfo<br/>
 * 创建人:mofeng<br/>
 * 时间：2018年11月11日-下午8:39:00 <br/>
 * @version 1.0.0<br/>
 * 
 */
public class GatherInfo {

	
	public static Set<String> getLinks(String link){
		try {
			Set<String> links = new HashSet<>();
			Document document = Jsoup.parse(new URL(link),10000);
			Elements elements = document.getElementById("posts").getElementsByTag("a");
			for (Element element : elements) {
				links.add(element.attr("href"));
			}
			return links;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void saveBlogs(String url) {
		try {
			Document document = Jsoup.parse(new URL(url), 3000);
			String img = document.getElementsByClass("post-cover").first().child(0).attr("src");
			String title = document.getElementsByClass("post-tit").eq(0).text();
			String content = document.getElementsByClass("post-content").eq(0).html();
			System.out.println(img);
			System.out.println(title);
			System.out.println(content);
			System.out.println("========================================");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Set<String> links = getLinks("https://aotu.io/index.html");
		for (String string : links) {
			saveBlogs("https://aotu.io"+string);
		}
		
	}
}
