package Hw;

import java.util.Objects;

public class Employee {
    private int numberOfOtdel;
    private String fullNameOfEmployee;
    private int salaryOfEmployee;
    private static int  counter;
    private  int id;


    public Employee(String fullNameOfEmployee,int salaryOfEmployee,int numberOfOtdel) {
        this.numberOfOtdel=numberOfOtdel;
        this.fullNameOfEmployee=fullNameOfEmployee;
        this.salaryOfEmployee=salaryOfEmployee;
        id=++counter;
    }
    public int getNumberOfOtdel() {
        return numberOfOtdel;
    }
    public String getFullNameOfEmployee() {
        return fullNameOfEmployee;
    }
    public int getSalaryOfEmployee() {
        return salaryOfEmployee;
    }
    public void setNumberOfOtdel(byte numberOfOtdel) {
        this.numberOfOtdel = numberOfOtdel;
    }
    public void setSalaryOfEmployee(int salaryOfEmployee) {
        this.salaryOfEmployee = salaryOfEmployee;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return numberOfOtdel == employee.numberOfOtdel && salaryOfEmployee == employee.salaryOfEmployee &&
                id == employee.id && Objects.equals(fullNameOfEmployee, employee.fullNameOfEmployee);
    }
    @Override
    public int hashCode() {
        return Objects.hash(numberOfOtdel, fullNameOfEmployee, salaryOfEmployee, id);
    }
    @Override
    public String toString() {
        return "Employee{" +
                "numberOfOtdel=" + numberOfOtdel +
                ", totalNameOfEmployee='" + fullNameOfEmployee + '\'' +
                ", salaryOfEmployee=" + salaryOfEmployee +
                ", id=" + id +
                '}';
    }
}

