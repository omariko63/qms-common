package common.mapper;

import common.dto.UserDto;
import common.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {RoleMapper.class})
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "password", ignore = true)
    @Mapping(target = "role", source = "role")
    UserDto toDto(User user);

    @Mapping(target = "passwordHash", source = "password")
    User toEntity(UserDto dto);
}
