package jara.diego.peakyblindersapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jara.diego.peakyblindersapi.repositories.CharacterRepository;

@Service
public class CharacterService {
	
	@Autowired
	private CharacterRepository characterRepository;

}
