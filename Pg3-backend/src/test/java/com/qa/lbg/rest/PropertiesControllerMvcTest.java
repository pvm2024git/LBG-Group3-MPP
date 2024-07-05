//package com.qa.lbg;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.jdbc.Sql;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.ResultMatcher;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = {"classpath:person-schema.sql","classpath:person-data.sql"})
//class LbgSpring1ApplicationTests {
//
//    @Autowired
//    private MockMvc mvc;
//    private ObjectMapper mapper;
//
//    @Test
//    void testCreate()throws Exception {
//        Person newPerson = new Person("bob", 42, "Builder");
//        String newPersonAsJson = this.mapper.writeValueAsString(newPerson);
//
//        RequestBuilder mockRequest = MockMvcRequestBuilders.post("/create").contentType(MediaType.APPLICATION_JSON).content(newPersonAsJson);
//
//        ResultMatcher checkStatus = MockMvcResultMatchers.status().isOk();
//        Person createdPerson = new Person(1, "Bob",42, "Builder");
//        String createdPersonAsJson = this.mapper.writeValueAsString(createdPerson);
//        ResultMatcher checkBody = MockMvcResultMatchers.content().json(createdPersonAsJson);
//
//        this.mvc.perform(mockRequest).andExpect(checkStatus).andExpect(checkBody);
//    }
//
//}
