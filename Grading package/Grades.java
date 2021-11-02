/**
*Each value is the top percentage mark for that grade
*@author 1.0 Jake Stewart
*version 1.0 2/11/21
*/
public enum Grades
{
    NS (0),
    F (39),
    D (49),
    C (59), 
    B (69),
    A (100);
    
    private final int value;
    
    private Grades(int value)
    {
       this.value = value; 
    }
    
    public int getValue()
    {
        return value;
    }
}