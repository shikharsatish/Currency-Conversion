package com.innovect.Currency.conversion.service;

import com.innovect.Currency.conversion.modal.CurrencyConversionModal;
import com.innovect.Currency.conversion.modal.Rate;
import com.innovect.Currency.conversion.modal.StartupInit;
import com.innovect.Currency.conversion.repository.CurrencyConversionRepository;
import com.innovect.Currency.conversion.repository.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyConversionService {

  @Autowired
  RateRepository rateRepository;

  @Autowired
  CurrencyConversionRepository currencyConversionRepository;

  @Autowired
  StartupInit startupInit;

  @Autowired
  Rate rate;

  public double getRates(String from, String to, double quantity) {
    CurrencyConversionModal currencyConversionModal = currencyConversionRepository.findByBase(from);
    List<Rate>rateList = currencyConversionModal.getRates();
    Rate rate = rateList.stream().filter(rate1 -> rate1.getCurrency().equals(to)).findFirst().get();
    return rate.getValue() * quantity;
  }
}
