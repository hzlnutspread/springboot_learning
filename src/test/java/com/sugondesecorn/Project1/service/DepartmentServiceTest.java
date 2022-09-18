package com.sugondesecorn.Project1.service;

import com.sugondesecorn.Project1.entity.Department;
import com.sugondesecorn.Project1.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

//    This is called before each and every test case in this class (If you have 5 tests it will run 5 times)
//    @BeforeAll will only be called once for all 5
//    @AfterAll, @AfterEach self explanatory

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department =
                Department.builder()
                        .departmentName("TE")
                        .departmentAddress("Australia")
                        .departmentCode("TE-14")
                        .departmentId(1L)
                        .build();

        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("TE"))
                .thenReturn(department);
    }

    @Test
    @DisplayName("Get Data based on Valid Department Name")
//    @Disabled - this will not run this method
    public void whenValidDepartmentName_thenDepartmentShouldFound() {
        String departmentName = "TE";
        Department found = departmentService.fetchDepartmentByName(departmentName);

        assertEquals(departmentName, found.getDepartmentName());
    }
}