package com.duyanh.photoapp.api.users.service;

import com.duyanh.photoapp.api.users.shared.UserDto;

public interface UsersService{
	UserDto createUser(UserDto userDetails);
}