package main;

import lombok.Data;

@Data //dodaje gettery i settery
public class PlatformBuilder {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    //obsługa buildera
    private PlatformBuilder(Builder builder){
        this.x1 = builder.x1;
        this.y1 = builder.y1;
        this.x2 = builder.x2;
        this.y2 = builder.y2;

    }

    //klasa buildera
    public static class Builder {
        private int x1 = 0; //nie wiem czy deklarowanie wartości jest konieczne
        private int y1 = 0;
        private int x2 = 0;
        private int y2 = 0;

        public Builder x1(int x1) {
            this.x1 = x1;
            return this;
        }

        public Builder y1(int y1) {
            this.y1 = y1;
            return this;
        }

        public Builder x2(int x2) {
            this.x2 = x2;
            return this;
        }

        public Builder y2(int y2) {
            this.y2 = y2;
            return this;
        }
        public PlatformBuilder build (){
            return  new PlatformBuilder(this);
        }
    }



}
