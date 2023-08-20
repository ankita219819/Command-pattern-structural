// this is the invoker class which invokes / excute a command class
package org.example;

public class AccountStatusChangeExecuter {
    public void excuteAccountStatusChange(AccountStatus accountStatus){
        accountStatus.changeAccountStatus();
    }

}
