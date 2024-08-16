package av.pcb.dto.mapper;

import av.pcb.constant.Company;
import av.pcb.dto.PersonDTO;
import av.pcb.entity.PersonEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2 (Amazon.com Inc.)"
)
@Component
public class PersonMapperImpl implements PersonMapper {

    @Override
    public PersonEntity toEntity(PersonDTO source) {
        if ( source == null ) {
            return null;
        }

        PersonEntity personEntity = new PersonEntity();

        personEntity.setId( source.getId() );
        personEntity.setFirstName( source.getFirstName() );
        personEntity.setSecondName( source.getSecondName() );
        personEntity.setInternalNumber( source.getInternalNumber() );
        personEntity.setWorkingTime( source.getWorkingTime() );
        personEntity.setAccountNumber( source.getAccountNumber() );
        personEntity.setBank( source.getBank() );
        personEntity.setVs( source.getVs() );
        personEntity.setSs( source.getSs() );
        personEntity.setKs( source.getKs() );
        if ( source.getCompany() != null ) {
            personEntity.setCompany( Enum.valueOf( Company.class, source.getCompany() ) );
        }

        return personEntity;
    }

    @Override
    public PersonDTO toDTO(PersonEntity source) {
        if ( source == null ) {
            return null;
        }

        PersonDTO personDTO = new PersonDTO();

        personDTO.setId( source.getId() );
        personDTO.setFirstName( source.getFirstName() );
        personDTO.setSecondName( source.getSecondName() );
        personDTO.setInternalNumber( source.getInternalNumber() );
        personDTO.setBank( source.getBank() );
        personDTO.setWorkingTime( source.getWorkingTime() );
        personDTO.setAccountNumber( source.getAccountNumber() );
        personDTO.setVs( source.getVs() );
        personDTO.setSs( source.getSs() );
        personDTO.setKs( source.getKs() );
        if ( source.getCompany() != null ) {
            personDTO.setCompany( source.getCompany().name() );
        }

        return personDTO;
    }

    @Override
    public PersonEntity editEntity(PersonDTO source, PersonEntity target) {
        if ( source == null ) {
            return target;
        }

        target.setFirstName( source.getFirstName() );
        target.setSecondName( source.getSecondName() );
        target.setInternalNumber( source.getInternalNumber() );
        target.setWorkingTime( source.getWorkingTime() );
        target.setAccountNumber( source.getAccountNumber() );
        target.setBank( source.getBank() );
        target.setVs( source.getVs() );
        target.setSs( source.getSs() );
        target.setKs( source.getKs() );
        if ( source.getCompany() != null ) {
            target.setCompany( Enum.valueOf( Company.class, source.getCompany() ) );
        }
        else {
            target.setCompany( null );
        }

        return target;
    }
}
