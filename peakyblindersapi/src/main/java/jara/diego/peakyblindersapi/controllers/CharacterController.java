package jara.diego.peakyblindersapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jara.diego.peakyblindersapi.services.CharacterService;

@CrossOrigin(origins = "*")
@RestController
public class CharacterController {
	
	@Autowired
	private CharacterService characterService;
	
	@GetMapping("/api/characters/id/{id}")
	public ResponseEntity<Character> getCharacterById(@PathVariable int id){
		return null;
	}
	
	@GetMapping("/api/characters/name/{name}")
	public ResponseEntity<Character> getCharacterByName(@PathVariable String name){
		return null;
	}
	
	@GetMapping("/api/characters")
	public ResponseEntity<List<Character>> getAllCharacters(){
		return null;
	}
	
	@GetMapping("/api/characters/status/{status}")
	public ResponseEntity<List<Character>> getCharactersByStatus(@PathVariable String status){
		return null;
	}
	
	@GetMapping("/api/characters/gender/{gender}")
	public ResponseEntity<List<Character>> getCharactersByGender(@PathVariable String gender){
		return null;
	}

}
