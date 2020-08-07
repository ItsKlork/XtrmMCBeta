package net.xtrmmc.xtrmmcbeta.parkour;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ParkourPlayerHandler {

    private final Map<UUID, Integer> cpMap = new HashMap<>();

    private final Map<Integer, ArrayList<UUID>> cpPlayerMap = new HashMap<>();

    public void setCP(UUID playerUUID, int cp) {
        if (cpMap.containsKey(playerUUID)) {
            cpMap.replace(playerUUID, cp);
        } else if (!(cpMap.containsKey(playerUUID))) {
            cpMap.put(playerUUID, cp);
        }
    }

    public int getCP(UUID playerUUID) {
        return cpMap.getOrDefault(playerUUID, 0);
    }

    public void init() {
        cpPlayerMap.put(1, new ArrayList<>());
        cpPlayerMap.put(2, new ArrayList<>());
        cpPlayerMap.put(3, new ArrayList<>());
        cpPlayerMap.put(4, new ArrayList<>());
    }

    public void addPlayerToCP(UUID playerUUID, int cp) {
        if (!(cpPlayerMap.get(cp).contains(playerUUID))) {
            cpPlayerMap.get(cp).add(playerUUID);
        }
    }

    public int getPlayerPlaceInCP(UUID playerUUID, int cp) {
        if (cpPlayerMap.get(cp).contains(playerUUID)) {
            return ((cpPlayerMap.get(cp).indexOf(playerUUID)) + 1);
        }

        return 0;
    }

}
