package assuncao.bryan.codes.staticmodifier.domain;

public class VideoCard {
    private String name;
    private static int year = 2024;
    private String manufacturer;

    public VideoCard( String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public void printVideoCard(){
        System.out.println("-----------");
        System.out.println("Name: " + this.name);
        System.out.println("Year: " + VideoCard.year);
        System.out.println("Manufacturer: " + this.manufacturer);
    }

    public static int getYear() {
        return year;
    }

    public static void setYear(int year) {
        VideoCard.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


}



