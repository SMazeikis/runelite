package net.runelite.client.plugins.playerlogout;

import com.google.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.events.PlayerSpawned;
import net.runelite.api.Client;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.WorldService;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.util.WorldUtil;
import net.runelite.http.api.worlds.World;
import net.runelite.http.api.worlds.WorldResult;

@Slf4j
@PluginDescriptor(
        name = "MyFirstPlugin",
        description = "My first plugin"
)
public class PlayerLogOut extends Plugin{

    @Inject
    private Client client;

    @Inject
    private WorldService worldService;

    private net.runelite.api.World quickHopTargetWorld;
    private int displaySwitcherAttempts = 0;

    @Subscribe
    public void onPlayerSpawned(PlayerSpawned spawned){
        System.out.println("wow");

        // Creates a world and hops the player to specified world.
        /*int worldId = 335;

        WorldResult worldResult = worldService.getWorlds();
        // Don't try to hop if the world doesn't exist
        World world = worldResult.findWorld(worldId);

        final net.runelite.api.World rsWorld = client.createWorld();
        rsWorld.setActivity(world.getActivity());
        rsWorld.setAddress(world.getAddress());
        rsWorld.setId(world.getId());
        rsWorld.setPlayerCount(world.getPlayers());
        rsWorld.setLocation(world.getLocation());
        rsWorld.setTypes(WorldUtil.toWorldTypes(world.getTypes()));

        quickHopTargetWorld = rsWorld;
        displaySwitcherAttempts = 0;

        client.hopToWorld(quickHopTargetWorld);*/
    }

}
