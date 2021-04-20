package sg.edu.rp.c347.id19023980.p02_holidays;

public class Holidays {
    private String photo;
    private String name;
    private String date;
    private String description;
    public Holidays(String photo, String name, String date, String description){
        this.photo = photo;
        this.name = name;
        this.date = date;
        this.description = description;
    }
    public String getPhoto(){
        return photo;
    }

    public String getName(){
        return name;
    }

    public String getDate(){
        return date;
    }

    public String getDescription(){
        return description;
    }
}

