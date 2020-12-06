package com.orm.dao.jpa;

import com.orm.dao.jpa.support.JpaSupportRepository;
import com.orm.domain.SysUser;
import com.orm.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.util.Streamable;

import java.util.List;

public interface SysUserRepository extends JpaSupportRepository<SysUser, Long> {


    Streamable<SysUser> findByUsernameContaining(String name);

}
