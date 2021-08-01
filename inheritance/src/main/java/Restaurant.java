import java.util.ArrayList;

public class Restaurant {

    private String name;
    public int stars;
    private String priceCatogery;
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

        System.out.println(this.priceCatogery);
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", starts=" + stars +
                ", priceCatogery='" + priceCatogery + '\'' +
                '}';
    }

    public void addReview(Review potato){
        reviews.add(potato);
        potato.restaurant = this;
        updateStars();
    }

    private void updateStars() {
        int total = 0;
        for (int i = 0; i < reviews.size(); i++) {
            total += reviews.get(i).star;
        }
        total /= reviews.size();
        System.out.println( reviews.size());
        this.stars = total;

    }
}