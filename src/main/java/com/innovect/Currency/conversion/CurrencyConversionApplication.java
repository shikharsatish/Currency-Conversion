package com.innovect.Currency.conversion;

import com.innovect.Currency.conversion.repository.CurrencyConversionRepository;
import com.innovect.Currency.conversion.repository.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class CurrencyConversionApplication {

	@Autowired
	CurrencyConversionRepository currencyConversionRepository;

	@Autowired
	RateRepository rateRepository;


	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		final String uri = "https://api.exchangerate-api.com/v4/latest/USD";
//		RestTemplate restTemplate = new RestTemplate();
//		 String result = restTemplate.getForObject(uri, String.class);
//		CurrencyConverterDto result = restTemplate.getForObject(uri, CurrencyConverterDto.class);
//		CurrencyConversionModal currencyConversionModal = currencyConversionRepository.findByBase("USD");
//		RateRepository rateObj = JsonConvert.DeserializeObject<RateRepository>(result);
		// CurrencyConversionModal currencyConversionModal = new CurrencyConversionModal();
///		rateRepository.save(new Rate(1, "AER",3.6));
//		rateRepository.save(new Rate(2,"ARD",60.13));
//		rateRepository.save(new Rate(3,"INR",68.0));
//		rateRepository.save(new Rate(4,"BGD",1.7));
//		rateRepository.save(new Rate(5,"BRQ",3.99));

	}

