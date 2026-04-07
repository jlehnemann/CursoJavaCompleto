package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;


public class ContractService {

    OnlinePaymentService onlinePaymentService;

    public ContractService() {
    }

    public OnlinePaymentService getOnlinePaymentService() {
        return onlinePaymentService;
    }

    public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months, OnlinePaymentService onlinePaymentService) {

        for (int i=1; i<=months; i++) {
            Double valuePerInstallment = (contract.getTotalValue()/months) +
                    onlinePaymentService.interest(contract.getTotalValue()/months,i);
            valuePerInstallment += onlinePaymentService.paymentFee(valuePerInstallment);


            LocalDate dueDate = contract.getDate().plusMonths(i);
            Installment installment = new Installment(dueDate, valuePerInstallment);
            contract.getInstallments().add(installment);
        }


    }
}
