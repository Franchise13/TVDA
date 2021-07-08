/*
Cài đặt lớp StudentMark gồm các thông tin:

-       Rollnumber

-       Họ tên

-       Lớp

-       Môn

-       Điểm.

 
Cài đặt đầy đủ: 2 constructor, các phương thức set/get.

Cài đặt hàm nhập, hiển thị.

Khai báo luôn hàm main trong lớp này:

Khai báo 2 đối tượng của lớp, khởi tạo 2 đối tượng bằng construcor không có tham số. Gọi hàm nhập để nhập vào các thông tin và hàm hiển thị để hiển thị các thông tin.

Hiển thị thông tin của người có điểm cao nhất.
 */
package Class03.Lession2;

import java.util.Scanner;

/**
 *
 * @author Tran Viet Duc Anh
 */
public class StudentMark {
    String id,  name,   classroom,  subject;
    float mark;
    
    public StudentMark() {
    }

    public StudentMark(String id, String name, String classroom, String subject, float mark) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
        this.subject = subject;
        this. mark = mark;
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getClassroom(){
        return classroom;
    }
    
    public void setClassroom(String classroom){
        this.classroom = classroom;
    }
    
    public String getSubject(){
        return subject;
    }
    
    public void setSubject(String subject){
        this.subject = subject;
    }
    
    public float getMark(){
        return mark;
    }
    
    public void setMark(float mark){
        this.mark = mark;
    }
    
    public void input() {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter The Rollnumber: ");
    id = input.nextLine();
    
    System.out.println("Enter The Name: ");
    name = input.nextLine();
    
    System.out.println("Enter The Classroom: ");
    classroom = input.nextLine();
    
    System.out.println("Enter The Subject: ");
    subject = input.nextLine();
    
    System.out.println("Enter The Mark: ");
    mark = Float.parseFloat(input.nextLine());
    }
    
    public void display(){
        System.out.println("Rollnumber : " + id);
        System.out.println("Name : " + name);
        System.out.println("Class : " + classroom);
        System.out.println("Subject : " + subject);
        System.out.println("Mark : " + mark);
    }
}