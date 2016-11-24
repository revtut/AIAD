package aiad.feup.models;

/**
 * Player possible states
 */
public enum PlayerState {

    /**
     * Waiting for new instructions
     */
    IDDLE,

    /**
     * Started negotiating
     */
    START_NEGOTIATION,

    /**
     * Ended negotiating
     */
    END_NEGOTIATION,

    /**
     * Started auctioning
     */
    START_AUCTION,

    /**
     * Ended auctioning
     */
    END_AUCTION
}
