package subProduct;

import app.Product;

public class Hamburger extends Product {
    private boolean isBurgerSet;    // 세트 여부
    private int burgerSetPrice;     // 세트 옵션 표기 시 세트 가격

    public Hamburger(int id, String name, int price, int kcal, boolean isBurgerSet, int burgerSetPrice) {
        super(id, name, price, kcal);
        this.isBurgerSet = isBurgerSet;
        this.burgerSetPrice = burgerSetPrice;
    }

    public boolean isBurgerSet()   { return isBurgerSet;    }
    public int getBurgerSetPrice() { return burgerSetPrice; }

    public void setBurgerSet(boolean burgerSet)       { isBurgerSet = burgerSet;    }
    public void setBurgerSetPrice(int burgerSetPrice) { this.burgerSetPrice = burgerSetPrice; }
}
