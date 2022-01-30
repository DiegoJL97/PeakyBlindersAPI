package jara.diego.peakyblindersapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jara.diego.peakyblindersapi.models.Quote;
import jara.diego.peakyblindersapi.services.QuoteService;

@CrossOrigin(origins = "*")
@RestController
public class QuoteController {

	@Autowired
	private QuoteService quoteService;
	
	@GetMapping("/api/quotes/id/{id}")
	public ResponseEntity<Quote> getQuoteById(@PathVariable int id){
		return null;
	}
	
	@GetMapping("/api/quotes")
	public ResponseEntity<List<Quote>> getAllQuotes(){
		return null;
	}
	
	@GetMapping("/api/quotes/author/{author}")
	public ResponseEntity<List<Quote>> getQuotesByAuthor(@PathVariable String author){
		return null;
	}
	
}
