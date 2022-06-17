package za.ac.cput.school_management.domain;

import org.apache.tomcat.jni.Address;

import java.util.Objects;

public class EmployeeAddress {
    private final String staffId;
    private Address address;

    private EmployeeAddress(Builder builder) {
        this.staffId = builder.staffId;
        this.address = builder.address;

    }

    public String getstaffId() {

        return staffId;
    }

    public Address getAddress() {

        return address;
    }

    public static class Builder {

        private String staffId;
        private Address address;



        public Builder staffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public Builder Address(Address address) {
            this.address = address;
            return this;
        }

        public Builder copy(EmployeeAddress employeeAddress) {
            this.staffId = staffId;
            this.address = address;

            return this;
        }

        public EmployeeAddress build() {
            return new EmployeeAddress(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Builder)) return false;
            Builder builder = (Builder) o;
            return staffId.equals(builder.staffId) && address.equals(builder.address);
        }

        @Override
        public int hashCode() {
            return Objects.hash(staffId, address);
        }

        @Override
        public java.lang.String toString() {
            return "Builder{" +
                    "staffId='" + staffId + '\'' +
                    ", address=" + address +
                    '}';
        }
    }
}
