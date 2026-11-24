/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    int a[];
    int front,rear,max;
    Main(int size){
        max=size;
        a=new int[max];
        front=rear=-1;
    }
    void enQueue(int ele){
        if(rear==max-1){
            System.out.println("Queue is Full");
            return;
        }
        if(front==-1){
            front=rear=0;
        }
        else{
            rear++;
        }
        a[rear]=ele;
    }
    void peek(){
        if(front==-1){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(a[front]);
    }
   void last(){
       if(front==-1){
           System.out.println("Queue is Empty");
           return;
       }
       System.out.println(a[rear]);
   }
   
    void display(){
        if(front==-1){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Remaining Queue");
        for(int i=front;i<=rear;i++){
            System.out.println(a[i]);
        }
        
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Main q= new Main(5);
	    for(int i = 0; i < 5; i++) {
            int ele = sc.nextInt();
            q.enQueue(ele);
        }
        
        System.out.println("Last Element is:");
    q.last();

        System.out.println("Queue elements are:");
        q.display();
        
		
	}
}
