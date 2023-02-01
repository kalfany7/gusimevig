public class Group {
    private int size;
    public Student[] students;
    private int occupiedSpots;

    public Group (int size) {
        this.size = size;
        students = new Student[size];
        occupiedSpots = 0;
    }

    public void addToGroup(Student student) 
    {
        if (occupiedSpots < size)
        {
            students[occupiedSpots] = student;
            occupiedSpots++;
        } else {
            System.out.println("Group has already reached maximum capacity");
        }
    }

}
