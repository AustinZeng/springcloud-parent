package com.spring.mapper;

import com.spring.model.NotifyMailbox;

public interface NotifyMailboxMapper {
    NotifyMailbox selectByPrimaryKey(Integer id);
}