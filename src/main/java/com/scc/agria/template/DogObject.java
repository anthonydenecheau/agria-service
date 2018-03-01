package com.scc.agria.template;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.scc.agria.model.Dog;

public class DogObject extends Dog {

	private Timestamp timestamp;

	@JsonIgnore
	public Timestamp getTimestamp() { return timestamp; }

}
