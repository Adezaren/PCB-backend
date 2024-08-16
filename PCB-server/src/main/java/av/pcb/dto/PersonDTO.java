package av.pcb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersonDTO {

    @JsonProperty("_id")
    private Long id;

    private String firstName;

    private String secondName;

    private Long internalNumber;

    private String bank;

    private Float workingTime;

    private String accountNumber;

    private String vs;

    private String ss;

    private String ks;

    private String company;

}
