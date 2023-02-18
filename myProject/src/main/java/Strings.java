public class Strings {
        public static void main(String[] args)
        {
            String str1 ="я пойду ";
            String str2 ="гулять";
            System.out.println("String 1: " + str1);
            System.out.println("String 2: " + str2);
            String str3 = str1.concat(str2);
            System.out.println("Объединенные строки: " + str3);
        }
    }