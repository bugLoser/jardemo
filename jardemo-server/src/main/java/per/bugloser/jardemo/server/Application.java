package per.bugloser.jardemo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EntityScan(basePackages = {"per.bugloser.jardemo"})
@EnableJpaRepositories(basePackages = {"per.bugloser.jardemo"})
@SpringBootApplication(scanBasePackages = {"per.bugloser.jardemo"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}