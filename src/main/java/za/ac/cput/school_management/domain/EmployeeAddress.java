package za.ac.cput.school_management.domain;

import org.apache.tomcat.jni.Address;

import java.util.Objects;

public class EmployeeAddress {
    private final String staffId;
    private Address address;

    private EmployeeAddress(EmployeeAddress.Builder builder) {
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



        public Builder setstaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public EmployeeAddress.Builder copy(EmployeeAddress employeeAddress) {
            this.staffId = staffId;
            this.address = address;

            return this;
        }

        public EmployeeAddress build() {
            return new EmployeeAddress(this);
        }

        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            if (!super.equals(object)) return false;
            Builder builder = (Builder) object;
            return java.util.Objects.equals(staffId, builder.staffId) && java.util.Objects.equals(address, builder.address);
        }

        public int hashCode() {
            return java.util.Objects.hash(super.hashCode(), staffId, address);
        }

        @java.lang.Override
        public java.lang.String toString() {
            return "Builder{" +
                    "staffId='" + staffId + '\'' +
                    ", address=" + address +
                    '}';
        }
    }
}
