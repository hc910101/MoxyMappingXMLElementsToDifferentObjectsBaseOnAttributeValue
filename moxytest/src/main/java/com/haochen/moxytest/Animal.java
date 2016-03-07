package com.haochen.moxytest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Animal {
	@XmlElement
	public String name;
}
