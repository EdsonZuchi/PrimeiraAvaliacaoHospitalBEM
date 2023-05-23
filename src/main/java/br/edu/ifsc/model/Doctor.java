package br.edu.ifsc.model;

public class Doctor extends HealthcareProfessional{
    private String specialization;

    private Doctor(DoctorBuilder builder) {
        this.setName(builder.name);
        this.specialization = builder.specialization;
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
        return "Doctor: " + getName() + ", Specialization: " + specialization;
    }
}