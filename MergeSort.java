
public class MergeSort
{
	public static void main(String[] args) 
		{
			int[] ar = {7,8,1,3,4,2};
			MergeSort.displayFinal(ar);
			MergeSort.mergerSort(ar);
			MergeSort.displayFinal(ar);
			}
		static void displayFinal (int [] ar)
		{
			System.out.println("*********");
			for( int i = 0; i < ar.length; i++)
			{
				System.out.println(ar[i]);
			}
			System.out.println("*********");

		}
		static void mergerSort(int[] ar)
		{
			MergeSort.mergeSortHelper(ar, 0, ar.length-1);
		}

		
		static void mergeSortHelper(int[] ar, int begin, int end)
		{
			if(begin != end)
			{
				int leftBegin = begin;
				int leftEnd = ((end-begin)/2 + begin);
				int rightBegin = ((end-begin)/2 + begin) + 1;
				int rightEnd = end;
				MergeSort.mergeSortHelper(ar, leftBegin, leftEnd);
				MergeSort.mergeSortHelper(ar, rightBegin, rightEnd);

				int[] temp = new int[(end-begin)+1];
				for(int i = 0; i < temp.length; i++)
				{
					if(ar[leftBegin] > ar[leftEnd])
					{
						temp[i] = ar[rightBegin];
						rightBegin++;
					}
					else if(rightBegin > rightEnd)
					{
						temp[i] = ar[leftBegin];
						leftBegin++;
					}
					else if(ar[leftBegin] < ar[rightBegin])
						{
							temp[i]= ar[leftBegin];
							leftBegin++;
						}
					else
					{
						temp[i] = ar[rightBegin];
						rightBegin++;
					}
					
				}
				
				for(int i = 0; i <temp.length; i++)
				{
					ar[begin+i] = temp[i];
				}
		}	

			}

		
		static void display(int[] ar, int begin, int end)
		{
			for(int i = begin; i <= end; i++)
			{
				System.out.print(ar[i] + " ");
			}
			System.out.println("");
		}
}

