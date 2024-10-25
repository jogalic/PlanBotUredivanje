package com.EventPlanner.EventPlannerApp.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="suggestions")
public class Suggestion {
	private LocalDateTime Time;
	private String Location;
	private User fromUser;
	public LocalDateTime getTime() {
		return Time;
	}
	public void setTime(LocalDateTime time) {
		Time = time;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public User getFromUser() {
		return fromUser;
	}
	public void setFromUser(User fromUser) {
		this.fromUser = fromUser;
	}
	
	
}
