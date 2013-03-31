package com.springjpa.trial.lesson01.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springjpa.trial.lesson01.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	List<User> findByName(String name);
}
