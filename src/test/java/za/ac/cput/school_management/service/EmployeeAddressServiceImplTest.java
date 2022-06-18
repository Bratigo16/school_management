package za.ac.cput.school_management.service;

import org.apache.tomcat.jni.Address;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.school_management.domain.EmployeeAddress;
import za.ac.cput.school_management.domain.StudentAddress;
import za.ac.cput.school_management.domain.factory.EmployeeAddressFactory;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class EmployeeAddressServiceImplTest {
    private final EmployeeAddress employeeAddress = EmployeeAddressFactory
            .build("test-staff-number",new Address());

    @Autowired
    private EmployeeAddressService service;
    @Test
    void save() {
        EmployeeAddress saved = this.service.save(this.employeeAddress);
        assertAll(
                () -> assertNotNull(saved),
                () -> assertEquals(this.employeeAddress, saved)
        );
    }

    @Test
    void read() {
        Optional<EmployeeAddress> read = this.service.read(this.employeeAddress.getstaffId());
        System.out.println(read);
        assertAll(
                () -> assertTrue(read.isPresent()),
                () -> assertSame(this.employeeAddress, read.get())
        );
    }

    @Test
    void delete() {
        this.service.delete(this.employeeAddress);
    }

    @Test
    void findAllStaffId() {
        String staffId = this.employeeAddress.getstaffId();
        List<EmployeeAddress> employeeAddressList
                = this.service.findAllStaffId(staffId);
        System.out.println(employeeAddressList);
        assertSame(0 ,employeeAddressList.size());
    }
}