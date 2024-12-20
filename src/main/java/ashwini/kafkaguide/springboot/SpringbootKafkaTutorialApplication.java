package ashwini.kafkaguide.springboot;

import ashwini.kafkaguide.springboot.kafka.KafkaProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "ashwini.kafkaguide.springboot.repository")
		//entityManagerFactoryRef = "sessionFactory")

@EnableTransactionManagement
public class SpringbootKafkaTutorialApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootKafkaTutorialApplication.class, args);
	}

}
