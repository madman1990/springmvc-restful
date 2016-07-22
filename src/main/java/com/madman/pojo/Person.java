package com.madman.pojo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "person")
public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String xxxx;

	@XmlElement(name = "xx")
	public String getXxxx() {
		return xxxx;
	}

	public void setXxxx(String xxxx) {
		this.xxxx = xxxx;
	}

}
