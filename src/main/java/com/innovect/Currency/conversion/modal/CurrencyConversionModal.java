package com.innovect.Currency.conversion.modal;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Component
@Entity
public class CurrencyConversionModal {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  @Column(unique = true)
  private String base;
  private String date;
  private String timeLastUpdated;

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getTimeLastUpdated() {
    return timeLastUpdated;
  }

  public void setTimeLastUpdated(String timeLastUpdated) {
    this.timeLastUpdated = timeLastUpdated;
  }

  @ElementCollection
  private List<Rate> rates;

  public int getId() {
    return id;
  }

  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public void setId(int id) {
    this.id = id;
  }

  public List<Rate> getRates() {
    return rates;
  }

  public void setRates(List<Rate> rates) {
    this.rates = rates;
  }

  public CurrencyConversionModal() {
  }
}
