package com.EventPlanner.EventPlannerApp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class ImageAttachment {
	private String imageURL;
	private String imageDesc;
	
	@OneToOne(mappedBy = "imageAttachment") // Reference back to Post
	
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public String getImageDesc() {
		return imageDesc;
	}
	public void setImageDesc(String imageDesc) {
		this.imageDesc = imageDesc;
	}
	
	
}
