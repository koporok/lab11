public class purchase implements product, user {
    public String name;
    protected double price;
    protected int rating;
    protected String login;
    private String password;

    purchase(String name, double price, int rating, String login, String password) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.login = login;
        this.password = password;
    }

    public void printPurchase() {
        System.out.printf("Пользователь %s купил %s", login, name);
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
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}
