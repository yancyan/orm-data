package com.orm.domain.events;

import com.orm.domain.SysUser;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SysUserEvent {

    private SysUser sysUser;


}
