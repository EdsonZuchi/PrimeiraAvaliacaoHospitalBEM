package br.edu.ifsc.model;

public abstract class HealthcareProfessional implements Cloneable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public HealthcareProfessional clone() throws CloneNotSupportedException {
        return (HealthcareProfessional) super.clone();
    }
}