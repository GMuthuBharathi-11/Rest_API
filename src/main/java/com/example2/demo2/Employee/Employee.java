package com.example2.demo2.Employee;

public class Employee
{
    private int Id;

    private String Name;

    private int  age;

    public Employee(int Id, String Name, int age)
    {
     this.age=age;
     this.Id=Id;
     this.Name=Name;
    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "Id=" + Id +
               ", Name='" + Name + '\'' +
               ", age=" + age +
               '}';
    }
}
