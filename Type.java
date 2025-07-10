package PokemonTypeGenerator;

public class Type {
	String name;
	String description;
	int index;
	int[] weaknesses;
	int[] resistances;
	int[] imunnities; 
	int[] strengths;
	int[] noeffects;
	int ranking;
	
	public Type(String name, String description, int index, 
			int[] weaknesses, int[] resistances, int[] imunnities, 
			int[] strengths, int[] noeffects)
	{
		this.name = name;
		this.description = description;
		this.index = index;
		this.weaknesses = weaknesses;
		this.resistances = resistances;
		this.imunnities = imunnities;
		this.strengths = strengths;
		this.noeffects = noeffects;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public int getIndex()
	{
		return index;
	}
	
	public int[] getWeaknesses()
	{
		return weaknesses;
	}
	
	public int[] getResistances()
	{
		return resistances;
	}
	
	public int[] getImunnities()
	{
		return imunnities;
	}
	
	public int[] getStrengths()
	{
		return strengths;
	}
	
	public int[] getNoeffects()
	{
		return noeffects;
	}
	
	public int getRanking()
	{
		return ranking;
	}
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setDescription(String d)
	{
		this.description = d;
	}
	
	public void setIndex(int i)
	{
		this.index = i;
	}
	
	public void setWeaknesses(int[] w)
	{
		this.weaknesses = w;
	}
	
	public void setResistances(int[] r)
	{
		this.resistances = r;
	}
	
	public void setImunnities(int[] im)
	{
		this.imunnities = im;
	}
	
	public void setStrengths(int[] s)
	{
		this.strengths = s;
	}
	
	public void setNoeffects(int[] ne)
	{
		this.noeffects = ne;
	}
	
	public void setRanking(int rk)
	{
		this.ranking = rk;
	}
	
	
}
