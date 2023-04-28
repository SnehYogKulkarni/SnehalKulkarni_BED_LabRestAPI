package com.CollegeFest.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CollegeFest.Entity.Student;
import com.CollegeFest.Repository.StudentRepository;
import com.CollegeFest.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepo;

	@Override
	public List<Student> getStudents() {

		return studentRepo.findAll();
	}

	@Override
	public Student save(Student student) {

		return studentRepo.save(student);
	}

	@Override
	public Student update(Student student) {

		return studentRepo.save(student);
	}

	@Override
	public Student findById(Long id) {

		return studentRepo.findById(id).get();
	}

	@Override
	public void delete(Long id) {

		Student st = this.findById(id);
		studentRepo.delete(st);

	}

}
