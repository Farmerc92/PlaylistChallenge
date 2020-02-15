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
            if (startIndex == playList.length - 1){
                startIndex = 0;
                forward++;
            }
            else {
                startIndex++;
                forward++;
            }
        }
        while (!playList[startIndexBackward].equals(selection)){
            if (startIndexBackward == 0){
                startIndexBackward = playList.length - 1;
                backward++;
            }
            else {
                startIndexBackward--;
                backward++;
            }
        }
        return (forward < backward) ? forward : backward;
    }
}
