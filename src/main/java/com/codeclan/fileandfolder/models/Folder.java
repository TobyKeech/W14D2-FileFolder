package com.codeclan.fileandfolder.models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "title")
    private String title;
    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    @OneToMany(mappedBy = "files")
    private List<Folder>folders;

    public Folder(String title, Person person) {
        this.title = title;
        this.person = person;
        this.folders = new ArrayList<Folder>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }
}
