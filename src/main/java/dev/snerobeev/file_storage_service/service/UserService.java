package dev.snerobeev.file_storage_service.service;

import dev.snerobeev.file_storage_service.dto.user.UserCreateRequest;
import dev.snerobeev.file_storage_service.dto.user.UserResponse;
import dev.snerobeev.file_storage_service.mapper.UserMapper;
import dev.snerobeev.file_storage_service.repository.UserRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  private final UserRepository userRepository;
  private final UserMapper userMapper;

  @Autowired
  public UserService(UserRepository userRepository, UserMapper userMapper) {
    this.userRepository = userRepository;
    this.userMapper = userMapper;
  }

  public UserResponse createUser(UserCreateRequest request) {
    var user = userMapper.toEntity(request);
    var savedUser = userRepository.save(user);
    return userMapper.toResponse(savedUser);
  }

}
