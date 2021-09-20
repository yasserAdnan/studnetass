package entites;

public class Course {

    private int ID;
    private String name;
    private double mark;

    private static int countForID = 1;

    public Course() {
        this.ID = countForID;
        countForID++;
    }

    public Course(String name, double mark) {
        this.ID = countForID;
        countForID++;
        this.name = name;
        this.mark = mark;
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

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Course{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
