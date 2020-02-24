/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;
/**
 *
 * @author dell
 */
public class AirlinerDirectory {
    private ArrayList<Airliner> airlinerDir;
    
    public AirlinerDirectory() {
        this.airlinerDir = new ArrayList<>();
    } 

    public ArrayList<Airliner> getAirlinerDir() {
        return airlinerDir;
    }

    public void setAirlinerDir(ArrayList<Airliner> airlinerDir) {
        this.airlinerDir = airlinerDir;
    } 
    
    public Airliner addAirliner(){
        Airliner newAirliner = new Airliner();
        airlinerDir.add(newAirliner);
        return newAirliner;
    }
    
    public int size() {
        return airlinerDir.size();
    }
    
    private void add(Airliner al) {
        airlinerDir.add(al);
    }
    
    public void deleteAirliner(Airliner al){
        airlinerDir.remove(al);
    }
    
    public AirlinerDirectory searchAirliner(String name){
        AirlinerDirectory result = new AirlinerDirectory();
        for(Airliner al : this.airlinerDir){
            if(al.getName().equalsIgnoreCase(name)){
                result.add(al);
            }
        }
        if(result.size() == 0)
            result = null;
        return result;
    }
}
