public class Student extends Person{
    private String university;

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Student(String firstName, String lastName, String university) {
        super(firstName, lastName);
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "university='" + university + '\'' +
                '}';
    }
}
