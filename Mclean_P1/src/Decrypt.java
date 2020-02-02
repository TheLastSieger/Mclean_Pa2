/*ask the user for their 4 digit encrypted number
 * make sure number is a 4 digit positive number
 * reverse encryption by subtracting 7 from each number
 * return 3rd number to first, and vise versa
 * return 4th number to second and vise versa
 * print the decrypted value of the number
 */
import java.util.Scanner;

public class Decrypt {
	
	int firstDigit, secondDigit, thirdDigit, fourthDigit, number, temp;
	
	{
	Scanner input = new Scanner( System.in );

    do{
    System.out.print(" Enter the encrypted Number: ");
    number = input.nextInt();
    
    }
    while(number / 1000 != 0 || number / 10000 != 0 );

    firstDigit = number / 1000;
    secondDigit = number / 100 % 10;
    thirdDigit = number / 10 % 10;
    fourthDigit = number % 10;

    if(firstDigit <= 6 && firstDigit >= 0)
        firstDigit = firstDigit + 10;
    if(secondDigit <= 6 && secondDigit >= 0)
        secondDigit = secondDigit + 10;
    if(thirdDigit <= 6 && thirdDigit >= 0)
        thirdDigit = thirdDigit + 10;
    if(fourthDigit <= 6 && fourthDigit >= 0)
        fourthDigit = fourthDigit + 10;

    firstDigit = firstDigit - 7;
    secondDigit = secondDigit - 7;
    thirdDigit = thirdDigit - 7;
    fourthDigit = fourthDigit - 7;

    temp = firstDigit;
    firstDigit = thirdDigit * 1000;
    thirdDigit = temp * 10;

    temp = secondDigit;
    secondDigit = fourthDigit * 100;
    fourthDigit = temp;

    System.out.printf(" Your Decrypted number is %d\n",
            firstDigit + secondDigit + thirdDigit + fourthDigit);
}
}

