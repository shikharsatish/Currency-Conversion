package com.innovect.Currency.conversion.repository;

import com.innovect.Currency.conversion.modal.Rate;
import org.json.JSONObject;
import org.springframework.data.repository.CrudRepository;

public interface RateRepository extends CrudRepository<Rate, String> {
 Rate findByCurrency(String to);
 Rate save(JSONObject jsonObject);
}
