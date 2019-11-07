package com.innovect.Currency.conversion.modal;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
public class Rate {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  @Column(unique = true)
  private String currency;
  private Double value;

  public Rate(String currency, Double value) {
    this.currency = currency;
    this.value = value;
  }

  public Rate() {}

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }
}
