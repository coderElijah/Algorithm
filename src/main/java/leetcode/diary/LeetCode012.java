package leetcode.diary;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: leetcode.diary
 * Date: 2019/4/8 22:53
 */
public class LeetCode012 {
    public String intToRoman(int num) {
        String[] roman1=new String[]{"I","X","C","M"};
        String[] roman2=new String[]{"V","L","D"};
        //StringBuffer stringBuffer=new StringBuffer();
        String res="";
        int count=0;
        while(num>0)
        {
            int temp=num%10;
            if(1<=temp&&temp<5){
                if (temp == 4)
                    res = roman1[count] + roman2[count]+res;
                else {
                    while (temp > 0) {
                        res = roman1[count]+res;
                        temp--;
                    }
                }
            }else if(temp==5){
                res=roman2[count]+res;
            }else if(temp>5){
                if(temp==9){
                    res=roman1[count]+roman1[count+1]+res;
                }else{
                    String temp1=res;
                    res=roman2[count];
                    while(temp>5)
                    {
                        res+=roman1[count];
                        temp--;
                    }
                    res+=temp1;
                }
            }
            num=num/10;
            count++;
        }
        return res;
    }

}
