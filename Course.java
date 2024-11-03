import java.util.*;

public class Course{
   private int courseId,quiz,handson;
   private String courseName,courseAdmin;

    public Course(int id,String courseName,String courseAdmin,int quiz,int handson){
        this.courseId = id;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    public int getid(){
        return courseId;
    }

    public void setid(int id){
        this.courseId = id;
    }

    public int getquiz(){
        return quiz;
    }

    public void setquiz(int q){
        this.quiz = q;
    }

    public int gethandon(){
        return handson;
    }

    public void sethandon(int hand){
        this.handson = hand;
    }

    public String getcoursename(){
        return courseName;
    }

    public void setcoursename(String course){
        this.courseName = course;
    }

    public String getcourseadmin(){
        return courseAdmin;
    }

    public void setcourseadmin(String course){
        this.courseAdmin = course;
    }
    
    public static void main(String args[]){
        
    }
}






