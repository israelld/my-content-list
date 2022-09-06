package model;

import java.util.Date;

public class media {

    private int id;
    private String title;
    private int rating;
    private Date releaseDate;
    private Date consumptionDate;
    private String status;
    private String description;
    private String comments;

    public media(int id, String title, int rating, Date releaseDate, Date consumptionDate, String status, String description, String comments) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.releaseDate = releaseDate;
        this.consumptionDate = consumptionDate;
        this.status = status;
        this.description = description;
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getConsumptionDate() {
        return consumptionDate;
    }

    public void setConsumptionDate(Date consumptionDate) {
        this.consumptionDate = consumptionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "media{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                ", releaseDate=" + releaseDate +
                ", consumptionDate=" + consumptionDate +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }



}
