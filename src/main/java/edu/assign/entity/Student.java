package edu.assign.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    private Integer id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "projectid")
    private Project project;

    @OneToMany(mappedBy = "student")
    private List<Preference> preferences;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
