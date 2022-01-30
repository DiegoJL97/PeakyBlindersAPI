package jara.diego.peakyblindersapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import jara.diego.peakyblindersapi.models.Quote;

@Repository
public interface QuoteRepository extends MongoRepository<Quote,Long>{

}
