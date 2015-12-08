package com.pomverte.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @Column
    @GeneratedValue
    private Long id;

    @Column
    private String name;
}
