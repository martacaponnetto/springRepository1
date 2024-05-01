package com.example.Spring.Repositories1.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "modelName")
    private String modelName;
    @Column(name = "serialNumber")
    private String serialNumber;
    @Column(name = "currentPrince")

    private Double currentPrice;
}
