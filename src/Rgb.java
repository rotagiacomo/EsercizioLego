public class Rgb {
    private int red;
    private int green;
    private int blue;

    public void setRed(int red) {
        if (red >= 0 && red <= 255){
            this.red = red;
        }else {
            this.red = -1;
        }
    }

    public void setGreen(int green) {
        if (green >= 0 && green <= 255){
            this.green = green;
        }else {
            this.green = -1;
        }
    }

    public void setBlue(int blue){
        if(blue >= 0 && blue <= 255){
            this.blue = blue;
        }else {
            this.blue = -1;
        }
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public Rgb(){
        red = 0;
        green = 0;
        blue = 0;
    }

    public Rgb(int red, int green, int blue){
        this.setRed(red);
        this.setGreen(green);
        this.setBlue(blue);
    }

    public boolean equals(Rgb rgbDaConfrontare){
        return red == rgbDaConfrontare.red && green == rgbDaConfrontare.green && blue == rgbDaConfrontare.blue;
    }

    public String toString(){
        return "Rgb[red: " +red + ", green: " + green + ", blue: " + blue + "]";
    }
}
