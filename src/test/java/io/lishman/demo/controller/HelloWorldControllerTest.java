package io.lishman.demo.controller;


import io.lishman.demo.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(HelloWorldController.class)
public class HelloWorldControllerTest {

    @MockBean
    private TestService testService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getHelloWorldMessage() throws Exception {
        given(testService.message()).willReturn("my message");

        mockMvc.perform(get("/message"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message", is(equalTo("my message"))));



    }

}