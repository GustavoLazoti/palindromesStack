import java.util.Scanner;
public class Main
{
    public static void Main(String[] args)
    {
        //Generating the first word to the stack
        Scanner scanner = new Scanner(System.in);
        stack p = new stack ();
        System.out.println("Digite a frase: ");
        String frase = scanner.nextLine();
        for(int i = 0; i< frase.length(); i++) {
            p.push(frase.charAt(i));
        }
        //Generating an equal stack from p to pop the content
        stack f;
        f = p;
        String fraseInvertida = "";
        // Inverting the word
        while(!f.isEmpty()) fraseInvertida += f.pop();
        //Comparing both sentences with .equal()
        if (frase.toLowerCase().replaceAll("\\s+", "").equals(fraseInvertida.toLowerCase().trim().replaceAll("\\s+", "")))
            System.out.println("Palindromes!");
        else
            System.out.println(("Not Palindromes!"));

        System.out.println(frase + " -> " + frase.toLowerCase().replaceAll("\\s+", ""));
        System.out.println(fraseInvertida + " -> " +fraseInvertida.toLowerCase().replaceAll("\\s+", ""));
    }
}