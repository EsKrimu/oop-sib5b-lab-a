public class Player {
    int speed = 1;
    int x = 0;
    int y = 0;
    String nama = "Sarata";
    int health = 100;
    int attack = 2;
    int defense = 10;
    boolean firstSkill = true;
    boolean secondSkill = true;
    boolean ultimateSkill = true;

    public void getInfo(){
        System.out.println( " \nNamaplayer = " + nama + " \nSpeed = " + speed + " \nX = "+ x + "\nY = " + y + " \nHealth = " + health + " \nAttack = " + attack + " \nDefense = " + defense + " \nFirstskill = " + firstSkill + " \nSecondskill = " + secondSkill + " \nUltimateskill = " + ultimateSkill);
    }
    public void nopal(){
        System.out.println("Aku nopal");
    }

    public void moveRight(){
        x = x + speed;
        System.out.println(nama + " bergerak ke kanan" + " \nX = " + x);
    }

    public void moveLeft(){
        x = x - speed;
        System.out.println(nama + " bergerak ke kiri" + " \nX = " + x);
    }

    public void moveUp(){
        y = y + speed;
        System.out.println(nama + " bergerak ke atas"+ " \nY = " + y);
    }

    public void moveDown(){
        y = y - speed;
        System.out.println(nama + " bergerak ke bawah" + " \nY = " + y);
    }
    
    public void getDamage(){
        health = health - 2;
        defense = defense - 1;
        System.out.println(nama + " terkena damage" + " \nDamage = 2" );
        System.out.println( "Sisa darah "  + nama + " \nHealth = " + health );
        System.out.println(nama + " terkena damage" + " \nDamage = 1" );
        System.out.println( "Sisa defense " + nama + " \nDefense = " + defense);
    }

    public void getPower(){
        attack = attack + 5;
        System.out.println(nama + " mendapatkan power" + " \nPower = " + attack);
    }
    
    public void attack(){
        System.out.println(nama + " memberi damage" + " \nDamage = "+ attack);
   }

    public void dash(){
        speed = 5;
        System.out.println(nama + " Ngedash \nSpeed = " + speed);
    }
    public void isDead(int health){
        this.health = this.health - health;
        if (this.health == 0){
            System.out.println(nama + " Mati Total");
        }
        else{
            System.out.println(nama + " Masih hidup");
        }
    }

    public void isRespawn(int health){
        this.health = 0;
        this.health = this.health + health;
        if (this.health == 100){
            System.out.println(nama + " Hidup kembali");
        }
        else{
            System.out.println(nama + " Masih mati total");
        }
    }

    public void firstSkill(int attack){
        this.attack = attack;
        if (firstSkill == false){
            System.out.println("Skill 1 masih cooldown");
        }
        else{
            System.out.println("Skill 1 digunakan");
            System.out.println("Damage = " + this.attack);
        }
    }

    public void secondSkill(int attack){
        this.attack = attack;
        if (secondSkill == false){
            System.out.println("Skill 2 masih cooldown");
        }
        else{
            System.out.println("Skill 2 digunakan");
            System.out.println("Damage = " + this.attack);
        }
    }

    public void ultimateSkill(int attack){
        this.attack = attack;
        if (ultimateSkill == false){
            System.out.println("Ultimate Skill masih cooldown");
        }
        else{
            System.out.println("Ultimate Skill digunakan");
            System.out.println("Damage = " + this.attack);
        }
    }

}
