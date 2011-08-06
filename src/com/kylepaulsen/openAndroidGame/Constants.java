/* Constants.java - Class for random game constants.
 * 
 * Copyright © 2011 Open-Android-Game Group
 * Please see the file COPYING in this
 * distribution for license terms.
 */

package com.kylepaulsen.openAndroidGame;

public final class Constants {
	//Window height and width get set in MainActivity.
	public static int WINDOW_HEIGHT;
	public static int WINDOW_WIDTH;
	
	//Base Game Constants
	public final static int GAME_TARGET_FPS = 20;
	//World Region Size
	public final static int WORLD_SIZE = 200;
	//World Tile Size
	public final static int WORLD_TILE_SIZE = 32;
	//Camera Default Move Speed
	public final static int DEFAULT_CAM_MOVE_SPEED = 1;
	
	//Player Constants
	public final static int PLAYER_BOUNDING_BOX_RADIUS = 15;
	
	//World Tile Constants
	public final static int TILE_GRASS_ID = 0;
	public final static int TILE_DIRT_ID = 1;
	public final static int TILE_SAND_ID = 2;
	public final static int TILE_WATER_ID = 3;
}
