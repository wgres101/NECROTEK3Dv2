pack	age GameMap;

public interface IProceduralWorld {

	//World is both linear and nonlinear
	//Towns are are linear and always the same
	//Regions between towns and game keypoints are randomly (procedurally) generated

	/*
	 * The procedural engine uses fractals to generate foliage (trees, plants, flowers). For other entities brushes (generic meshes) are used.
	 *  First the terrain is generated procedurally, then the foliage, rocks, etc. are added randomly to the scenbe. 

	There is a shadow behind the main character when he is running. If running might slide into stones, or jump and roll.
	 Or if you come to hang over a cliff, catch from falling and hang off the clifside,  moving side to side or jump up back on
	  to solid ground.

	

	Dynamic lighting, corona, ambient, spotlight, normal lighting, Colored Lighting, Fog Lights, Smoke Lights.
	Seasons, weather, time of day
	Maps/Dungeons generated randomly
	All damage over a certain number causes fireball explosions. Damage done is proportional to type of attack. 
	Sky changes appearances throughout the day
	Good lightning effects
	Non-triangle based objects. NURBS, Bezier B-Splines, etc.
	Shoot a lake, sand, dirt, trees, houses, stone, etc. and realistic results
	Spells that cause morphing 
	Certain objects, such as a tree branch, can be broken off. (Solid modeling is an advantage here)

	Procedural texture mapping can be turned on or used to generate a texture.
	 */
	
	
	/*
	 * NECROTEK Real-time Destruction and Deformation of Objects

This applies to both damage to an enemy, damage taken, and strucetures and objects being randomly generated.

Construction/Destruction/Interaction

Can build and own a merchant.  (Build like minecraft)
Run the merchant like a real merchant (make weapons,  catch fish, etc.)
Have to pay taxes

Build a gorgeous world and then let your players crush it to pieces. Unreal Engine 3’s fracturing tool and runtime enable you to take 
virtually any existing mesh, slice it up into as many fragments as desired, and destroy structures. Unreal Engine 3 supports the 
destruction of everything from metal to cloth, bringing more realism and interaction to your environment.
Unreal Engine 3’s fracture tool makes it possible to create remarkably interactive, deformable worlds. 
Easily craft all types of destructible environments and objects that break apart just as you would expect them to in real life.
 Splinter walls and floors layer by layer. Blow apart rocky structures chunk by chunk. Add cool physics elements and particle effects.
  Unreal Engine gives you total control over destruction.
Destructible environments enable scene elements to break apart and collapse realistically.
Whether you’re building a photorealistic world or a highly stylized environment, you can make any mesh crumble to pieces
 with Unreal Engine 3’s structural analysis tool.
			Easily slice static meshes to create fracture meshes.
			Modify chunk size and quantity for desired impact and performance.
			Instantly add fracturable assets by dropping them into your game world.
Tires, bridges, etc. can all be damaged.

Fire from fire attacks, flooding from flood attacks, tree leaves move with wind attacks, things are crushed with earth (boulder) attacks

Plates, vases, etc. are not just stationary Bump into something it can fall and shatter
Lowers emotion values if that object had sentimental value to a character

Wind blows leaves in trees, causes fire to flicker, and grass to move back and forth

When you walk in it, you part the grass (3D realistic textures)

Textures may chang with collision: grass & water parts, rocks slide, etc.

May create other objects such as smoke/dust (rocks) or insects flying around the grass or fish jumping out of water

Vary textures, remove repetition.
Mipmapping of bricks

Slime & Water slides and drips

Rain creates puddles on its own according to terrain level

You may need to wait for a rainstorm in order for you to access an area via swimming. 

Gore and fire and water and other things remain and don’t decay.

Blood and bullet holes stay and do not decay

Intellligent battle attacks and effects. Things light on fire if hit with a stray fire spell.  
Debris flies off, especially in a shockwave attack. Smoke goes with fire.

Awesome death scenes for burning alive, and losing a limb (blood squirting(

Very detailed armor, as dents, scratches, blood stains. Actually built into the armor fo the guy, not just some lame texture.

Slick walls, moisture in room, mists.

Cloth Animation, Hair Animation, etc… effected by Wind
 

	 */
}
