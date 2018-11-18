package com.company;

public class Pharmacy {
    private String drugName;
    private String company;
    private double unitPrice;
    private int inPackage;
    private int pharmacyNumber;
    private int shelfLife;

    public Pharmacy(String drugName, String company, double unitPrice, int inPackage, int pharmacyNumber, int shelfLife) {
        this.drugName = drugName;
        this.company = company;
        setUnitPrice(unitPrice);
        setInPackage(inPackage);
        setPharmacyNumber(pharmacyNumber);
        setShelfLife(shelfLife);
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "drugName='" + drugName + '\'' +
                ", company='" + company + '\'' +
                ", unitPrice=" + unitPrice +
                ", inPackage=" + inPackage +
                ", pharmacyNumber=" + pharmacyNumber +
                ", shelfLife=" + shelfLife +
                '}';
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getUnitPrice() { return unitPrice;}

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice <= 0. ? -1. : unitPrice;
    }

    public int getInPackage() {
        return inPackage;
    }

    public void setInPackage(int inPackage) {
        this.inPackage = inPackage <= 0 ? -1 : inPackage;
    }

    public int getPharmacyNumber() {
        return pharmacyNumber;
    }

    public void setPharmacyNumber(int pharmacyNumber) {
        this.pharmacyNumber = pharmacyNumber <= 0 ? -1 : pharmacyNumber;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife <= 0 ? -1 : shelfLife;
    }
}
