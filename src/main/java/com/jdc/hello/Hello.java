package com.jdc.hello;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Hello {

    @Id
    @GeneratedValue
    private int id;
    private String message;
}
