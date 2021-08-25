package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;

@RestController
public class DemoController {

	@RequestMapping("/test")
	public List<Book> readTest() {
		List<Book> list = new ArrayList<>();
		list.add(new Book(1, "Hello world!", "JK . Rowling"));
		list.add(new Book(2, "Lord of The Rings", "Tolkien"));
		return list;
	}
}
