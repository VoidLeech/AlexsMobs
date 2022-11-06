package com.github.alexthe666.alexsmobs.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class StraddleJumpEnchantment extends StraddleEnchantment {

    protected StraddleJumpEnchantment(Rarity p_i46729_1_, EnchantmentCategory p_i46729_2_, EquipmentSlot... p_i46729_3_) {
        super(p_i46729_1_, p_i46729_2_, p_i46729_3_);
    }

    public int getMinCost(int p_77321_1_) {
        return 4 + (p_77321_1_ - 1) * 5;
    }

    public int getMaxCost(int p_223551_1_) {
        return super.getMinCost(p_223551_1_) + 10;
    }

    public int getMaxLevel() {
        return 3;
    }
}
