package org.example.persistent1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Emp{
    private int Id;
    private String name;
    private int salary;

    public Emp(int id, String name, int salary) {
        Id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class ListToMap {

    static void mth1(){

        List<Emp> emp=new ArrayList<>();

        emp.add(new Emp(101,"muruga" , 20000));
        emp.add(new Emp(102,"muruga1" , 20006));
        emp.add(new Emp(103,"muruga2" , 20008));
        emp.add(new Emp(104,"muruga7" , 20002));

        System.out.println(emp);

        //tomap

        Map<Integer,Integer> idandname=emp.stream().collect(Collectors.toMap(Emp::getId,Emp::getSalary));
        System.out.println(idandname);

    }

    public static void main(String[] args) {
        mth1();
    }
}
