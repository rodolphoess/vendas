package org.gitlab.rodolphoess;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

    private final String applicationName;

    public VendasApplication(String applicationName) {
        this.applicationName = applicationName;
    }

    @GetMapping("/hello")
    @Qualifier("applicationName")
    public String get() {
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }

}
