package av.pcb.service;

import av.pcb.dto.PersonDTO;

import java.util.List;

public interface PersonService {

    /**
     * create a new Person
     * @param personDTO
     * @return created Person
     */
    PersonDTO addPerson(PersonDTO personDTO);

    /**
     * edit Person
     * @param personDTO
     * @param personId
     * @return edited person
     */
    PersonDTO editPerson(PersonDTO personDTO, Long personId);

    /**
     * find person by id
     * @param personId
     * @return looking person
     */
    PersonDTO getPersonById(Long personId);

    /**
     * set person hidden
     * @param personId
     */
    void removePerson(Long personId);

    /**
     * get all persons
     * @return
     */
    List<PersonDTO> getAll();


}
