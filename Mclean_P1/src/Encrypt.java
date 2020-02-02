
/* ask user for a 4 digit number
 * make sure number is positive and only 4 digits
 * Encrypt numbers by dividing by intervals of 10, 100, 1000
 * add 7 to each number and then calculate remainder with division of 10
 * store first number as 3rd, and 3rd as first
 * store second number as 4th, and 4th as second
 * print the new encrypted value to the user
 * 
 */
import java.util.Scanner;
  
public class Encrypt{
	public int firstDigit, secondDigit, thirdDigit, fourthDigit, number, temp;
	{
	Scanner input = new Scanner( System.in );
	

    do {
    System.out.print(" Enter a four digit Number:");
    number = input.nextInt();
    }
    while(number / 1000 == 0 || number / 10000 != 0 );

    firstDigit = number / 1000;
    secondDigit = number / 100 % 10;
    thirdDigit = number / 10 % 10;
    fourthDigit = number % 10;

    firstDigit = (firstDigit + 7) % 10;
    secondDigit = (secondDigit + 7) % 10;
    thirdDigit = (thirdDigit + 7) % 10;
    fourthDigit = (fourthDigit + 7) % 10;

    temp = firstDigit;
    firstDigit = thirdDigit;
    thirdDigit = temp;

    temp = secondDigit;
    secondDigit = fourthDigit;
    fourthDigit = temp;

    System.out.printf(" Your encrypted number is %d%d%d%d\n",
            firstDigit, secondDigit, thirdDigit, fourthDigit);
}
}

	


