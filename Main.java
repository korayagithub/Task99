public class Main
{
    public static void main(String[] args)
    {
       if (args.length != 3)
       {
           System.out.print("Usage: java SwitchDemo (1)-add, ");
           System.out.print("(2) subtract,(3) multiply, ");
           System.out.print("(4) divide <num_one> <num_two>");
           System.out.println();
           System.exit(1);
       }
       byte command = Byte.parseByte(args[0]);
       float numOne = Float.parseFloat(args[1]);
       float numTwo = Float.parseFloat(args[2]);
       String output = "The result is ";

       switch(command)
       {
           case 1:
               //add operation
               System.out.println(output + (numOne + numTwo));
               break;
           case 2:
               //subtraction operation
               System.out.println(output + (numOne - numTwo));
               break;
           case 3:
               //multiply operation
               System.out.println(output + (numOne * numTwo));
               break;
           case 4:
               //add operation
               System.out.println(output + (numOne / numTwo));
               break;
           default:
               //unknown command
               System.out.println(output + ("Unknown Command"));
       }
    }
}
