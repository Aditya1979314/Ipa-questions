import java.util.*;


public class charRepeat{

static String repeat(String s){
char temp = s.charAt(0);
int count = 0;
String ans = "";
for(int i=0;i<s.length();i++){
if(s.charAt(i) ==  temp){
    count++;
}else{
ans = ans + temp +count;
temp = s.charAt(i);
count = 0;
i--;
}
}
ans = ans + temp + count;
return ans;
}

    public static void main(String args[]){
        System.out.println(repeat("aabbbcccddeeeee"));
    }
}