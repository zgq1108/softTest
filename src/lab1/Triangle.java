package lab1;

public class Triangle {
//���������ߵĲ���������ʼ��Ϊ0
	public float edge1=0,edge2=0,edg3=0;

	//�����ж��Ƿ�Ϊ������
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
//�����жϲ������жϺ�֮����з��� 1,2,3��0�����ܹ���������

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

