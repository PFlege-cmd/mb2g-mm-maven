import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import org.mapstruct.factory.Mappers;
import patrick.entities.user.*;
import patrick.guru.commands.*;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "email")
    User UserCommand2User(UserCommand userCommand);

    @Mapping(target = "email")
    UserCommand User2UserCommand(User user);


}
