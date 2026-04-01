package pkg1;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Expression: ");
        String exp= scanner.nextLine();
        StackClass stack1=new StackClass(exp.length());
        boolean isValid=true;
        for (int i=0; i<exp.length();i++){
            char ch = exp.charAt(i);

            if (ch=='(' || ch=='[' || ch=='{'){
                stack1.push(ch);
            }
            else if(ch==')'|| ch==']' || ch=='}'){
                if(stack1.isEmpty()){
                    isValid=false;
                    break;
                }
                char top= stack1.pop();

                if ((ch !=')' && top=='(') || (ch!=']' && top=='[') || (ch!='}' && top=='{')){
                    isValid=false;
                }
            }
        }

        if(isValid && stack1.isEmpty())
            System.out.println("Expression is Valid");
        else
            System.out.println("Missing closing bracket for: " + stack1.peek());
    }
}
