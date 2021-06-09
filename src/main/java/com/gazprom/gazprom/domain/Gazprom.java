package com.gazprom.gazprom.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "gazprom")
public class Gazprom {

    @Id
    @SequenceGenerator(name = "seq_GAZ", initialValue = 10000, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_GAZ")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "personal_account")
    private String personalAccount;

    @Column(name = "customer")
    private String customer;

}
