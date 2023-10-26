package ucu.apps.flowerstore.flowers;

public enum FlowerColor {
    RED("red"), GREEN("green"), BLUE("blue");

    private String label;
    FlowerColor(String label){
        this.label = label;
    }

    public String toString(){
        return label;
    }

    public String getValue(){
        return label;
    }
}
