package com.xing.main;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.xing.main.model.Role;
import com.xing.main.repository.RoleRepository;

@Configuration
public class InitialConfiguration {

	@Autowired
	private RoleRepository roleRepository;

	@PostConstruct
	public void init() {
		createRoles();
		System.out.println("XING:Initial configuration done");
	}

	private void createRoles() {
		Role userRole = new Role("USER");
		roleRepository.save(userRole);
		Role adminRole = new Role("ADMIN");
		roleRepository.save(adminRole);
	}

}
