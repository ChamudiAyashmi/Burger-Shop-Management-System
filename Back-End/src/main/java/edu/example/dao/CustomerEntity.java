package edu.example.dao;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor


public class CustomerEntity {

    private long customerId;
    private String name;
    private String address;
    private int phoneNumber;
}
