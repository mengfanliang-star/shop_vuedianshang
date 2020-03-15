package com.mengfanliang;

import com.mengfanliang.mapper.SpRoleMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ShopApplicationTests {
    @Autowired
    SpRoleMapper mapper;

    @Test
    void contextLoads() {
        mapper.deleteByPrimaryKey(41);

    }

}
