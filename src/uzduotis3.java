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

        System.out.println(login);
        System.out.println(email);
        System.out.println(password);
        System.out.println(pakartotasPassword);

        arLoginNesutampaSuSlaptazodziu(login, password);
        arEmailTuriSimbolius(email);
        arVienodiSlaptazodziai(password,pakartotasPassword);
        slaptazodzioIlgis(password);
        arYraMazojiRaideSlaptazodyje(password);
        arYraDidziojiRaideSlaptazodyje(password);
        arYraSkaitmenuSlapazodyje(password);


    }

    /**
     * Patikrina ar login nesutampa su slaptazodziu, jei taip - pranešti, jog jie negali sutapti
     * @param login Prisijungimo vardas, įvesti
     * @param password Slaptažodis, įvesti
     */
    public static void arLoginNesutampaSuSlaptazodziu(String login, String password){

        if(login.equalsIgnoreCase(password)){
            System.out.println("Slaptažodis negali būti toks pats kaip ir prisijungimo vardas");
        }
        else{
            System.out.println("Slaptažodis ir prisijungimo vardas - OK");
        }


    }

    /**
     * Patikrina ar el. pašto adresas turi simbolius "@" ir ".", atsako į tai kas pateikta
     * @param email Elektroninis paštas
     */
    public static void arEmailTuriSimbolius(String email){
        if(email.contains("@") && email.contains(".")){
            System.out.println("Su el. paštu viskas gerai");
        }
        else{
            System.out.println("Neteisingai įvestas el. pašto adresas");
        }
    }

    /**
     * Patikrina ar slaptažodžiai vienodi, atsako
     * @param password
     * @param pakartotasPassword
     */
    public static void arVienodiSlaptazodziai(String password, String pakartotasPassword){
        if(password.equals(pakartotasPassword)){
            System.out.println("Slaptažodžiai sutampa");
        }
        else{
            System.out.println("Slaptažodžiai nesutampa, pabandykite dar kartą");
        }
    }

    /**
     * Patikrina ar slaptažodžius sudaro bent 10 simbolių
     * @param password
     */
    public static void slaptazodzioIlgis(String password){
        if(password.length() < 10){
            System.out.println("Slaptažodis per trumpas, slaptažodį turėtų sudaryti bent 10 simbolių");
        }
        else{
            System.out.println("Slaptažodžių ilgis geras");
        }
    }

    public static void arYraMazojiRaideSlaptazodyje(String password){
        if(password.equals(password.toUpperCase()) ){
            System.out.println("Slaptažodyje nėra mažosios raidės");
        }
        else{
            System.out.println("Slaptažodyje yra mažųjų raidžių");
        }
    }
    public static void arYraDidziojiRaideSlaptazodyje(String password){
        if(password.equals(password.toLowerCase())){
            System.out.println("Slaptažodyje nėra didžiosios raidės");
        }
        else{
            System.out.println("Slaptažodyje yra didžiųjų raidžių");
        }
    }
    public static void arYraSkaitmenuSlapazodyje(String password){
        char[] ch = password.toCharArray();
        for (char c: ch){
            if(Character.isDigit(c)){
                System.out.println("Rastas skaitmuo");
            }
            else{
                System.out.println("Nėra skaitmenų");
            }
        }
    }
}
