class BalancoTrimestral{public static void main (String[] args){
    int gastosJaneiro = 15000;
    int gastosFevereiro = 23000;
    int gastosMarco = 17000;
    int gastoTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
    int mediaGastos = gastoTrimestre / 3;
    System.out.println("Gastos Trimestre:\n");
    System.out.println(gastoTrimestre);
    System.out.println("\nMédia Gastos Trimestre:\n");
    System.out.println(mediaGastos);

    }


}