public class ReversString {

    public String revers(String mystr){
        CharStack mystack=new CharStack();
        String tr="";
        for (char c:mystr.toCharArray()){
            mystack.push(c);
        }
        while (!mystack.isEmpty()){
            tr+=mystack.pop();
        }
        return  tr;
    }
}
