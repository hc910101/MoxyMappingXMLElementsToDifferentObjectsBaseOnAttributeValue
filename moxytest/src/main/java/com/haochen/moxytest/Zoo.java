package com.haochen.moxytest;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.eclipse.persistence.oxm.annotations.XmlPaths;
import javax.xml.bind.annotation.XmlElements;
@XmlRootElement(name="zoo")
public class Zoo {
	@XmlElements({
	        @XmlElement(type=Cat.class),
	        @XmlElement(type=Dog.class)
	    })
	@XmlPaths({
		@XmlPath("animals/animal[@type='cat']"),
		@XmlPath("animals/animal[@type='dog']")
	})	
	public List<Animal> animals;

	@Override
	public String toString() {
		return "Zoo [animals=" + animals + "]";
	}




}
