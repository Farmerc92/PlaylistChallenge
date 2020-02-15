package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        Integer forward = 0;
        Integer backward = 0;
        boolean foundForward = false;
        boolean foundBackward = false;
        for (int index = startIndex; index < playList.length; index++) {
            if (selection != playList[index]) {
                forward++;
            } else {
                foundForward = true;
                break;
            }
        }
        if (!foundForward) {
            for (int index = 0; index < playList.length; index++) {
                if (selection != playList[index]){
                    forward++;
                }
                else {
                    break;
                }
            }
        }
        for (int index = startIndex; index > -1; index--) {
            if (selection != playList[index]) {
                backward++;
            } else {
                foundBackward = true;
                break;
            }
        }
        if (!foundBackward) {
            for (int index = playList.length - 1; index > -1; index--) {
                if (selection != playList[index]){
                    backward++;
                }
                else {
                    break;
                }
            }
        }
        if (forward < backward){
            return forward;
        }
        return backward;
    }
}
