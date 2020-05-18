package com.example.demo.files;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService{

	/*
	 * @Autowired private UserRepository userRepository;
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//DB Calls happend here
		//User user = userRepository.findByUserName(username);
		//return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(),new ArrayList<>());
		return new org.springframework.security.core.userdetails.User("Ramakrishna","BHanu@28",new ArrayList<>());
	
	}

}
