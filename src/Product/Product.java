package Product;

public abstract class Product {
    private int id;
    private String name;
    private String category;
    private int price;
    private int kcal;

    public Product(int id, String name, String category, int price, int kcal) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.kcal = kcal;
    }

    public int getId()          { return id;    }
    public String getName()     { return name;  }
    public String getCategory() { return category;  }
    public int getPrice()       { return price; }
    public int getKcal()        { return kcal;  }
}
