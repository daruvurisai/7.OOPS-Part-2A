class Movie {
        private String name;

        public Movie(String name) {
            this.name = name;
        }

        public String plot(){
            return "No Plot here";
        }

    public String getName() {
        return name;
    }
}
    class Jaws extends Movie{
        public Jaws(){
            super("Jaws");
        }
        public String plot(){
            return "A Shark Eats lots of people";
        }
    }
    class Independence extends Movie{
        public Independence(){
            super("Independence Day");
        }
        @Override
        public String plot(){
            return "Aliens to take over our earth";
        }
    }

    class MazeRunner extends Movie{
        public MazeRunner(){
            super("MazeRunner");
        }
      //No Plot Method here

    }
public class Main {

    public static void main(String[] args){
        for (int i=1;i<11;i++){
            Movie movie = randomMovie();
            System.out.println("Movie # "+i+movie.getName()+"\n"+" Plot: "+movie.plot()+"\n");
        }

    }

    public static Movie randomMovie(){
       int randomNumber =(int)(Math.random()*5)+1;
        System.out.println("Random Number Generated was : "+randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new Independence();
            case 3:
                return new MazeRunner();


        }
        return null;
    }
}
