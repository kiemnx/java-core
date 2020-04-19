package lecture4;

import java.util.Scanner;

public class MainOOP {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so sv: ");
        int n = scanner.nextInt();

        int x;

        Integer m = null;

        scanner.nextLine();

        Student[] students = new Student[n];



        for(int i = 0; i<n; i++){
            System.out.println("Nhap vao svien thu " + (i+1));
            String thongTin = scanner.nextLine();
            String[] thongTins = thongTin.split(" ");

            students[i] = new Student(thongTins[0], Integer.valueOf(thongTins[1]), thongTins[2]);

          /* students[i] = new Student();
          students[i].setTen(thongTins[0]);
            students[i].setTuoi(Integer.valueOf(thongTins[1]));
            students[i].setGioiTinh(thongTins[2]);*/
        }

        Student temp = null;
        for(int i = 0; i<students.length-1; i++){
            for(int j = i+1; j<students.length; j++) {
                if(students[i].getTuoi() > students[j].getTuoi()){
                    temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        for(Student st : students){
            System.out.println("Name: " + st.getTen() + " Tuoi: " + st.getTuoi());
        }
    }
}
