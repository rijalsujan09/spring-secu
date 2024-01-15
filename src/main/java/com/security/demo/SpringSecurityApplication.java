package com.security.demo;

import com.security.demo.anotation.model.User;
import com.security.demo.anotation.model.UserDto;
import com.security.demo.anotation.propertysource.PropertySourceDemo;
import com.security.demo.anotation.service.impl.UserService;
import com.security.demo.anotation.value.ValueAnnotationDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringSecurityApplication.class, args);
		UserService userService = context.getBean(UserService.class);
		UserDto dto = context.getBean(UserDto.class);
		dto.setEmail("rijalsujna09@gmail.com");
		dto.setName("Sujna Rijal");
		dto.setPassword("secret");
		User  user = userService.getUser(dto);
		System.out.println(user);



//		ValueAnnotationDemo annotationDemo = context.getBean(ValueAnnotationDemo.class);
//		System.out.println(annotationDemo.getDefaultName());
//
//		System.out.println("------------------------");
//
//		PropertySourceDemo propertySourceDemo = context.getBean(PropertySourceDemo.class);
//		System.out.println(propertySourceDemo.getHost()+"\n"+propertySourceDemo.getEmail()+"\n"+propertySourceDemo.getPassword());
//
//		System.out.println("=========================");
//		System.out.println(propertySourceDemo.getAppName()+"\n"+propertySourceDemo.getDescription());
//
//		System.out.println("=========================");
//		propertySourceDemo.getEnvironmentValues();
//
//
//		List<String> cities = List.of("delhi", "tokyo", "ktm", "new-york");
//		List<String>  CITIES = cities.stream().map(String::toUpperCase).toList();
//		CITIES.forEach(System.out::println);
//		System.out.println(CITIES);

//		SingletonBean singletonBean1 =context.getBean(SingletonBean.class);
//		System.out.println(singletonBean1.hashCode());
//		SingletonBean singletonBean2 =context.getBean(SingletonBean.class);
//		System.out.println(singletonBean2.hashCode());
//
//		PrototypeBean prototypeBean1 =context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean1.hashCode());
//		PrototypeBean prototypeBean2 =context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean2.hashCode());
//


//		PizzaController pizzaController  = (PizzaController)context.getBean("pizzaController");
//		pizzaController.destroy();
//
//		MyController myController = context.getBean(MyController.class);
//		System.out.println(myController.hello());
//
//
//		MyServiceImpl myService = context.getBean(MyServiceImpl.class);
//		System.out.println(myService.helloFromService());
//
//		MyRepository repository = context.getBean(MyRepository.class);
//		System.out.println(repository.helloFromRepo());
//
//		LazyLoader lazyLoader = context.getBean(LazyLoader.class);
//
//		VegPizza vegPizza = (VegPizza) context.getBean("veg");
//		System.out.println(pizzaController.getPizza());

	}

}
