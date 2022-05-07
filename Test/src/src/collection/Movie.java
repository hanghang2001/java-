package collection;

public class Movie {
    private String neme;
    private double score;
    private String actor;

    public Movie() {
    }

    public Movie(String neme, double score, String actor) {
        this.neme = neme;
        this.score = score;
        this.actor = actor;
    }

    public String getNeme() {
        return neme;
    }

    public void setNeme(String neme) {
        this.neme = neme;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
