package th.co.scb.ngage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DbservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbservicesApplication.class, args);
	}

}
