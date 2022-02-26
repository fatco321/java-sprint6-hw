package ru.yandex.practicum.tasktraker.tasks;

public class Subtask extends Task {
    private int epicId;

    public Subtask(String taskName, String taskDescription, TaskStatus status, int epicId) {
        super(taskName, taskDescription, status);
        this.epicId = epicId;
    }

    public int getEpicId() {
        return epicId;
    }

    public void setEpicId(int epicId) {
        this.epicId = epicId;
    }

    @Override
    public String toString() {
        return "Subtask{" +
                "taskName='" + super.getTaskName() + '\'' +
                ", taskDescription='" + super.getTaskDescription() + '\'' +
                ", status=" + super.getStatus() +
                ", id=" + super.getId() + '\'' +
                ", epicId=" + epicId +
                '}';
    }
}
