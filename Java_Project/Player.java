public class Player
{
    static int num_all_players=0; // Статическая переменная
	int  player_num;
	public Hand hand;
    
	public Player(int player_num){
        this.hand=new Hand();
        this.player_num = player_num;
        num_all_players++;
    }
	public int Get_Sum_Points(Coefficient coefficient){
        int sum_points_first = 0, sum_points_final = 0;
    for (int i = 0; i < 3; i++)
    {
        if (this.hand.Check_If_Card_In_Place(i))
            sum_points_first += this.hand.Get_Cost_From_Card_In_Place(i);
    }
    sum_points_final = (sum_points_first * coefficient.hard_coefficient) + coefficient.soft_coefficient;
    return sum_points_final;
    }
    public static int Get_Num_All_Players(){
        return num_all_players;
    }
};