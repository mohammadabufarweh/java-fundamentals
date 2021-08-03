import java.util.ArrayList;

public class Review {
    private String body;
    private String auth;
    public int star;
    public Restaurant restaurant;
    public Shop shop;
    public Theater theater;
    public AddReviwe addReviwe;

    public Review(String body, String auth, int star) {
        this.body = body;
        this.auth = auth;
        this.star = star;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", auth='" + auth + '\'' +
                ", stars=" + star +
                '}';
    }

}