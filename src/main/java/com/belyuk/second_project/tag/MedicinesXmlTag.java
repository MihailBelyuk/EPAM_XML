package com.belyuk.second_project.tag;

public enum MedicinesXmlTag {
   ANTIBIOTICS("antibiotics"),

  NAME("name"),
  MANUFACTURER("manufacturer"),
  CERTIFICATE("certificate"),
  DOSAGE_FORM("dosage_form"),
  PACKAGE("package"),
  PACKAGE_TYPE("package-type"),
  AMOUNT("amount"),
  PRICE("price"),
  DOSAGE("dosage"),
  ID("id"),
  SERIAL("serial"),
  ISSUE_DATE("issue_date"),
  EXPIRY_DATE("expiry_date"),
  SOLUBILITY("solubility"),
  PAINKILLER("painkiller"),
  ORIGIN("origin");
  private String value;

  MedicinesXmlTag(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
