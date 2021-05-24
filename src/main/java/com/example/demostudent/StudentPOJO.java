package com.example.demostudent;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class StudentPOJO {

    private int id;
    @JsonProperty("names")
    private String name;
    @JsonProperty("sub")
    private List<String> subject;
    private String roll;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
    // By default yyyy-mm-dd yyyy-MM-dd
}
