package com.orm.dao.jpa;

import com.orm.dao.jpa.support.JpaSupportRepository;
import com.orm.domain.SysUser;
import com.orm.dto.projection.UserOnlyInfo;
import com.orm.dto.projection.UserOnlyProjection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.util.Streamable;

import java.util.Collection;

public interface SysUserRepository extends JpaSupportRepository<SysUser, Long> {


    Streamable<SysUser> findByUsernameContaining(String name);

    Collection<UserOnlyInfo> findByUsername(String name);

    @Query(value = "select username from test_db.sys_user where username = ?1", nativeQuery = true)
    Collection<UserOnlyProjection> findByName(String name);
}
