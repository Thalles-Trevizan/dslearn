package com.devsuperior.dslearnbds.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_content")
public class Content extends Lesson{
	private static final long serialVersionUID = 1L;
	
	private String textCotent;
	private String videoUri;
	
	public Content() {
		super();
	}

	public Content(Long id, String title, Integer position, Section section, String textCotent, String videoUri) {
		super(id, title, position, section);
		this.textCotent = textCotent;
		this.videoUri = videoUri;
	}

	public String getTextCotent() {
		return textCotent;
	}

	public void setTextCotent(String textCotent) {
		this.textCotent = textCotent;
	}

	public String getVideoUri() {
		return videoUri;
	}

	public void setVideoUri(String videoUri) {
		this.videoUri = videoUri;
	}
}
