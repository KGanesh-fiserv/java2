public class Rectangle extends Shape{
    private int length;
    private int width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    @Override
    String draw() {
        String drawing = "";
        for(int i = 0; i<width; i++){
            for(int j = 0; j<length; j++){
                if(i == 0|| j== 0|| i== width -1 || j == length-1)
                    drawing += "*";
                else
                    drawing += " ";
            }
            drawing += "\n";
        }
        
        return drawing;
    }
    
}
