package za.ac.cput.school_management.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.util.Objects;

@Builder
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Address {
    private String unitNumber;
    private String complexName;
    private String streetNumber;
    private String streetName;
    private int postalCode;
    private City city;

    private Address(Builder builder){
        this.unitNumber = builder.unitNumber;
        this.complexName = builder.complexName;
        this.streetName = builder.streetName;
        this.streetNumber = builder.streetNumber;
        this.postalCode = builder.postalCode;
        this.city = builder.city;

    }
    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getComplexName() {
        return complexName;
    }

    public void setComplexName(String complexName) {
        this.complexName = complexName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }


    public static class Builder{
        public String unitNumber;
        public String complexName;
        public String streetNumber;
        public String streetName;
        public Integer postalCode;
        public City city;

        public Address.Builder UnitNumber(String unitNumber) {
            this.unitNumber = unitNumber;
            return this;
        }

        public Address.Builder complexName(String complexName) {
            this.complexName = complexName;
            return this;
        }

        public Address.Builder StreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Address.Builder StreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Address.Builder PostalCode(int postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Address.Builder City(City city) {
            this.city = city;
            return this;
        }
        public Builder copy(Address address){
            this.unitNumber = address.unitNumber;
            this.complexName = address.complexName;
            this.streetNumber = address.streetNumber;
            this.streetName = address.streetName;
            this.postalCode = address.postalCode;
            this.city = address.city;
            return this;
        }
        public Address build(){
            return new Address(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return postalCode == address.postalCode && Objects.equals(unitNumber, address.unitNumber) && Objects.equals(complexName, address.complexName) && Objects.equals(streetNumber, address.streetNumber) && Objects.equals(streetName, address.streetName) && Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitNumber, complexName, streetNumber, streetName, postalCode, city);
    }

    @Override
    public String toString() {
        return "Address{" +
                "unitNumber='" + unitNumber + '\'' +
                ", complexName='" + complexName + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", postalCode=" + postalCode +
                ", city=" + city +
                '}';
    }
}
