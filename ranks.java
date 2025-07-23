package PokemonTypeGenerator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ranks {
	
	public static void main(String[] args) {
		String[] chart = new String[5];
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/ronaldng/Downloads/types.csv"))) {
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {
            	chart[i] = line;
                i = i + 1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        for (int i = 0; i < chart.length; i++) {
        	System.out.println(chart[i]);
        }
        
        
        
	}
	
	public int ranking(Type t, String[] chart, String[] list)
	{
		int total = 0;
		
		int[] strengths = t.getStrengths();
		int[] weaknesses = t.getWeaknesses();
		int[] imunnities = t.getImunnities();
		int[] noeffects = t.getNoeffects();
		int[] resistances = t.getResistances();
		int[] disadv = t.getDisadv();
		
		for(int i = 0; i < chart.length; i++) {
			for (int j = 0; j < strengths.length; j++)
			{
				if(chart[i].contains(list[strengths[j]]))
				{
					total = total + 2*(5-i);
				}
			}
			
			for (int j = 0; j < weaknesses.length; j++)
			{
				if(chart[i].contains(list[weaknesses[j]]))
				{
					total = total - 2*(5-i);
				}
			}
			
			for (int j = 0; j < imunnities.length; j++)
			{
				if(chart[i].contains(list[imunnities[j]]))
				{
					total = total + 2*(5-i);
				}
			}
			
			for (int j = 0; j < noeffects.length; j++)
			{
				if(chart[i].contains(list[noeffects[j]]))
				{
					total = total - 2*(5-i);
				}
			}
			
			for (int j = 0; j < resistances.length; j++)
			{
				if(chart[i].contains(list[resistances[j]]))
				{
					total = total + (5-i);
				}
			}
			
			for (int j = 0; j < disadv.length; j++)
			{
				if(chart[i].contains(list[disadv[j]]))
				{
					total = total - (5-i);
				}
			}
			
			
		}
		
		
		if (total > 5)
		{
			return 5;
		}
		
		if (total >= 0)
		{
			return 4;
		}
		
		if (total >= -5)
		{
			return 3;
		}
		
		if (total >= -10)
		{
			return 2;
		}
		
		
		return 1;
	}
}
