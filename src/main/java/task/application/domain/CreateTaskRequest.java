package task.application.domain;

import java.time.LocalDate;

import task.application.domain.entity.TaskPriority;

public record CreateTaskRequest (
    String title,String description, LocalDate dueDate, TaskPriority priority
) {

}
