package jara.diego.peakyblindersapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jara.diego.peakyblindersapi.repositories.EpisodeRepository;

@Service
public class EpisodeService {
	
	@Autowired
	private EpisodeRepository episodeRepository;

}
