

package mage.server.game;

import mage.constants.RangeOfInfluence;
import mage.players.Player;
import mage.players.PlayerType;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.util.EnumMap;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

/**
 * @author BetaSteward_at_googlemail.com
 */
public enum PlayerFactory {

    instance;
    private static final Logger logger = Logger.getLogger(PlayerFactory.class);

    private final EnumMap<PlayerType, Class> playerTypes = new EnumMap<>(PlayerType.class);


    public Optional<Player> createPlayer(PlayerType playerType, String name, RangeOfInfluence range, int skill) {
        try {
            Class playerTypeClass = playerTypes.get(playerType);
            if (playerTypeClass != null) {
                UUID playerId = null;
                try {
                    BufferedReader buf = new BufferedReader(new FileReader("./gameState.sav.uuid"));
                    String line = null;
                    while ((line = buf.readLine()) != null) {
                        String split[] = line.split("\t");
                        if (split[1].equals(name)) {
                             playerId = UUID.fromString(split[0]);
                            break;
                        }
                    }
                    buf.close();
                } catch(Exception e) {
                }


                if (playerId == null) {
                    Constructor<?> con = playerTypeClass.getConstructor(String.class, RangeOfInfluence.class, int.class);
                    Player player = (Player) con.newInstance(name, range, skill);
                    logger.debug("Player created: " + name + " - " + player.getId());
                    return Optional.of(player);
                } else {
                    Constructor<?> con = playerTypeClass.getConstructor(String.class, RangeOfInfluence.class, int.class, UUID.class);
                    logger.info("Creating player with id: " + playerId.toString());
                    Player player = (Player) con.newInstance(name, range, skill, playerId);
                    logger.info("Player created: " + name + " - " + player.getId());
                    return Optional.of(player);
                }

            } else {
                logger.fatal("Unknown player type: " + playerType);
            }
        } catch (Exception ex) {
            logger.fatal("PlayerFactory error ", ex);
        }
        return Optional.empty();
    }

    public Set<PlayerType> getPlayerTypes() {
        return playerTypes.keySet();
    }

    public void addPlayerType(String name, Class playerType) {
        PlayerType type = PlayerType.getByDescription(name);
        if (type != null) {
            if (playerType != null) {
                this.playerTypes.put(type, playerType);
            }
        }
    }

}
