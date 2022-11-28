package springbanqbatch;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"spring-banq-batch.springbanqbatch.Controller"})
public class DemoApplication{
	public static void main(String[] args) {
	 SpringApplication.run(DemoApplication.class, args);
		//System.out.println("bonjour diagana!!!");

	}




}


