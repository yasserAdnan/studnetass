package entites;

import java.util.ArrayList;

public class Student {

    private int ID;
    private String name;
    private ArrayList<Course> courses;

    private static int countForID = 1;

    public Student() {
        courses = new ArrayList<>();
        ID = countForID;
        countForID++;
    }

    public Student(String name) {
        courses = new ArrayList<>();
        this.ID = countForID;
        countForID++;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(int courseID) {
        for (int i = 0; i < courses.size(); i++) {
            Course course = courses.get(i);
            if (course.getID() == courseID) {
                courses.remove(i);
                System.out.println("Course Removed Successfully...");
                break;
            }
        }
    }

    public String displayCourses() {
        if (courses.isEmpty()) {
            return ("There is NO Courses...");
        } else {
            String coursesData = "";
            for (Course course : courses) {
                coursesData += course + "\n";
            }
            return coursesData;
        }
    }

    public Course minCourse() {
        if (courses.isEmpty()) {
            return null;
        }

        double min = courses.get(0).getMark();
        Course minCourse = courses.get(0);
        for (Course course : courses) {
            if (course.getMark() < min) {
                min = course.getMark();
                minCourse = course;
            }
        }
        return minCourse;
    }

    public Course maxCourse() {
        if (courses.isEmpty()) {
            return null;
        }

        double max = courses.get(0).getMark();
        Course maxCourse = courses.get(0);
        for (Course course : courses) {
            if (course.getMark() > max) {
                max = course.getMark();
                maxCourse = course;
            }
        }
        return maxCourse;
    }

    public double avg() {
        if (courses.isEmpty()) {
            return -1;
        }
        double sum = 0;
        for (Course course : courses) {
            sum += course.getMark();
        }
        return sum / courses.size();
    }

    @Override
    public String toString() {
        return
                "Student Number =" + ID +
                ", name='" + name + '\'' +
                '}' + "\n" + displayCourses();
    }
}
