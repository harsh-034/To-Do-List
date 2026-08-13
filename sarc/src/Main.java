
public class Main {
    public static void main(String[] args) {

       int choice;
        do {
            Task.Display();
            choice = Task.sc.nextInt();

            switch(choice){
                case 1: Task.add();
                       break;
                case 2: Task.view();
                       break;
                case 3: Task.edit();
                        break;
                case 4: Task.delete();
                        break;
                case 5:
                    System.out.println("Exit.......");
                    break;
                default:
                    System.out.println("Plz Enter right number......");

            }
        }while(choice != 5);
        System.out.println("<< Thanks For using To Do List >>");

    }
    }


    // git  remote add origin https://github.com/harsh-034/To-Do-List.git  connect your github account
    /*
    Add task
    viw task
    delete task
    mark task


    */