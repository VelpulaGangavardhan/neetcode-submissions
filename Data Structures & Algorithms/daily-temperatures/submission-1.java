class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> st = new Stack();

        for(int i=result.length-1;i>=0;i--){
            int ele= temperatures[i];
            if(st.isEmpty()){
                result[i]=0;
                st.push(i);
            }
            while((!st.isEmpty())&&(temperatures[st.peek()]<=ele) ){
                st.pop();
            }
            if(st.isEmpty()){
                result[i]=0;
            }else{
                int days= st.peek()-i;
                result[i]=days;
            }
            
            st.push(i);
        }
        return result;
    }
}
