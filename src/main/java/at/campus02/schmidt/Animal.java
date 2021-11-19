package at.campus02.schmidt;

public class Animal {

    private String name;
    private String species;
    private String animalLoud;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAnimalLoud() {
        return animalLoud;
    }

    public void setAnimalLoud(String animalLoud) {
        this.animalLoud = animalLoud;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Animal(String name, String species, String animalLoud, int age) {
        this.name = name;
        this.species = species;
        this.animalLoud = animalLoud;
        this.age = age;
    }

        public String giveAnimalLoud(){
        return animalLoud;

    }
        public String getNameAndAge(){
        String nameAndAge= "Das Tier heißt "+name+ " und ist "+age+" alt";
        return nameAndAge;

    }

        public String ageCategory(){
        String ausgabe ="";
        if(age>4){ ausgabe= "old animal";}
        if(age>2){ ausgabe= "youg animal";}
        if(age<2 && age>0){ ausgabe= "baby animal";}

        return ausgabe;

    }




}
