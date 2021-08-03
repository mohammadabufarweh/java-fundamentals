import java.util.ArrayList;

public class Theater implements AddReviwe{
    private String body;
    private String auth;
    private int star;
    private String name;
    private String nameForTheater;
    private int reviweForTheater;
    ArrayList<Theater> reviews = new ArrayList<>();

    public void movie(String name){
    this.name=name;
    }
    public Theater(String nameForTheater){
        this.nameForTheater=nameForTheater;

    }

    public Theater(String body, String auth, int star) {
        this.body=body;
        this.auth=auth;
        this.star=star;

    }


    public void addReview(String body, String auth, int star){
        Theater reviewTheater=new Theater(body ,auth,star);
        reviews.add(reviewTheater);
        updateReviw();
    }
    private void updateReviw() {
        int total = 0;
        for (int i = 0; i < reviews.size(); i++) {
            total += reviews.get(i).star;
        }
        total /= reviews.size();
        System.out.println( "this.reviweForShops"+this.reviweForTheater);
        this.reviweForTheater = total;

    }

    @Override
    public String toString() {
        return "Theater{" +
                ", nameForTheater='" + nameForTheater + '\'' +
                ", reviweForTheater=" + reviweForTheater +
                ", reviews=" + reviews +
                '}';
    }
}
