
public class Ques4 {
    public static void main(String[] args) {
        String str = "\u2003  Hello By \" Rohit Rawat   \u2003";
        System.out.println(str);
        System.out.println(str.repeat(3));

        System.out.println(str.strip());

        System.out.println(str.trim());

        String spaceString = " \t  \n ";
        System.out.println(spaceString.isBlank());
        System.out.println(spaceString.isEmpty());

        String str2= "1234";
        int convertedInt = str2.transform(Integer::parseInt);
        System.out.println(convertedInt);

        String str3= "Hello by Indent";
        System.out.println(str3.indent(20));
        String stripInd= """
                Hello by 
                   n  
                stripIndent""";
        System.out.println(stripInd.stripIndent());

        String translate= "hello by \n translate \"  ";

        String tripleQuote= """
                Hello by 
                   n  
                stripIndent""";
        System.out.println(tripleQuote);
        String name = "Rohit Rawat";
        int age =25;
        String format="The name = %s and age = %d".formatted(name,age);
        System.out.println(format);
    }
}