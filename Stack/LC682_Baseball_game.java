package Stack;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int x,temp;
        int final_sum=0;
        for(int i=0;i<operations.length;i++){
        if(operations[i].equals("C")){
            stack.pop();
        }
        else if(operations[i].equals("D")){
            temp=stack.peek()*2;
        stack.push(temp);
        }
        else if(operations[i].equals("+")){
            int top_store = stack.pop();
int sum_store = top_store + stack.peek();
stack.push(top_store);
stack.push(sum_store);
        }
        else{
            x = Integer.parseInt(operations[i]);
stack.push(x);
        }
        }
        // to return sum
        while(!stack.isEmpty()){
        final_sum+=stack.pop();
        }
        return final_sum;
    }
}
