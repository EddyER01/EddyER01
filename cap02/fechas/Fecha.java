/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.fechas;

/**
 *
 * @author eduar
 */
public class Fecha 
{
    private int dia; 
    private int mes; 
    private int año;
    
    private int fechaToDias()
    {
        return año*360+mes*30+dia;
    }
    private void diasToFecha(int i)
    {
        año = (int)i/360;
        int resto = i % 360;
        mes = (int) resto/30;
        dia = resto % 30;
        if( dia == 0)
        {
            dia=30;
            mes--;
        }
        if( mes == 0)
        {
            mes=12;
            año--;
        }
    }
    public void addDias(int d)
    {
        int sum=fechaToDias()+d;
        diasToFecha(sum);
    }
    
    public Fecha(int d, int m, int a)
    {
        dia = d;
        mes = m;
        año = a;
    }
    
    public Fecha(String s)
    {
        int pos1=s.indexOf('/');
        int pos2=s.lastIndexOf('/');
        String sDia=s.substring(0,pos1);
        dia = Integer.parseInt(sDia);
        String sMes=s.substring(pos1+1,pos2);
        mes = Integer.parseInt(sMes);
        String sAño = s.substring(pos2+1);
        año = Integer.parseInt(sAño);
    }
    public Fecha()
    {
        
    }
    
    public boolean equals(Object o)
    {
        Fecha otra = (Fecha)o;
        return (dia==otra.dia) && (mes==otra.mes) && (año==otra.año);
    }
    
    public String toString()
    {
        return dia+"/"+mes+"/"+año;
    }
    public int getDia()
    {
        return dia;
    }
    public void setDia(int dia)
    {
        this.dia = dia;
    }
    public int getMes()
    {
        return mes;
    }
    public void setMes(int mes)
    {
        this.mes = mes;
    }
    public int getAño()
    {
        return año;
    }
    public void setAño(int año)
    {
        this.año = año;
    }
}
