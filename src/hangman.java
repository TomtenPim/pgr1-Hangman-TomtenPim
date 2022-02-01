import javax.swing.*;

public class hangman {
    public static void main(String[] args) {

        String word = "TEST";
        int antGiss = Integer.parseInt(JOptionPane.showInputDialog("Hur många fel tillåter du?"));
        int allCorrect = 0;
        int antFel = 0;

        while (allCorrect < 1 && antFel < antGiss + 1){
            System.out.println(antFel + " " + antGiss + " " + allCorrect + " " + word);
            String guess = JOptionPane.showInputDialog("Gissa en bokstav");

            if(guess == "TEST"){
                allCorrect++;
                System.out.println("win");
            }
            else {
                antFel++;
            }
        }
        if (allCorrect < 1)
        System.out.println("You lost :(");

    }
}
