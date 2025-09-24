package dev.snerobeev.file_storage_service.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
  private Long id;
  private String email;
  private String firstName;
  private String secondName;
  private LocalDate createdAt;
}
