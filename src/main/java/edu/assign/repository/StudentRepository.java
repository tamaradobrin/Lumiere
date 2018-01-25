package edu.assign.repository;

import edu.assign.entity.Student;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class StudentRepository {

    @PersistenceContext(unitName = "lune")
    private EntityManager em;

    public List<Student> findAll(){
        TypedQuery<Student> query = em.createQuery("select s from Student s", Student.class);
        return query.getResultList();
    }

    public Student save(Student student){
        em.persist(student);
        return student;
    }

}
