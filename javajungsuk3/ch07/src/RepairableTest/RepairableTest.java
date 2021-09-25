package RepairableTest;

class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();
        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);
        scv.repair(dropship);
//        scv.repair(marine); // 에러. repair(Repairable) in SCV cannot be applied to (Marine)
    }
}

interface Repairable { }

class Unit {
    int hitpoint;
    final int MAX_HP;
    Unit(int hp) {
        MAX_HP = hp;
    }
    // ...
}

class GroundUnit extends Unit {
    GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends Unit {
    AirUnit(int hp) {
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(150); // Tank의 HP는 150이다.
        hitpoint = MAX_HP;
    }

    public String toString() {
        return "Tank";
    }
    // ...
}

class Dropship extends AirUnit implements Repairable {
    Dropship() {
        super(125); // Dropship의 HP는 125이다.
        hitpoint = MAX_HP;
    }

    public String toString() {
        return "Dropship";
    }
    // ...
}

class Marine extends GroundUnit {
    Marine() {
        super(40);
        hitpoint = MAX_HP;
    }
    // ...
}

class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitpoint = MAX_HP;
    }

    void repair(Repairable r) {
        if(r instanceof Unit) {
            Unit u = (Unit)r;
            while(u.hitpoint != u.MAX_HP) {
                /* Unit의 HP를 증가시킨다. */
                u.hitpoint++;
            }
            System.out.println(u.toString()+"의 수리가 끝났습니다.");
        }
    }
    // ...
}