package com.github.aaric.mongdb;

import com.github.aaric.mongdb.entity.UserInfo;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * MongodbTests
 *
 * @author Aaric, created on 2018-05-09T12:00.
 * @since 0.1.0-SNAPSHOT
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MongoTemplateTests {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    @Ignore
    public void testSave() {
        UserInfo userInfo;
        for (int i = 0; i < 10; i++) {
            userInfo = new UserInfo();
            userInfo.setId(i)
                    .setUsername("user" + i)
                    .setEmail("user" + i + "@163.com")
                    .setAge(18 + 5 * i)
                    .setSalary(2000D + 100 * i);
            mongoTemplate.save(userInfo);
        }
    }

    @Test
    @Ignore
    public void testFindOne() {
        Query query = new Query(Criteria.where("username").is("user1"));
        UserInfo userInfo = mongoTemplate.findOne(query, UserInfo.class);
        System.out.println(userInfo);
    }

    @Test
    @Ignore
    public void testUpdateFirst() {
        Query query = new Query(Criteria.where("id").is(0));
        Update update = new Update().set("username", "admin")
                .set("salary", 5000D);
        mongoTemplate.updateFirst(query, update, UserInfo.class);
        //mongoTemplate.updateMulti(query, update, UserInfo.class);
    }

    @Test
    @Ignore
    public void testRemove() {
        Query query = new Query(Criteria.where("id").is(9));
        mongoTemplate.remove(query, UserInfo.class);
    }

    @Test
    @Ignore
    public void testPage() {
        Integer pageNum = 2;
        Integer pageSize = 5;
        Query query = new Query(Criteria.where("age").gt(18));

        long count = mongoTemplate.count(query, UserInfo.class);
        System.out.println(count);

        query.skip((pageNum - 1) * pageSize).limit(pageSize);
        List<UserInfo> userInfoList = mongoTemplate.find(query, UserInfo.class);
        System.out.println(userInfoList.size());
    }
}
