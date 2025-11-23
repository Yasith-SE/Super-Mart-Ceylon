package edu.icet.model.dto;

import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class CustomerDto {

    @Id
    private String id;

    private String name;

    private String address;

    private String email;

}
