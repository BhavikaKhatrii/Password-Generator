import java.util.Random;

class Main{
    public static void main(String[] args){
        //Creating String
        String upper = "QWERTYUIOPLKJHGFDSAZXCVBNM";
        String lower = "lmnopqrstuvwxyzabcdefghijk";
        String num = "1236547890";

        //Creating Random Builder String
        StringBuilder sb = new StringBuilder();

        //Creating Object of Random
        Random random = new Random();

        //Combine all Strings
        String pass = upper + lower + num;

        //Length of random object
        int length = 7;
        for (int i=0;i<length;i++)
        {
            int index = random.nextInt(pass.length());

            //getting character from index
            char randomChar = pass.charAt(index);

            //Append the character to the string Builder
            sb.append(randomChar);
        }

        String randomStr = sb.toString();
        System.out.println("UR PASSWORD Is : " + randomStr);

    }
}