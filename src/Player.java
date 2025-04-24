public class Player {
    private String name;
    private Integer id;
    private Colour colour;

    public Player(String name, Integer id, Colour colour){
        this.name = name;
        this.id = id;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public Colour getColour() {
        return colour;
    }
}
