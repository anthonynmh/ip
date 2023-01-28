package seedu.duke;

/**
 * Handles the tasks relating to the ToDoList
 */
public class Task {

    private int id;
    private String task;
    private boolean done;

    public Task(int id, String task) {
        this.id = id;
        this.task = task;
        this.done = false;
    }

    /**
     * Prints the current task.
     *
     * @return This task
     */
    public String printTask() {
        return done ? "[x] " + task: "[ ] " + task;
    }

    /**
     * Marks the current task as done.
     *
     * @param index the task number to mark
     */
    public void markDone(int index) {
        this.done = true;
        System.out.println("\tCongratulations, Mr Stark. You have completed task " + index);
        System.out.println("\t" + printTask());
    }

    /**
     * Unmarks the current task; mark current task undone.
     *
     * @param index the task number to unmark
     */
    public void unmark(int index) {
        this.done = false;
        System.out.println("\tjarvis.Task " + index + " has been unmarked.");
        System.out.println("\t" + printTask());
    }

    /**
     * Returns the unique id associated with the current task.
     *
     * @return Id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Checks if current task is completed.
     *
     * @return boolean of done-ness
     */
    public boolean isDone() {
        return this.done;
    }

    /**
     * Prints the current task.
     *
     * @return The current task
     */
    public String getTask() {
        return this.task;
    }

    public boolean hasTask(String task) {
        return (this.task.contains(task));
    }
}
