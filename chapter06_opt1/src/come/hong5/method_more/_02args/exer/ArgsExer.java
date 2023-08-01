package come.hong5.method_more._02args.exer;

/**
 * ClassName: ArgsExer
 * Package: come.hong5.method_more._02args.exer
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/7/31 15:25
 * @Version 1.0
 * 不积跬步无以至千里
 */
public class ArgsExer {

    public static void main(String[] args) {
        ArgsExer a2 = new ArgsExer();
        System.out.println(a2.strConnect("-"));
        System.out.println(a2.strConnect("-","zhong","guo"));
        System.out.println(a2.strConnect(",","zhong","guo","ni","hao"));
    }

    public String strConnect(String operator,String ...strs){
        String sc="";
        if(strs.length == 0){
            return "";
        }
        for (int i = 0; i < strs.length-1; i++) {
            sc += strs[i] + operator;
        }

        sc += strs[strs.length-1];

        return sc;
    }
}
