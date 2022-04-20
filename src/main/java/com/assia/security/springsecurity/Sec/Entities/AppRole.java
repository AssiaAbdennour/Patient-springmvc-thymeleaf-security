package com.assia.security.springsecurity.Sec.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class AppRole {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roleId;
    @Column(unique = true)
    private String roleName;
    private String description;
}
