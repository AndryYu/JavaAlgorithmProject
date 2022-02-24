package com.zyf.algorithm.datastructure;

import com.sun.istack.internal.NotNull;

public class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object student){
        if (this == student)
            return true;

        if (student==null)
            return false;

        if (student instanceof Student) {
            Student another = (Student) student;
            return this.name.toLowerCase()
                    .equals(another.name.toLowerCase());
        }
        return false;
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return Integer.compare(this.score, o.score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public static void main(String[] args) {
        //自定义对象
        Array<Student> studentArray = new Array<>();
        studentArray.addLast(new Student("Alice",97));
        studentArray.addLast(new Student("Bobo",77));
        studentArray.addLast(new Student("Charles",85));
        System.out.println(studentArray);
    }
}
