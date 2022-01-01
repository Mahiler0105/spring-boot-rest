package com.lrtbl.helloworld.rest.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user_in_role")
@Getter
@Setter
public class UserInRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToMany
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    @JoinColumn(name="role_id")
    private Role role;
}
