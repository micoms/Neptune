package dev.lrxh.neptune.game.arena.impl;

import dev.lrxh.neptune.game.arena.Arena;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Location;

@Getter
@Setter
public class SharedArena extends Arena {
    public SharedArena(String name, String displayName, Location redSpawn, Location blueSpawn, boolean enabled, int deathY) {
        super(name, displayName, redSpawn, blueSpawn, enabled, deathY);
    }

    public SharedArena(String name) {
        super(name, name, null, null, false, -68321);
    }
}
