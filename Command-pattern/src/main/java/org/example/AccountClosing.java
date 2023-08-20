// This is a command class
package org.example;
public class AccountClosing implements AccountStatus{
    @Override
    public void changeAccountStatus() {
        System.out.println("Account is closed now");
    }
}
