package pkg1;

public class StackClass {
    private int maxSize;
    private char[] stackArray; //declaring the variable type double array
    private int top;

    public StackClass(int s){
        maxSize=s;
        stackArray = new char[maxSize]; //creating the actual array object and assigning it to the variable
        top=-1;
    }

    public void push(char j){
        if (top==maxSize-1)
            System.out.println("Array is full");
        else
            stackArray[++top]=j;
    }
    public char pop(){
        if (top==-1){
            System.out.println("Array is empty");
            return '\0';
        }
        else
            return stackArray[top--];
    }
    char peek(){
        if (top==-1)
            return '\0';
        else
            return stackArray[top];
    }
    boolean isEmpty(){
        if (top==-1)
            return true;
        else
            return false;
    }
    boolean isFull(){
        if(top==maxSize-1)
            return true;
        else
            return false;
    }
}
