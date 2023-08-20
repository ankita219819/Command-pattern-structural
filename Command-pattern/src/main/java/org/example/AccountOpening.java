// This is a command class
package org.example;

public class AccountOpening implements AccountStatus{
    @Override
    public void changeAccountStatus() {
        System.out.println("Account is opened now");
    }
}
