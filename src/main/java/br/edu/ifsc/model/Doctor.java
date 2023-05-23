package br.edu.ifsc.model;

public class Doctor {
    private String name;
    private String specialization;

    private Doctor(DoctorBuilder builder) {
        this.name = builder.name;
        this.specialization = builder.specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public static class DoctorBuilder {
        private String name;
        private String specialization;

        public DoctorBuilder name(String name) {
            this.name = name;
            return this;
        }

        public DoctorBuilder specialization(String specialization) {
            this.specialization = specialization;
            return this;
        }

        public Doctor build() {
            return new Doctor(this);
        }
    }

    @Override
    public String toString() {
        return "Doctor: " + name + ", Specialization: " + specialization;
    }
}