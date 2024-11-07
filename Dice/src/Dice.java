import java.util.Random;
public class Dice {

    public int sides() {

        Random random = new Random();

        int side = random.nextInt(6);

                return side + 1;
    }
    public int comparar(int side, int guess) {
        if (guess == side)
            return 0;
        else
            return 1;
    }
}
