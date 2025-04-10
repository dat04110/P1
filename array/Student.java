package queue.array;

public class Student {
    private int id;
    private String name;
    private double mark;

    public Student(String name, int id, double mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
    //Getter

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMark() {
        return mark;
    }

    public String getRanks(double mark)
    {
        if (mark < 5) return "Fail";
        else if (mark < 6.5 ) return "Medium";
        else if (mark < 7.5 ) return "Good";
        else if (mark < 9.0) return "Very good";
        else return "Excellent";
    }

    @Override
    public String toString() {
        return "Student{" + "id:" + id + ", name:" + name + ", mark:" + mark + ", rank: " + getRanks(mark) +'}';
    }
}

