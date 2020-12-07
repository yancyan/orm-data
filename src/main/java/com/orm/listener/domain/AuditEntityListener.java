package com.orm.listener.domain;

import com.orm.auth.AppSession;
import com.orm.domain.AbstractModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Configurable;

import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import java.time.Instant;


@Slf4j
@Configurable
public class AuditEntityListener {

    @PrePersist
    public void prePersist(Object o) {
        if (o instanceof AbstractModel) {
            AbstractModel target = (AbstractModel) o;
            target.setVersion(1L);
            target.setCreateId(AppSession.getUserId());
            target.setCreateInstant(Instant.now());
        }
    }

    @PreUpdate
    public void preUpdate(Object o) { if (o instanceof AbstractModel) {
            AbstractModel target = (AbstractModel) o;
            target.setModifyId(AppSession.getUserId());
            target.setModifyInstant(Instant.now());
        }
    }

    @PreRemove
    public void preRemove(Object o) {
       log.info("remove target info " + o.toString());
    }

}
