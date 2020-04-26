package chuabaibuoi4;

public class QuanLySinhVien {

    public Student timTheoTenSV(String name, Student[] students){
        for(Student st : students){
            if(st.getName().equals(name)){
                return st;
            }
        }
        return null;
    }

    /*public Student[] timTheoDanhMuc(String nameCategory, Student[] students){

    };*/

}
