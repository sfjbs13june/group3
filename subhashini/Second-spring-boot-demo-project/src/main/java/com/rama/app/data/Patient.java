package com.rama.app.data;

import java.util.Objects;

public class Patient {
  public int id;
  public int age;
  public String name;
  public String disease;

  public Patient() {
  }

  public Patient(int id,int age,String name, String disease) {

    this.id = id;
    this.age = age;
    this.name = name;
    this.disease = disease;
  }

  public Patient(String name, String disease) {
    this.name = name;
    this.disease = disease;
  }

  public int getId() {
    return this.id;
  }


  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  public String getDisease() {
    return this.disease;
  }
  public void setId(int id) {
    this.id = id;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDisease(String disease) {
    this.disease = disease;
  }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Patient))
      return false;
    Patient employee = (Patient) o;
    return Objects.equals(this.id, employee.id)
          &&  Objects.equals(this.age, employee.age)
            && Objects.equals(this.name, employee.name)
      && Objects.equals(this.disease, employee.disease);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id,this.age,this.name, this.disease);
  }

  @Override
  public String toString() {
    return "Patient{" + ", id='" + this.id + '\'' + "," + ", age='" + this.age + '\'' + "," + ", name='" + this.name + '\'' + ", disease='" + this.disease + '\'' + '}';
  }
}

