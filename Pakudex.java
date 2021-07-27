import java.util.Arrays;
public class Pakudex {
    Pakuri[] array;
    int size = 0;
    int cap;
    public Pakudex() {
        array = new Pakuri[20];
        cap = 20;
    }
    public Pakudex(int capacity) {
        array = new Pakuri[capacity];
        cap = capacity;
    }
    public int getSize() {
        return size;
    }
    public int getCapacity() {
        return cap;
    }
    public String[] getSpeciesArray() {
        if (size == 0) {
            return null;
        }
        String[] arrayOfSpecies = new String[size];
        for (int i = 0; i < size; i++) {
                arrayOfSpecies[i] = array[i].getSpecies();
        }
        return arrayOfSpecies;
    }

    public int[] getStats(String species) {
        int[] statArray = new int[3];
        for (int i = 0; i < size; i++) {
            if (array[i].getSpecies().equals(species)) {
                statArray[0] = array[i].getAttack();
                statArray[1] = array[i].getDefense();
                statArray[2] = array[i].getSpeed();
                return statArray;
            }
        }
        return null;
    }
    public void sortPakuri() {
        Arrays.sort(array, 0, size);
    }
    public boolean addPakuri(String species) {
        for (int i = 0; i < size; i++) {
            if(array[i].getSpecies().equals(species)){
                System.out.println("Error: Pakudex already contains this species!");
                return false;

            }
        }
        if (size == cap) {
            System.out.println("Error: Pakudex is full!");
            return false;
        }
        array[size++] = new Pakuri(species);
        return true;
    }
    public boolean evolveSpecies(String species) {
        //pakuri.evolve();
        // if species doesn't exist
        for (int i = 0; i < size; i++) {
            if (array[i].getSpecies().equals(species)){
                array[i].evolve();
                return true;
            }
        }
        return false;
    }
}
 
