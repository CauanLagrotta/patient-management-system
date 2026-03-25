package com.cauanlagrotta.patientservice.mapper;

import com.cauanlagrotta.patientservice.dto.PatientResponseDTO;
import com.cauanlagrotta.patientservice.model.Patient;

public class PatientMapper {
  public static PatientResponseDTO toDTO(Patient patient){
    PatientResponseDTO patientDTO = new PatientResponseDTO();
    patientDTO.setId(patientDTO.getId());
    patientDTO.setName(patientDTO.getName());
    patientDTO.setAddress(patient.getAddress());
    patientDTO.setEmail(patientDTO.getEmail());
    patientDTO.setDateOfBirth(patient.getDateOfBirth().toString());
    return patientDTO;
  }
}
