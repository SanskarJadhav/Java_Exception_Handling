# Java_Exception_Handling
There are two programs.

The first one involves the FactorialCalculation class and FactorialException class. The user can calculate the factorials of a list of numbers entered in the command line. The inbuilt NumberFormatException handles incorrect parsing, for example if the user enters string data that is not an integer. The custom FactorialException handles the range of numbers that can be entered, from 0 to 15 as negative numbers do not have a factorial and any number larger than 15 will have a factorial beyond the storage size of long type data.

The second program involves the InputString class and NOMATCHEXCP class. The user enters various strings, but they must be India, else the program throws a custom exception that informs the user which word entered was incorrect at which position and which line in the program code (using printStackTrace).
