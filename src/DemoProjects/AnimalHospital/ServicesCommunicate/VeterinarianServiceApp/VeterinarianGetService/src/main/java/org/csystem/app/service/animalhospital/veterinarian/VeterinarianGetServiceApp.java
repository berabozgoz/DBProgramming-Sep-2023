package org.csystem.app.service.animalhospital.veterinarian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.csystem", "com.metemengen"})
public class VeterinarianGetServiceApp {
	public static void main(String[] args)
	{
		SpringApplication.run(VeterinarianGetServiceApp.class, args);
	}
}
