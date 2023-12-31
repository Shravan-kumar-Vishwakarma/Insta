package com.sawnkalabihar.encompasses.handling.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ID;
    private String name;
    private String brand;
    private Integer price;

    @OneToOne(cascade = CascadeType.ALL)
    private Student student;
}
