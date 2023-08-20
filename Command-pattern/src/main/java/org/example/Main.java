package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // this can be considered as CLIENT class as the respective class which implement Account status is called
        AccountStatusChangeExecuter asce=new AccountStatusChangeExecuter();
        asce.excuteAccountStatusChange(new AccountOpening());
        asce.excuteAccountStatusChange(new AccountClosing());
    }
}