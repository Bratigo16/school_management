package za.ac.cput.school_management.factory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import za.ac.cput.school_management.domain.Name;

import static org.junit.jupiter.api.Assertions.*;

class NameFactoryTest {
   // Failing test
    @Test public  void buildFailing(){
        //
        Name  name =  NameFactory.build("","","");
        System.out.println(name);
        assertNotNull(name);
    }
 //Built with no errors
    @Test public  void buildErrorfree(){
        //
        Name  name =  NameFactory.build("Alizwa","Van Wyk","Carter");
        System.out.println(name);
        assertNotNull(name);
    }
    //Built with errors
    @Test public  void builtWithErrors(){
;
    Exception exception;
        exception = assertThrows(IllegalArgumentException.class,() ->
                NameFactory.build(null,"Van Wyk","Carter"));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("First name is required",exceptionMessage);
    }

}