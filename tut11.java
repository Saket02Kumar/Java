public class tut11 {
    public static void main(String[] args) {
        tut11 obj=new tut11();
        int x=23; int y=23;
        int getresult=obj.add(x,y);
        System.out.println(getresult);
    }
    public int add(int num1, int num2){
        int result=num1+num2;
        return result;
    }
}
