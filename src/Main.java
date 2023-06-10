class product_berries implements product {
    public String name;
    protected double price;
    protected int rating;

    product_berries(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) { this.price = price; }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public void setRating(int rating) { this.rating = rating; }
}
class product_fruits implements product {
    public String name;
    protected double price;
    protected int rating;

    product_fruits(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) { this.price = price; }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public void setRating(int rating) { this.rating = rating; }
}
class product_vegetable implements product {
    public String name;
    protected double price;
    protected int rating;

    product_vegetable(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) { this.price = price; }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public void setRating(int rating) { this.rating = rating; }
}


interface product{
    String getName();
    void setName(String name);
    double getPrice();
    void setPrice(double price);
    int getRating();
    void setRating(int rating);
}

interface user{
    String getLogin();
    void setLogin(String login);
    String getPassword();
    void setPassword(String password);
}

public class Main {
    public static void main(String[] args) {
        product Apple = new product_fruits("Яблоко", 26.4, 5);
        product Potato = new product_vegetable("Картофель", 20.3, 5);
        product Strawberry = new product_berries("Клубника", 30.6, 4);
        user Ivan = new user_admin("Ivan_ad", "23nsu543");
        user Shop = new user_shop("Shop", "ki93821ks");
        user Oleg = new user_buyer("Oleg", "213ssd23");
        purchase purchase_1 = new purchase(Apple.getName(), Apple.getPrice(), Apple.getRating(), Oleg.getLogin(), Oleg.getPassword());
        purchase_1.printPurchase();
    }
    }
