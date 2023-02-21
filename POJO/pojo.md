# POJO

- POJO stands for Plain Old Java Object.

- Defining a POJO means defining the characteristic of a class. A class is called POJO when

1. It does not extends any other class

2. It does not implements any interface

3. It does not have Annotations

- POJOs are used for increasing the readability and re-usability of a program.

## Java Beans

- Beans are special type of Pojos. There are some restrictions on POJO to be a bean.

- All JavaBeans are POJOs but not all POJOs are JavaBeans.

- Serializable i.e. they should implement Serializable interface. Still, some POJOs who don’t implement a Serializable interface are called POJOs because Serializable is a marker interface and therefore not of many burdens.

- Fields should be private. This is to provide complete control on fields.

- Fields should have getters or setters or both.

- A no-arg constructor should be there in a bean.

- Fields are accessed only by constructor or getter setters.