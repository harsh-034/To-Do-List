import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    static ArrayList<String> task = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    // Display
    public static void Display(){
        System.out.println("<-------------Start To Do List ------------->");
        System.out.println("1. Add new Task.");
        System.out.println("2. View all Task.");
        System.out.println("3. Edit Task. ");
        System.out.println("4. Delete your Task. ");
        System.out.println("5. Exit");
        System.out.println("Enter Choice  Number : ");
    }

    //Add Your Task
    public static void add(){
        System.out.println("Enter your task : ");
         String taskAdd = sc.nextLine();
         task.add(taskAdd);
        System.out.println("Success full add your Task....");
    }

    //View Your All Task
    public static void view(){
        if(task.isEmpty()){
            System.out.println("Your Task is Empty.....?");
            System.out.println("PLz Add the Task..... ");

        }else {
            System.out.println("<--------List of Task---------->");
            for (int i = 0; i < task.size(); i++) {
                System.out.println(i + 1 + ") " + task.get(i));
            }
        }
    }

    //Edit Your Task
    public static void edit(){
        System.out.println("Enter task number for update. ");
        int update = sc.nextInt();
        if(update-1   < task.size()) {
            System.out.println("Write Your update task.");
            sc.nextLine();
            String updateTask = sc.nextLine();
            task.set(update-1, updateTask);
            System.out.println("Successful update your task.");
        }else if(task.isEmpty()){
            System.out.println("Your Task is Empty.....?");
            System.out.println("PLz Add the Task..... ");
        }else{
            System.out.println("Plz enter right Number For update task.......? ");
        }
    }

    //Delete Your Task.
    public static void delete(){
        System.out.println("Enter your task number for Delete.");
        int delete = sc.nextInt();
        if(delete-1   < task.size()) {
            task.remove(delete-1);
            System.out.println("Successful remove your task...");
        }else if(task.isEmpty()){
            System.out.println("Your Task is Empty.....?");
            System.out.println("PLz Add the Task..... ");
    }else{
            System.out.println("Plz enter right Number For Delete task.......? ");
        }
    }

}
