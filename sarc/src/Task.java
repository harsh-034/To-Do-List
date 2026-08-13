import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    static ArrayList<String> task = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void Display(){
        System.out.println("1. Add new Task.");
        System.out.println("2. View all Task.");
        System.out.println("3. Edit Task. ");
        System.out.println("4. Delete your Task. ");
        System.out.println("5. Exit");
        System.out.println("Enter Tour Choice  Number : ");
    }
    public static void Add(){
        System.out.println("Enter your task : ");
         String taskAdd = sc.nextLine();
         task.add(taskAdd);
        System.out.println("Success full add your Task....");
    }
    public static void View(){
        System.out.println("<--------List of Task---------->");
        for (int i = 0; i<task.size();i++)
            System.out.println(task.get(i+1));


    }

}
