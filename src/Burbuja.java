public class Burbuja {
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

    
}
