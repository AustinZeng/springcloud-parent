package com.spring.mapper;

import com.spring.model.AgreementWithBLOBs;

public interface AgreementMapper {
    AgreementWithBLOBs selectByPrimaryKey(Integer id);
}