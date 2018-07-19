package DataStructures.Stacks;
//implementing stack using arrays//

public class ArrayStack {
    final static int size= 100;
    int[] arr=new int[size];
    int top;
    public ArrayStack(){
        top=-1;
    }

    //Check whether the stack is empty//
    public boolean isempty(){
        if(top<0){
            return true;
        }
        else return false;
    }

    //push an element//
    public void push(int data){
        if(top>=size-1){
            System.out.println(" element can not be added");
        }
        else{
            arr[++top]=data;
        }
    }
    //pop an element//
    public void pop(){
        if(isempty()){
            System.out.println("Stack is already empty");
        }
        else{
            int x=arr[top--];
        }
    }

    public static void main(String[] args){
        ArrayStack obj=new ArrayStack();
        obj.push(2);
        obj.push(4);
        obj.pop();

}
}
