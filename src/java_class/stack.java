package java_class;

import java.util.Arrays;

// stack using Array
public class stack {
    int arr[];
    int size;
    int top;

    void stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;

    }
    public void push(int data){
        if (top==size-1){
            System.out.println("stack is full");
            return;
        }
        top++;
        arr[top]=data;

    }
    public void pr(){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        stack obj= new stack();
        obj.stack(5);
        obj.push(5);
        obj.pr();

    }

}
