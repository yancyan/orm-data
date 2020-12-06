package com.orm.domain;

import com.orm.domain.events.SysUserEvent;
import lombok.Data;
import org.springframework.data.domain.AfterDomainEventPublication;
import org.springframework.data.domain.DomainEvents;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Data
@Entity
@Table(name = "sys_user")
public class SysUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private Long age;

    @DomainEvents
    Collection<Object> domainEvents() {
        System.out.println("######### domainEvents start.");
        return Collections.singletonList(new SysUserEvent(this));
    }

    @AfterDomainEventPublication
    void callbackMethod() {
        System.out.println("######### callbackMethod start.");
        // … potentially clean up domain events list
    }
}
