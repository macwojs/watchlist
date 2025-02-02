package com.openclassroom.watchlist;

import com.fasterxml.jackson.databind.annotation.JsonAppend;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@GoodMovie
@BadMovie
public class WatchlistItem {

	private Integer id;

	@NotBlank ( message = "Pleas enter the title" )
	private String title;

	@Rating
	private String rating;

	@Priority
	private String priority;

	@Size ( max = 50, message = "Comment should be maximum 50 characters" )
	private String comment;

	public static int index = 0;

	public WatchlistItem() {
		//this.id = index ++;
	}

	public WatchlistItem( String title, String rating, String priority, String comment ) {
		super( );
		this.id = index++;
		this.title = title;
		this.rating = rating;
		this.priority = priority;
		this.comment = comment;
	}

	public Integer getId() {
		return id;
	}

	public void setId( Integer id ) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle( String title ) {
		this.title = title;
	}

	public String getRating() {
		return rating;
	}

	public void setRating( String rating ) {
		this.rating = rating;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority( String priority ) {
		this.priority = priority;
	}

	public String getComment() {
		return comment;
	}

	public void setComment( String comment ) {
		this.comment = comment;
	}
}