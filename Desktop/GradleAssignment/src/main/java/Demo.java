import org.apache.commons.lang3.StringUtils;

public class Demo {
    public static void main(String[] args) {
//        source2 sou=new source2();
//        sou.print();

        String str = "hello";
        System.out.println(str.hashCode());
        str = StringUtils.upperCase(str);
        System.out.println(str.hashCode());
        System.out.println(str);
        System.out.println("Radhe Radhe");
    }
}
