package ru.aneuro.skillbox.pluginapi;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication(exclude = UserDetailsServiceAutoConfiguration.class)
public class SkillboxApiApplication implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(SkillboxApiApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
