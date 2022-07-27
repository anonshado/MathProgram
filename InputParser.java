public class InputParser {
    protected int power = -1;
    protected int numElements = -1;
    protected int[] row;
    protected String expression = "";
    protected String base = "";

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
        try {
            String[] tempHolder = expression.split("\\^");
            setPower(tempHolder[1]);

            if(getPower() < 0)
                throw new IllegalArgumentException("Exponents must be positive");

            setNumElements(power+1);
            setRow(new int[getNumElements()]);
            setBase(tempHolder[0]);
                
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
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
        this.power = power;
    }
    public void setPower(String power) {
        this.power = Integer.parseInt(power);
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
