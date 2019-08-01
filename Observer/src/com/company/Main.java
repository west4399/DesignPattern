package com.company;
public class Main {
    public static void main(String[] args) {
        Suuchi s = new Suuchi();
        Hyouji o1 = new NishinHyouji();
        Hyouji o2 = new JyuurokushinHyouji();

        int i = 0;
        while (i < 100) {
            i += (int)(Math.random() * 30) - 10;
            if ( i > s.getValue() ) {
                s.setValue(i);
                o1.print(s.getValue());
                o2.print(s.getValue());
            }
            else {
                System.out.println("更新してません");
            }
        }
    }
}

abstract class Hyouji {
    abstract public void print(int n);
}

class Suuchi {
    int atai;

    public void setValue(int atai) {
        this.atai = atai;
    }

    public int getValue() {
        return atai;
    }
}

class NishinHyouji extends Hyouji {
    public void print(int n) {
        System.out.println(n + "を2進数表示します");
        //
        // ここに2進数変換処理と表示処理を作成する
        //
    }
}

class JyuurokushinHyouji extends Hyouji {
    public void print(int n) {
        System.out.println(n + "を 16 進数表示します");
        //
        // ここに 16 進数変換処理と表示処理を作成する
        //
    }
}
