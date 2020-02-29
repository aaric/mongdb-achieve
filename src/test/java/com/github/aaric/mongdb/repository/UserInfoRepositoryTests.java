package com.github.aaric.mongdb.repository;

import com.github.aaric.mongdb.entity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * UserInfoRepositoryTests
 *
 * @author Aaric, created on 2020-02-29T22:35.
 * @version 0.1.0-SNAPSHOT
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserInfoRepositoryTests {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Test
    public void testSave() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(1)
                .setUsername("admin")
                .setEmail("admin@163.com");
        userInfoRepository.save(userInfo);
    }

    @Test
    public void testFindAll() {
        List<UserInfo> userInfoList = userInfoRepository.findAll();
        userInfoList.forEach(object -> System.out.println(object));

    }
}
