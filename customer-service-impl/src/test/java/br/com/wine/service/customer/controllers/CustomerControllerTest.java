package br.com.wine.service.customer.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * CustomerControllerTest
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
@TestPropertySource(properties = "server.port=8080")
public class CustomerControllerTest {

    @Autowired
    private CustomerClient client;

    @Test
    public void test_getCustomer() {
        Long id = 666L;
        assertEquals(client.getCustomer(id).getId(), id);
    }

}