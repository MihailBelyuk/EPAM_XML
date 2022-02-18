package com.belyuk.second_project.entity.impl;

import com.belyuk.second_project.entity.Medicine;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class AntibioticsImpl implements Medicine {

  private String name;
  private String manufacturer;
  private Date medCertificateIssueDate;
  private Date medCertificateExpiryDate;
  private String dosageForm;
  private int amount;
  private BigDecimal price;
  private String dosage;
  private String id;

  public AntibioticsImpl() {
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

    AntibioticsImpl that = (AntibioticsImpl) o;

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
    final StringBuilder sb = new StringBuilder("Antibiotics:\n");
    sb.append("name=").append(name).append(",\n");
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
