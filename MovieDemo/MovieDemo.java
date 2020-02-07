import java.util.Scanner;

class MovieDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Movie film = new Movie("The Ripper", "Sony", "G", 10.50);
        Movie film2 = new Movie("Endgame", "Disney", "PG-13", 12);
        Movie film3 = new Movie("Joker", "Sony", "R", 15);
        System.out.println("What type of rating are you looking for?");
        String rate_req = scan.nextLine();
        System.out.println("How much money are you willing to pay?");
        double money_req = scan.nextDouble();
        if(film.reccomend(rate_req,money_req)){
          System.out.println(film.getTitle() + " is a good movie for you!");
        }
        if(!film.reccomend(rate_req,money_req)){
          System.out.println(film.getTitle() + " is a bad movie for you");
        }
        /*System.out.println("How much money do you have tickets");
        double money = scan.nextDouble();
        if(film.getTicketPrice() > money){
          System.out.println("You need " + film.isAffordable(money) + "$ to see a movie");
        }
        if(film.getTicketPrice() < money){
          System.out.println("You have " + film.isAffordable(money) + "$ left over after seeing the movie");
        }
        if(film.getTicketPrice() == money){
          System.out.println("You have just enough money to see the movie!");
        }
        */
      }
}

class Movie{
    String title;
    String studio;
    String rating;
    double ticketPrice;
    public Movie(String title, String studio, String rating, double ticketPrice){
        this.title = title;
        this.studio = studio;
        this.rating = rating;
        this.ticketPrice = ticketPrice;
    }
    public String getTitle(){
      return title;
    }

    public double getTicketPrice(){
      return ticketPrice;
    }

    public Boolean IsPG(){
        if(rating.equals("PG")){
            return true;
        }
        else{
            return false;
        }
    }

    public double isAffordable(double money){
        if(ticketPrice < money){
            double leftover = money - ticketPrice;
            return leftover;
        }
        if(ticketPrice > money){
            double leftover = ticketPrice - money;
            return leftover;
        }
        return 0;
    }
    public boolean reccomend(String rate, double money){
      if(rating.equals(rate) && money > ticketPrice){
        return true;
      }
      else{
        return false;
      }
    }
}
