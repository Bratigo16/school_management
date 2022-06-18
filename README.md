# Improvements to design and system

The uml design could have bridging entities instead of having 
entities having aggregation and composition.

The entity Address cannot exist without a City and 
a City cannot exist without a Country. This is composition.
While this works in the real world, it is a problem for a 
relational database. 

If a City or Country is deleted, updated or created, they 
need to be deleted, updated or created in many locations.

In a relational database the values of the City and Country
will be duplicated in more than one place. This is data
redundancy and can cause problems in a database.

This can be mediated by creating bridging entities between 
these entities that can help to alleviate the data redundancy 
that the composition will create.

This will also allow for an Address to exist without
having to create a City first, and a City to exist without 
having to create a Country first.

This will allow them to be independently deployable
as microservices, as they can now be created without having to 
depend on the existence of other entities.
