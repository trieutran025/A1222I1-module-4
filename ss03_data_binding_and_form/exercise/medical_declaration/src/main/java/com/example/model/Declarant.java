package com.example.model;

public class Declarant {
    private String idDeclarant;
    private Information information;
    private Contact contact;
    private Disease disease;
    private HistoryInfection historyInfection;



    public Declarant(String idDeclarant, Information information, Contact contact, Disease disease, HistoryInfection historyInfection) {
        this.idDeclarant = idDeclarant;
        this.information = information;
        this.contact = contact;
        this.disease = disease;
        this.historyInfection = historyInfection;
    }

    public String getIdDeclarant() {
        return idDeclarant;
    }

    public void setIdDeclarant(String idDeclarant) {
        this.idDeclarant = idDeclarant;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public HistoryInfection getHistoryInfection() {
        return historyInfection;
    }

    public void setHistoryInfection(HistoryInfection historyInfection) {
        this.historyInfection = historyInfection;
    }
}
