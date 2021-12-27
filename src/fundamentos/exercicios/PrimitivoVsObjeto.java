package fundamentos.exercicios;

public class PrimitivoVsObjeto {

    public static void main(String[] args) {

        Integer a = 2;//É um objeto (Wrappers), e possibilita o uso de notação ponto, posso associar a
        //algum comportamento
        a.compareTo(8);

        int b = 7; //Carrega apenas o valor

        // ********** Usando Wrappers *****************

        Byte by = 10;
        Short s = 100;
        Integer i = 1000;
        Long l = 10000L;
        Float f = 123.45F;
        Double d = 123.456;

        System.out.println("Byte " + by.byteValue());
        System.out.println("Short " + s.shortValue());
        System.out.println("Integer " + i.hashCode());
        System.out.println("Long " + l.longValue());
        System.out.println("Float " + f);
        System.out.println("Double " + d);

        Boolean bo = Boolean.parseBoolean("True"); //Recebe uma String e transforma em boolean
        System.out.println("Boolean " + bo);
        System.out.println("Boolean " + bo.toString().toUpperCase()); // Transforma um boolean em String e converte tudo em maíuscula

        Character c = '&';
        System.out.println("Char "+ c.charValue());

    }
}
