public class Seleccion {
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

    //Ordena por seleccion el codigo de una dirrecion por codigo
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
}
