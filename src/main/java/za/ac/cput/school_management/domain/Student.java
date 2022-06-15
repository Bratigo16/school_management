package za.ac.cput.school_management.domain;

import java.util.Objects;
/*
 *  Author: Brady Sheldon 219053715
 *  Student
 *  June Assignment
 *  Date: 09 June 2022
 * */
public class Student {
    private final String StudentID, StudentEmail, FirstName, MiddleName, LastName;

    private Student(builder builder) {
        this.StudentID = builder.StudentID;
        this.StudentEmail = builder.StudentEmail;
        this.FirstName = builder.FirstName;
        this.MiddleName = builder.MiddleName;
        this.LastName = builder.LastName;
    }

    public String getStudentID() {
        return StudentID;
    }

    public String getStudentEmail() {
        return StudentEmail;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String MiddleName() {
        return MiddleName;
    }
    public String LastName() {
        return LastName;
    }

    public static class builder {
        private String StudentID, StudentEmail, FirstName, MiddleName, LastName;

        public builder StudentID(String StudentID) {
            this.StudentID = StudentID;
            return this;
        }

        public builder StudentEmail(String studentEmail) {
            this.StudentEmail = studentEmail;
            return this;
        }

        public builder FirstName(String FirstName) {
            this.FirstName = FirstName;
            return this;
        }
        public builder MiddleName(String MiddleName) {
            this.MiddleName = MiddleName;
            return this;
        }
        public builder LastName(String LastName) {
            this.LastName = LastName;
            return this;
        }

        public builder Copy(Student Student) {

            this.StudentID = Student.StudentID;
            this.StudentEmail = Student.StudentEmail;
            this.FirstName = Student.FirstName;
            this.MiddleName = Student.MiddleName;
            this.LastName = Student.LastName;

            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return StudentID.equals(student.StudentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(StudentID, StudentEmail, FirstName, MiddleName, LastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentID='" + StudentID + '\'' +
                ", Student email='" + StudentEmail + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", MiddleName='" + MiddleName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}