package com.CollegeFest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CollegeFest.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
