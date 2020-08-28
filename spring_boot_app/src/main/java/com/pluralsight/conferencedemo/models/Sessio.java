package com.pluralsight.conferencedemo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "sessions")
public class Sessio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sesion_id;
	private String session_name;
	private String session_description;
	private Integer session_length;
	
	@ManyToMany
	@JoinTable(
			name = "session_sepakers",
			joinColumns = @JoinColumn(name = "session_id"),
			inverseJoinColumns = @JoinColumn(name = "sepaker_id")
			)
	private List<Speaker> speakers;
	
	public Sessio() {
		
	}
	
		
	public List<Speaker> getSpeakers() {
		return speakers;
	}
	public void setSpeakers(List<Speaker> speakers) {
		this.speakers = speakers;
	}



	public Long getSesion_id() {
		return sesion_id;
	}
	public void setSesion_id(Long sesion_id) {
		this.sesion_id = sesion_id;
	}
	public String getSession_name() {
		return session_name;
	}
	public void setSession_name(String session_name) {
		this.session_name = session_name;
	}
	public String getSession_description() {
		return session_description;
	}
	public void setSession_description(String session_description) {
		this.session_description = session_description;
	}
	public Integer getSession_length() {
		return session_length;
	}
	public void setSession_length(Integer session_length) {
		this.session_length = session_length;
	}

}
