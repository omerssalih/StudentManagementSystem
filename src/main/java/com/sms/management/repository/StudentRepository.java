package com.sms.management.repository;

import com.sms.management.entity.Student;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

  Optional<Student> findStudentByEmail(String email);

  Optional<List<Student>> findStudentsByAssignedCourses_courseId(Long courseId);

  Long countByAssignedCourses_courseId(Long courseId);

  boolean existsByEmail(String email);
}
