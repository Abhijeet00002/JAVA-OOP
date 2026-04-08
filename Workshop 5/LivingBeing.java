interface LivingBeing {
    void specialFeature();
}

class Fish implements LivingBeing {
    public void specialFeature() {
        System.out.println("Fish can swim");
    }
}

class Bird implements LivingBeing {
    public void specialFeature() {
        System.out.println("Bird can fly");
    }

    public static void main(String[] args) {
        Fish f = new Fish();
        Bird b = new Bird();

        f.specialFeature();
        b.specialFeature();
    }
}