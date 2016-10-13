package aiad.feup.agent;

import aiad.feup.core.Company;

import java.util.*;

/**
 * The player super class.
 * Holds information common to all players
 */
public abstract class Player {

    /**
     * Name of the player
     */
    private final String name;

    /**
     * Money of the player
     */
    private int money;

    /**
     * Companies owned by the player
     */
    private final List<Company> companies;

    /**
     * Constructor of Player
     * @param name name of the player
     * @param money money of the player
     */
    public Player(final String name, final int money) {
        this.name = name;
        this.money = money;
        this.companies = new ArrayList<>();
    }

    /**
     * Get the name of the player
     * @return name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * Get the current money of the player
     * @return current money of the player
     */
    public int getMoney() {
        return money;
    }

    /**
     * Add money to the player
     * @param money quantity to be added
     */
    public void addMoney(final int money) {
        this.money += money;
    }

