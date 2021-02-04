package pkg;

/**
 * Course Object
 * @author Maira Kotsvoulou
 * @since 2021
 */
public class Course {
    //encapsulation --> attributes not directly accessible by other programs
    private String course_code;
    private String course_name;
    private int credits;
    private String professor;

    /**
     * Instantiates a new course with code and name
     *
     * @param course_code This is the code code
     * @param course_name
     */
    public Course(String course_code, String course_name) {
        this.course_code = course_code;
        this.course_name = course_name;
        credits = 3;
        professor = "TBA";
    }

    /**
     * instantiates a new course with code, name and credits
     * @param course_code
     * @param course_name
     * @param credits
     */
    public Course(String course_code, String course_name, int credits) {
        this.course_code = course_code;
        this.course_name = course_name;
        this.credits = credits;
        professor = "TBA";
    }

    public Course(String course_code, String course_name, int credits, String professor) {
        this.course_code = course_code;
        this.course_name = course_name;
        this.credits = credits;
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Course: " +
                 course_code +
                ", course_name=" + course_name +
                ", credits=" + credits +
                ", professor=" + professor ;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getCourse_code() {
        return course_code;
    }

    public String getCourse_name() {
        return course_name;
    }

    public int getCredits() {
        return credits;
    }

    public String getProfessor() {
        return professor;
    }

    /**
     * if the credits is not valid the methods returns false
     * @param c
     * @return boolean
     */
    public boolean setCredits(int c) {
        if (c>=1 && c <=4) {
            credits = c;
            return true;
        }
        return false;
    }
}
