import java.util.ArrayList;

public class Shop implements AddReviwe{
    private String name;
    private String description;
    private String numberOfDollar;
    private int reviweForShops;
    ArrayList<Review> reviews = new ArrayList<>();


    public Shop(String name,String description ,int numberOfDollar){
        this.name=name;
        this.description=description;
        String dollarsSign="";
        for (int i=0;i < numberOfDollar;i++){
            dollarsSign=dollarsSign+"$";
            System.out.println(dollarsSign);
        }
        this.numberOfDollar = dollarsSign;

    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numberOfDollar='" + numberOfDollar + '\'' +
                ", reviweForShops=" + reviweForShops +
                ", reviews=" + reviews +
                '}';
    }

    //    public void addReviewForShop(Review potato){
//        reviews.add(potato);
////        System.out.println("reviews.add(potato)"+reviews.add(potato));
//        potato.shop = this;
////        System.out.println(" potato.restaurant = this"+ potato.restaurant);
////        System.out.println("this:"+this);
//        updateReviw();
//
public void addReview(String body, String auth, int star){
        Review reviewShops=new Review(body,auth,star);
        reviews.add(reviewShops);
         updateReviw();

}
    private void updateReviw() {
        int total = 0;
        for (int i = 0; i < reviews.size(); i++) {
            total += reviews.get(i).star;
        }
        total /= reviews.size();
        System.out.println( "this.reviweForShops"+this.reviweForShops);
        this.reviweForShops = total;

    }
}
