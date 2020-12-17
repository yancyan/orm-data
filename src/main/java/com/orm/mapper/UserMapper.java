package com.orm.mapper;

import com.github.pagehelper.Page;

import java.util.Map;

public interface UserMapper {

    Page<Map<String, Object>> queryByConditionPageable(Map<String, Object> params);

}
