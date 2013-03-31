package com.springjpa.trial.lesson01.service;

import javax.persistence.Persistence;

public class TestJpa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("myJPA");
	}

}
