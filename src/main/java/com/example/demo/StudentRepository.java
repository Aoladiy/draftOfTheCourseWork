package com.example.demo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("select p from Student p where concat(p.first, '', p.last, '', p.num, '', p.av) like %?1%")
    List<Student> search(String keyword);
}
