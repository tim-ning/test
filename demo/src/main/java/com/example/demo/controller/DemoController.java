package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Author;
import com.example.demo.model.Book;

@RestController
@CrossOrigin
public class DemoController {

	@GetMapping("/books")
	public List<Book> readBooks() {
		List<Book> list = new ArrayList<>();
		list.add(new Book(1, "Hello world!", "JK . Rowling"));
		list.add(new Book(2, "Lord of The Rings", "Tolkien"));
		return list;
	}

	@GetMapping("/authors")
	public List<Author> readAuthors() {
		List<Author> list = new ArrayList<>();
		list.add(new Author(1, "JK . Rowling"));
		list.add(new Author(2, "Tolkien"));
		return list;
	}
}



