package dev.snerobeev.file_storage_service.service;

import dev.snerobeev.file_storage_service.dto.user.UserCreateRequest;
import dev.snerobeev.file_storage_service.dto.user.UserResponse;
import dev.snerobeev.file_storage_service.mapper.UserMapper;
import dev.snerobeev.file_storage_service.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
  private final UserRepository userRepository;
  private final UserMapper userMapper;

  public UserResponse createUser(UserCreateRequest request) {
    var user = userMapper.toEntity(request);
    var savedUser = userRepository.save(user);
    return userMapper.toResponse(savedUser);
  }

}
