public class Student extends Person{
    private String studentId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void showInfo(){
        System.out.println("Student ID: " + studentId);
        System.out.println("Fullname: " + this.fullname);
    }
}
