class Multiplo {
    public static void main(String[] args){
        int numero = 3;
        int multiplo;
        int resultado1;
        int resultado2;
        for(multiplo = 100; multiplo >= 1; multiplo--) {
            resultado1 = numero * multiplo;
            resultado2 = resultado1 / multiplo;
            if(resultado2 == numero && resultado1 < 100){
                System.out.println(resultado1);
            }
        }
    }
}