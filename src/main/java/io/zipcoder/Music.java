package io.zipcoder;


public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int startIndexBackward = startIndex;
        Integer forward = 0;
        Integer backward = 0;
        while (!playList[startIndex].equals(selection)){
            startIndex++;
            forward++;
            if (startIndex >= playList.length){
                startIndex = 0;
            }
        }
        while (!playList[startIndexBackward].equals(selection)){
            startIndexBackward--;
            backward++;
            if (startIndexBackward < 0){
                startIndexBackward = playList.length - 1;
            }
        }
        return (forward < backward) ? forward : backward;
    }
}
