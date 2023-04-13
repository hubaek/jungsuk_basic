package ch12;

import java.util.ArrayList;
import java.util.Iterator;

class Ex12_2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("자바왕", 1, 1));
        list.add(new Student("자바짱", 1, 2));
        list.add(new Student("홍길동", 2, 1));

        Iterator<Student> it = list.iterator();
//        Iterator it = list.iterator();
        while (it.hasNext()) {
            //  Student s = (Student)it.next(); // 지네릭스를 사용하지 않으면 형변환 필요.
            Student s = it.next();  // next가 반환하는 타입(값)이 Student.
            System.out.println(s.name);
//            System.out.println(it.next().name);   // 위 두줄을 한줄로 적을 수 있음
        }
    } // main
}


class Student {
    String name = "";
    int ban;
    int no;

    Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}