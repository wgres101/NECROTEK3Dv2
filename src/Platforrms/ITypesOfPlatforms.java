package Platforrms;

public interface ITypesOfPlatforms {
/*
 * Types of platforms
Platforms will have custom properties that I can add in Gleed 2D. I will be using the primitive rectangles in Gleed 2D for collision platforms on one layer. On a separate layer, I will place graphics, which only are for looks. I will change the color of the primitive rectangles for each type of platform to make it easier for me to know which is which.

Standard platforms
This will make up majority of a level. They are walls, floors, etc. Player cannot fall through them or jump up through them. (Grey primitive)

Special Collisions
They tell enemies to turn around when enemy runs into them. (Blue primitive)

Yellow platforms
Player can stand, run, land on them when player is yellow. When player is red, they fall through yellow platforms. This means that when player is red, they can jump up and through yellow platforms. (Yellow primitive)

Red platforms
Same as yellow but for red. (Red primitives)

If possible, it would be nice to have alternating platforms, platforms that alternate between yellow and red every so many seconds.

Breakable platform
The graphic that goes over these will look cracked, hinting to the player than they can be broken. To break a platform, you must do a head stomp move. Once you collide with breakable platform doing the head stomp move, you fall through it and the breaking animation plays.

Deadly spikes
This will be a platform that kills player upon touching it.

Animated spikes
Where ever I place these platforms, it will play an animated set of spikes that move back and forth. Basically, they are deadly platforms on paths.

Music Collisions
These will have custom properties for song loops. Each song loop will have a name, and that name will be the name of the custom property to be used in Gleed. So basically, when player crosses this collision, it tells the song loop playing to stop, and then to play new song loop. So say song loop A is playing, and player passes through collision with custom property "song loop B." Then song loop A will stop playing, and song loop B will start playing.

Moving platforms PATHS
They can be Stardard or Yellow or Red platforms, but they follow a path. For paths I will use the Gleed primitive designed for paths. There will be different types of paths, and thus will have custom properties. One custom property will be Boolean. True or false. "Loop." If "loop" is true, then the platform or enemy will continue to follow the path around and around. If "loop" is false, then the platform or enemy will only go around it once and then follow its normal function. There will also be "bounce." Bounce will tell the platform to move back and forth along the path. A--------------B  So if this were a path set to bounce, then the platform would go to A then bounce off A and go to B, then bounce off B and go back to A, etc. There will be one more type of property for paths, "Warp." This will make it so that after a platform makes it to A, it then vanishes and warps to B, then moves toward A again. Upon reaching A, it repeats the warp process.

I will need a custom property for the platforms or the paths "speed," which ever is easier. This way I can put in a value to control how fast the platform moves along the path.

Game elements
As mentioned before, I will need turrets that shoot bullets based on the custom properties I will assign in Gleed. So a turret will have the same properties as star throwers. "projectile speed," and "projectile rate." Some turrets will also be on paths.

Besides turrets, I will need laser zappers. Basically, they will be virtual or horizontal A----------B The laser will form between point A and B, blocking Players path. So play must time when to jump through, dash through, etc. These are pretty standard in platformers like Kim Possible 2.

Types of platforms
Platforms will have custom properties that I can add in Gleed 2D. I will be using the primitive rectangles in Gleed 2D for collision platforms on one layer. On a separate layer, I will place graphics, which only are for looks. I will change the color of the primitive rectangles for each type of platform to make it easier for me to know which is which.

Standard platforms
This will make up majority of a level. They are walls, floors, etc. Player cannot fall through them or jump up through them. (Grey primitive)

Special Collisions
They tell enemies to turn around when enemy runs into them. (Blue primitive)

Yellow platforms
Player can stand, run, land on them when player is yellow. When player is red, they fall through yellow platforms. This means that when player is red, they can jump up and through yellow platforms. (Yellow primitive)

Red platforms
Same as yellow but for red. (Red primitives)

If possible, it would be nice to have alternating platforms, platforms that alternate between yellow and red every so many seconds.

Breakable platform
The graphic that goes over these will look cracked, hinting to the player than they can be broken. To break a platform, you must do a head stomp move. Once you collide with breakable platform doing the head stomp move, you fall through it and the breaking animation plays.

Deadly spikes
This will be a platform that kills player upon touching it.

Animated spikes
Where ever I place these platforms, it will play an animated set of spikes that move back and forth. Basically, they are deadly platforms on paths.

Music Collisions
These will have custom properties for song loops. Each song loop will have a name, and that name will be the name of the custom property to be used in Gleed. So basically, when player crosses this collision, it tells the song loop playing to stop, and then to play new song loop. So say song loop A is playing, and player passes through collision with custom property "song loop B." Then song loop A will stop playing, and song loop B will start playing.

Moving platforms PATHS
They can be Stardard or Yellow or Red platforms, but they follow a path. For paths I will use the Gleed primitive designed for paths. There will be different types of paths, and thus will have custom properties. One custom property will be Boolean. True or false. "Loop." If "loop" is true, then the platform or enemy will continue to follow the path around and around. If "loop" is false, then the platform or enemy will only go around it once and then follow its normal function. There will also be "bounce." Bounce will tell the platform to move back and forth along the path. A--------------B  So if this were a path set to bounce, then the platform would go to A then bounce off A and go to B, then bounce off B and go back to A, etc. There will be one more type of property for paths, "Warp." This will make it so that after a platform makes it to A, it then vanishes and warps to B, then moves toward A again. Upon reaching A, it repeats the warp process.

I will need a custom property for the platforms or the paths "speed," which ever is easier. This way I can put in a value to control how fast the platform moves along the path.

Game elements
As mentioned before, I will need turrets that shoot bullets based on the custom properties I will assign in Gleed. So a turret will have the same properties as star throwers. "projectile speed," and "projectile rate." Some turrets will also be on paths.

Besides turrets, I will need laser zappers. Basically, they will be virtual or horizontal A----------B The laser will form between point A and B, blocking Players path. So play must time when to jump through, dash through, etc. These are pretty standard in platformers like Kim Possible 2.


 */
}
