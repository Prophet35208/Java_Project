public class Coefficient {
    public class Coefficient_Helper{
        static Coefficient current_coefficient;
        static public void Change_Current__Coefficient(Coefficient coefficient){
            current_coefficient=coefficient;
        }
        static public int Get_Soft_Coef_From_Current_Coefficient(){
            return current_coefficient.soft_coefficient;
        }
        static public int Get_Hard_Coef_From_Current_Coefficient(){
            return current_coefficient.hard_coefficient;
        }
    }
	public int hard_coefficient;
	public int soft_coefficient;

	public Coefficient(){
        this.soft_coefficient = 0;
	    this.hard_coefficient = 1;
    }
	public Coefficient(int hard_coefficient){
        this.hard_coefficient = hard_coefficient;
	    this.soft_coefficient = 0;
    }
	public Coefficient(int soft_coefficient, int hard_coefficient){
        this.soft_coefficient = soft_coefficient;
	    this.hard_coefficient = hard_coefficient;
    }

    public void Set_Coefficient(int hard_coefficient, int soft_coefficient){
        this.soft_coefficient = soft_coefficient;
	    this.hard_coefficient = hard_coefficient;
    }
    public int Get_Soft_Coefficient(){
        return this.soft_coefficient;
    }
	public int Get_Hard_Coefficient(){
        return this.hard_coefficient;
    }
}
