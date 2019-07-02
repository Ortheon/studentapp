package pl.bwcislo.studentapp.repository;

import org.springframework.data.repository.CrudRepository;
import pl.bwcislo.studentapp.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
