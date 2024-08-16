package av.pcb.service;

import av.pcb.dto.PersonDTO;
import av.pcb.dto.mapper.PersonMapper;
import av.pcb.entity.PersonEntity;
import av.pcb.entity.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonMapper personMapper;

    public PersonDTO addPerson(PersonDTO personDTO) {
        PersonEntity entity = personMapper.toEntity(personDTO);
        entity =personRepository.save(entity);

        return personMapper.toDTO(entity);
    }

    public PersonDTO editPerson(PersonDTO personDTO, Long personId) {
        PersonEntity entity = fetchPersonById(personId);
        personDTO.setId(personId);
        personMapper.editEntity(personDTO, entity);

        PersonEntity saved = personRepository.save(entity);

        return personMapper.toDTO(saved);

    }

    public List<PersonDTO> getAll() {
        return personRepository.findByHidden(false)
                .stream()
                .map(i -> personMapper.toDTO(i))
                .collect(Collectors.toList());
    }

    public void removePerson(Long personId) {
        try {
            PersonEntity person = fetchPersonById(personId);
            person.setHidden(true);

            personRepository.save(person);
        } catch (NotFoundException ignored) {
            // The contract in the interface states, that no exception is thrown, if the entity is not found.
        }

    }

    public PersonDTO getPersonById(Long personId) {
        PersonEntity entity = fetchPersonById(personId);
        return personMapper.toDTO(entity);
    }




    /**
     * <p>Attempts to fetch a person.</p>
     * <p>In case a person with the passed [id] doesn't exist a [{@link org.webjars.NotFoundException}] is thrown.</p>
     *
     * @param id Person to fetch
     * @return Fetched entity
     * @throws org.webjars.NotFoundException In case a person with the passed [id] isn't found
     */
    private PersonEntity fetchPersonById(long id) {
        return personRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Person with id " + id + " wasn't found in the database."));
    }

}
