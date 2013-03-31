package com.springjpa.trial.lesson01.service;

import com.springjpa.trial.lesson01.domain.User;

public interface UserService {
	void saveUser(User user);

	User findUserById(Integer id);

	void updateUser(User user);

	void deleteUserById(Integer id);
}
