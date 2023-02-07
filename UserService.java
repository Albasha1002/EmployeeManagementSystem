package com.management.user.service;

import com.management.user.VO.ResponseTemplateVO;
import com.management.user.entity.User;

public interface UserService {
	
	public User saveUser(User user);
	
	public User findByUserId(Long userId);

	public ResponseTemplateVO getUserWithDepartment(Long userId);

	

}
