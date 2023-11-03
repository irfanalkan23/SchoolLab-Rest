package com.cydeo.dto;

import com.cydeo.enums.AddressType;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)  //ignore null values (while serializing and deserializing)
//@JsonIgnoreProperties(ignoreUnknown = true) //"if I don't know the field, I will ignore it". default is false.
public class AddressDTO {

    @JsonIgnore
    private Long id;

    @NotBlank(message = "Street cannot be empty.")
    @Size(min = 1, max = 100, message = "Street should be between 1 and 100 characters.")
    private String street;

    @NotBlank(message = "Country cannot be empty.")
    @Size(min = 1, max = 50, message = "Country should be between 1 and 50 characters.")
    private String country;

    //@NotBlank(message = "State cannot be empty.")
    @Size(min = 1, max = 50, message = "State should be between 1 and 50 characters.")
    private String state;

    @NotBlank(message = "City cannot be empty.")
    @Size(min = 1, max = 50, message = "City should be between 1 and 50 characters.")
    private String city;

    @NotBlank(message = "Postal code cannot be empty.")
    @Pattern(regexp = "\\d{5}", message = "Postal code should be 5 digits long.")
    private String postalCode;

    @NotNull(message = "Address type cannot be null.")
    private AddressType addressType;

    @JsonBackReference(value = "student-address-reference")
    private StudentDTO student;

    @JsonBackReference(value = "parent-address-reference")
    private ParentDTO parent;

    @JsonBackReference(value = "teacher-address-reference")  //I do NOT want to see Teacher info when I ask AddressDTO
    private TeacherDTO teacher;

    //no validation here, because I'm not expecting anything from the user
    private Integer currentTemperature;

    //no validation here, because I'm not expecting anything from the user
    private String flag;

}