//package com.javarush.task.task27.task2712.ad;
//
//public class Advertisement {
//
//    private Object content;
//    private String name;
//    private long initialAmount;
//    private int hits;
//    private int duration;
//    private long amountPerOneDisplaying;
//
//    public Advertisement(Object content, String name, long initialAmount, int hits, int duration) {
//        this.content = content;
//        this.name = name;
//        this.initialAmount = initialAmount;
//        this.hits = hits;
//        this.duration = duration;
//        amountPerOneDisplaying = hits > 0 ? initialAmount / hits : 0;;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getDuration() {
//        return duration;
//    }
//
//    public long getAmountPerOneDisplaying() {
//        return amountPerOneDisplaying;
//    }
//
//    public void revalidate(){
//        if (!(hits>0)) throw new UnsupportedOperationException();
//        hits--;
//    }
//
//    public int getHits() {
//        return hits;
//    }
//}

package com.javarush.task.task27.task2712.ad;

public class Advertisement {
    private Object content; //видео
    private String name;
    private long initialAmount; //начальная сумма, стоимость рекламы в копейках
    private int hits; // количество показов
    private int duration; // продолжительность в секундах

    private long amountPerOneDisplaying; // стоимость одного показа рекламного объявления в копейках

    public Advertisement(Object content, String name, long initialAmount, int hits, int duration) {
        this.content = content;
        this.name = name;
        this.initialAmount = initialAmount;
        this.hits = hits;
        this.duration = duration;

        this.amountPerOneDisplaying = initialAmount / hits;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public int getHits() {
        return hits;
    }

    public long getAmountPerOneDisplaying() {
        return amountPerOneDisplaying;
    }

    public void revalidate() {
        if (hits <= 0) {
            throw new UnsupportedOperationException();
            //throw new NoVideoAvailableException();
        }
        hits--;
    }
}