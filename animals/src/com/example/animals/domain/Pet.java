package com.example.animals.domain;

import java.io.Serializable;

public interface Pet extends Serializable{
	void play();
	void setName(String name);
	String getName();

}
