public class uzduotis2 {
    public static void main(String[] args) {

        int x = 2;
        int y = 110;

        System.out.println(funkcija(x, y));
    }

    public static int funkcija (int x, int y){
        if(x % 2 == 0){
            return x * y;
        }
        else if(x % 2 == 1){
            if(y > 100){
                return y - x;
            }
            else if(y < 100){
                return x - y;
            }
            else if(y == 100){
                return 0;
            }
        }
        else{
        }
        return 1993;
    }
}
