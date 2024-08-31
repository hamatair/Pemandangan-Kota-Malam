import processing.core.PApplet;
import ddf.minim.*;
public class MySketch extends PApplet {
    int xs = -120, ys = 275, tes=60, awan1= 150,awan2=0,awan3=100,awan4=750;
    int kanan = (int)random(-200,500), kanan1 = kanan - (int) random(-100,500);
    int bawah = (int)random(-300, 100), bawah1 = bawah - (int) random(-200, 200);
    int bb = 100;
    AudioPlayer player;
    Minim minim;//audio context;
    public void settings(){
        size(1300, 750);
        minim = new Minim(this);
        player = minim.loadFile("jenengmu.mp3");
        player.play();
    }
    public void bintang(){
        fill(255,255,255);
        ellipse(10,bb+10,3,3);
        ellipse(200,bb+70,3,3);
        ellipse(345,bb-34,3,3);
        ellipse(704,bb-50,3,3);
        ellipse(920,bb+30,3,3);
        ellipse(1250,bb-10,3,3);

        ellipse(20,bb-25,3,3);
        ellipse(365,bb+50,3,3);
        ellipse(724,bb+25,3,3);
        ellipse(940,bb-70,3,3);
        ellipse(1270,bb+10,3,3);
        ellipse(1100,bb+23,3,3);
        ellipse(1070,bb-50,3,3);
        ellipse(1050,bb-90,3,3);
        stroke(222,242,158);

        if (bawah >= 500){
            kanan = (int) random(-500,500);
            bawah = (int) random(-500,-100);
        }
        if (bawah1 >= 400){
            kanan1 = (int) random(-300,500);
            bawah1 = (int) random(-500,-100);
        }

        line(kanan, bawah, kanan - 50, bawah - 50);
        line(kanan + 100, bawah + 25, kanan + 50, bawah - 25);
        line(kanan + 500, bawah - 20, kanan + 450, bawah - 70);
        line(kanan + 600, bawah + 30, kanan + 550, bawah - 20);
        line(kanan + 700, bawah - 10, kanan + 650, bawah - 60);

        line(kanan1 - 250, bawah1 - 70, kanan1 - 350, bawah1 - 170);
        line(kanan1 + 150, bawah1 + 55, kanan1 + 50, bawah1 - 45);
        line(kanan1 + 250, bawah1 - 95, kanan1 + 150, bawah1 - 195);
        line(kanan1 + 450, bawah1 - 150, kanan1 + 350, bawah1 - 250);
        line(kanan1 + 750, bawah1 - 130, kanan1 + 650, bawah1 - 230);

        kanan+=5;kanan1+=5;
        bawah+=5;bawah1+=5;
    }
    public void kota(){
        fill(3, 1, 0);
        rect(0,158, 102, 200);
        rect(104,236, 122, 122);
        rect(228,247, 200, 110);
        rect(430,132, 110, 225);
        rect(542,57, 120, 300);
        rect(664,226, 200, 130);
        rect(866,112, 134, 243);
        rect(1002,135, 121, 220);
        rect(1125,255, 221, 100);

        //rooftop
        fill(3, 1, 0);
        quad(0,158,24,134,78,134,102,158);
        quad(104,236,128,212,202,212,226,236);
        quad(228,247,252,225,404,225,428,247);
        triangle(430,132,485,65,540,132);
        rect(550,30, 105, 40);
        quad(664,226,688,202,840,202,864,226);
        rect(870,90,126,40);
        triangle(1002,135,1062,65,1123,135);
        quad(1125,255,1149,221,1300,221,1324,255);

        //window
        fill(247, 200, 12);
        rect(8,190,20,20);
        rect(75,190,20,20);
        rect(8,220,20,20);
        rect(43,250,20,20);
        rect(75,310,20,20);
        rect(110,310,20,20);
        rect(140,250,20,20);
        rect(170,280,20,20);
        rect(200,280,20,20);
        rect(235,285,20,20);
        rect(265,315,20,20);
        rect(295,315,20,20);
        rect(325,315,20,20);
        rect(355,285,20,20);
        rect(440,145,20,20);
        rect(440,205,20,20);
        rect(475,235,20,20);
        rect(510,265,20,20);
        rect(510,295,20,20);
        rect(550,95,20,20);
        rect(580,190,20,20);
        rect(605,220,20,20);
        rect(580,250,20,20);
        rect(670,235,20,20);
        rect(838,235,20,20);
        rect(808,295,20,20);
        rect(778,265,20,20);
        rect(873,120,20,20);
        rect(900,180,20,20);
        rect(923,210,20,20);
        rect(974,270,20,20);
        rect(1043,140,20,20);
        rect(1068,200,20,20);
        rect(1043,260,20,20);
        rect(1095,290,20,20);
        rect(1135,290,20,20);
        rect(1160,260,20,20);
        rect(1213,290,20,20);
        rect(1240,260,20,20);

        //pinggir air
        fill(0,0,0);
        rect(0,355,1400,40);

        //bayangan kota di air
        fill(0,0,0,70);
        rect(0,375, 102,100);
        quad(0,475,102,475,78,485,24,485);
        rect(104,375,122,70);
        quad(104,445,128,455,202,455,226,445);
        rect(228,375,200,65);
        quad(228,440,428,440,404,450,252,450);
        rect(430,375,110,120);
        triangle(430,495,540,495,485,520);
        rect(542,375,120,130);
        rect(550,505,105,15);
        rect(664,375,200,65);
        quad(664,440,864,440,840,450,688,450);
        rect(866,375,134,115);
        rect(870,490,126,15);
        rect(1002,375,121,110);
        triangle(1002,485,1062,515,1123,485);
        rect(1125,375,221,65);
        quad(1125,440,1149,450,1300,450,1324,440);
    }
    public void awan(){
        fill(255,255,255,25);
        if (awan1 >= 1300){
            awan1 = -150;
        }
        rect(awan1+=2,25,150,30);

        if (awan2 >= 1300){
            awan2 = -150;
        }
        rect(awan2+=2,100,150,30);

        if (awan3 <= -150){
            awan3 = 1300;
        }
        rect(awan3-=2,75,150,30);

        if (awan4 <= -150){
            awan4 = 1300;
        }
        rect(awan4-=2,75,150,30);
    }
    public void pagar(){
        for (int i = 0; i <=200; i+=2){
            fill(1,1,1,(float)235-i/10);
            rect(0,590+i,1300,2);
        }
        fill(0,0,0);
        for(int i = 20; i <= 1300; i+= 130){
            rect(i,580,40,20);
            rect(15 + i, 520, 8,60);
        }
        rect(0,520,1300,8);
        // lampu
        for (int i = 0; i<=1300; i += 530){
            fill(1,1,1);
            rect(i + 50, 610,50,20);
            rect(i + 55, 590,40,20);
            rect(i + 69, 440,12,150);
            stroke(0,0,0,100);
            fill(0,0,0,150);
            quad(i + 70, 450,i + 40,410,i + 110,410,i + 82,450);
            fill(1,1,1,155);
            quad(i + 45,410,i + 64,400,i + 90,400,i + 105,410);
            noStroke();
            fill(247, 200, 12);
            quad(i + 70,450,i + 45,410,i + 105,410,i + 82,450);
        }

    }
    public void malam(){
        //langit
        for (int i = 0; i <=400; i+=2){
            fill(6,(float)43-i/10,(float)150-i/2);
            rect(0,i,1400,200);
        }
        bintang();
        noStroke();

        //air
        for (int i = 0; i <= 280; i+=3){
            fill(5,(float) i/10,(float)i/3);
            rect(0,355+i,1400,100);
        }

        //bulan
        fill(255,255,255,170);
        ellipse(200,55,100,100);

        awan();

        kota();

        pagar();
    }
    public void draw(){
        background(5,0,37);
        malam();
        delay(100);
    }
    public static void main(String[] args){
        String judul = "Hello World";
        String[] processingArgs = {judul};
        MySketch mySketch = new MySketch();
        PApplet.runSketch(processingArgs, mySketch);
    }
}