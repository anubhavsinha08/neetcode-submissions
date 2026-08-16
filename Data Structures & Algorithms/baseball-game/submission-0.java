class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> ans = new Stack<>();

        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                ans.pop();
            }else if(operations[i].equals("D")){
                int nextVal = ans.peek();
                ans.push(nextVal*2);
            }else if(operations[i].equals("+")){
                int firstVal = ans.pop();
                int scndVal = ans.peek();
                ans.push(firstVal);
                ans.push(firstVal+scndVal);
            }else{
                ans.push(Integer.parseInt(operations[i]));
            }
        }
        int result=0;
        while(!ans.empty()){
            result+=ans.pop();
        }
        return result;
    }
}