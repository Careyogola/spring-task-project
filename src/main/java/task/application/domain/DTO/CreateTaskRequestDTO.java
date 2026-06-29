
package task.application.domain.DTO;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import task.application.domain.entity.TaskPriority;

public record CreateTaskRequestDTO(
    @NotBlank(message = ERROR_MESSAGE_TITLE_LENGTH)
    @Length(max = 255, message = ERROR_MESSAGE_TITLE_LENGTH)
    String title, 
    String description, 
    LocalDate duDate, 
    TaskPriority priority) 
    {

        private static final String ERROR_MESSAGE_TITLE_LENGTH = "Title must be between 1 and 255 characters";

}