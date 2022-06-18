package za.ac.cput.school_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "za.ac.cput.school_management.repository")

@EntityScan(basePackages = "za.ac.cput.school_management.domain")
public class SchoolManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolManagementApplication.class ,args);
    }
}
