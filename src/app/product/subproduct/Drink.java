package subProduct;

import app.Product;

public class Drink extends Product {
    private boolean hasStraw;  // 빨대 유무
    public Drink(int id, String name, int price, int kcal, boolean straw) {
        super(id, name, price, kcal);
        this.hasStraw = straw;
    }

    public boolean hasStraw() { return hasStraw; }

    public void setHasStraw(boolean straw) { this.hasStraw = straw; }

}
