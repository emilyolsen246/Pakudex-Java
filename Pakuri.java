
public class Pakuri implements Comparable<Pakuri>{
    String speciesPaku;
    int attack;
    int defense;
    int speed;
    public int compareTo(Pakuri target)
    {

        if (target == null)
            return -1;

        return this.speciesPaku.compareTo(target.speciesPaku);
    }
    public Pakuri(String species) {
        speciesPaku = species;
        attack = (speciesPaku.length() * 7) + 9;
        defense = (speciesPaku.length() * 5) + 17;
        speed = (speciesPaku.length() * 6) + 13;
    }
    public String getSpecies() {
        return this.speciesPaku;
    }
    public int getAttack() {

        return this.attack;
    }
    public int getDefense() {

        return this.defense;
    }
    public int getSpeed() {
        return this.speed;
    }
    public void setAttack(int newAttack) {
        this.attack = newAttack;
    }
    public void evolve() {
        this.attack = 2 * this.attack;
        this.defense = 4 * this.defense;
        this.speed = 3 * this.speed;
    }
}
