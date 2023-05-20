package com.workers;




public class Employee {

    private Gender gender;
    private Profession profession;
    private double salary;



    public Gender getGender(){
        return this.gender;
    }

    public void setGender(Gender gender){
        this.gender = gender;
    }

    public Profession getProfession(){
        return this.profession;
    }

    public void setProfession(Profession p){
        this.profession = p;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public class Statistic{

        public double annualSalary(){
            // Returning annual salary
            return getSalary() * 12;
        }



        public void hasMoreSalary(){
            if (getSalary() > getProfession().getAverageSalary()){
                System.out.println("Worker has greater salary than should have");
            } else {
                System.out.println("Worker has not greater salary than should have");
            }

        }
    }


}






