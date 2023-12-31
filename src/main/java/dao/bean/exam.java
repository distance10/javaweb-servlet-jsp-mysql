package dao.bean;

public class exam {
    private String math_exam_time;
    private String math_exam_location;
    private String english_exam_time;
    private String english_exam_location;
    private String chinese_exam_time;
    private String chinese_exam_location;
    private String physics_exam_time;
    private String physics_exam_location;

    public String getMath_exam_time() {
        return math_exam_time;
    }

    public void setMath_exam_time(String math_exam_time) {
        this.math_exam_time = math_exam_time;
    }

    public String getMath_exam_location() {
        return math_exam_location;
    }

    public void setMath_exam_location(String math_exam_location) {
        this.math_exam_location = math_exam_location;
    }

    public String getEnglish_exam_time() {
        return english_exam_time;
    }

    public void setEnglish_exam_time(String english_exam_time) {
        this.english_exam_time = english_exam_time;
    }

    public String getEnglish_exam_location() {
        return english_exam_location;
    }

    public void setEnglish_exam_location(String english_exam_location) {
        this.english_exam_location = english_exam_location;
    }

    public String getChinese_exam_time() {
        return chinese_exam_time;
    }

    public void setChinese_exam_time(String chinese_exam_time) {
        this.chinese_exam_time = chinese_exam_time;
    }

    public String getChinese_exam_location() {
        return chinese_exam_location;
    }

    public void setChinese_exam_location(String chinese_exam_location) {
        this.chinese_exam_location = chinese_exam_location;
    }

    public String getPhysics_exam_time() {
        return physics_exam_time;
    }

    public void setPhysics_exam_time(String physics_exam_time) {
        this.physics_exam_time = physics_exam_time;
    }

    public String getPhysics_exam_location() {
        return physics_exam_location;
    }

    public void setPhysics_exam_location(String physics_exam_location) {
        this.physics_exam_location = physics_exam_location;
    }

    @Override
    public String toString() {
        return "exam{" +
                "math_exam_time='" + math_exam_time + '\'' +
                ", math_exam_location='" + math_exam_location + '\'' +
                ", english_exam_time='" + english_exam_time + '\'' +
                ", english_exam_location='" + english_exam_location + '\'' +
                ", chinese_exam_time='" + chinese_exam_time + '\'' +
                ", chinese_exam_location='" + chinese_exam_location + '\'' +
                ", physics_exam_time='" + physics_exam_time + '\'' +
                ", physics_exam_location='" + physics_exam_location + '\'' +
                '}';
    }
}
