package com.lzh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lzh.bean.Book;

@RestController
public class BookController {
	@GetMapping("/test")
    public ModelAndView test() {
        // 创建返回数据
        List<Book> books = new ArrayList<>();
        Book b1 = new Book(1, "hangge.com", "hangge");
        Book b2 = new Book(2, "航歌", "hangge");
        Book b3 = new Book(3, "三体", "刘慈欣");
        Book b4 = new Book(4, "丰乳肥臀", "鲁迅");
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        // 创建并返回 ModelAndView
        ModelAndView mv = new ModelAndView();
        mv.addObject("books", books); // 设置返回的数据
        mv.setViewName("book"); //设置视图名
        //返回modelandview
        return mv;
    }
}
