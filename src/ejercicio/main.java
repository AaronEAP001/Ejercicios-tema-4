package ejercicio;

public class main {
    
    public static void main(String[] args) {
        
        //ejercicio 1
        int numeroIf = 8;
        //ejerccio2
        int numeroWhile = 1;
        //ejercicio5
        String estacion = "Otoño";
        
        //ejercici0 1
        System.out.println("----- 1 -----");
        if(numeroIf == 0){
            System.out.println("Nomero 0");
        }else{
            if(numeroIf<0){
                System.out.println(String.format("Numero ( %s ) Negativo", numeroIf));
            }else{
                System.out.println(String.format("Numero ( %s ) Positivo", numeroIf));
            }
        }
        
        //ejercicio2
        System.out.println("----- 2 -----");
        while (numeroWhile < 3) {
            System.out.println(String.format("Incrementa el Numero -> %s ", numeroWhile));
            numeroWhile+=1;
        }
        
        //ejercicio3
        System.out.println("----- 3 -----");
        do {            
            System.out.println(String.format("Incrementa el Numero -> %s ", numeroWhile));
            numeroWhile+=1;
        } while (numeroWhile<3);
        
        //ejercicio4
        System.out.println("----- 4 -----");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(String.format("Incrementa el numero -> ( %s )", numeroFor));
        }
        
        //ejercicio5
        System.out.println("----- 5 -----");
        switch (estacion.toLowerCase()) {
            case "primavera" -> {
                System.out.println("La estacion es PRIMAVERA");
            }
            case "verano" -> {
                System.out.println("La estacion es VERANO");
            }
            case "otoño" -> {
                System.out.println("La estacion es OTOÑO");
            }
            case "invierno" -> {
                System.out.println("La estacion es INVIERNO");
            }
            default -> {
                System.out.println("Estacion no existe :'v ");
            }
        }
        
    }
    
}
