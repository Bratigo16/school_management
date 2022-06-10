package za.ac.cput.school_management.domain;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/*
 *Author :Alizwa Solibanzi
 * Student no: 220001499
 * APPLICATION DEVELOPMENT PRACTICE 3
 * ASSIGNMNET 2
 *
 */
public class City {
    private String id;
    private  String name;
    private String  country;

   public City (Builder builder){
       this.id = builder.id;
       this.name = builder.name;
       this.country = builder.country;
   }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return city.equals(city.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }



    public class Builder {
        private String id;
        private String name;
        private String country;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder copy( City city) {
            this.id =city.id ;
            this.name = city.name;
            this.country = city.country;
            return  this;
        }
        public City build(){
            return  new City(this);
        }


    }
}
