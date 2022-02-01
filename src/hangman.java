import javax.swing.*;

public class hangman {
    public static void main(String[] args) {

        String word = "TEST";
        int antGiss = Integer.parseInt(JOptionPane.showInputDialog("Hur många fel tillåter du?"));
        boolean allCorrect = false;
        int antFel = 0;

        for(allCorrect = false;;){
            String guess = JOptionPane.showInputDialog("Gissa en bokstav");
            if(guess == word){
                allCorrect = true;
            }
            else {
                antFel++;
            }
        }

    }
}
