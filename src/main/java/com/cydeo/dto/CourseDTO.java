package com.cydeo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)  //ignore null values (while serializing and deserializing)
@JsonIgnoreProperties(ignoreUnknown = true) //"if I don't know the field, I will ignore it". default is false.
public class CourseDTO {

    @JsonIgnore
    private Long id;

    private String courseName;
    private String description;

}