package com.Kushagra.app;

import com.Kushagra.app.model.Human;
import com.Kushagra.app.model.Laptop;
import com.Kushagra.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Application.class, args);

		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);

		service.addLaptop(lap);





//		Human obj = context.getBean(Human.class);
//		System.out.println(obj.getAge());
//		obj.code();

	}

}
