package za.ac.cput.school_management.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.school_management.domain.City;
import za.ac.cput.school_management.domain.Name;
import za.ac.cput.school_management.factory.NameFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = NameServiceImpl.class)

class NameServiceImplTest {

private  Name name = NameFactory.build("test-FirstName",
        "test-MiddleName","LastName");

@Autowired private  NameServiceImpl Service;
@Test
void save(){

    Name saved = this.Service.save(this.name);
    assertAll(
            () -> assertNotNull(saved), () -> assertEquals(this.name, saved));
}
@Test
void  delete(){
    this.Service.delete(this.name);
    List<Name> NameList = this.Service.findAll();
    assertEquals(0, NameList.size());
}

    @Test
    void reading() {
    this.Service.reading(name);
        assertNotNull(this.name);
    }

    @Test
    void findAll() {
        List<Name> NameList = this.Service.findAll();
        assertEquals(1, NameList.size());
    }
}