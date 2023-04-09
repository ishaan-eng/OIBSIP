In this implementation, we have five main operations - Transactions History, Withdraw, Deposit, Transfer, and Quit.

The Transactions History option displays all previous transactions in the ATM interface console. It uses an ArrayList of Transaction objects to keep track of each
transaction. The viewTransactionHistory method iterates through the ArrayList and prints out each transaction.

The Withdraw option prompts the user for the amount to withdraw. It checks if the user has sufficient funds in their balance to withdraw the requested amount.
If the user has sufficient funds, it subtracts the amount from the balance and adds a new Transaction object to the transactionHistory ArrayList with the type
"Withdraw" and the amount withdrawn.

The Deposit option prompts the user for the amount to deposit. It adds the amount to the balance and adds a new Transaction object to the transactionHistory ArrayList
with the type "Deposit" and the amount deposited.

The Transfer option prompts the user for the recipient's user id and the amount to transfer. It checks if the user has sufficient funds in their balance to transfer
the requested amount. If the user has sufficient funds, it subtracts the amount from the balance and adds a new Transaction object to the transactionHistory ArrayList
with the type "Transfer to user [recipient id]" and the amount transferred.

The Quit option exits the program.
