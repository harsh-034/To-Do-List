import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;




public class Main {
    public static void main(String[] args) {
        ArrayList<String> task = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("-------------To Do List------------");
            System.out.println("1. Add");
            System.out.println("2. View");
            System.out.println("3. delete");
            System.out.println("4. Exit");
            System.out.println("Enter any number :");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter Your Task :");
                    sc.nextLine();
                    String addtask = sc.nextLine();
                    task.add(addtask);
                    break;
                case 2:
                    System.out.println("Viwe list of task...");
                    for(int i=0;i<task.size();i++){
                        System.out.println(i+1 + ". "+task.get(i));
                    }
                    break;
                case 3:
                    System.out.print("please Enter Your number for remove task :");
                    int n = sc.nextInt();
                     task.remove(n-1);


            }

        }while(choice != 4);
    }
    }

    /*
    Add task
    viw task
    delete task
    mark task


    */