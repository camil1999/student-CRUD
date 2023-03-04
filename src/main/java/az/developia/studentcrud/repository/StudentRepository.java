package az.developia.studentcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.studentcrud.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
List<Student>findAllByTeacher(String teacher);
}