package com.belyuk.second_project.entity.impl;

import com.belyuk.second_project.entity.Medicine;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class VitaminsImpl implements Medicine {

  private String name;
  private String serial;
  private String manufacturer;
  private Date medCertificateIssueDate;
  private Date medCertificateExpiryDate;
  private String dosageForm;
  private int amount;
  private BigDecimal price;
  private String dosage;
  private String id;

  public VitaminsImpl() {
  }

  public void setSerial(String serial) {
    this.serial = serial;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void setId(String id) {
    this.id = id;
  }

  @Override
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  @Override
  public void setMedCertificateIssueDate(Date medCertificateIssueDate) {
    this.medCertificateIssueDate = medCertificateIssueDate;
  }

  @Override
  public void setMedCertificateExpiryDate(Date medCertificateExpiryDate) {
    this.medCertificateExpiryDate = medCertificateExpiryDate;
  }

  @Override
  public void setDosageForm(String dosageForm) {
    this.dosageForm = dosageForm;
  }

  @Override
  public void setAmount(int amount) {
    this.amount = amount;
  }

  @Override
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  @Override
  public void setDosage(String dosage) {
    this.dosage = dosage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    VitaminsImpl vitamins = (VitaminsImpl) o;

    if (amount != vitamins.amount) {
      return false;
    }
    if (name != null ? !name.equals(vitamins.name) : vitamins.name != null) {
      return false;
    }
    if (serial != null ? !serial.equals(vitamins.serial) : vitamins.serial != null) {
      return false;
    }
    if (manufacturer != null ? !manufacturer.equals(vitamins.manufacturer)
        : vitamins.manufacturer != null) {
      return false;
    }
    if (medCertificateIssueDate != null ? !medCertificateIssueDate.equals(
        vitamins.medCertificateIssueDate) : vitamins.medCertificateIssueDate != null) {
      return false;
    }
    if (medCertificateExpiryDate != null ? !medCertificateExpiryDate.equals(
        vitamins.medCertificateExpiryDate) : vitamins.medCertificateExpiryDate != null) {
      return false;
    }
    if (dosageForm != null ? !dosageForm.equals(vitamins.dosageForm)
        : vitamins.dosageForm != null) {
      return false;
    }
    if (price != null ? !price.equals(vitamins.price) : vitamins.price != null) {
      return false;
    }
    if (dosage != null ? !dosage.equals(vitamins.dosage) : vitamins.dosage != null) {
      return false;
    }
    return id != null ? id.equals(vitamins.id) : vitamins.id == null;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (serial != null ? serial.hashCode() : 0);
    result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
    result =
        31 * result + (medCertificateIssueDate != null ? medCertificateIssueDate.hashCode() : 0);
    result =
        31 * result + (medCertificateExpiryDate != null ? medCertificateExpiryDate.hashCode() : 0);
    result = 31 * result + (dosageForm != null ? dosageForm.hashCode() : 0);
    result = 31 * result + amount;
    result = 31 * result + (price != null ? price.hashCode() : 0);
    result = 31 * result + (dosage != null ? dosage.hashCode() : 0);
    result = 31 * result + (id != null ? id.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Vitamins:\n");
    sb.append("name=").append(name).append(",\n");
    sb.append("serial=").append(serial).append(",\n");
    sb.append("manufacturer=").append(manufacturer).append(",\n");
    sb.append("medCertificateIssueDate=").append(medCertificateIssueDate).append(",\n");
    sb.append("medCertificateExpiryDate=").append(medCertificateExpiryDate).append(",\n");
    sb.append("dosageForm=").append(dosageForm).append(",\n");
    sb.append("amount=").append(amount).append(",\n");
    sb.append("price=").append(price).append(",\n");
    sb.append("dosage=").append(dosage).append(",\n");
    sb.append("id=").append(id).append(".\n");
    return sb.toString();
  }
}
