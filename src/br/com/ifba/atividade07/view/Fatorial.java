package br.com.ifba.atividade07.view;

public class Fatorial {
    private int value;
    public String formula;
    
    public void setValue(int num){
        this.value = 1;
        this.formula = "";
        for(int i=num; i>0; i--){
            this.value = value*i;
            
            if(i != 1){
                this.formula = this.formula + i + " x ";
            }else{
                this.formula = this.formula + i ;
            }                       
        }
        this.formula = this.formula + " = " + value;
        
    }
    
    public int getFatorial(){
        return this.value;
    }
    
    public String getFormula(){
        return this.formula;
    }
    
}
