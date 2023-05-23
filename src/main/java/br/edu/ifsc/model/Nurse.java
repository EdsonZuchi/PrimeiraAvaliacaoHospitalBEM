package br.edu.ifsc.model;

public class Nurse extends HealthcareProfessional{
    private int experienceYears;

    private Nurse(NurseBuilder builder) {
        this.setName(builder.name);
        this.experienceYears = builder.experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public static class NurseBuilder {
        private String name;
        private int experienceYears;

        public NurseBuilder name(String name) {
            this.name = name;
            return this;
        }

        public NurseBuilder experienceYears(int experienceYears) {
            this.experienceYears = experienceYears;
            return this;
        }

        public Nurse build() {
            return new Nurse(this);
        }
    }

    @Override
    public String toString() {
        return "Nurse: " + getName() + ", Experience Years: " + experienceYears;
    }
}