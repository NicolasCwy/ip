public class DeleteTask extends Command {
    // zero-indexed
    int taskNum;

    // taskNum is number in task list, one indexed
    public DeleteTask(String taskNum) throws KermitException {
        try {
            this.taskNum = Integer.parseInt(taskNum) - 1;
        } catch (NumberFormatException e) {
            throw new KermitException("That is an invalid task number!");
        }

    }

    @Override
    void execute(ToDo taskList, Ui ui, Storage storage) throws KermitException {
        try {
            Task deletedTask = taskList.deleteTask(taskNum);
            ui.showDeleteTaskMessage(deletedTask, taskList);
            storage.save(taskList);
        } catch (IndexOutOfBoundsException e) {
            throw new KermitException("That is an invalid task!");
        }
    }

    @Override
    boolean isExit() {
        return false;
    }
}