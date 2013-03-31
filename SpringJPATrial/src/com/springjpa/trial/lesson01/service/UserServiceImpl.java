package com.springjpa.trial.lesson01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springjpa.trial.lesson01.domain.User;
import com.springjpa.trial.lesson01.repository.UserRepository;

@Service("userSrv")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepos;

	@Transactional
	public void saveUser(User user) {
		userRepos.save(user);
	}

	@Transactional
	public User findUserById(Integer id) {
		return userRepos.findOne(id);
	}

	@Transactional
	public void updateUser(User user) {
		userRepos.save(user);
	}

	@Transactional
	public void deleteUserById(Integer id) {
		userRepos.delete(id);
	}
}
