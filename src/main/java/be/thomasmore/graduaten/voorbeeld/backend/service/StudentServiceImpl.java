package be.thomasmore.graduaten.voorbeeld.backend.service;

import be.thomasmore.graduaten.voorbeeld.backend.entity.Student;
import be.thomasmore.graduaten.voorbeeld.backend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.getOne(id);
    }

}
