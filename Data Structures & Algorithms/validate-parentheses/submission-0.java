class Solution {
    public boolean isValid(String st) {
        Stack s = new Stack();
        for(char i : st.toCharArray()){
              //System.out.println(s);
            if(i=='(' || i=='{' || i=='['){
                s.push(i);
                //System.out.println(s);
            }else{
                if(s.size()==0)
                    return false;
                char c = (Character)s.pop();
                if(!((i=='}' && c=='{')|| (i==']' && c=='[') || (i==')' && c=='('))){
                    return false;

                }
                  //System.out.println(s);
            }
        }

        if(s.size()>0){
            return false;
        }
        return true;
        
    }
}
