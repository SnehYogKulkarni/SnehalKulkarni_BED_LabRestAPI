package com.CollegeFest.Service;

import java.util.List;

import com.CollegeFest.Entity.Student;

public interface StudentService {
	public List<Student> getStudents();

	public Student save(Student student);

	public Student update(Student student);

	public void delete(Long id);

	public Student findById(Long id);
}
