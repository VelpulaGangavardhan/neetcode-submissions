class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack();
        String symbols="+-*/";
        for(String i : tokens){

            if (symbols.contains(i)){
                int t1 = st.pop();
                int t2 = st.pop();

                if(i.equals("+")){ 
                    st.push(t1+t2);
                }else if (i.equals("-")){
                    st.push(t2-t1);
                    
                }else if(i.equals("*")){
                    st.push(t1*t2);
                }else{
                    st.push(t2/t1);
                }

            }else{
                 st.push(Integer.parseInt(i));

            }

        }
        return st.pop();
        
    }
}
