package dev.snerobeev.file_storage_service.mapper;

import org.mapstruct.Condition;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.openapitools.jackson.nullable.JsonNullable;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface JsonNullableMapper {
  default <T> JsonNullable<T> wrap(T entity) {
    return JsonNullable.of(entity);
  }

  default <T> T unwrap(JsonNullable<T> jsonNullable) {
    return jsonNullable == null ? null : jsonNullable.orElse(null);
  }

  @Condition
  default <T> boolean isPresent(JsonNullable<T> nullable) {
    return nullable != null && nullable.isPresent();
  }
}
