/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.br.ifpr.model.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rafael
 */
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic
    @Column(length = 100, nullable = false)
    private String name;

    @Basic
    @Column(length = 50, nullable = false)
    private String registration;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private List<PhoneNumber> numbers;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private List<Address> addresses;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "students_disciplines", joinColumns = @JoinColumn(name = "id_student", nullable = false), inverseJoinColumns = @JoinColumn(name = "id_discipline", nullable = false))
    private List<Discipline> disciplines;

    public Student() {
    }

    public void addDiscipline(Discipline discipline) {
        if (disciplines == null) {
            disciplines = new LinkedList<>();
        }
        disciplines.add(discipline);
    }

    public void addAddress(Address address) {
        if (addresses == null) {
            addresses = new LinkedList<>();
        }
        addresses.add(address);
    }

    public void addNumber(PhoneNumber phoneNumber) {
        if (numbers == null) {
            numbers = new LinkedList<>();
        }
        numbers.add(phoneNumber);
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<PhoneNumber> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<PhoneNumber> numbers) {
        this.numbers = numbers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

}
