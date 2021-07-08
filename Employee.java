/*
Cài đặt lớp Employee gồm các thông tin:

-       Họ tên             (String)

-       Giới tính          (String)

-       Quê quán        (String)

-       Chức vụ          (String)

-       Lương             (double)

 
Cài đặt 2 constructors.

Cài đặt các phương thức set/get cho các thuộc tính

Cài đặt hàm nhập, hiển thị.

Cài đặt lớp Test, có hàm main:

Khai báo 2 đối tượng của lớp.

1 đối tượng gọi constructor có tham số. 1 đối tượng gọi constructor không có tham số (phải gọi hàm nhập để lấy thông tin).

Gọi hàm hiển thị để hiển thị kết quả.
 */
package Class03.Lession1;

import java.util.Scanner;

/**
 *
 * @author Tran Viet Duc Anh
 */
public class Employee {
    String fullname;
    String gender;
    String country;
    String duty;
    double salary;
    
    public String getName() {
        return fullname;
    }

    public void setName(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public double getSalary() {
        return salary;
    }
    
    public double setSalary(double salary) {
        if(salary <= 0){
            System.err.println("Invalid salary!!! Please try again");
        }else{
            this.salary = salary;
        }    
        return 0;
    }
    
    public void input(){
    Scanner input = new Scanner(System.in);
    System.out.println("\n\nEnter your fullname: ");
    fullname = input.nextLine();
    System.out.println("Enter your gender: ");
    gender = input.nextLine();
    System.out.println("Enter your country: ");
    country = input.nextLine();
    System.out.println("Enter your duty: ");
    duty = input.nextLine();
    System.out.println("Enter your salary: ");
    salary = input.nextDouble();
    }
    
    public void display(){
        System.out.format("\nFullname: %s \nGender: %s \nCountry: %s \nDuty: %s \nSalary: %f", fullname,gender,country,duty,salary);
    }
}