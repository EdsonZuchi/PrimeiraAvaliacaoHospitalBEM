package br.edu.ifsc;

import br.edu.ifsc.model.Doctor;
import br.edu.ifsc.model.Hospital;
import br.edu.ifsc.model.Nurse;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = Hospital.getInstance();
        hospital.setName("Hospital BEM");

        Doctor doctor = new Doctor.DoctorBuilder()
                .name("Dr. John")
                .specialization("Cardiology")
                .build();
        hospital.addDoctor(doctor);

        Nurse nurse = new Nurse.NurseBuilder()
                .name("Nurse Jane")
                .experienceYears(5)
                .build();
        hospital.addNurse(nurse);

        doctor = new Doctor.DoctorBuilder()
                .name("Dra. Brena")
                .specialization("Psychiatrist")
                .build();
        hospital.addDoctor(doctor);

        doctor = new Doctor.DoctorBuilder()
                .name("Dr. Mateus")
                .specialization("Pediatrician")
                .build();
        hospital.addDoctor(doctor);

        nurse = new Nurse.NurseBuilder()
                .name("Nurse Edson")
                .experienceYears(15)
                .build();
        hospital.addNurse(nurse);

        System.out.println(hospital.toString());
    }
}
