Here are the commands need to implement:
1) +, -, /, * : These are your standard arithmetic functions, requiring the stack to be at least two deep. The top two elements are then popped off the stack, used in the computation, and the result is "pushed" back to the top of the stack. If an exception occurs, the stack should not change.

2) pop : This removes the top element from the stack

3) clear : This clears the stack. It is not an error to clear an empty stack.

4) midi : This uses the top three elements and generates a midi sound whose instrument is specified by the top stack value, note is specified by the second-from-the-top value, and duration by the third-from-top value. The stack contents do not change as the result of this command, but the side-effect is that a sound is produced.

5) quit : This ends the simulation 
