import java.util.Vector;
public class color{
    public static void main(String[] args) {
        Vector<String> Colorr=new Vector<>();
        Colorr.add("Red");
        Colorr.add("Green");
        Colorr.add("Blue");
        Colorr.add("Yellow");
        Colorr.remove("Green");
        System.out.println("Color in the vector:");
        for (String coloring:Colorr) {
            System.out.println(coloring);
        }
    }
}