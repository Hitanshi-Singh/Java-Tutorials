package Stack2;

// import java.util.ArrayList;
import java.util.Stack;

public class ValidParentheses {
    public static void checkP(Stack<Character> s, StringBuilder str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='{'||ch=='['||ch=='('){
                s.push(ch);
            }
            else{
                if(ch==']')
                while(!s.isEmpty()){
                    if(s.pop()=='[')
                        break;
                }
                if(ch=='}')
                while(!s.isEmpty()){
                    if(s.pop()=='{')
                        break;
                }
                if(ch==')')
                while(!s.isEmpty()){
                    if(s.pop()=='(')
                        break;
                }
               
            }
            if(i+1!=str.length() && stac)
        }
    }
    public static void main(String[] args) {
        
    }
}
