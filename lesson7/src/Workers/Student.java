package Workers;

public class Student extends Worker {
    private static final int GRADE = 3;

    public Student(String name) {
        super(name, GRADE);
        minSalary = random.nextDouble(2000, 4000);
    }

}