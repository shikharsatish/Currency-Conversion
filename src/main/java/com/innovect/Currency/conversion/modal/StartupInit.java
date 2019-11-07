package com.innovect.Currency.conversion.modal;

import com.innovect.Currency.conversion.repository.CurrencyConversionRepository;
import com.innovect.Currency.conversion.repository.RateRepository;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class StartupInit {
  @Autowired
  RateRepository rateRepository;
  @Autowired
  CurrencyConversionRepository currencyConversionRepository;
  @PostConstruct
  public void init() {
    final String uri = "https://api.exchangerate-api.com/v4/latest/USD";
    try {
      List<Rate> rateList = new ArrayList<>();
      RestTemplate restTemplate = new RestTemplate();
      String result = restTemplate.getForObject(uri, String.class);
      JSONObject jsonObject = new JSONObject(result);
      String base = jsonObject.getString("base");
      JSONObject rates = (JSONObject) jsonObject.get("rates");
      JSONArray rateArray = rates.names();
      for (int i = 0; i < rates.length(); i++){
        String currency = rateArray.getString(i);
        double values = rates.getDouble(currency);
        Rate rate1 = new Rate(currency, values);
        rateList.add(rate1);
        rateRepository.save(rate1);
      }
      CurrencyConversionModal currencyConversionModal = new CurrencyConversionModal();
      currencyConversionModal.setRates(rateList);
      currencyConversionModal.setBase(base);
      currencyConversionRepository.save(currencyConversionModal);
    } catch (JSONException e) {
    }
  }
}

