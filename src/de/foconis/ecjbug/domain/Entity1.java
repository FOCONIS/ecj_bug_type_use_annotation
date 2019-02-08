package de.foconis.ecjbug.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Entity1 {

	private String name;
	
	@TestAnnotation
	@ManyToOne
	private Entity2 refEntity;

}
