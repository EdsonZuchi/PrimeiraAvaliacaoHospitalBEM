package br.edu.ifsc.model;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private static Hospital instance;
    private String name;
    private final List<Doctor> doctors;
    private final List<Nurse> nurses;

    private Hospital() {
        doctors = new ArrayList<>();
        nurses = new ArrayList<>();
    }

    public static Hospital getInstance() {
        if (instance == null) {
            instance = new Hospital();
        }
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addNurse(Nurse nurse) {
        nurses.add(nurse);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Hospital: ").append(name).append("\n");

        builder.append("Doctors:\n");
        for (Doctor doctor : doctors) {
            builder.append(doctor).append("\n");
        }

        builder.append("Nurses:\n");
        for (Nurse nurse : nurses) {
            builder.append(nurse).append("\n");
        }

        return builder.toString();
    }
}