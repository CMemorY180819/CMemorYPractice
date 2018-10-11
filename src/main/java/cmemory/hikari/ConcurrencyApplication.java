package cmemory.hikari;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConcurrencyApplication {
	public static void main(String[] args) {
		System.out.println("hikarisama -> 启动 spring boot");
		SpringApplication.run(ConcurrencyApplication.class, args);
	}
}
