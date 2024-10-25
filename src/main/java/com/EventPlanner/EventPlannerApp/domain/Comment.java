package com.EventPlanner.EventPlannerApp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="comments")
public class Comment {
	private String text;
	private User fromUser;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public User getFromUser() {
		return fromUser;
	}
	public void setFromUser(User fromUser) {
		this.fromUser = fromUser;
	}
	
	
}
