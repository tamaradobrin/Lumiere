package edu.assign.entity;

import javax.persistence.*;

@Entity
public class Preference {

    @EmbeddedId
    private PreferenceId id;

    @ManyToOne
    @MapsId("studentid")
    @JoinColumn(name = "studentid")
    private Student student;

    @ManyToOne
    @MapsId("projectid")
    @JoinColumn(name = "projectid")
    private Project project;

    private Integer rank;

    public PreferenceId getId() {
        return id;
    }

    public void setId(PreferenceId id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
}
