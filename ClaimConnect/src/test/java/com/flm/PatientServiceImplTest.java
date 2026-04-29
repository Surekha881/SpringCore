package com.flm;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.flm.entity.Patient;
import com.flm.repository.PatientRepo;
import com.flm.service.PatientServiceImpl;

@SpringBootTest
class PatientServiceImplTest {

    @MockBean
    private PatientRepo repo;   // mock repo so no real DB

    @Autowired
    private PatientServiceImpl service;  // real service bean

    @Test
    void testRegisterDetailsEncodesPassword() {
        // Arrange
        Patient patient = new Patient();
        patient.setPatientName("John");
        patient.setPatientEmail("john@gmail.com");
        patient.setPatientPassword("plain123");

        // Mock repo.save to just return the patient back
        when(repo.save(any(Patient.class))).thenAnswer(invocation -> invocation.getArgument(0));

        // Act
        Patient saved = service.signup(patient);

        // Assert
        assertNotEquals("plain123", saved.getPatientPassword()); // password should be encoded
        assertTrue(saved.getPatientPassword().startsWith("$2a$")); // BCrypt hash format
    }
}
