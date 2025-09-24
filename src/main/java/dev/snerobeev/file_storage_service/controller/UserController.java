package dev.snerobeev.file_storage_service.controller;

import dev.snerobeev.file_storage_service.dto.user.UserCreateRequest;
import dev.snerobeev.file_storage_service.dto.user.UserResponse;
import dev.snerobeev.file_storage_service.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
  private final UserService userService;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public UserResponse createUser(@Valid @RequestBody UserCreateRequest request) {
    return userService.createUser(request);

  }
}
