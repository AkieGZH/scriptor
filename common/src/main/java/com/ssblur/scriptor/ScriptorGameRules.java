package com.ssblur.scriptor;

import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.GameRules.Category;
import net.minecraft.world.level.GameRules.IntegerValue;
import net.minecraft.world.level.GameRules.Key;

public class ScriptorGameRules {
  public static Key<IntegerValue> TOME_MAX_COST;
  public static Key<IntegerValue> CHALK_MAX_COST;
  public static Key<IntegerValue> VOCAL_MAX_COST;
  public static Key<IntegerValue> VOCAL_HUNGER_THRESHOLD;
  public static Key<IntegerValue> VOCAL_DAMAGE_THRESHOLD;
  public static Key<IntegerValue> VOCAL_COOLDOWN_MULTIPLIER;
  public static Key<IntegerValue> TOME_COOLDOWN_MULTIPLIER;
  public static Key<IntegerValue> CASTING_LECTERN_COOLDOWN_MULTIPLIER;	

  public static void register() {
    TOME_MAX_COST = GameRules.register("scriptor:tome_max_cost", Category.MISC, IntegerValue.create(50));
    CHALK_MAX_COST = GameRules.register("scriptor:chalk_max_cost", Category.MISC, IntegerValue.create(200));
    VOCAL_MAX_COST = GameRules.register("scriptor:vocal_max_cost", Category.MISC, IntegerValue.create(-1));
    VOCAL_HUNGER_THRESHOLD = GameRules.register("scriptor:vocal_hunger_threshold", Category.MISC, IntegerValue.create(50));
    VOCAL_DAMAGE_THRESHOLD = GameRules.register("scriptor:vocal_damage_threshold", Category.MISC, IntegerValue.create(75));
    VOCAL_COOLDOWN_MULTIPLIER = GameRules.register("scriptor:vocal_cooldown_multiplier", Category.MISC, IntegerValue.create(100));
    TOME_COOLDOWN_MULTIPLIER = GameRules.register("scriptor:tome_cooldown_multiplier", Category.MISC, IntegerValue.create(100));
    CASTING_LECTERN_COOLDOWN_MULTIPLIER = GameRules.register("scriptor:casting_lectern_cooldown_multiplier", Category.MISC, IntegerValue.create(100));
  }
}
