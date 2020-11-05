package item;
import java.util.List;

public class FlowerBucket implements Item{
    private List<Flower> flowers;
    public FlowerBucket(){
        super();
    }
    public String getDescription(){
        return null;
    }
    public double getPrice(){
        double n = 0;
        for (int i = 0; i < this.flowers.size(); i++){
            n += this.flowers.get(i).getPrice();
        }
        return n;
    }
    public void addFlower(Flower flower){
        this.flowers.add(flower);
    }
}