package com.qa.lbg.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.lbg.entities.Seller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.queryParam;

@SpringBootTest
@AutoConfigureMockMvc
@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD,
        scripts = {"classpath:person-schema.sql", "classpath:person-data.sql"})
public class PersonControllerMvcTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper mapper;

    @Test
    void testCreate() throws Exception {

        Seller newPerson = new Seller("Dave", 41, "HR");
        String newPersonAsJson = this.mapper.writeValueAsString(newPerson);
        RequestBuilder mockRequest = MockMvcRequestBuilders.post("/create").contentType(MediaType.APPLICATION_JSON).content(newPersonAsJson);

        ResultMatcher checkStatus = MockMvcResultMatchers.status().isOk();
        Seller createdPerson = new Seller(2, "Dave", 41, "HR");
        String createdPersonAsJson = this.mapper.writeValueAsString(createdPerson);
        ResultMatcher checkBody = MockMvcResultMatchers.content().json(createdPersonAsJson);

        this.mvc.perform(mockRequest).andExpect(checkStatus).andExpect(checkBody);
    }
    @Test
    void testDelete() throws Exception {
        int id = 1;
        RequestBuilder mockRequest = MockMvcRequestBuilders.delete("/remove/" + id);

        ResultMatcher checkStatus = MockMvcResultMatchers.status().isOk();

        Seller existing = new Seller(id, "Praveen", 40, "SE");
        String existingPersonAsJson = this.mapper.writeValueAsString(existing);
        ResultMatcher checkBody = MockMvcResultMatchers.content().json(existingPersonAsJson);

        this.mvc.perform(mockRequest).andExpect(checkStatus).andExpect(checkBody);
    }

    @Test
    void testUpdate() throws Exception {
        int id = 1;
        Seller updated = new Seller(id, "David", 35, "Analyst");

        RequestBuilder mockRequest = MockMvcRequestBuilders.patch("/update/" + id)
                .queryParam("name", updated.getName())
                .queryParam("age", String.valueOf(updated.getAge()))
                .queryParam("job", updated.getJob());

        ResultMatcher checkStatus = MockMvcResultMatchers.status().isOk();

        String updatePersonAsJson = this.mapper.writeValueAsString(updated);
        ResultMatcher checkBody = MockMvcResultMatchers.content().json(updatePersonAsJson);

        this.mvc.perform(mockRequest).andExpect(checkStatus).andExpect(checkBody);
    }

    @Test
    void testReadAll() throws Exception {
        RequestBuilder mockRequest = MockMvcRequestBuilders.get("/getAll");

        ResultMatcher checkStatus = MockMvcResultMatchers.status().isOk();
        Seller existing = new Seller(1, "Praveen", 40, "SE");
        String existingPersonAsJson = this.mapper.writeValueAsString(List.of(existing));
        ResultMatcher checkBody = MockMvcResultMatchers.content().json(existingPersonAsJson);

        this.mvc.perform(mockRequest).andExpect(checkStatus).andExpect(checkBody);
    }



}
