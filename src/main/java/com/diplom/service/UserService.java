package com.diplom.service;

import com.diplom.DTO.UserDTO;

public interface UserService {

	public UserDTO getUserDTObyId(int id, String password);
	public Object getLoginUser();
	
	public void save();
}
