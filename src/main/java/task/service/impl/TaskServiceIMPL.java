package task.service.impl;

import java.time.Instant;

import task.application.domain.CreateTaskRequest;
import task.application.domain.entity.Task;
import task.application.domain.entity.TaskStatus;
import task.application.repository.TaskRepository;
import task.service.TaskService;

public class TaskServiceIMPL implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceIMPL(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(CreateTaskRequest request) {
        Instant now = Instant.now();

        Task task = new Task(
            null,
            request.title(),
            request.description(),
            request.dueDate(),
            TaskStatus.OPEN,
            request.priority(),
            now,
            now

        );
        return taskRepository.save(task);
    }
    
}
