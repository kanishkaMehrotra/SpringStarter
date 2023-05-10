package com.kanishka.spring.basics.springin5steps.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype",
proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {

	public JdbcConnection() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("JDBC");
	}
	

}
