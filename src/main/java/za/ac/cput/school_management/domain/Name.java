package za.ac.cput.school_management.domain;

import lombok.Builder;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/*
 *Author :Alizwa Solibanzi
 * Student no: 220001499
 * APPLICATION DEVELOPMENT PRACTICE 3
 * ASSIGNMNET 2
 *
 */
@Entity

@Table(name ="Name")
      public class Name implements Serializable {
 @NotNull
 private String firstName;
  @NotNull  private String middleName;
  @NotNull  private String lastName;

    protected Name(){}
    public Name(Builder builder){
         this.firstName = builder.firstName;;
         this.middleName = builder.middleName;;
         this.lastName = builder.lastName;
     }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    public static class Builder{
        private String firstName;
        private String middleName;
        private String lastName;

        public Builder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder setMiddleName(String middleName){
            this.middleName = middleName;
            return  this;
        }
        public Builder setLastName(String lastName){
            this.lastName = lastName;
            return  this;
        }
        public Builder copy(Name name){
            this.firstName = name.firstName;
            this.middleName = name.middleName;
            this.lastName = name.lastName;
            return this;
        }
        public Name build(){
            return  new Name(this);

        }
    }
}
