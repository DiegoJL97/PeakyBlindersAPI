package jara.diego.peakyblindersapi.models;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Document(collection="episodes")
@JsonPropertyOrder({"id","season","title","airDate","characters"})
public class Episode implements Serializable {

	private static final long serialVersionUID = -4129012095382223295L;
	
	@Id
	private long id;
	
	private int season;
	
	private String title;
	private String airDate;
	
	private List<Character> characters;
	
	public Episode() {}

	public int getSeason() {
		return season;
	}

	public void setSeason(int season) {
		this.season = season;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAirDate() {
		return airDate;
	}

	public void setAirDate(String airDate) {
		this.airDate = airDate;
	}

	public List<Character> getCharacters() {
		return characters;
	}

	public void setCharacters(List<Character> characters) {
		this.characters = characters;
	}

}
