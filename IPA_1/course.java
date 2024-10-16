package IPA_1;

public class course {
    private int courseId, quiz, handson;
    private String courseName, courseAdmin;

    public course(int id, int quiz, int handson, String name, String admin) {
        this.courseId = id;
        this.quiz = quiz;
        this.handson = handson;
        this.courseName = name;
        this.courseAdmin = admin;
    }

    public int getCourseId() {
        return this.courseId;
    }

    public void setCourseId(int id) {
        this.courseId = id;
    }

    public int getQuiz() {
        return this.quiz;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public int getHandson() {
        return this.handson;
    }

    public void setHandson(int handson) {
        this.handson = handson;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String name) {
        this.courseName = name;
    }

    public String getCourseAdmin() {
        return this.courseAdmin;
    }

    public void setCourseAdmin(String admin) {
        this.courseAdmin = admin;
    }

}
