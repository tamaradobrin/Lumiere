package edu.assign.bean;

import edu.assign.entity.Student;
import edu.assign.repository.StudentRepository;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class StudentBean {

    @EJB
    private StudentRepository studentRepository;
    private Student student;
    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList(){
        studentList = studentRepository.findAll();
        return studentList;
    }

    public String addNewStudent(){
        student = studentRepository.save(student);
        studentList = studentRepository.findAll();
        return "studentList.xhtml";
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
