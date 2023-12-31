package dao.bean;

public class teacher {
//    NAME VARCHAR(30) NOT NULL,
//    teacher_id INT NOT NULL,
//    birthday DATE,
//    PASSWORD INT,
//    gender ENUM('男', '女') NOT NULL,
//    department VARCHAR(50) NOT NULL,
//    major VARCHAR(50) NOT NULL
    private String name;
    private String teacher_id;
    private String birthday;
    private String gender;
    private String department;
    private String major;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "name='" + name + '\'' +
                ", teacher_id='" + teacher_id + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
