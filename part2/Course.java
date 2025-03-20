package part2;

import java.util.Arrays;

public class Course {

    static int maxCapacity;
    String courseName;
    int enrollStudents;
    String enrolledStudents[];

    static {
        maxCapacity=100;
    }





    Course(String courseName){
        this.courseName=courseName;
        this.enrollStudents=0;
        this.enrolledStudents=new String[maxCapacity];

    }

    static void setMaxCapacity(int capacity){
        Course.maxCapacity=capacity;

    }

    public void enrolledStudent(String studentName){
        if(enrollStudents<maxCapacity) {
            this.enrolledStudents[enrollStudents] = studentName;
            this.enrollStudents++;
        }else{
            System.out.println("Coures is full. Can not enroll "+studentName);
        }

    }
    public void unenrolledStudent(String studentName){

        int index=-1;

        for(int i=0;i<enrollStudents;i++){
            if(enrolledStudents[i].equals(studentName)){
                index=i;
                break;
            }
        }

        if(index!=-1){

            for(int i=index;i<enrollStudents-1;i++){
                enrolledStudents[i]=enrolledStudents[i+1];

            }
            enrolledStudents[enrollStudents-1]=null;
            enrollStudents--;
        }else {
            System.out.println(studentName+" is not enrolled in this course");
        }

    }

    // Display enrolled students
    public void displayStudents() {
        System.out.println("Enrolled students in " + courseName + ": " + Arrays.toString(Arrays.copyOf(enrolledStudents, enrollStudents)));
    }

    public static void main(String[] args) {
        Course course1=new Course("DataScience");
        course1.enrolledStudent("Atish");
        course1.enrolledStudent("Atul");
        course1.displayStudents();
    }


}
