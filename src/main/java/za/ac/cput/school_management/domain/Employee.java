/*
 *Author:Chad Siegelaar 218340982
 *Employee entity
 *09 June 2022
 */

package za.ac.cput.school_management.domain;


import java.util.Objects;

public class Employee {
    private final String staffId;
    private String email;
    private Name name;

    private Employee(Employee.Builder builder){
        this.staffId = builder.staffId;
        this.email = builder.email;
        this.name = builder.name;
    }

    public String getStaffId(){return staffId;}
    public String getEmail(){return email;}
    public Name getName(){return name;}

    public static class Builder{
        public String staffId;
        public String email;
        public Name name;

        public Employee.Builder staffId(String staffId) {
            this.staffId = staffId;
            return this;
        }
        public Employee.Builder email(String email) {
            this.email = email;
            return this;
        }
        public Employee.Builder name(Name name) {
            this.name = name;
            return this;
        }
        public Employee.Builder copy(Employee employee){
            this.staffId =  employee.staffId;
            this.email =  employee.email;
            this.name =  employee.name;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }

        @Override
        public boolean equals(Object o)
        {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return staffId.equals(staffId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(staffId);
        }

    @Override
    public String toString() {
        return "Employee{" +
                "staffId='" + staffId + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    }
}
