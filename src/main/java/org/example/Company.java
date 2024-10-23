package org.example;

/*
    @author sn4s
    @project SoftwareTesting
    @class org.example
    @version 1
    @SE 20.09.24 - 18:30
*/


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Company {
    private Company parent;
    private long employeeCount;


}
