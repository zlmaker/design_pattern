package iterator;

public interface StudentService {
    void addStudent(Student student);

    void removeStudent(Student student);

    Iterator<Student> getIterator();
}
