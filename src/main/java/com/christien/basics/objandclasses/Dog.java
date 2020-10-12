package com.christien.basics.objandclasses;

public class Dog {

    String breed;
    int age;
    private Training training;

    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void bark(){
        System.out.println("Hello I am a " + breed + " and I am " + age + " years old");
        System.out.println(doTrick());
    }

    public void assignTraining(){
        this.training = Training.assignTraining();
        System.out.println(training);
    }

    //This method can only be called within this class and NOT in an instance of this class
    private String doTrick(){
        return "Doing trick";
    }

    enum Training{
        BEGINNER        (1),
        INTERMEDIATE    (2),
        ADVANCED        (3);

        private final int levelCode;

        Training(int levelCode){
            this.levelCode = levelCode;
        }

        public static Training assignTraining(){
            double x = Math.random();
            if(x < 0.3){
                return Training.BEGINNER;
            }else if(x > 0.3 && x < 0.6){
                return Training.INTERMEDIATE;
            }else{
                return Training.ADVANCED;
            }
        }

        public int getLevelCode() {
            return levelCode;
        }
    }


}
