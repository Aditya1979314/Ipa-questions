import java.util.*;

public class courseProgram{

public static Course[] sortCourseByHandsOn(Course[] course,int handson){
    Course[] ans = new Course[0];
    for(int i=0;i<course.length;i++){
        if(course[i].gethandon() < handson){
            ans = Arrays.copyOf(ans,ans.length+1);
            ans[ans.length-1] = course[i];
        }
    }

    for(int i=0;i<ans.length-1;i++){
        for(int j = i+1;j<ans.length;j++){
            if(ans[i].gethandon()>ans[j].gethandon()){
                Course temp = ans[i];
                ans[i] = ans[j];
                ans[j] = temp;
            }
        }
    }

    return ans;
}


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Course[] course = new Course[4];
        for(int i=0;i<course.length;i++){
            int courseid = sc.nextInt();sc.nextLine();
            String courseName = sc.nextLine();
            String adminName = sc.nextLine();
            int quiz = sc.nextInt();sc.nextLine();
            int handson = sc.nextInt();sc.nextLine();

            course[i] = new Course(courseid,courseName,adminName,quiz,handson);
        }

        Course[] ans = sortCourseByHandsOn(course,10);

        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i].getid());
            System.out.println(ans[i].getcoursename());
            System.out.println(ans[i].getcourseadmin());
            System.out.println(ans[i].getquiz());
            System.out.println(ans[i].gethandon());
        }
    }
}