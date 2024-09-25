public class point
{
private int Abscisse;
private int Ordonnée;
private String nom;
public point (String n,int a,int b)
{
  Abscisse=a;
  Ordonnée=b;
  nom=n;
}
public point(int b,int a)
{
  Ordonnée=b;
  Abscisse=a;
}
public point(String n)
{
  nom=n;
}
public void Affiche()
{
  System.out.println(nom+'('+Abscisse+','+Ordonnée+')');
}
public void TranslHoriz(int a)
{
   Abscisse=Abscisse+a;
}

public void TranslVert(int a)
{
  Ordonnée=Ordonnée+a;
}
public void Translation(int a,int b)
{
  Abscisse=Abscisse+a;
  Ordonnée=Ordonnée+b;
}
public boolean Coincide(point p)
{
  if(p.Abscisse==Abscisse && p.Ordonnée==Ordonnée)
{return true;}
else {return false;}
}
public String getNom()
{
  return nom;
}
public int getAbscisse()
{
  return Abscisse;
}
public int getOrdonnée()
{
  return Ordonnée;
}
public void setNom(String ch)
{
  nom=ch;
}
public void setAbscisse(int a)
{
  Abscisse=a;
}
public void setOrdonnée(int a)
{
  Ordonnée=a;
}
}