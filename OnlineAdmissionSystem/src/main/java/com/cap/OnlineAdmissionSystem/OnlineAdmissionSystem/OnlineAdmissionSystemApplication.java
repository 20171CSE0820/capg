package com.cap.OnlineAdmissionSystem.OnlineAdmissionSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable;

@SpringBootApplication
public class OnlineAdmissionSystemApplication {
	

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(OnlineAdmissionSystemApplication.class, args);
//	    ctx.close();
	}

}
