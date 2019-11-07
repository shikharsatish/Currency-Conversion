package com.innovect.Currency.conversion.repository;

import com.innovect.Currency.conversion.modal.CurrencyConversionModal;
import org.springframework.data.repository.CrudRepository;

public interface CurrencyConversionRepository extends CrudRepository<CurrencyConversionModal, Integer> {
  CurrencyConversionModal findByBase(String base);
}
