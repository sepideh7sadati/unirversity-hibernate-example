package service;

import dao.StudentDao;
import entity.Student;

public class StudentService {
    StudentDao studentDao;
    public void save(Student student){
      studentDao = new StudentDao();
      studentDao.saveStudent(student);

    }

}
