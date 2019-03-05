package com.collections1;

public class MovieDetails {
	String mov_Name;
	String lead_actor;
	String lead_actess;
	String genre;
	
	public String getMov_Name() {
		return mov_Name;
	}
	public void setMov_Name(String mov_Name) {
		this.mov_Name = mov_Name;
	}
	public String getLead_actor() {
		return lead_actor;
	}
	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}
	public String getLead_actess() {
		return lead_actess;
	}
	public void setLead_actess(String lead_actess) {
		this.lead_actess = lead_actess;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public MovieDetails(String mov_Name, String lead_actor, String lead_actess, String genre) {
		super();
		this.mov_Name = mov_Name;
		this.lead_actor = lead_actor;
		this.lead_actess = lead_actess;
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return "MovieDetails [mov_Name=" + mov_Name + ", lead_actor=" + lead_actor + ", lead_actess=" + lead_actess
				+ ", genre=" + genre + "]";
	}	
	
	
}
