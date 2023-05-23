package br.edu.ifsc.model;

public class Nurse {
    private String name;
    private int experienceYears;

    private Nurse(NurseBuilder builder) {
        this.name = builder.name;
        this.experienceYears = builder.experienceYears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Nurse: " + name + ", Experience Years: " + experienceYears;
    }
}