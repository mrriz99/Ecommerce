package com.milkbasket.service;

import com.milkbasket.model.UserDtls;



public interface UserService {

	public UserDtls createUser(UserDtls user);

	public boolean checkEmail(String email);

}