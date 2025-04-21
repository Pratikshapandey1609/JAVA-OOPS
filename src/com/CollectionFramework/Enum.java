package com.CollectionFramework;

public class Enum {
    enum Week {
        Monday , Tuesday , Wednesday , Thursday , Friday , Saturday , Sunday;
        // these are enum  constant
        // public Static Final
        // since its final you can create a child enums
        // type is where these are declared  week

        public static void main(String[] args) {
            Week week  ;
            week = Week.Monday;

        }
    }
}
