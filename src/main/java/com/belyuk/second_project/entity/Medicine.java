package com.belyuk.second_project.entity;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Medicine {

  private String name;
  private String manufacturer;
  private Date medCertificateIssueDate;
  private Date medCertificateExpiryDate;
  private String dosageForm;
  private int amount;
  private BigDecimal price;
  private String dosage;
  private String id;

  public void setName(String name) {
    this.name = name;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public void setMedCertificateIssueDate(Date medCertificateIssueDate) {
    this.medCertificateIssueDate = medCertificateIssueDate;
  }

  public void setMedCertificateExpiryDate(Date medCertificateExpiryDate) {
    this.medCertificateExpiryDate = medCertificateExpiryDate;
  }

  public void setDosageForm(String dosageForm) {
    this.dosageForm = dosageForm;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public void setDosage(String dosage) {
    this.dosage = dosage;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Medicine that = (Medicine) o;

    if (amount != that.amount) {
      return false;
    }
    if (name != null ? !name.equals(that.name) : that.name != null) {
      return false;
    }
    if (manufacturer != null ? !manufacturer.equals(that.manufacturer)
        : that.manufacturer != null) {
      return false;
    }
    if (medCertificateIssueDate != null ? !medCertificateIssueDate.equals(
        that.medCertificateIssueDate) : that.medCertificateIssueDate != null) {
      return false;
    }
    if (medCertificateExpiryDate != null ? !medCertificateExpiryDate.equals(
        that.medCertificateExpiryDate) : that.medCertificateExpiryDate != null) {
      return false;
    }
    if (dosageForm != null ? !dosageForm.equals(that.dosageForm) : that.dosageForm != null) {
      return false;
    }
    if (price != null ? !price.equals(that.price) : that.price != null) {
      return false;
    }
    if (dosage != null ? !dosage.equals(that.dosage) : that.dosage != null) {
      return false;
    }
    return id != null ? id.equals(that.id) : that.id == null;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
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
    final StringBuilder sb = new StringBuilder("AbstractMedicine{");
    sb.append("name='").append(name).append('\'');
    sb.append(", manufacturer='").append(manufacturer).append('\'');
    sb.append(", medCertificateIssueDate=").append(medCertificateIssueDate);
    sb.append(", medCertificateExpiryDate=").append(medCertificateExpiryDate);
    sb.append(", dosageForm='").append(dosageForm).append('\'');
    sb.append(", amount=").append(amount);
    sb.append(", price=").append(price);
    sb.append(", dosage='").append(dosage).append('\'');
    sb.append(", id='").append(id).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
