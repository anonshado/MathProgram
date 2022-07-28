public class InputParser {
    private int power = -1;
    private int numElements = -1;
    private int[] row;
    private String expression = "";
    private String base = "";

    // constructor is invalid in no string arguement is present
    public InputParser(){
        try {
            if(power == -1 || numElements == -1 || row.length == 0 || expression.isEmpty() || base.isEmpty()){
                throw new Exception("InputParser() must be declared with a String arguement");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }

    //valid constructor
    public InputParser(String expression){
        this.expression = expression;
    }

    // Initializes previously unknown fields
    public void parseExpression(){

            String[] tempHolder = expression.split("\\^");
            setPower(tempHolder[1]);
            setBase(tempHolder[0]);
            setNumElements(getPower()+1);
            setRow(new int[getNumElements()]);
    }

    // All of the following methods are getters and setters

    //expression
    public String getExpression() {
        return expression;
    }
    public void setExpression(String expression) {
        this.expression = expression;
    }
    //power
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        try {
            this.power = power;
            if(getPower() < 0){
                throw new IllegalArgumentException("Error: Exponents must be positive");
            }
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void setPower(String power) {
        try {
            this.power = Integer.parseInt(power);

            if(getPower() < 0){
                throw new IllegalArgumentException("Error: Exponents must be positive");
            }
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    //numElements
    public int getNumElements() {
        return numElements;
    }
    public void setNumElements(int numElements) {
        this.numElements = numElements;
    }

    //row
    public int[] getRow() {
        return row;
    }
    public void setRow(int[] row) {
        this.row = row;
    }

    //base
    public String getBase() {
        return base;
    }
    public void setBase(String base) {
        this.base = base;
    }
}
