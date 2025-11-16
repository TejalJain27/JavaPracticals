class Box {
    protected float width;
    protected float height;
    protected float depth;
    public Box() {
        width = height = depth = 0;
    }
    public Box(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public Box(Box b) {
        this.width = b.width;
        this.height = b.height;
        this.depth = b.depth;
    }
    public float getWidth() { return width; }
    public void setWidth(float width) { this.width = width; }

    public float getHeight() { return height; }
    public void setHeight(float height) { this.height = height; }

    public float getDepth() { return depth; }
    public void setDepth(float depth) { this.depth = depth; }

    public void displayVolume() {
        float volume = width * height * depth;
        System.out.println("Volume = " + volume);
    }
}
class BoxWeight extends Box {
    private float weight;

    public BoxWeight() {
        super(); //call parent class
        weight = 0;
    }
    public BoxWeight(float width, float height, float depth, float weight) {
        super(width, height, depth); 
        this.weight = weight;
    }
    public BoxWeight(BoxWeight bw) {
        super(bw); 
        this.weight = bw.weight;
    }
    public float getWeight() { return weight; }
    public void setWeight(float weight) { this.weight = weight; }

    public void displayWeight() {
        System.out.println("Weight = " + weight);
    }
}

public class BoxWeightDemo {

    public static void main(String[] args) {
        BoxWeight bw1 = new BoxWeight(4, 5, 6, 10);
        System.out.println("BoxWeight bw1:");
        bw1.displayVolume();
        bw1.displayWeight();

        BoxWeight bw2 = new BoxWeight(bw1);
        System.out.println("\nBoxWeight bw2 (clone):");
        bw2.displayVolume();
        bw2.displayWeight();

        BoxWeight bw3 = new BoxWeight();
        System.out.println("\nBoxWeight bw3 (default):");
        bw3.displayVolume();
        bw3.displayWeight();
    }
}
