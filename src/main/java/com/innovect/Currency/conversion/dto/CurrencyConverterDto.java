package com.innovect.Currency.conversion.dto;

import java.util.Map;

public class CurrencyConverterDto {
  private String base;
  private Map<String, Map<String, Double>> rates;

  public CurrencyConverterDto() {}

  public CurrencyConverterDto(String base, Map<String, Map<String, Double>> rates) {
    this.base = base;
    this.rates = rates;
  }

  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }
}
