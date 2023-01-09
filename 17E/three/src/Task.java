public class Task {


    private String descr;
    private Task next;


    public Task(String descr, Task next) {
        this.descr = descr;
        this.next = next;
    }


    public Task(String descr) {
        this(descr, null);
    }


    public void setNextTask(Task t) {
        this.next = t;
    }


    public void printTasks() {
        System.out.print(descr + " ");
        if (next != null) {
            next.printTasks();
        }
    }


    public static void printTasks(Task head) {
        head.printTasks();
    }


    public void printTasksRev() {
        if (next != null) {
            next.printTasksRev();
        }
        System.out.print(descr + " ");
    }

    
    public static void printTasksRev(Task head) {
        head.printTasksRev();
    }
}
