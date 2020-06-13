package com.example.logist;

import org.json.JSONObject;

public class recipe {
    private String name;
    private ingredient[] ingredList;
    private String description;

    public recipe(String n, ingredient[] initialList, String d){
        name = n;
        ingredList = initialList;
        description = d;
    }

    public String getName() {return name;}
    public String getDescription() {return description}
    public ingredient[] getIngredList() {
        return ingredList;
    }

    public void addIngredient(ingredient newIng) {
        int lastIndex = ingredList.length;
        ingredient[] newList = new ingredient[ingredList.length + 1];

        for(int i = 0; i < lastIndex; i++){
            newList[i] = ingredList[i];
        }
        newList[lastIndex] = newIng;
        ingredList = newList;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setIngredList(ingredient[] ingredList) {
        this.ingredList = ingredList;
    }

    public JSONObject toJson() {

    }
}
