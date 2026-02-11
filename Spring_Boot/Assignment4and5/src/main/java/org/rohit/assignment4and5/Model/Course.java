package org.rohit.assignment4and5.Model;

public class Course {

    private int id;
    private String userName;
    private String courseName;

    public Course(int id, String userName, String courseName) {
        this.id = id;
        this.userName = userName;
        this.courseName = courseName;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getCourseName() {
        return courseName;
    }


    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }

}
