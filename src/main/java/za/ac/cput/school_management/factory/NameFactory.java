package za.ac.cput.school_management.factory;

import za.ac.cput.school_management.domain.Name;

public class NameFactory {
    public static Name build( String firstName, String middleName, String lastName){

        if ( firstName == null ||firstName.isEmpty()  )
            throw new IllegalArgumentException("First name is required");
        if (  middleName.isEmpty())
            throw new IllegalArgumentException("Middle Name can be empty but not null");
        if ( lastName == null ||lastName.isEmpty() )
            throw new IllegalArgumentException("Last name is required");
        return  new Name.Builder().setFirstName(firstName).setMiddleName(middleName)
                .setLastName(lastName).build();
    }
}