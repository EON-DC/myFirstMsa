package com.example.app;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {

    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;


    public boolean isFraudulentCustomer(Long customerId) {
        fraudCheckHistoryRepository.save(
                FraudCheckHistory
                        .builder()
                        .customerId(customerId)
                        .isFraudster(false)
                        .createdOn(LocalDateTime.now())
                        .build()
        );
        return false;
    }
}
