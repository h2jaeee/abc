
public class may11_teacher {
	   public static void main(String[] args) 
	   {
		   int val=13;
		   int div=2;
		   boolean isPrimeNum = true;
		   for(int i=0;i<val-2;i++)
		   {
			   if(0==val%div)
			   {
				   isPrimeNum = false;
				   break;
			   }
			   div++;
		   }
		   if(isPrimeNum==true)
		   {
			   System.out.println("�Ҽ�");		  
		   }
		   else
		   {
			   System.out.println("�ռ���");
		   }
		   //�߰��� �ּ�
	   }

}
