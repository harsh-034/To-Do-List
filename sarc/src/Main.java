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
            System.out.println("4. Edit");
            System.out.println("5. Exit");

            System.out.println("Enter any number :");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter Your Task :");
                    sc.nextLine();
                    String addtask = sc.nextLine();
                    task.add(addtask);
                    System.out.println("New Task add SuccessFul....");
                    break;
                case 2:

                    if (task.size() == 0) {
                        System.out.println("Empty Task...............");
                        System.out.println("Please add new Task .............");
                        break;
                    } else {
                        System.out.println("  Your Task List ");
                        for (int i = 0; i < task.size(); i++) {
                            System.out.println(i + 1 + ". " + task.get(i));

                        }
                        break;
                    }
                case 3:

                    System.out.print("please Enter Task number for remove :");
                    int n = sc.nextInt();
                    if (task.size() > n-1) {
                        task.remove(n - 1);
                        System.out.println("Remove "+n+" Task Successfull ..............");
                    }else{
                        System.out.println("Plz Enter Valid Task Number........ ");
                    }

                     break;
                case 4:
                    System.out.println("Which task number update :");
                    int n1 = sc.nextInt();
                    if(task.size()>n1-1) {
                        System.out.println("Write your update task :");
                        sc.nextLine();
                        String newTask = sc.nextLine();
                        task.set(n1 - 1, newTask);
                        System.out.println("Update Successful...........");
                    }else{
                        System.out.println("Plz Enter Valid Task Number........ ");
                    }
                    break;

                default:if(choice != 5){
                    System.out.println("Plese enter valid Number........... ");

                }
            }

        }while(choice != 5);
    }
    }


    // git  remote add origin https://github.com/harsh-034/To-Do-List.git  connect your github account
    /*
    Add task
    viw task
    delete task
    mark task


    */