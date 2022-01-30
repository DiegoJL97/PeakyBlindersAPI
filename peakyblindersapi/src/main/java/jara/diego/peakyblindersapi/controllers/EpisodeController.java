package jara.diego.peakyblindersapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jara.diego.peakyblindersapi.models.Episode;
import jara.diego.peakyblindersapi.services.EpisodeService;

@CrossOrigin(origins = "*")
@RestController
public class EpisodeController {
	
	@Autowired
	private EpisodeService episodeService;
	
	@GetMapping("/api/episodes/id/{id}")
	public ResponseEntity<Episode> getEpisodeById(@PathVariable int id){
		return null;
	}
	
	@GetMapping("/api/episodes/title/{title}")
	public ResponseEntity<Episode> getEpisodeByTitle(@PathVariable String title){
		return null;
	}
	
	@GetMapping("/api/episodes")
	public ResponseEntity<List<Episode>> getAllEpisodes(){
		return null;
	}
	
	@GetMapping("/api/episodes/season/{season}")
	public ResponseEntity<List<Episode>> getEpisodesBySeason(@PathVariable int season){
		return null;
	}
	
	@GetMapping("/api/episodes/character/{character}")
	public ResponseEntity<List<Episode>> getEpisodesByCharacter(@PathVariable String character){
		return null;
	}

}
