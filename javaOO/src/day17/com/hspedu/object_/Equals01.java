package day17.com.hspedu.object_;

import com.sun.corba.se.impl.orbutil.CorbaResourceUtil;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a==b);
        System.out.println(a==c);
//        public boolean equals(Object obj) {
//            return (this == obj);
//        }

        "xiao".equals("sd");//ctrl + b看源码

        /*
        public boolean equals(Object anObject) {//String类重写equal方法
        if (this == anObject) {//如果是同一个引用
            return true;
        }
        if (anObject instanceof String) {
            String anotherString = (String)anObject;
            int n = value.length;
            if (n == anotherString.value.length) {
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }
         */
        Integer i = new Integer(5);
        i.equals(3);
        /*
          public boolean equals(Object obj) {//Integer的equals方法
        if (obj instanceof Integer) {
            return value == ((Integer)obj).intValue();
        }
        return false;
    }
         */

    }
}
class A{

}