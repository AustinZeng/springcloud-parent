package com.spring.mapper;

import com.spring.model.Device;

public interface DeviceMapper {
    Device selectByPrimaryKey(Integer id);
}