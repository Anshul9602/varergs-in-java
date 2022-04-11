 public class varergs {
    static int sum(int x,int ...arr){
      //   int x is compulsory argument
        int result =x;
        for (int a:arr){
            result +=a;
        }
        return result;
    }
    // the all are  is old methods the new is the

    public static void main(String[] args) {
        System.out.println("wellcome to varergs ");
        System.out.println("the sum of 4  or 5 is : " + sum(4, 5));
        System.out.println("the sum of 4  or 5 is : " + sum(4, 5,6));
        System.out.println("the sum of 4  or 5 is : " + sum(4, 5,7,8));
    }
}
