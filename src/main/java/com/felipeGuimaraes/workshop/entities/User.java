package com.felipeGuimaraes.workshop.entities;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User implements Serializable {

    private static final long serialVersionUID =1L;

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
}