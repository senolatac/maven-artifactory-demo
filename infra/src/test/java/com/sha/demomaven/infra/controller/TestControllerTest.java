package com.sha.demomaven.infra.controller;

import com.sha.demomaven.infra.configuration.TestConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ContextConfiguration(classes={TestConfiguration.class})
@WebMvcTest(controllers = TestController.class)
class TestControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void getTest_success() throws Exception {
        mockMvc.perform(get("/test"))
                .andExpect(status().isOk());
    }
}