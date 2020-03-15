package com.mengfanliang.service;

import com.mengfanliang.entity.SpRole;


import java.util.List;

public interface SpRoleService {
    List<SpRole> findList(String name,int page,int rows);
}
