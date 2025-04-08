public record Entrada_Record(String nombreEvento, double precio){
    public void mostrarInformacion(){
        System.out.println("Nombre del evento: " + nombreEvento + " y " + "Precio: $" + precio);
    }
}

