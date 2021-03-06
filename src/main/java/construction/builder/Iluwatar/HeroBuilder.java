package construction.builder.Iluwatar;

import lombok.Getter;

@Getter
public class HeroBuilder {

    /**
     * The builder class.
     */
    private final Profession profession;
    private final String name;
    private HairType hairType;
    private HairColor hairColor;
    private Armor armor;
    private Weapon weapon;

    /**
     * Constructor
     */
    public HeroBuilder(Profession profession, String name) {
        if (profession == null || name == null) {
            throw new IllegalArgumentException("profession and name can not be null");
        }
        this.profession = profession;
        this.name = name;
    }

    public HeroBuilder withHairType(HairType hairType) {
        this.hairType = hairType;
        return this;
    }

    public HeroBuilder withHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    public HeroBuilder withArmor(Armor armor) {
        this.armor = armor;
        return this;
    }

    public HeroBuilder withWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    public Hero build() {
        return new Hero(this);
    }
}
