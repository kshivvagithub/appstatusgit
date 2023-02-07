package com.wf.appstatus.springboot;

import java.util.Collections;
import java.util.Optional;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.wf.appstatus.springboot.model.User;
import com.wf.appstatus.springboot.service.UserService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfiguration {

	private final UserService userService;

	public WebSecurityConfig(UserService userService) {
		this.userService = userService;
	}

	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().requestMatchers("/login").permitAll().requestMatchers("/*/**").authenticated().and()
				.formLogin().loginPage("/login").and().logout().permitAll();
	}

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(username -> {
			Optional<User> user = userService.findByUsername(username);
			return new org.springframework.security.core.userdetails.User(user.get().getUsername(),
					user.get().getPassword(),
					Collections.singletonList(new SimpleGrantedAuthority(user.get().getRole())));
		});
	}
}
