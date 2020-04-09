package lecture8.sort;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSort {
    public static void main(String... sortingWithList) {
        Timestamp now2 = new Timestamp(System.currentTimeMillis());
        List<Teacher> teachers = new ArrayList<>();
        Timestamp now = new Timestamp(System.currentTimeMillis());
        teachers.add(new Teacher(now, true));
        teachers.add(new Teacher(now, false));
        teachers.add(new Teacher(now2, true));
        teachers.add(new Teacher(now2, false));

        //Ascending
        System.out.println("=============== Sort ascending");
        Collections.sort(teachers, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                int s = 0;
                if(o1.getDateTime().before(o2.getDateTime())){
                    s = -1;
                } else if(o1.getDateTime().equals(o2.getDateTime())){
                    if(o1.getIsUnbind() == true){
                        s = -1;
                    } else {
                        s = 1;
                    }
                }
                return s;
            }
        });

        for(Teacher t : teachers){
            System.out.println(t.toString());
        }
    }
}

class Teacher{
    Timestamp dateTime;
    Boolean isUnbind;

    public Teacher(Timestamp dateTime, Boolean isUnbind) {
        this.dateTime = dateTime;
        this.isUnbind = isUnbind;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public Boolean getIsUnbind() {
        return isUnbind;
    }

    public void setIsUnbind(Boolean unbind) {
        isUnbind = unbind;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "dateTime=" + dateTime +
                ", isUnbind=" + isUnbind +
                '}';
    }
}

