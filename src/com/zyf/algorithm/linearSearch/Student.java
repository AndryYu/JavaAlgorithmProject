package com.zyf.algorithm.linearSearch;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
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
}
