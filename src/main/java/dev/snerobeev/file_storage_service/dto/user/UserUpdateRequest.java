package dev.snerobeev.file_storage_service.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.openapitools.jackson.nullable.JsonNullable;

@Getter
@Setter
public class UserUpdateRequest {
  @NotBlank
  @Email
  private JsonNullable<String> email;
  private JsonNullable<String> firstName;
  private JsonNullable<String> lastName;
  @Size(min = 3)
  @NotBlank
  private JsonNullable<String> password;
}
