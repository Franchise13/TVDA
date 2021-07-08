/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class03.Lession1;

/**
 *
 * @author Tran Viet Duc Anh
 */
public class TestEmployee {
    public static void main (String args[]) {
        Employee emp = new Employee(); 

    emp.setName("TVDA");
    emp.setGender("Male");
    emp.setCountry("Nam Dinh");
    emp.setDuty("Student");
    emp.setSalary(15);

    emp.display();

    Employee tmp = new Employee();
    tmp.input();
    tmp.display();
    }
}