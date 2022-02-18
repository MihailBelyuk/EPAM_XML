package com.belyuk.second_project.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Vitamins extends Medicine {

  private String serial;

  public void setSerial(String serial) {
    this.serial = serial;
  }

  @Override
  public void setName(String name) {
    super.setName(name);
  }

  @Override
  public void setManufacturer(String manufacturer) {
    super.setManufacturer(manufacturer);
  }

  @Override
  public void setMedCertificateIssueDate(Date medCertificateIssueDate) {
    super.setMedCertificateIssueDate(medCertificateIssueDate);
  }

  @Override
  public void setMedCertificateExpiryDate(Date medCertificateExpiryDate) {
    super.setMedCertificateExpiryDate(medCertificateExpiryDate);
  }

  @Override
  public void setDosageForm(String dosageForm) {
    super.setDosageForm(dosageForm);
  }

  @Override
  public void setAmount(int amount) {
    super.setAmount(amount);
  }

  @Override
  public void setPrice(BigDecimal price) {
    super.setPrice(price);
  }

  @Override
  public void setDosage(String dosage) {
    super.setDosage(dosage);
  }

  @Override
  public void setId(String id) {
    super.setId(id);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }

    Vitamins vitamins = (Vitamins) o;

    return serial != null ? serial.equals(vitamins.serial) : vitamins.serial == null;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (serial != null ? serial.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("VitaminsImpl{");
    sb.append("serial='").append(serial).append('\'');
    sb.append(super.toString()).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
