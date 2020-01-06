/**
 * The MIT License
 * Copyright (c) 2014 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package construction.builder.Iluwatar;

/**
 * 
 * Hero, the class with many parameters.
 * 
 */
public final class Hero {

  private final Profession profession;
  private final String name;
  private final HairType hairType;
  private final HairColor hairColor;
  private final Armor armor;
  private final Weapon weapon;

  Hero(HeroBuilder builder) {
    this.profession = builder.getProfession();
    this.name = builder.getName();
    this.hairColor = builder.getHairColor();
    this.hairType = builder.getHairType();
    this.weapon = builder.getWeapon();
    this.armor = builder.getArmor();
  }

  public Profession getProfession() {
    return profession;
  }

  public String getName() {
    return name;
  }

  public HairType getHairType() {
    return hairType;
  }

  public HairColor getHairColor() {
    return hairColor;
  }

  public Armor getArmor() {
    return armor;
  }

  public Weapon getWeapon() {
    return weapon;
  }

  @Override
  public String toString() {

    StringBuilder sb = new StringBuilder();
    sb.append("This is a ")
            .append(profession)
            .append(" named ")
            .append(name);
    if (hairColor != null || hairType != null) {
      sb.append(" with ");
      if (hairColor != null) {
        sb.append(hairColor).append(' ');
      }
      if (hairType != null) {
        sb.append(hairType).append(' ');
      }
      sb.append(hairType != HairType.BALD ? "hair" : "head");
    }
    if (armor != null) {
      sb.append(" wearing ").append(armor);
    }
    if (weapon != null) {
      sb.append(" and wielding a ").append(weapon);
    }
    sb.append('.');
    return sb.toString();
  }
}
