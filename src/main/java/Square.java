public class Square extends Shape {
    private int size;

    public Square(int size) {
        this.size = size;
    }

    @Override
    String draw() {
        String drawing = "";
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                if(i == 0|| j== 0|| i== size -1 || j == size-1)
                    drawing += "*";
                else
                    drawing += " ";
            }
            drawing += "\n";
        }
        
        return drawing;
    }
    
}
