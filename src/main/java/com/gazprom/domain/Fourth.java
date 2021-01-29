package com.gazprom.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "fourth")
public class Fourth {

    @Id
    @SequenceGenerator(name = "seq_GAZ4", initialValue = 10000, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_GAZ4")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "personal_account")
    private String personalAccount;

    @Column(name = "street")
    private String street;

    @Column(name = "house")
    private  String house;

    @Column(name = "flat")
    private String flat;

    @Column(name = "phone")
    private String phone;

    @Column(name = "mob_phone")
    private String mobPhone;

    @Column(name = "gas_reading")
    private Long gasReading;

    @Column(name = "reading_date")
    private String gasReadingDate;

    @Column(name = "gas_reading_new")
    private Long gasReadingNew;
}