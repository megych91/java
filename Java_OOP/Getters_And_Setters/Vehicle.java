class Vehicle {
    private int numberOfWheels;
    private String color;

    public Vehicle() {
    }

    public Vehicle(String color) {
        this.color = color;
    }

    public Vehicle(String color, int numberOfWheels) {
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }
    public String getColor(){
        return this.color;
    }
    public Integer getNum(){
        return this.numberOfWheels;
    }


// class Vehicle {
//     private int numberOfWheels;
//     private String color;
//     public int getNumberOfWheels() {
//         return numberOfWheels;
//     }
//     public void setNumberOfWheels(int number) {
//         numberOfWheels = number;
//     }
//     public String getColor() {
//         return color;
//     }
//     public void setColor(String color) {
//         this.color = color;
//     }
}