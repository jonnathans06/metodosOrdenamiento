package Controller;

public class code {
    
    //Ordena edad con burbuja
    public void sortByAgeWithBubble(Persona[] personas){
        int n = personas.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if(personas[j].getEdad() > personas[j+1].getEdad()){
                    Persona temp = personas[j];
                    personas[j] = personas[j+1];
                    personas[j+1] = temp;
                }
            }
        } 
    }

    //Ordena edad con insercion
    public void sortByAgeWithInsertion(Persona[] personas){
        for(int i = 1; i < personas.length; i++){
            int j = i - 1;
            while(j>=0 && personas[j].getEdad() > personas[i].getEdad()){
                personas[j+1] = personas[j];
                j--;
            }
            personas[j+1] = personas[i];
        }
    }

    //Ordena edad con seleccion
    public void sortByYearWithSeleccion(Persona[] personas){
        for(int i = 0; i < personas.length-1; i++){
            int mid = i;
            for(int j = i+1; i < personas.length;j++){
                if(personas[j].getEdad()>personas[mid].getEdad()){
                    mid = j;
                }
            }
            if (mid != i) {
                Persona temp = personas[mid];
                personas[mid] = personas[i];
                personas[i] = temp;
            }
        }
    }

    //Ordena el codigo de una dirrecion por codigo
    //Para ordenar por este metodo primero debemos obtener el .get de la direccion y despues el .get del codigo
    public void sortByCode(Persona[] personas, int code){
        for(int i = 1; i < personas.length; i++){
            int mid = i;
                for(int j = i + 1; i < personas.length; j++){
                    if (personas[j].getDireccion().getCodigo() > personas[mid].getDireccion().getCodigo()) {
                        mid = j;
                    }
                }
                if (mid != i) {
                    Persona temp = personas[mid];
                    personas[mid] = personas[i];
                    personas[i] = temp;
                }
        }
    }

//-----------------------------------------------------------------------------------------

    //Ordena nombre con burbuja
    public void sortByNameWithBubble(Persona[] personas) {
        int n = personas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (personas[j].getNombre().compareToIgnoreCase(personas[j + 1].getNombre()) > 0) {
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
    }

    //Ordena nombre con insercion
    public void sortByNameWithInsercion(Persona[] personas) {
        int n = personas.length;
    
        for (int i = 1; i < n; i++) {
            Persona aux = personas[i];
            int pos = i;
    
            while (pos > 0 && personas[pos - 1].getNombre().compareToIgnoreCase(aux.getNombre()) > 0) {
                personas[pos] = personas[pos - 1];
                pos--;
            }
            personas[pos] = aux;
        }
    }

    //Ordena nombre con seleccion
    public void sortByNameWithSeleccion(Persona[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < personas.length; j++) {
                if (personas[j].getNombre().compareToIgnoreCase(personas[min].getNombre()) < 0) {
                    min = j;
                }
            }
            Persona temp = personas[min];
            personas[min] = personas[i];
            personas[i] = temp;
        }
    }
    

//-----------------------------------------------------------------------------------------

    //Ordena altura con burbuja
    public void sortByHeightBubble(Persona[] personas){
        for(int i = 0; i < personas.length-1; i++){
            for(int j = 0; j < personas.length - i - 1; j++){
                if(personas[j].getAltura() > personas[j+1].getAltura()){
                    Persona temp = personas[j];
                    personas[j] = personas[j+1];
                    personas[j+1] = temp;
                }
            }
        }
    }

    //Ordena altura con insercion
    public void sortByHeightWithInsertion(Persona[] personas){
        for(int i = 1; i < personas.length; i++){
            int j = i - 1;
            while(j>=0 && personas[j].getAltura() > personas[i].getAltura()){
                personas[j+1] = personas[j];
                j--;
            }
            personas[j+1] = personas[i];
        }
    }

    //Ordena altura con seleccion
    public void sortByYearWithSeleccion(Persona[] personas){
        for(int i = 0; i < personas.length-1; i++){
            int mid = i;
            for(int j = i+1; i < personas.length;j++){
                if(personas[j].getAltura()>personas[mid].getAltura()){
                    mid = j;
                }
            }
            Persona temp = personas[mid];
            personas[mid] = personas[i];
            personas[i] = temp;
        }
    }

//-----------------------------------------------------------------------------------------------

    //Busqueda binaria por edad
    public Persona buscarPorEdad(Persona[] personas, int edad) {
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