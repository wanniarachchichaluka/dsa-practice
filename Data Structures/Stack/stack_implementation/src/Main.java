public class Main {
    public static void main(String[] args) {
        StackX stack1 = new StackX(10);
        stack1.push(30);
        stack1.push(80);
        stack1.push(100);
        stack1.push(25);

        while(!stack1.isEmpty()){
            System.out.println(stack1.pop());
        }
    }
}
