package lecture2;

public class Student {
    //Variable
    /*
    Multiple comment
     */
    private String name;
    private String mssv;
    private String birthday;
    private String gender;
    private float gpa;

    public Student(){

    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String mssv) {
        this.name = name;
        this.mssv = mssv;
    }

    public Student(String name, String mssv, String birthday, String gender, float gpa) {
        this.name = name;
        this.mssv = mssv;
        this.birthday = birthday;
        this.gender = gender;
        this.gpa = gpa;
    }

    public String getName(){
        return this.name;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mssv='" + mssv + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
