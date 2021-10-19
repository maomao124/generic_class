import java.math.BigInteger;

/**
 * Project name(项目名称)：泛型类
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/19
 * Time(创建时间)： 14:24
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test<T1, T2>
{
    T1 x;
    T2 y;

    public T1 getX()
    {
        return x;
    }

    public void setX(T1 x)
    {
        this.x = x;
    }

    public T2 getY()
    {
        return y;
    }

    public void setY(T2 y)
    {
        this.y = y;
    }

    public static void main(String[] args)
    {
        test<String, String> t1 = new test<String, String>();
        t1.setX("hello");
        t1.setY("world");
        System.out.println(t1.getX() + "," + t1.getY());
        test<BigInteger, BigInteger> t2 = new test<BigInteger, BigInteger>();
        t2.setX(new BigInteger("11111111111111111111111111"));
        t2.setY(new BigInteger("2222222222222222222222222"));
        System.out.println(t2.getX() + "\n" + t2.getY());
        test<Integer, Integer> t3 = new test<Integer, Integer>();
        t3.setX(16);
        t3.setY(69);
        System.out.println(t3.getX() + "+" + t3.getY() + "=" + (t3.getX() + t3.getY()));
    }
}
