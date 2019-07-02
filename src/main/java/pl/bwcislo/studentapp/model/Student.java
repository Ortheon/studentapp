package pl.bwcislo.studentapp.model;


import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Entity
public class Student  extends BaseEntity{

    private String name;
    private String surname;
    private String className;
    private String address;
    private Integer pesel;
    private Date birthdate;
    private boolean dyslexia;
    private List<Mark> marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPesel() {
        return pesel;
    }

    public void setPesel(Integer pesel) {
        this.pesel = pesel;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public boolean isDyslexia() {
        return dyslexia;
    }

    public void setDyslexia(boolean dyslexia) {
        this.dyslexia = dyslexia;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }
}
