package dev.snerobeev.file_storage_service.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserCreateRequest {
  @NotBlank
  @Email
  private String email;
  private String firstName;
  private String secondName;
  @Size(min = 3)
  @NotBlank
  private String password;
}
