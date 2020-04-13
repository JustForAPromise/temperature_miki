package com.fhx.temperature.base;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Component
public interface BaseRepository<T> {
    T findOne(T var);

    List<T> findAll(T var1);

    List<T> findList(T var1);

    T findLastOne(T var1);

    T findById(T var1);

    List<T> findPage(T var1);

    long findTotal(T var1);

    int save(T var1);

    int update(T var1);

    int delete(T var1);

}
