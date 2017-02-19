package com.tqt.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "video")
public class Video {

	@Id
	@Field(value = "id")
	private String id;
	
	@Field
	private String absoluteFilePath;
	
	@Field
	private String videoName;
	
	@Field
	private int rating;
	
	@Field
	private List<String> genre;

	@Field
	private String thumbName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAbsoluteFilePath() {
		return absoluteFilePath;
	}

	public void setAbsoluteFilePath(String absoluteFilePath) {
		this.absoluteFilePath = absoluteFilePath;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public List<String> getGenre() {
		return genre;
	}

	public void setGenre(List<String> genre) {
		this.genre = genre;
	}

	public String getThumbName() {
		return thumbName;
	}

	public void setThumbName(String thumbName) {
		this.thumbName = thumbName;
	}

	@Override
	public String toString() {
		return String.format("Video [id=%s, absoluteFilePath=%s, videoName=%s, rating=%s, genre=%s, thumbName=%s]", id,
				absoluteFilePath, videoName, rating, genre, thumbName);
	}
	
}
