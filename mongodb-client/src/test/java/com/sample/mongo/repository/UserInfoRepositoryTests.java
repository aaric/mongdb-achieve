package com.sample.mongo.repository;

import com.sample.mongo.TestApp;
import com.sample.mongo.entity.UserInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

/**
 * UserInfoRepositoryTests
 *
 * @author Aaric, created on 2020-02-29T22:35.
 * @version 0.1.0-SNAPSHOT
 */
@Disabled
@SpringBootTest(classes = TestApp.class)
@ExtendWith(SpringExtension.class)
public class UserInfoRepositoryTests {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Test
    public void testSave() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(1)
                .setUsername("admin")
                .setEmail("admin@163.com")
                .setAge(18)
                .setSalary(2000D);
        userInfoRepository.save(userInfo);
    }

    @Test
    public void testFindAll() {
        List<UserInfo> userInfoList = userInfoRepository.findAll();
        userInfoList.forEach(object -> System.out.println(object));
    }
}
