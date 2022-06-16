package za.ac.cput.school_management.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.Name;
import za.ac.cput.school_management.factory.NameFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NameServiceImplTest {
private  Name name;
private NameServiceImpl Service;
@BeforeEach
void setup(){
   this.name = NameFactory.build("test-FirstName","test-MiddleName","LastName");
   this.Service = NameServiceImpl.getNAMEService();
    Name saved =this.Service.save(this.name);
    assertSame(this.name,saved);
}
@AfterEach
void  teardown(){
    this.Service.delete(this.name);
    List<Name> NameList = this.Service.findAll();
    assertEquals(0, NameList.size());
}

    @Test
    void reading() {
    this.Service.reading(name);
    }

    @Test
    void findAll() {
        List<Name> NameList = this.Service.findAll();
        assertEquals(1, NameList.size());
    }
}