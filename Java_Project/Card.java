class Ex extends Exception  // подкласс от общего класса исключений
{
  public int Type;       // номер варианта исключения
  Ex(int a)                   // конструктор определяемого класса
  {
    Type = a;
   }
}
public class Card 
{ 
	private int cost;
	public  Card(int cost){
		try {
			if (cost <= 0)
				throw new Ex(-1);
			if (cost > 10)
				throw new Ex(1);
			this.cost = cost;
		}
		catch (Ex e) {
			System.out.printf("Найдено исключение. Код: %d. Объект создан, но стоимость установлена в 1\n", e.Type);
			this.cost=1;
		}
	};
	public  Card(){
		this.cost = 1;
	}
	public  int Get_Cost(){
		return this.cost;
	}
	public  void Set_Cost(int cost){
		try {
			if (cost <= 0)
				throw new Ex(-1);
			if (cost > 10)
				throw new Ex(1);
			this.cost = cost;
		}
		catch (Ex e) {
			System.out.printf("Найдено исключение. Код: %d. Стоимость не установлена\n", e.Type);
	}
}};