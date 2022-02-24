
/*
AuthorPay Project:
Takes the word count, multiplies by base pay value (C),
then uses a multiplier in the end to determine the final payout.
Developer: Donnaven Clark
Last Edit: 23/02/2022
*/

/*
                           BASE C-LEVEL PAY
|--------------------------------------------------------------------|
| Length  | < 7500 | 7500-8000| 8000-17500 |  17500-19000 |  > 19000 |
|--------------------------------------------------------------------|
| BlockPay| 0.08pw |   600    |   0.075pw  |    1313      |   0.07pw |
|--------------------------------------------------------------------|
          |blockOne| blockTwo | blockThree |   blockFour  | blockFive|

 */



import java.util.Scanner;
public class AuthorPay {

    public static void main(String[] args) {
        char authorLevel;
        int wordCount;
        double payOut;
        double payMath;
        double returnPay;
    Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the author's level\n");
    authorLevel = keyboard.next("[a-cA-C]").charAt(0);
        System.out.println("Please enter the word count:\n");
    wordCount = keyboard.nextInt();
    returnPay = payMath(wordCount, authorLevel);
        System.out.printf("Total pay for an %C level author for a %,d story is $%,.2f \n", authorLevel, wordCount, returnPay);
    }

    public static double payMath(int wordCount, char authorLevel) {
        double payOut = 0;

        if (wordCount < 7500){
            payOut = (wordCount * 0.08);
        }
        if (wordCount >= 7500 && wordCount <= 8000) {
            payOut = 600;
        }
        if (wordCount >= 8001 && wordCount <= 17500) {
            payOut = (wordCount * 0.075);
        }
        if (wordCount >= 17501 && wordCount <= 19000) {
             payOut = 1313;
        }
        if (wordCount > 19001) {
             payOut = (wordCount * 0.07);
        }
    if (authorLevel == 'b' || authorLevel == 'B') {
    payOut = (payOut * 1.25);
}
}
        return payOut;
    }
}