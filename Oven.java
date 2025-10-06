class Oven{
    // Private variables
    private String model;
    private int time;
    private int degrees;
    private boolean isOn;
    private boolean isReady;

    // Constructor
    public Oven(String model, int time, int degrees, boolean isOn, boolean isReady) {
        this.model = model;
        this.time = time;
        this.degrees = degrees;
        this.isOn = isOn;
        this.isReady = isReady;
    }

    // Methods

        // Getter
    public String getModel() {
        return model;
    }

    public int getTime() {
        return time;
    }

    public int getDegrees() {
        return degrees;
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean getIsReady() {
        return isReady;
    }

        // Setter
    public void setDegrees(int power) {
        if (this.isOn) {
            this.degrees = power;
            System.out.println("Degrees set to: " + this.degrees + " degrees");
        }else{
            System.out.println("Oven must be put to on first");
        }
    }

    public void setTime(int time) {
        if(this.isOn){
            this.time = time;
            System.out.println("Time set to: " + this.time + " minutes");
        }else{
            System.out.println("Oven must be put to on first");
        }
    }

    public void cooking(String food){
        System.out.println("Oven is cooking your " + food + ".");
        this.isReady = true;
    }

    public void eating(String food){
        if(this.isReady){
            System.out.println("Your food is ready to be eaten. Enjoy your " + food + ".");
            this.isReady = false;
        }
    }

    public void setIsOn() {
        if(!this.isOn){
            this.isOn = true;
        }else{
            System.out.println("The oven is already on!");
        }
    }

    public void setIsOff() {
        if(this.isOn){
            this.isOn = false;
            System.out.println("The oven is now off!");
        }else{
            System.out.println("The oven is already off!");
        }

    }
}
