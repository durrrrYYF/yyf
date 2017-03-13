/*
编写一个程序，输出字符串"abcdefgh"的全排列。（提示：可考虑递归）
*/
public class permutation{
	


		void print(String x) {    //打印字符串
          System.out.print(x + ",");
                                     }
		void swap(String[] str,int i,int j) {  //将字符串数组中的第i个字符串和第j个字符串交换  
                    if(i!=j)
                     {
                 String tmp = new String();
                   tmp = str[i];
                  str[i] = str[j];
                   str[j] = tmp;
                     }
                   }
void arrange(String[] str, int st, int len) {  //递归实现str[st]到str[len-1]的全排列
  
  if(st==len-1)        //如果从字符串数组的最后一个字符串开始全排列，则依次打印字符串数组。
  {
   for(int j=0; j<len; j++)
   {
    print(str[j]); 
   }
   System.out.println();
  }
  else{          //否则，依次递归调用。
   for(int i=st; i<len; i++)
   {   
    swap(str,st,i);
    arrange(str,st+1,len);
    swap(str,st,i);
   }
  }
}
public static void main(String[] args){
		char m;
		char[] chars={'a','b','c'};
arrange(chars,0,3);    //实现字符串数组str从str[0]到str[3]的全排列。	
	}
			
}
