package com.srk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srk.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

}
