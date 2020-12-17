package com.orm.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class PageCondition implements Serializable {
    private Long pageNum;
    private Long pageSize;
    private Boolean countSql;
}
