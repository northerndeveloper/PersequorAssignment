package com.persequor.compliance.eu;

public class CompalianceServiceEUImpl implements  ComplianceService{

    @Override
    public void send(ComplianceMessage message) {

        //TODO
        System.out.println("Compaliance Message for EU type is sent" + message.getMessageId());
    }
}
