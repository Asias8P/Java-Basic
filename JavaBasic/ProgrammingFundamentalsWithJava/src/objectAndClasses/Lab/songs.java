package objectAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class songs {

    static class Song {
        String typeList;
        String songName;
        String time;

        Song (String typeList, String songName, String time) {
            this.typeList = typeList;
            this.songName = songName;
            this.time = time;
        }

        public Song() {

        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getTypeList() {
            return typeList;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTime() {
            return time;
        }

        public void setSongName(String songName) {
            this.songName = songName;
        }

        public String getSongName() {
            return songName;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        List <Song> playList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] elements = in.nextLine().split("_");
            String type = elements[0];
            String name = elements[1];
            String time = elements[2];

            Song song = new Song();

            song.setTypeList(type);
            song.setSongName(name);
            song.setTime(time);

            playList.add(song);
        }

           String typeList = in.nextLine();

        if(typeList.equals("all")){
            for (Song song:playList) {
                System.out.println(song.getSongName());
            }

        }
        else {
            for (Song type: playList) {
                if(type.getTypeList().equals(typeList)){
                System.out.println(type.getSongName());}
            }
        }
    }
}
