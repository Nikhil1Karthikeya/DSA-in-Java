package Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {

            if (asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } 
            else {

                boolean alive = true;

                while (!stack.isEmpty() && stack.peek() > 0) {

                    if (Math.abs(asteroids[i]) < stack.peek()) {
                        alive = false;
                        break;
                    } 
                    else if (stack.peek() == Math.abs(asteroids[i])) {
                        stack.pop();
                        alive = false;
                        break;
                    } 
                    else {
                        stack.pop();
                    }
                }

                if (alive && (stack.isEmpty() || stack.peek() < 0)) {
                    stack.push(asteroids[i]);
                }
            }
        }

        int[] ans = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }
}