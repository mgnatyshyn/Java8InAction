package lambdasinaction.chap5.my;

/**
 * Created by Inet on 29.12.2015.
 */
public class InnerClasses {

    String outerString= "outer";
    class Inner{
        public void doIt(){
            outerString = "inner";
        }
    }

    public static void main(String[] args) {
        InnerClasses outer = new InnerClasses();
        Inner inner =  outer.new Inner();

        System.out.println(outer.outerString);
        inner.doIt();
        System.out.println(outer.outerString);
    }
}
