package ce.micros.borrowers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class MicroservicioDeudores extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(MicroservicioDeudores.class, args);
    }
}
