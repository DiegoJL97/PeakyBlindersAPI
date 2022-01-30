package jara.diego.peakyblindersapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import jara.diego.peakyblindersapi.models.Episode;

@Repository
public interface EpisodeRepository extends MongoRepository<Episode,Long>{

}
