package jara.diego.peakyblindersapi.models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Document(collection="quotes")
@JsonPropertyOrder({"id","quote","author","episode"})
public class Quote implements Serializable {

	private static final long serialVersionUID = 3984618072309297890L;
	
	@Id
	private long id;
	
	private String quote;
	
	private Character author;
	private Episode episode;
	
	public Quote() {}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public Character getAuthor() {
		return author;
	}

	public void setAuthor(Character author) {
		this.author = author;
	}

	public Episode getEpisode() {
		return episode;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

}
