public class Main {
    public static void main(String[] args) {
        String producto = "12345;Laptop HP Pavilion;1500.99;Electrónica";

        int longitudCadena = producto.length();
        System.out.println("Longitud de la cadena: " + longitudCadena);

        String idProducto = producto.substring(0, producto.indexOf(";"));
        System.out.println("ID del producto: " + idProducto);

        int primerPuntoComa = producto.indexOf(";");
        int segundoPuntoComa = producto.indexOf(";", primerPuntoComa + 1);
        String nombreProducto = producto.substring(primerPuntoComa + 1, segundoPuntoComa);
        System.out.println("Nombre del producto: " + nombreProducto);

        String nombreProductoMayusculas = nombreProducto.toUpperCase();
        System.out.println("Nombre del producto en mayúsculas: " + nombreProductoMayusculas);

        int tercerPuntoComa = producto.indexOf(";", segundoPuntoComa + 1);
        String precioProductoStr = producto.substring(segundoPuntoComa + 1, tercerPuntoComa);
        double precioProducto = Double.parseDouble(precioProductoStr);
        System.out.println("Precio del producto: " + precioProducto);

        char caracterPosicion10 = nombreProducto.charAt(9);
        System.out.println("Carácter en la posición 10 del nombre: " + caracterPosicion10);


        int primeraOcurrenciaA = nombreProducto.indexOf('a');
        System.out.println("Primera ocurrencia de 'a' en el nombre: " + primeraOcurrenciaA);

        int ultimaOcurrenciaO = nombreProducto.lastIndexOf('o');
        System.out.println("Última ocurrencia de 'o' en el nombre: " + ultimaOcurrenciaO);

        String categoriaProducto = producto.substring(tercerPuntoComa + 1);
        String precioYCategoria = precioProductoStr + " – " + categoriaProducto;
        System.out.println("Precio y categoría: " + precioYCategoria);

        String subcadenaDesde7 = nombreProducto.substring(6);
        System.out.println("Subcadena desde la posición 7 del nombre: " + subcadenaDesde7);

    }
}
