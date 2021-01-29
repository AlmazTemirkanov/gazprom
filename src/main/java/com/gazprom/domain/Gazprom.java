package com.gazprom.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "gazprom")
public class Gazprom {

    @Id
    @SequenceGenerator(name = "seq_GAZ", initialValue = 10000, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_GAZ")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "personal_account", length = 30)
    private String personalAccount;

    @Column(name = "customer", length = 50)
    private String customer;

    @Column(name = "division", length = 50)
    private String division;

    @Column(name = "region", length = 30)
    private String region;

    @Column(name = "district", length = 30)
    private String district;

    @Column(name = "locality", length = 30)
    private String locality;

    @Column(name = "street", length = 50)
    private String street;

    @Column(name = "house", length = 30)
    private  String house;

    @Column(name = "flat", length = 30)
    private String flat;

    @Column(name = "phone", length = 70)
    private String phone;

    @Column(name = "mob_phone", length = 70)
    private String mobPhone;

    @Column(name = "gas_reading", length = 30)
    private Long gasReading;

    @Column(name = "reading_date")
    private String gasReadingDate;

    @Column(name = "gas_reading_new", length = 30)
    private Long gasReadingNew;

    public Gazprom() {

    }
}
