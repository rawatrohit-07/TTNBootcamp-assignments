package org.rohit.rest_assignment2.DTO;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserV2 {
    private String name;
    private String email;
    private String phone;
    private String address;
}