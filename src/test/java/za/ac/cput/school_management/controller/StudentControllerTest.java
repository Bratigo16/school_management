package za.ac.cput.school_management.controller;

/*
 *  Author:BS Brady Sheldon 219053715
 *  Student
 *  June Assignment
 * i tried but failed:')
 * */

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.school_management.domain.Student;
import za.ac.cput.school_management.factory.StudentFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudentControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private StudentController student;

    @Autowired private TestRestTemplate restTemplate;

    private Student Student;

    private String baseUrl ;

    @BeforeEach
    void setUp() {
        Student = StudentFactory
                .build(
                        "987654" ,
                        "CristerRonaldoSUI@gmail.com",
                        "Cristiano",
                        "SUUUI",
                        "Ronaldo");

        baseUrl = "http://localhost:" + this.port + "/school_management/student/";

    }

    @Order(1)
    @Test
    void save() {
        String url = baseUrl + "save";
        System.out.println(url);
        ResponseEntity<Student> response = this.restTemplate
                .postForEntity(url, this.student,Student.class);
        System.out.println(response);
        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertNotNull(response.getBody())

        );
    }

    @Order(2)
    @Test
    void read() { //{String url = baseUrl + "read/" + this.student.getStudentID();
        //       System.out.println(url);
        //      ResponseEntity<Student> response = this.restTemplate.getForEntity(url, Student.class);
        //     System.out.println(response);
        //      assertAll(
        //              () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
        //              () -> assertNotNull(response.getBody())


        //     );}
    }

    @Order(3)
    @Test
    void delete() {
        String url = baseUrl + "delete/" + this.Student.getStudentID();
        this.restTemplate.delete(url);
    }

    @Order(4)
    @Test
    void findAll() {
        String url = baseUrl + "findAll";
        System.out.println(url);
        ResponseEntity<Student[]> response = this.restTemplate.getForEntity(url, Student[].class);
        System.out.println(Arrays.asList(response.getBody()));

        assertAll(
                () -> assertEquals(HttpStatus.OK, response.getStatusCode()),
                () -> assertTrue(response.getBody().length==0)


        );
    }
}