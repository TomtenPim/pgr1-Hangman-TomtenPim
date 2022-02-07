import javax.swing.*;

public class hangman {
    public static void main(String[] args) {

        String wordguess = JOptionPane.showInputDialog("Skriv ordet");
        String[] word = wordguess.split("");
        int antGiss = Integer.parseInt(JOptionPane.showInputDialog("Hur många fel tillåter du?"));
        int allCorrect = 0;
        int antFel = 0;
        String allGuess = "";
        String felGuess = "";
        String guessRätt = "";

        while (allCorrect < 1 && antFel < antGiss + 1){

            String guess = JOptionPane.showInputDialog("Gissa en bokstav \nDu har gissat " + allGuess + "\n" + felGuess + "var fel.");
            allGuess += guess + " ";
            System.out.println(antFel + " " + antGiss + " " + allCorrect + " " + word + " " + guess);

            if(){

                for (int i=0; i<word.length; i++)
                    if (guess == word[i]){

                }


                allCorrect++;
                JOptionPane.showMessageDialog(null,"Du vann!!!");
            }
            else {
                antFel++;
                felGuess += guess + " ";
            }
        }
        if (allCorrect < 1)
            JOptionPane.showMessageDialog(null,"Du förlorade :(");

    }
}
