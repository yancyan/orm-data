package com.orm.domain;

import com.orm.listener.domain.AuditEntityListener;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import javax.persistence.Version;
import java.io.Serializable;
import java.time.Instant;

@Setter
@Getter
@ToString
@EntityListeners(AuditEntityListener.class)
@MappedSuperclass
public class AbstractModel implements Serializable {

    @Transient
    @Version
    private Long version;


    @Transient
    private Long createId;
    @Transient
    private Instant createInstant;
    @Transient
    private Long modifyId;
    @Transient
    private Instant modifyInstant;

}
