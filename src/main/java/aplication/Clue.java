package aplication;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Clue {

   private static List<String> clueList = new ArrayList<>();

   public void addClueToList(String clue) {
       clueList.add(clue);
   }

   public String getRandomClue(List<String> list) {
       final int size = list.size();
       //TODO
       return list.get(0);
   }

   public List<String> getClueList() {
       return clueList;
   }


}
