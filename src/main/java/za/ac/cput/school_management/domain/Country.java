/*  Country.java
    Entity for the Country
    Author: Wilbur Deano Smith (220003033)
    Date: 14 June 2022
*/
package za.ac.cput.school_management.domain;


import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Country implements Serializable
{
    @NotNull @Id private String id;
    @NotNull private String name;

    protected Country(){}

    public Country(Builder builder)
    {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public static class Builder
    {
        private String id;
        private String name;

        public Builder setId(String id)
        {
            this.id = id;
            return this;
        }

        public Builder setName(String name)
        {
            this.name = name;
            return this;
        }

        public Builder copy(Country country)
        {
            this.id = country.id;
            this.name = country.name;
            return this;
        }

        public Country build()
        {
            return new Country(this);
        }
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(id, country.id) && Objects.equals(name, country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString()
    {
        return "Country{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
