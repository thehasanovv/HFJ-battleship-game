public class SimpleStartupGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        boolean isAlive = true;
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        GameHelper helper = new GameHelper();
        SimpleStartup theStartup = new SimpleStartup();
        theStartup.setLocationCells(locations);

        while (isAlive) {
            int guess = helper.getUserInput("Enter a number");
            String result = theStartup.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses.");
            }
        }
    }
}
