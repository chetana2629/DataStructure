package Assignment_2_DS;
//Q.1 Implement linear probing using 2D array (bucketing) using same H(x)=x%10.
public class linear_Probing 
{
	private final int TABLE_SIZE = 10;
    private final int EMPTY = -1;
    private int[][] table;  

    public linear_Probing() 
    {
        table = new int[TABLE_SIZE][2];
        for (int i = 0; i < TABLE_SIZE; i++) 
        {
            table[i][0] = EMPTY; 
            table[i][1] = EMPTY; 
        }
    }

    public void put(int key, int value) 
    {
        int index = key % TABLE_SIZE; 

        while (table[index][0] != EMPTY) 
        {
            index = (index + 1) % TABLE_SIZE; 
        }

        table[index][0] = key; // Store the key
        table[index][1] = value; // Store the value
    }

    public int get(int key) 
    {
        int index = key % TABLE_SIZE; 

        while (table[index][0] != EMPTY) 
        {
            if (table[index][0] == key) 
            {
                return table[index][1]; 
            }
            index = (index + 1) % TABLE_SIZE; 
        }

        return EMPTY; 
    }

    public static void main(String[] args) 
    {
        linear_Probing hashTable = new linear_Probing();
        hashTable.put(5, 50);
        hashTable.put(15, 150);
        hashTable.put(25, 250);

        System.out.println(hashTable.get(5));  
        System.out.println(hashTable.get(15)); 
        System.out.println(hashTable.get(25)); 
        System.out.println(hashTable.get(35));
    }
}

/*output:-
50
150
250
-1

 */
