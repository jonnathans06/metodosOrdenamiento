public class BusquedaBinaria {
    //Busqueda binaria por nombre
    public Persona buscarPorNombre(Persona[] personas, String nombre) {
        int bajo = 0;
        int alto = personas.length - 1;
    
        while (bajo <= alto) {
            int central = bajo + (alto - bajo) / 2;
            String nombreCentral = personas[central].getNombre();
    
            int comparacion = nombreCentral.compareToIgnoreCase(nombre);
            if (comparacion == 0) {
                return personas[central];
            }
    
            if (comparacion < 0) {
                bajo = central + 1;
            } else {
                alto = central - 1;
            }
        }
    
        return null;
    }

    //Busqueda binaria por edad
    public Persona buscarPorEdad(Persona[] personas, int altura) {
        int bajo = 0;
        int alto = personas.length - 1;
        while (bajo <= alto) {
            int central = bajo + (alto - bajo) /2;
            int edadCentral = personas[central].getEdad();
            if (edadCentral == edad) { //si es igual
                return personas[central];
            }

            if (personas[central].getEdad() < edad) {
                bajo = central + 1;                
            } else {
                alto = central - 1;
            }
        }
        return null;
    }

    //Busqueda binaria por altura
    public Persona buscarPorEdad(Persona[] personas, int altura) {
        int bajo = 0;
        int alto = personas.length - 1;
        while (bajo <= alto) {
            int central = bajo + (alto - bajo) /2;
            int edadCentral = personas[central].getAltura();
            if (edadCentral == altura) { //si es igual
                return personas[central];
            }

            if (personas[central].getAltura() < altura) {
                bajo = central + 1;                
            } else {
                alto = central - 1;
            }
        }
        return null;
    }

    //Busqueda binaria por codigo de direccion
    public Persona findPersonaByCodigoDireccion (Persona[] personas, int codigo){
        int bajo = 0;
        int alto = personas.length - 1;
        while (bajo <= alto) {
            int central = (alto + bajo)/2;
            int valorCentro = personas[central].getCodigoDireccion();
            if (valorCentro == codigo) {
                return personas[central];
            }
            if (valorCentro > codigo) {
                bajo = central + 1;
            } else {
                alto = central - 1;
            }
        }
        return null;
    }

    //Metodo recive otra persona y devuelva true or false si la direecion de persona1 == persona2
    public boolean equalsByCodeDireccion (Persona otraPersona){
        boolean resp = getCodigoDireccion() > otraPersona.getCodigoDireccion();
        return resp;
    }

    public boolean equalsByCodeDireccion (int codigoDireccion){
        return getCodigoDireccion() == codigoDireccion;
    }
}
