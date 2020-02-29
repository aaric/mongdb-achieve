package com.github.aaric.mongdb;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * MongodbTests
 *
 * @author Aaric, created on 2018-05-09T12:00.
 * @since 0.1.0-SNAPSHOT
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MongodbTests {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void testGetObject() {
        Assert.assertNotNull(mongoTemplate);
    }
}