package person.birch.chuckjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class ChuckJokesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChuckJokesApplication.class, args);
    }

}
