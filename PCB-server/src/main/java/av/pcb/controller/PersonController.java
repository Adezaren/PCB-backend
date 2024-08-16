package av.pcb.controller;

import av.pcb.dto.PersonDTO;
import av.pcb.dto.mapper.PersonMapper;
import av.pcb.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private PersonService personService;

    @Autowired
    private PersonMapper personMapper;

    @PostMapping("/persons")
    public PersonDTO addPerson(@RequestBody PersonDTO personDTO) {

        return personService.addPerson(personDTO);
    }

    @GetMapping("/persons")
    public List<PersonDTO> getPersons() {
        return personService.getAll();
    }

    @GetMapping("/persons/{personId}")
    public PersonDTO getPerson(@PathVariable Long personId) {
        return personService.getPersonById(personId);
    }

    @DeleteMapping("/persons/{personId}")
    public void deletePerson(@PathVariable Long personId) {
        personService.removePerson(personId);
    }

    @PutMapping("/persons/{personId}")
    public PersonDTO editPerson(@RequestBody PersonDTO personDTO, @PathVariable Long personId) {
        return personService.editPerson(personDTO, personId);
    }
}


