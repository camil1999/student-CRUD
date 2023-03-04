//package az.developia.studentcrud.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import az.developia.studentcrud.model.Student;
//import az.developia.studentcrud.repository.StudentRepository;
//
//@Service
//public class StudentService {
//	@Autowired
//	private StudentRepository repository;
//
//	public List<Student> findAll() {
//		return repository.findAll();
//
//	}
//
//	public void save(Student s) {
//		repository.save(s);
//
//	}
//
//	public void deleteById(Integer id) {
//		repository.deleteById(id);
//
//	}
//
//	public Student findById(Integer id) {
//		
//		Optional<Student> finded = repository.findById(id);
//		if(finded.isPresent()) {
//			return finded.get();
//		}else {
//			return null;
//		}
//	}
//
//}
