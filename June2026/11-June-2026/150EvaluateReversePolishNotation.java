class Solution {
    public int evalRPN(String[] tokens) {
        // can be solved using stack
        // whenever the token is a number, push onto stack
        // whenever the token is an operand, then pop last two numbers from stack and perform operation
        // push the result back into stack
        Stack<String> stack = new Stack<String>();

        String operands = "+-*/";

        for(String token: tokens){
            if(!operands.contains(token)){
                stack.push(token);
            } else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());

                int index = operands.indexOf(token);

                switch(index){
                    case 0:
                        stack.push(String.valueOf(a+b));
                        break;
                    case 1:
                        stack.push(String.valueOf(b-a));
                        break;
                    case 2:
                        stack.push(String.valueOf(a*b));
                        break;
                    case 3:
                        stack.push(String.valueOf(b/a));
                        break;
                }
            }
        }

        // after iterating through all tokens, we have our final stack
        return Integer.valueOf(stack.pop());
    }
}