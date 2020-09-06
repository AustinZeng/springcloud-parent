package com.spring.mapper;

import com.spring.model.Relation;

public interface RelationMapper {
    Relation selectByPrimaryKey(Integer id);
}