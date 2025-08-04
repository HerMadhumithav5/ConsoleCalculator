Java Console Calculator

This is a simple console-based calculator built using Java in IntelliJ IDEA.
The calculator supports four basic arithmetic operations: addition, subtraction, multiplication, and division. 
Each operation is implemented as a separate method within a `Calculator` class, promoting clean code and reusability. 
Special attention is given to the division operation, where exception handling is used to manage division by zero.
An `ArithmeticException` is thrown and properly handled to ensure the program doesn’t crash during invalid input.
In the `main` method, I created an object of the Calculator class and used the `Scanner` class to capture user input.
A `do-while` loop allows repeated calculations until the user chooses to exit.
A `switch-case` structure is used to provide a menu-driven interface, letting users choose the operation they wish to perform. 
After each calculation, the user is prompted to continue or exit.
If they choose to continue, the loop repeats; otherwise, the program terminates gracefully, and the `Scanner` is closed.
This project demonstrates core Java concepts such as object-oriented programming, control flow, exception handling, and user interaction through the console.
