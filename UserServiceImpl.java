package com.management.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.management.user.VO.Depart;
import com.management.user.VO.ResponseTemplateVO;
import com.management.user.entity.User;
import com.management.user.repository.UserRepository;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	public UserRepository userRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	private static final String GET_USERSERVICE="getUserWithDepartment";
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user) ;
	}

	@Override
	public User findByUserId(Long userId) {
		// TODO Auto-generated method stub
		return  userRepo.findByUserId(userId);
	}

	@Override
	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		// TODO Auto-generated method stub
		 ResponseTemplateVO vo=new ResponseTemplateVO();
		 User user=userRepo.findByUserId(userId);
		 
		 Depart department=
				 restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(),
						 Depart.class);
		 vo.setUser(user);
		 vo.setDepartment(department);
		 
		 return vo;
	}
	
	public String serviceUserFallback(Exception e) {
		return "fallback";
	}
	
	  

}
