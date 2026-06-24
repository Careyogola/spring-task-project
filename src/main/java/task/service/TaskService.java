package task.service;

import task.application.domain.CreateTaskRequest;
import task.application.domain.entity.Task;

public interface TaskService {
    Task createTask(CreateTaskRequest request);
}
