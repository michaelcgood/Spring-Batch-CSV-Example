package com.michaelcgood;

import org.apache.commons.lang3.builder.ToStringBuilder;
/**
 * Contains the information of a single anime
 *
 * @author Michael C Good michaelcgood.com
 */

public class AnimeDTO {
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



	private String id;
	



	private String title;
	private String description;
	
	public AnimeDTO(){
		
	}
	
	public AnimeDTO(String id, String title, String description){
		this.id = id;
		this.title = title;
		this.description = title;
	}
	

	
	   @Override
	    public String toString() {
		   return new ToStringBuilder(this)
				   .append("id", this.id)
				   .append("title", this.title)
				   .append("description", this.description)
				   .toString();
	   }


}
