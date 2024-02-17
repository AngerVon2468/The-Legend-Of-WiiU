package net.mavity.the_legend_of_wiiu.util.datagen.glm;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.mavity.the_legend_of_wiiu.item.ModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;

import javax.annotation.Nonnull;
import java.util.Random;
import java.util.function.Supplier;

public class RupeeModifier extends LootModifier {
    private static final Random random = new Random();

    //this counts from zero and will generate a range of zero to one digit below the integer (30)
    int chance = random.nextInt(31);

    public static final Supplier<Codec<RupeeModifier>> CODEC = Suppliers.memoize(() ->
            RecordCodecBuilder.create(inst -> codecStart(inst)
                    .apply(inst, RupeeModifier::new)));

    protected RupeeModifier(LootItemCondition[] conditionsIn) {
        super(conditionsIn);
    }

    @Nonnull
    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        ItemStack green_rupee = ModItems.GREEN_RUPEE.get().getDefaultInstance();
        ItemStack blue_rupee = ModItems.BLUE_RUPEE.get().getDefaultInstance();
        ItemStack red_rupee = ModItems.RED_RUPEE.get().getDefaultInstance();
        if(chance >= 0 && chance <= 10) {
            generatedLoot.add(green_rupee);
        }
        if(chance >= 11 && chance <= 20) {
            generatedLoot.add(blue_rupee);
        }
        if(chance >= 21 && chance <= 25) {
            generatedLoot.add(red_rupee);
        }
        return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }

}