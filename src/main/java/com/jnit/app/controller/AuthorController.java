package com.jnit.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jnit.app.model.Author;
import com.jnit.app.service.AuthorService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "authors", method = RequestMethod.OPTIONS)
public class AuthorController {

	@Autowired
	private AuthorService authorService;

	@PostMapping
	public Author createAuthor(@RequestBody Author author) throws Exception {
		System.out.println("hello");
		System.out.println(author.getAuthorName());
		return authorService.createAuthor(author);
	}

	@PutMapping
	public Author updateAuthor(@RequestBody Author author) throws Exception {
		return authorService.updateAuthor(author);
	}

	@DeleteMapping(value="/{authorId}")
	public ResponseEntity<HttpStatus> deleteAuthor(@PathVariable("authorId") String authorId) throws Exception {
		authorService.deleteAuthor(authorId);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}

	@GetMapping
	public List<Author> getAllAuthors() throws Exception {
		//System.out.println("i am in get");
		return authorService.getAllAuthors();
	}
	
	@GetMapping("/{authorId}")
	public Author getAuthorById(@PathVariable("authorId")String authorId) throws Exception{
		return authorService.getAuthorById(authorId);
	}
}
