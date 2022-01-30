package jara.diego.peakyblindersapi.models;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Document(collection="characters")
@JsonPropertyOrder({"id","name","status","gender","image","occupation","portrayed","episodes"})
public class Character implements Serializable {
	
	private static final long serialVersionUID = -2796385316268864893L;
	
	@Id
	private long id;
	
	private String name;
	private String status;
	private String gender;
	private String image;
	private String occupation;
	private String portrayed;
	
	private List<Episode> episodes;
	
	public Character() {};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getPortrayed() {
		return portrayed;
	}

	public void setPortrayed(String portrayed) {
		this.portrayed = portrayed;
	}

	public List<Episode> getEpisodes() {
		return episodes;
	}

	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;
	}

}
