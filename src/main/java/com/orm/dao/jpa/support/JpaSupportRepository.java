package com.orm.dao.jpa.support;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.Optional;

//@RepositoryDefinition
@NoRepositoryBean
public interface JpaSupportRepository<T, ID> extends JpaRepository<T, ID> {
    default Optional<T> findOptionById(ID id){
        return findById(id);
    }

}
