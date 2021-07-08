/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class03.Lession2;

/**
 *
 * @author Tran Viet Duc Anh
 */
public class TestStudentMark {
    public static void main(String[] args) {
    StudentMark a;
    StudentMark b = new StudentMark();
    a = new StudentMark("A01", "TVDA", "12H", "IT", 10);

    b.input();
    a.display();
    b.display();

    System.out.println("\nSinh viên có điểm cao nhất là: ");
        if (a.getMark() > b.getMark()) {
            a.display();
        } else {
            b.display();
        }
    }
}
