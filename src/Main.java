import exceptions.DifferentDayException;
import exceptions.UnderAgeException;
import model.IdType;
import model.Market;

public class Main {
	 public static void main(String[] args) throws UnderAgeException, DifferentDayException{
		 Market market = new Market();
		 market.register(IdType.CC, "1006171179", 2);
		 market.register(IdType.PP, "1006171160", 1);
		 market.getPeopleWhoTryToEnter();
	 }
}
