import java.util.Scanner;

public class uzduotis3 {
    public static void main(String[] args) {
        Scanner skaitytuvas = new Scanner(System.in);



        System.out.println("Įveskite prisijungimo vardą: ");
        String login = skaitytuvas.nextLine();
        System.out.println("Įveskite savo elektroninį paštą: ");
        String email = skaitytuvas.nextLine();
        System.out.println("Įveskite slaptažodį: ");
        String password = skaitytuvas.nextLine();
        System.out.println("Pakartokite slaptažodį: ");
        String pakartotasPassword = skaitytuvas.nextLine();



        pagrindinis(login, email, password, pakartotasPassword);


    }
    public static boolean pagrindinis(String login, String email, String password, String pakartotasPassword){
        boolean a = arLoginNesutampaSuSlaptazodziu(login, password);
        boolean b = arEmailTuriSimbolius(email);
        boolean c = arVienodiSlaptazodziai(password,pakartotasPassword);
        boolean d = slaptazodzioIlgis(password);
        boolean e = arYraMazojiRaideSlaptazodyje(password);
        boolean f = arYraDidziojiRaideSlaptazodyje(password);
        boolean g = arYraSkaitmenuSlapazodyje(password);
        if(a  && b  && c  && d  && e  && f  && g ){
            System.out.println("Sveikiname sėkmingai užsiregistravus");
            return true;
        }
        else{
            System.out.println("Registracija nepavyko");
            return false;
        }
    }

    /**
     * Patikrina ar login nesutampa su slaptazodziu, jei taip - pranešti, jog jie negali sutapti
     * @param login Prisijungimo vardas, įvesti
     * @param password Slaptažodis, įvesti
     */
    public static boolean arLoginNesutampaSuSlaptazodziu(String login, String password){
        if(login.equalsIgnoreCase(password)){
            System.out.println("Slaptažodis negali būti toks pats kaip ir prisijungimo vardas");
            return false;
        }
        else{
            return true;
        }
    }

    /**
     * Patikrina ar el. pašto adresas turi simbolius "@" ir ".", atsako į tai kas pateikta
     * @param email Elektroninis paštas
     */
    public static boolean arEmailTuriSimbolius(String email){
        if(email.contains("@") && email.contains(".")){
            return true;
        }
        else{
            System.out.println("Neteisingai įvestas el. pašto adresas");
            return false;
        }
    }

    /**
     * Patikrina ar slaptažodžiai vienodi, atsako
     * @param password
     * @param pakartotasPassword
     */
    public static boolean arVienodiSlaptazodziai(String password, String pakartotasPassword){
        if(password.equals(pakartotasPassword)){
            return true;
        }
        else{
            System.out.println("Slaptažodžiai nesutampa, pabandykite dar kartą");
            return false;
        }
    }

    /**
     * Patikrina ar slaptažodžius sudaro bent 10 simbolių
     * @param password
     */
    public static boolean slaptazodzioIlgis(String password){
        if(password.length() < 10){
            System.out.println("Slaptažodis per trumpas, slaptažodį turėtų sudaryti bent 10 simbolių");
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean arYraMazojiRaideSlaptazodyje(String password){
        if(password.equals(password.toUpperCase()) ){
            System.out.println("Slaptažodyje privalo būti bent viena mažoji raidė");
            return false;
        }
        else{
            return true;
        }
    }
    public static boolean arYraDidziojiRaideSlaptazodyje(String password){
        if(password.equals(password.toLowerCase())){
            System.out.println("Slaptažodyje privalo būti bent viena didžioji raidė");
            return false;
        }
        else{
            return true;
        }
    }
    public static boolean arYraSkaitmenuSlapazodyje(String password){
        char[] ch = password.toCharArray();
        boolean arYraSkaicius = false;
        for (char cr: ch){
            if(Character.isDigit(cr)){
                arYraSkaicius = true;
                break;
            }
        }
        if(arYraSkaicius)
            return true;
        else{
            System.out.println("Slaptažodį privalo sudaryti bent vienas skaitmuo");
            return false;
        }
    }
}
