package collection;
import java.util.logging.Logger;
import java.util.Scanner;

public class collection {
	private static final Logger LOGGER= Logger.getLogger(collection.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomList<Integer> newList = new CustomList<Integer>();
        Scanner s = new Scanner(System.in);
        LOGGER.info(" Enter size of array greater than or equal to 10 : ");
        int n;
        n = s.nextInt();
        for(int i=0;i<n;i++)
        {
            newList.add(s.nextInt());
        }
        newList.display();
        LOGGER.info(" Enter the index of element to be removed :");
        newList.remove(s.nextInt());
        newList.display();
        LOGGER.info("Enter element to be added :");
        newList.add(s.nextInt());
        newList.display();
        System.out.println(newList.get(3));
        newList.display();

	}

}
