/*
 *Author:Tasneem Jacobs 215030389
 *Applications Development ADP3
 *Assignment School management
 *Entity :Student Address
 */

package za.ac.cput.school_management.domain;

import java.util.Objects;

public class StudentAddress {
    private final String studentId,address;


    private StudentAddress(Builder builder) {
        this.studentId = builder.studentId;
        this.address = builder.address;

    }

    public String getStudentId() {
        return studentId;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder {

        private String studentId, address;


        public Builder studentId(String studentID) {
            this.studentId = studentID;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }



        public Builder copy(StudentAddress studentAddress) {
            this.studentId = studentId;
            this.address = address;

            return this;
        }

        public StudentAddress build() {
            return new StudentAddress(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            StudentAddress studentAddress = (StudentAddress) o;
            return studentId.equals(studentAddress.studentId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(studentId);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "studentId='" + studentId + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }

}

