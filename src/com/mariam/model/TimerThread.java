package com.mariam.model;

public class TimerThread extends Thread {
    private int second;
    private int minute;

    public TimerThread(int second, int minute) {
        this.second = second;
        this.minute = minute;
    }

    @Override
    public void run() {
        if (second >= 60) {
            minute += second / 60;
            second = second % 60;
        }
        for (int j = minute; j >= 0; --j) {
            for (int i = (j == minute) ? second : 59; i >= 0; --i) {
                System.out.println(((j < 10) ? ("0" + j) : j)
                        + ":" + ((i < 10) ? ("0" + i) : i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }


}
