public class Insercion {
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
}
