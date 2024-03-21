package org.example.account.dtos;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.account.enums.CurrencyType;
import org.example.account.models.Customer;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {
    private String id;
    private Double balance;
    private LocalDate dateCreated;
    private CurrencyType currency;
    private Customer customer;
    private Long customerId;
}



