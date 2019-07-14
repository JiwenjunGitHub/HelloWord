package com.jwj.pojo;

/**
 * Created by Administrator on 2019/7/14.
 */
public class Jiwenjun {
    int hign;
    int weight;
    String love;
    String work;

    public int getHign() {
        return hign;
    }

    public void setHign(int hign) {
        this.hign = hign;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Jiwenjun(int hign, int weight, String love, String work) {
        this.hign = hign;
        this.weight = weight;
        this.love = love;
        this.work = work;
    }
}
