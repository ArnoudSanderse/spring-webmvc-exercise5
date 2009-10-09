package arnoud.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student implements Serializable {
  @Id
  @Column(name="Student_ID")
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  
  @Column(name="Name",nullable=false,unique=true)
  private String name;
  
  @Column(name="School",nullable=false,unique=true)
  private String school;

  @Column(name="Training",nullable=false,unique=true)
  private String training;

  public Student(){}

  public Student(String n, String s, String t){
    this(0, n, s, t);
  }
  
  public Student(int i, String n, String s, String t){
    this.id = i;
    this.name = n;
    this.school = s;
    this.training = t;
  }

  public Integer getId(){
    return id;
  }

  public void setId(Integer i){
    this.id = i;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getTraining() {
        return training;
    }

    public void setTraining(String training) {
        this.training = training;
    }

  @Override
  public String toString(){
    return id + " - " + name + " - " + school + " - " + training;
  }
}