package com.example.model;

public class HistoryInfection {
    private boolean  animalContact;
    private boolean  nCovContact;

    public HistoryInfection(boolean animalContact, boolean nCovContact) {
        this.animalContact = animalContact;
        this.nCovContact = nCovContact;
    }

    public HistoryInfection() {
    }

    public boolean isAnimalContact() {
        return animalContact;
    }

    public void setAnimalContact(boolean animalContact) {
        this.animalContact = animalContact;
    }

    public boolean isnCovContact() {
        return nCovContact;
    }

    public void setnCovContact(boolean nCovContact) {
        this.nCovContact = nCovContact;
    }
}
