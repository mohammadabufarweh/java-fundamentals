import java.util.ArrayList;

public class Restaurant implements AddReviwe {

    private String name;
    public int stars;
    private String priceCatogery;
    private int reviweForResturant;
    ArrayList<Review> reviews = new ArrayList<>();



    public Restaurant (String name,int priceCatogery ,int stars){
        this.name=name;
        if (stars<0) {
            this.stars = 0;
        }else if ( stars>5){
            this.stars=5;
        }else{
            this.stars=stars;
        }
        String dollerSign="";
        for (int i=0;i < priceCatogery;i++){
            dollerSign=dollerSign+"$";
            System.out.println(dollerSign);
        }
        this.priceCatogery = dollerSign;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", priceCatogery='" + priceCatogery + '\'' +
                ", reviweForResturant=" + reviweForResturant +
                ", reviews=" + reviews +
                '}';
    }

    public void addReview(String body, String auth, int star){
        Review reviewResturent=new Review(body, auth,  star);
        reviews.add(reviewResturent);
        updateReviw();
    }
private void updateReviw() {
    int total = 0;
    for (int i = 0; i < reviews.size(); i++) {
        total += reviews.get(i).star;
    }
    total /= reviews.size();
    this.reviweForResturant = total;

}

}