package ObjectsBasicsMandatory;

import java.util.Scanner;

public class ClockDemo {
    public static class Clock {
        int seconds, minutes, hours;

        Clock() {
            hours = 12;
            minutes = 0;
            seconds = 0;
        }

        Clock(int seconds, int minutes, int hours) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;

        }

        Clock(int seconds) {
            this.seconds = seconds;
        }

        public Clock setClock(int seconds) {
            if (seconds == 0) {
                minutes = 0;
                hours = 0;
                this.seconds = 0;
                Clock MyClock = new Clock(this.hours, this.minutes, this.seconds);
                return MyClock;
            } else {
                hours = (seconds / 3600);
                minutes = (seconds - hours * 3600) / 60;
                this.seconds = seconds - hours * 3600 - minutes * 60;
                Clock MyClock = new Clock(this.hours, this.minutes, this.seconds);
                return MyClock;
            }
        }

        public Clock tick() {
            seconds++;
            if (seconds > 59) {
                minutes++;
                seconds = 0;

            }
            if (minutes > 59) {
                hours++;
                minutes = 0;
            }
            if (hours > 23) {
                hours = 0;
            }
            int s = seconds + (minutes * 60) + (hours * 3600);
            return setClock(s);

        }

        public Clock tickdown() {
            this.seconds--;
            if (seconds < 0) {
                minutes--;
                seconds = 59;
            }
            if (minutes < 0) {
                hours--;
                minutes = 59;

            }
            if (hours < 0) {
                hours = 23;
            }
            int s = seconds + (minutes * 60) + (hours * 3600);
            return setClock(s);
        }

        public boolean time_pattern(int seconds, int minutes, int hours) {
            if (seconds < 0 || seconds > 59) {
                return false;
            } else if (minutes < 0 || minutes > 59) {
                return false;
            } else if (hours < 0 || hours > 23) {
                return false;
            } else {
                return true;
            }
        }

        public boolean time_patternSeconds(int seconds) {
            if (seconds < 0 || seconds > 86399) {
                return false;

            } else {
                return true;
            }
        }

        public Clock subtractClock(Clock clock) {
            int s = Math.abs(hours * 3600 + minutes * 60 + seconds);
            seconds = seconds - Math.abs(clock.seconds);
            minutes = minutes - Math.abs(clock.minutes);
            hours = hours - Math.abs(clock.hours);
            int min = 0;
            if (s == min) {
                return setClock(0);
            } else {
                return setClock(s);
            }
        }

        public Clock addClock(Clock clock) {
            int lim = 86400;
            seconds = seconds + clock.seconds;
            minutes = minutes + clock.minutes;
            hours = hours + clock.hours;
            int s = hours * 3600 + minutes * 60 + seconds;
            if (s < lim) {
                return setClock(s);


            } else {
                return setClock(0);

            }


        }

        public static void main(String[] args) {
            System.out.println("Enter a time in seconds: ");
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            Clock firstclock = new Clock(s);
            if (firstclock.time_patternSeconds(s) == true) {
                firstclock.setClock(s);
                System.out.println("Time one is: " + firstclock.hours + ":" + firstclock.minutes + ":" + firstclock.seconds);
                System.out.println("Let's start ticking....");
                for (int i = 0; i < 5; i++) {
                    firstclock.tick();
                    System.out.println("Now our time is: " + firstclock.hours + ":" + firstclock.minutes + ":" + firstclock.seconds);

                }
            } else {
                System.out.println("ERROR");
            }
            System.out.println("Enter a three parameters now");
            System.out.println("Enter a hours");
            int hour = sc.nextInt();
            System.out.println("Enter a minute");
            int min = sc.nextInt();
            System.out.println("Enter a second");
            int sec = sc.nextInt();
            Clock secondclock = new Clock(hour,min,sec);
            if (secondclock.time_pattern(hour,min,sec)==true){
                System.out.println("Time is: " + secondclock.hours +":" +secondclock.minutes + ":" + secondclock.seconds);
                System.out.println("Let's start countdown...");
                for (int i =0;i<5;i++){
                    secondclock.tickdown();
                    System.out.println("Time before Explore!"+ secondclock.hours +":" +secondclock.minutes + ":" + secondclock.seconds);
                }

            }
            else {
                System.out.println("Wrong code");
            }
            System.out.println("Now Let's do a Add of our two times");
            firstclock.addClock(secondclock);
            System.out.println("Now our tine is: " + firstclock.hours + ":" + firstclock.minutes + ":" + firstclock.seconds);
            System.out.println();
            System.out.println("So we have: "+ firstclock.hours + ":" + firstclock.minutes + ":" + firstclock.seconds);
            System.out.println("And also we have: " + secondclock.hours +":" +secondclock.minutes + ":" + secondclock.seconds);
            System.out.println("Here is a difference ");
            firstclock.subtractClock(secondclock);
            System.out.println(firstclock.minutes + ":" + firstclock.seconds);


        }

    }
}
