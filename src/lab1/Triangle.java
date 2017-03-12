package lab1;

public class Triangle {
//建立三个边的参数，并初始化为0
	public float edge1=0,edge2=0,edg3=0;

	//首先判断是否为三角形
	public boolean isTriangle(float a,float b,float c) {
		if((a>0)&&(b>0)&&(c>0))
		{
			if(((a+b)>c)&&((a+c)>b)&&((b+c)>a))
				return true;
			else
				return false;	
		}
		else 
			return false;
		
	}
//建立判断参数，判断好之后进行返回 1,2,3，0代表不能构成三角形

public int whichTri(float a,float b,float c) {
	if (isTriangle(a, b, c)) {
	if((a==b)&&(b==c))
		return 1;
	else if((a==b)||(b==c)||(a==c))
	{
		return 2;
	}
	else if((a!=b)&&(b!=c)&&(a!=c)){
		return 3;	
	}
	}
	else
		return 0;
	return (Integer) null;
}
public String Name(Integer b) {
	if(b==0)
		return "NoTri";
	if(b==1)
		return "Equal";
	if(b==2)
		return "Isos";
	if(b==3)
		return "Scal";
	return null;
}

}

