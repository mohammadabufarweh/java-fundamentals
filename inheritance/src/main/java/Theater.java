import java.util.ArrayList;

public class Theater implements AddReviwe{
    private String body;
    private String auth;
    private int star;
    private String name;
    private String nameForTheater;
    private int reviweForTheater;
    ArrayList<Review> reviews = new ArrayList<>();
    ArrayList<Movie>movies=new ArrayList<>();

    public Theater(String nameForTheater){
        this.nameForTheater=nameForTheater;

    }

    public Theater(String body, String auth, int star) {
        this.body=body;
        this.auth=auth;
        this.star=star;

    }
    public void addFavouritMovies(Movie movie) {
        movies.add(movie);
    }
    public void addReview(String body, String auth, int star){
        Review reviewTheater=new Review(body ,auth,star);
        reviews.add(reviewTheater);
        updateReviw();
    }
    private void updateReviw() {
        int total = 0;
        for (int i = 0; i < reviews.size(); i++) {
            total += reviews.get(i).star;
        }
        total /= reviews.size();
        this.reviweForTheater = total;

    }
    public void removeMovie(Movie movie) {
        if(movies.contains(movie))
            movies.remove(movie);
    }
    @Override
    public String toString() {
        return "Theater{" +
                " nameForTheater='" + nameForTheater + '\'' +
                ", reviweForTheater=" + reviweForTheater +
                  reviews +
                ", movies=" + movies +
                '}';
    }


}
