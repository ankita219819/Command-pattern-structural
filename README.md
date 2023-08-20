# Command-pattern is a behavioral design pattern

This model allows us to decouple objects that produce the commands from their consumers, so that's why the pattern is commonly known as the producer-consumer pattern.
In a classic implementation, the command pattern requires implementing four components (in the example, I have mentioned the class in respective component): 
1. the Command (AccountStatus, AccountOpening, AccountClosing), 
2. the Receiver (didn't have), 
3. the Invoker (AccountStatusChangeExecuter), and 
4. the Client (main method).

To Refer more example please refer the [Link](https://www.baeldung.com/java-command-pattern)
