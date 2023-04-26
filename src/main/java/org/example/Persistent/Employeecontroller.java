package org.example.Persistent;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Employeecontroller {

    static  List<Employee> elis;
    static void loademp(){

         elis=EmployeeRepository.loademployee();

    }

    static void mth1(){

        // Query 1 : How many male and female employees are there in the organization?

        Map<String,Long> res=elis.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        res.entrySet().forEach(System.out::println);

    List<String> empnames=elis.stream().map(Employee::getName).collect(Collectors.toList());
    empnames.forEach(System.out::println);

    List<Double> empsalary=elis.stream()
            .filter(salary->salary.getSalary()>30000).map(sal->sal.getSalary()+10000).collect(Collectors.toList());
        System.out.println(empsalary);


    }

    static void mth2(){
        // Query 2 : Print the name of all departments in the organization?

        List<String> orgnames=elis.stream()
                .map(Employee::getDepartment).distinct().collect(Collectors.toList());
        System.out.println(orgnames);


    }

    static void mth3(){

        //Query 3 : What is the average age of male and female employees?
        //{Male=30.181818181818183, Female=27.166666666666668}

        Map<String,Double> age=elis.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
        System.out.println(age);

    }
    static void mth4(){

        // Query 4 : Get the details of highest paid employee in the organization?
        //Name :Anuj ChettiarId :277

        Optional<Employee> highpayemp=elis.stream()
                .max(Comparator.comparing(Employee::getSalary));
        System.out.println(highpayemp.get().getId());
        System.out.println(highpayemp.get().getSalary());

    }

    static void mth5(){
// Query 5 : Get the names of all employees who have joined after 2015?
        /*Iqbal Hussain
        Amelia Zoe
        Nitin Joshi
        Nicolus Den
        Ali Baig*/

        List<String> empnames=elis.stream()
                .filter(names->names.getYearOfJoining()>2015).map(Employee::getName).collect(Collectors.toList());
        System.out.println(empnames);

    }

    static void mth6(){

        // Query 6 : Count the number of employees in each department?

        Map<String,Long> empcount=elis.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        empcount.forEach((k,v)->{

            System.out.println("Department="+k);
            System.out.println("Emp Count="+v);

        });

    }

    static void mth7() {

// Query 7 : What is the average salary of each department?

        Map<String,Double> avgsalary=
                elis.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgsalary );


    }
    static void mth8(){

        // Query 8 : Get the details of youngest male employee in the product
        // development department?
        // 222
        // 25
        Optional<Employee> youthemp=elis.stream()
                .filter(emp->emp.getGender()=="Male" && emp.getDepartment()=="Product Development")
                .collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
        System.out.println(youthemp.get().getId());
        System.out.println(youthemp.get().getAge());

    }

    static void mth9(){

        // Query 9 : Who has the most working experience in the organization?
        //177
        //35

        Optional<Employee> emp=elis.stream()
                .collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
        System.out.println(emp.get().getId());
        System.out.println(emp.get().getYearOfJoining());

    }

    static void mth10(){

        // Query 10 : How many male and female employees are there in the sales and
        // marketing team?
        //{Female=1, Male=2}

        Map<String,Long> emps=elis.stream()
                .filter(e->e.getDepartment()=="Sales And Marketing")
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(emps);



    }

    static void mth11(){

            // Query 11 : What is the average salary of male and female employees?
        //{Male=21300.090909090908, Female=20850.0}

        Map<String,Double> avgsa=elis.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgsa);

    }
    static void mth12(){

        // Query 12 : List down the names of all employees in each department?

        Map<String,List<Employee>> depnames=elis.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
       // List<String> names= depnames.entrySet().stream().map(nam->nam).collect(Collectors.toList());
        depnames.forEach((k,v)->{

            System.out.println("Department="+k);
            System.out.println("count is:"+v.size());
            for (Employee e:v){
                System.out.println(e.getName());
            }
            //System.out.println("emp is="+v);
        });


    }

    static void mth13(){
        //high paid employee each deptpartment

        Map<String,Optional<Employee>> res=elis.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(res);
        res.forEach((k,v)->{

            System.out.println("Department is="+k);
            System.out.println("Emp sal is="+v.get().getSalary());

        });

    }
    public static void main(String[] args) {


        loademp();
       // mth1();
        //mth2();
        //mth3();
        //mth4();
       // mth5();
        //mth6();
        //mth7();
       // mth8();
        //mth9();
       // mth10();
        //mth11();
        //mth12();
        mth13();

    }


}



