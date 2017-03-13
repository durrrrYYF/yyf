/*
编写一个程序，计算自然数n的阶乘n!。（提示：可用循环完成）
*/
public class factorial{
	 public static void main(String[] args){
         //将args[0]转换为阶数n
           int n=Integer.parseInt(args[0]);
         //循环计算n!，返回结果
         int a=1;int b=1;int c=1;
	 	 for(int i=1;i<n;i++)
	 	 {
	 	 	a=i*a;
	 	 }
	 	 System.out.print(a);
	}
}
