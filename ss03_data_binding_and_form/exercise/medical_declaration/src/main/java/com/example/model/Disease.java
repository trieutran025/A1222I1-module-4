package com.example.model;

public class Disease {
    private boolean fever; //Sốt
    private boolean cough;//Ho
    private boolean shortNess;//Khó thở
    private boolean soreThroat;//Đau họng
    private boolean vomit;// Nôn
    private boolean diarrhea;//Tiêu chảy
    private boolean hemorrhage;//Xuất huyết
    private boolean rash;//nổi ban

    public Disease(boolean fever, boolean cough, boolean shortNess, boolean soreThroat,
                   boolean vomit, boolean diarrhea, boolean hemorrhage, boolean rash) {
        this.fever = fever;
        this.cough = cough;
        this.shortNess = shortNess;
        this.soreThroat = soreThroat;
        this.vomit = vomit;
        this.diarrhea = diarrhea;
        this.hemorrhage = hemorrhage;
        this.rash = rash;
    }

    public Disease() {
    }

    public boolean isFever() {
        return fever;
    }

    public void setFever(boolean fever) {
        this.fever = fever;
    }

    public boolean isCough() {
        return cough;
    }

    public void setCough(boolean cough) {
        this.cough = cough;
    }

    public boolean isShortNess() {
        return shortNess;
    }

    public void setShortNess(boolean shortNess) {
        this.shortNess = shortNess;
    }

    public boolean isSoreThroat() {
        return soreThroat;
    }

    public void setSoreThroat(boolean soreThroat) {
        this.soreThroat = soreThroat;
    }

    public boolean isVomit() {
        return vomit;
    }

    public void setVomit(boolean vomit) {
        this.vomit = vomit;
    }

    public boolean isDiarrhea() {
        return diarrhea;
    }

    public void setDiarrhea(boolean diarrhea) {
        this.diarrhea = diarrhea;
    }

    public boolean isHemorrhage() {
        return hemorrhage;
    }

    public void setHemorrhage(boolean hemorrhage) {
        this.hemorrhage = hemorrhage;
    }

    public boolean isRash() {
        return rash;
    }

    public void setRash(boolean rash) {
        this.rash = rash;
    }
}
