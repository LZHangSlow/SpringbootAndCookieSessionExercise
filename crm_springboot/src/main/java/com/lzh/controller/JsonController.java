package com.lzh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lzh.bean.Book;

@Controller
public class JsonController {

	@RequestMapping("/toJson")
	public String toJson() {
		return "json";
	}
	
	@ResponseBody
	@RequestMapping(value="/jsonToList",produces = "application/json; charset=utf-8")
	public String jsonToList() {
		Book book = new Book(1, "三体", "刘慈欣");
		Book book2 = new Book(2, "雷雨", "鲁迅");
		Book book3 = new Book(3, "时间简史", "霍金");
		ArrayList<Book> arrayList = new ArrayList<>();
		arrayList.add(book);
		arrayList.add(book2);
		arrayList.add(book3);
		Gson gson = new Gson();
		//list转json返回到前端的数据会被转义，没有找到解决方法
		String json = gson.toJson(arrayList);
		//json转回list
		
		return json;
	}
}

class BookType extends TypeToken<ArrayList<Book>>{}
