package com.orm.listener.domain;

import com.orm.domain.events.SysUserEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class SysUserListener {

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void handleAfterPersonSavedComplete(SysUserEvent event){

        System.out.println("######### handleAfterPersonSavedComplete");
    }

}
