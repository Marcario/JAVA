public class AmericanFlag {
    public static void main(String[] args) {
        int width = 45; // Width of the flag (in characters)
        int height = 15; // Height of the flag (in characters)
        int stripeHeight = 3; // Height of each stripe (in characters)
        int fieldHeight = stripeHeight * 7; // Height of the blue field (in characters)
        int starsPerRow = 9; // Number of stars in each row
        int starSpacing = 6; // Spacing between stars (in characters)

        // Print top part of the flag
        for (int row = 0; row < stripeHeight * 6; row++) {
            for (int col = 0; col < width; col++) {
                if (row % stripeHeight < stripeHeight / 2) {
                    // Print red stripe
                    System.out.print("*");
                } else {
                    // Print white stripe
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Print blue field
        for (int row = 0; row < fieldHeight; row++) {
            for (int col = 0; col < width; col++) {
                if (col < width / 2) {
                    // Print blue field
                    System.out.print(" ");
                } else {
                    // Print stars
                    int starRow = row % stripeHeight;
                    int starCol = col - width / 2;

                    if (starRow < stripeHeight / 2 && starCol % starSpacing == 0) {
                        // Print star
                        System.out.print("*");
                    } else {
                        // Print white space
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

        // Print bottom part of the flag
        for (int row = 0; row < stripeHeight; row++) {
            for (int col = 0; col < width; col++) {
                // Print red stripe
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

