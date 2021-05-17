package Lesson_1;

public class Main {
    public static void main(String[] args) {
        Lesson_1.JumpableRunnable[] members = {
                new Lesson_1.Human(2, 2, "Vasya"),
                new Lesson_1.Human(1, 2, "Maria"),
                new Lesson_1.Cat(3, 4, "MegaCat"),
                new Lesson_1.Cat(1, 1, "Mashka"),
                new Lesson_1.Robot(0, 10, 10),
                new Lesson_1.Robot(4,7,12)
        };

        Lesson_1.Obstaclable[] obstacles = {
                new Lesson_1.RunningTrack(1),
                new Lesson_1.RunningTrack(4),
                new Lesson_1.Wall(1),
                new Lesson_1.Wall(3)
        };

        for (Lesson_1.JumpableRunnable member : members) {
            System.out.println("К прохождению препятствий приступает " + member);
            boolean winner = true;
            for (Lesson_1.Obstaclable obstacle : obstacles) {
                System.out.println(member + " пробует пройти " + obstacle);
                if (obstacle.toJump(member.getMaxHeight()) ||
                        obstacle.toRun(member.getMaxLength())) {
                    System.out.println("И у него получается!");
                } else {
                    winner = false;
                    System.out.println("И у него не получается.");
                    break;
                }
            }

            if(winner) {
                System.out.println(member + " прошёл дистанцию!");
            } else {
                System.out.println(member + " проиграл.");
            }
            System.out.println();
        }
    }
}
