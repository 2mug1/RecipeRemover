package net.iamtakagi.reciperemover;

import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.Recipe;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.Iterator;
import java.util.List;

public class RecipeRemover extends JavaPlugin {

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        YamlConfiguration config =  YamlConfiguration.loadConfiguration(new File( this.getDataFolder() + File.separator + "config.yml"));
        List<String> materials = config.getStringList("materials");
        materials.forEach(m -> {
            Material material = Material.getMaterial(m, true);
            if(material == null) {
                this.getLogger().info("存在しない org.bukkit.Material です: Material." + m);
                return;
            }
            removeCrafting(material);
            this.getLogger().info("クラフトが不可になりました: Material." + m);
        });
    }

    private void removeCrafting(Material material) {
        Iterator<Recipe> iterator = getServer().recipeIterator();

        while (iterator.hasNext()) {
            Recipe recipe = iterator.next();

            if (recipe != null && recipe.getResult().getType() == material) {
                iterator.remove();
            }
        }
    }
}