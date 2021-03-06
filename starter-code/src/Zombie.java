/**
 * Created by drewmahrt on 4/27/16.
 */

//TODO: Make Skeleton a subclass of monster, and implement the aboutMe method.
//Example output of the aboutMe method: "I am a Zombie with 4 health and do 10 damage!"

public class Zombie extends Monster {

    public Zombie(int mHealth, int mDamage) {
        super(mHealth, mDamage);
    }

    @Override
    public String aboutMe() {
        return "I am an Undead Zombie with " + getHealth() + "HP, and hit for " + getDamage() + " damage";
    }

}
