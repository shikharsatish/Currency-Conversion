package com.innovect.Currency.conversion.controller;

import com.innovect.Currency.conversion.modal.CurrencyConversionModal;
import com.innovect.Currency.conversion.modal.Rate;
import com.innovect.Currency.conversion.repository.RateRepository;
import com.innovect.Currency.conversion.service.CurrencyConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(value = "/currency-converter")
public class CurrencyConversionController {

  @Autowired
  CurrencyConversionService conversionService;

  @Autowired
  RateRepository rateRepository;

  CurrencyConversionModal conversionModal;

  @RequestMapping("/from/{from}/to/{to}/quantity/{quantity}")
  public double currencyConversion(@PathVariable String from, @PathVariable String to, @PathVariable Double quantity) {
  return conversionService.getRates(from, to, quantity);
  }
  @RequestMapping("/test")
  public @ResponseBody Iterable<Rate> getRates(){
    return rateRepository.findAll();
  }
}
