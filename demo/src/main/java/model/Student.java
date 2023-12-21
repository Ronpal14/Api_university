package model;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    private String dni;
    private String name;
    private Date dateOfBirth;
    private String address;
    private int phoneNumber;
}
