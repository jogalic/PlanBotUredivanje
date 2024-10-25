package com.EventPlanner.EventPlannerApp.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;

@Entity 
@Table(name="posts")//bc not sure if word "post" is already reserved, just to be sure
public class Post {
	private String status; //maybe create entity (published, deleted, finished...)
	private Long postNumber; 
	
	@OneToOne(fetch=FetchType.EAGER, optional=true, cascade=CascadeType.ALL)
	@JoinColumn(name = "image_attachment_id") // Specifies the foreign key column
	private ImageAttachment picture; 
	
	@ManyToOne(fetch=FetchType.EAGER, optional= false, cascade = CascadeType.MERGE)
	private User publishedBy; 
	private List<User> joinedBy = new ArrayList<>(); 
	private List<User> NotJoinedBy = new ArrayList<>(); 
	private List<Comment> comments = new ArrayList<>(); 
	private List<Suggestion> suggestions = new ArrayList<>();
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getPostNumber() {
		return postNumber;
	}
	public void setPostNumber(Long postNumber) {
		this.postNumber = postNumber;
	}
	public ImageAttachment getPicture() {
		return picture;
	}
	public void setPicture(ImageAttachment picture) {
		this.picture = picture;
	}
	public User getPublishedBy() {
		return publishedBy;
	}
	public void setPublishedBy(User publishedBy) {
		this.publishedBy = publishedBy;
	}
	public List<User> getJoinedBy() {
		return joinedBy;
	}
	public void setJoinedBy(List<User> joinedBy) {
		this.joinedBy = joinedBy;
	}
	public List<User> getNotJoinedBy() {
		return NotJoinedBy;
	}
	public void setNotJoinedBy(List<User> notJoinedBy) {
		NotJoinedBy = notJoinedBy;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public List<Suggestion> getSuggestions() {
		return suggestions;
	}
	public void setSuggestions(List<Suggestion> suggestions) {
		this.suggestions = suggestions;
	} 
	
	
	

}
