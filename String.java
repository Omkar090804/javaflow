//checking if gamil is present in str and giving back username and domain
class Main 
{
    public static void main(String[] args)
  {
        String str = "amisha@gmail.com";
        System.out.println(str.contains("gmail"));

        int i = str.indexOf("@");
        System.out.println("Username: " + str.substring(0, i));

        System.out.println("Domain: " + str.substring(i + 1));
    }
}

//checkin hexadecimal 
class Main {
    public static void main(String[] args) {
        String str = "1abcdf101";

        boolean yesorno = str.matches("[01a-f]*");

        System.out.println(yesorno);


    }
}
