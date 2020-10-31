package be.thomasmore.graduaten.voorbeeld.backend.service;

import be.thomasmore.graduaten.voorbeeld.backend.entity.Student;
import org.springframework.stereotype.Service;

public interface StudentService {
    Student getStudentById(Long id);
}
