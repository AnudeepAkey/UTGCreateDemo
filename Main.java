class Test
{
    // Method to add two numbers
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Declare and initialize two variables
        int number1 = 10;
        int number2 = 20;

        // Call the addNumbers method and store the result
        int sum = addNumbers(number1, number2);

        // Print the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
    }