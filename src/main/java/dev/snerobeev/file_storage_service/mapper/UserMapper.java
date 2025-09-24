package dev.snerobeev.file_storage_service.mapper;

import dev.snerobeev.file_storage_service.dto.user.UserCreateRequest;
import dev.snerobeev.file_storage_service.dto.user.UserResponse;
import dev.snerobeev.file_storage_service.dto.user.UserUpdateRequest;
import dev.snerobeev.file_storage_service.repository.User;
import org.mapstruct.*;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    uses = {JsonNullableMapper.class}
)
public abstract class UserMapper {

  public abstract User toEntity(UserCreateRequest dto);

  public abstract UserResponse toResponse(User entity);

  public abstract void updateEntity(@MappingTarget User entity, UserUpdateRequest dto);
}
