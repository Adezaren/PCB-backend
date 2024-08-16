package av.pcb.dto.mapper;

import av.pcb.dto.PersonDTO;
import av.pcb.entity.PersonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonEntity toEntity(PersonDTO source);

    PersonDTO toDTO(PersonEntity source);

    @Mapping(target = "id", ignore = true)
    PersonEntity editEntity(PersonDTO source, @MappingTarget PersonEntity target);

}
