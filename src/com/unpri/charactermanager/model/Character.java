
package com.unpri.charactermanager.model;

/**
 * Merepresentasikan satu karakter dalam aplikasi Character Manager.
 * Menerapkan prinsip Encapsulation.
 */
public class Character {

    // ===== ATRIBUT PRIVATE =====
    private int id;
    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attackPower;
    private int mana;

    // ===== CONSTRUCTOR 1: KARAKTER BARU =====
    public Character(String name, CharacterType type, int level) {
        this.name = name;
        this.type = type;
        setLevel(level);
    }

    // ===== CONSTRUCTOR 2: MEMUAT DATA KARAKTER =====
    public Character(int id, String name, CharacterType type,
                     int level, int hitPoints, int attackPower) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.level = level;
        this.hitPoints = hitPoints;
        this.attackPower = attackPower;
    }

    // ===== HELPER METHOD =====
    private int calculateBaseHP() {
        return 100 + (level * 10);
    }

    private int calculateBaseAttack() {
        return 10 + (level * 5);
    }

    // ===== GETTER =====
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CharacterType getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getMana() {
        return mana;
    }

    // ===== SETTER =====
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    public void setLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException(
                "Level minimal adalah 1"
            );
        }

        this.level = level;
        this.hitPoints = calculateBaseHP();
        this.attackPower = calculateBaseAttack();
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    // ===== MINI-CHALLENGE: MANA =====
    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException(
                "Mana tidak boleh negatif"
            );
        }

        this.mana = mana;
    }

    // ===== MINI-CHALLENGE: IS ALIVE =====
    public boolean isAlive() {
        return hitPoints > 0;
    }

    // ===== TOSTRING =====
    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", level=" + level +
                ", hp=" + hitPoints +
                ", atk=" + attackPower +
                ", mana=" + mana +
                '}';
    }
}
