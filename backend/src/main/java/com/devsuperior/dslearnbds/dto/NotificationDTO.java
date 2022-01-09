package com.devsuperior.dslearnbds.dto;

import java.io.Serializable;
import java.time.Instant;

import com.devsuperior.dslearnbds.entities.Notification;

public class NotificationDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long Id;
	private String text;
	private Instant moment;
	private boolean read;
	private String route;
	private Long userId;

	public NotificationDTO() {
		super();
	}
	
	public NotificationDTO(Long id, String text, Instant moment, boolean read, String route, Long userId) {
		super();
		Id = id;
		this.text = text;
		this.moment = moment;
		this.read = read;
		this.route = route;
		this.userId = userId;
	}
	
	public NotificationDTO(Notification entity) {
		Id = entity.getId();
		text = entity.getText();
		moment = entity.getMoment();
		read = entity.isRead();
		route = entity.getRoute();
		userId = entity.getUser().getId();
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
