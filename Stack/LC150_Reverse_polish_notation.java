package Stack;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int x,temp;
for(int i=0;i<tokens.length;i++){
    //+
if(tokens[i].equals("+")){
temp=stack.pop();
int sum=temp+stack.pop();
stack.push(sum);
}
//-
else if(tokens[i].equals("-")){
temp=stack.pop();
int diff=stack.pop()-temp;
stack.push(diff);
}
//*
else if(tokens[i].equals("*")){
temp=stack.pop();
int product=temp*stack.pop();
stack.push(product);
}
// /
else if(tokens[i].equals("/")){
temp=stack.pop();
int div=stack.pop()/temp;
stack.push(div);
}
else{
    x=Integer.parseInt(tokens[i]);
    stack.push(x);
}
}
return stack.peek();
    }
}
