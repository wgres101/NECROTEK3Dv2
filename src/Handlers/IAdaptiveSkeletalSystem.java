package Handlers;

public interface IAdaptiveSkeletalSystem {
/*
 * The naked body reflects a generic template for that race, female or male. Metadata is used to make the naked template unique for each player. This makes the playable characters different from one and another. For example between one elf and another. This occurs inside a guild when a new character is available. The main character Seren is hard-coded with body template and starting character class. You can switch characters class and therefore clothing and weapons as well for Seren. Both the clothing and character are animated with skeletal animation. The clothes will fit. There are one joinable characters in the beginning of the game for each race . Some are gathered, you start with two and the main character who have their own unique template naked characters with their own unique metadata for their template and  a unique race. There is at least one of each race that can be brought back to the guild to assign a class. The metadata and race of each character is is unique.

The clothing mesh can have a separate skeleton from the naked mesh of the individual unique character. The two are animated at the
 same time so they have a smooth animation. Also, the techniques or skills are animated in a separate skeleton.


For example, Seren (character) is of an Dark Knight class, and uses a sword.  First Seren is clothed using the clothing mesh for a 
Dark Knight which reacts like a normal knight. Then the technique skeletons/motion capture are interpolated to fit (rig) the character.

To make certain characters unique metadata can be used to add things to the characters equipment or clothing that makes the character 
appear unique, even if they are wearing generic clothing for his or her class.

To separate generic NPCs for Heroes, several things happen. Certain player characters have an affinity for certain classes 
and will have unique markings (metadata) when they are taking on and training that class
For example, the character Amelia is a swordie, so she gets a large bonus on sword-wielding classes.
Not just that, her appearance changes as well. In the case of Amelia, when in the swordsmen class, her blonde hair is tied into
 a ponytail and her armor looks different – with an emblem of her family crest.


Can damage individual character body parts. The game engine will paint a texture onto that part of the damaged character.
 For example if received slicing damage, the arm  might have a gash in it.


Individual characters have their joints connected and weapons connected to their hands, etc. using an id technology called Tags.
 If a tag exists between two meshes (say shoulder and bicep) then that part of the body will respond to the skeleton for the character.
  Universal skeletons are interpolated to the character mesh allowing it to take on a variety of different roles.


Damaging a part of the body of a character in some cases deforms it. For example a fireball might burn a whole in a persons leg or arm.
 Severe damage to a limb will  "cut the tag" and the character will drop his limb
The types of damage includes but are not limited to: bullets, on fire, limbless, iced, deformation, poison 
Animation is similar to Odin Sphere, and Elysium, using puppet rigging but with 3D models




The naked model is attached to a clothing mesh. The clothing mesh has its own skeletal animation tree. 
 As the clothing mesh changes to another piece of clothing mesh, the previous dynamic skeleton changes according to 
 ASA to the new piece of clothing. This happens for all the skeletons in the mesh. All of the base skeletons such as attack
  skeletons or spell cast skeleton are morphed (interpolated) for the new weapons and armor meshes.

The two, mesh and skeleton, are animated at the same time so they have a smooth animation. Also, the techniques or skills are
 animated in a separate skeleton.
The various meshes, weapon, item, armor, etc. attach to the character using id's Tags.
For example, Amelia (character) is of an Archer Class, and uses a bow.  First Amelia is clothed using the clothing mesh for an 
Archer which reacts like a normal archer. .

Then the technique (shoot arrow) skeletons/motion capture are interpolated to fit (rig) the character. 


To make certain characters unique metadata can be used to add things to the characters equipment or clothing that makes the 
 appear unique, even if they are wearing generic clothing for his or her class.

Damaging a part of the body of a character physical structure deforms it. There are predefined mesh damage lattices
 in the model file that are called upon when a static structure or dynamic individual receives heavy damage.

ASA is used to use several skeletons universally over all the following models, making rigging of each skeleton for each keyframe unnecessary.
Some weapons are normal weapons and some are slotted and souls can be placed in them. These weapons show small visible holes (slots).
Weapons, Armor, and Items are shown in miniature in backpack, shown larger on the paper doll, then shown on the player.
One instance of item model. Use id Software's tag concept to link the weapons to the player.

The main character Amelia is hard-coded as well as the other heroes with a body template and starting character class. 
You can switch characters class and therefore clothing and weapons as well for Amelia.

Both the clothing and character are animated with skeletal animation. The clothes will fit around the naked body.
 As the clothes are morphed to fit the body, so is the generic skeleton fit to the body. There is one joinable character
  in the beginning of the game for each race. Heroes are found later as the game progresses.

Some player characters of various races are gathered, you start with two and the main character who have their own unique template
 naked characters with their own unique metadata for their template and  a unique race. 

There are also the twelve that includes Amelia, the heroes, that are more powerful than any normal peasant or knight in the guild. 
They are treated like Amelia. Scern is one of them for example.

Animation is similar to Odin Sphere, and Elsyia, using puppet rigging but with 3D models

The clothing mesh can have a separate skeleton from the naked mesh of the individual unique character. 
The two are animated at the same time so they have a smooth animation. Also, the techniques or skills are animated in a separate skeleton.
The various meshes, weapon, item, armor, etc. attach to the character using id's Tags.
For example, Amelia (character) is of an Archer Class, and uses a bow.  First Amelia is clothed using the clothing mesh for an Archer 
which reacts like a normal archer. .
Then the technique skeletons/motion capture are interpolated to fit (rig) the character
To make certain characters unique metadata can be used to add things to the characters equipment or clothing that 
makes the character appear unique, even if they are wearing generic clothing for his or her class.
The following animations are implemented using skeletonsshared among characters
 



NECRO-TEK Animation System

The NECROTEK animation system is based off of its unique ASA: Adaptive Skeleton Animation algorithm. ASA uses skeletons and skeletal animations in a unique way that allows one skeleton to be used for multiple models of dfferent shapes or the same mesh with different skeletons. 
 
It supports more than four bone influences per vertex, allowing for subtle nuanaces in the animation. NECROTEK’s animation allows for mesh LOD to be built into the game, making multiple LOD models all compatible with the same skeleton.

There is a tree of animation nodes called NecroNodes.

	Blend controllers, performing an n-way blend between nested animation objects.
	Data-driven controllers, encapsulating motion capture or hand animation data.
	Physics controllers, tying into the rigid body dynamics engine for ragdoll player and NPC animation and physical response to impulses.
	Procedural skeletal controllers, for game features such as having an NPC’s head and eyes track a player walking through the level.
	Inverse Kinematics solver for calculating limb pose based on a goal location (e.g. for foot placement).
	Group animations, handling notifications for the whole group. Synchronize all or a subset of them.
	Morph target animation, allowing the control of morph target blend weights from animation data, with support for material control as well. Morph animation can be authored in Maya and morph data can be exported via ActorX. Skeletal animation can now control vertex and material animation, with preview in the AnimSet Viewer.
			Plus, there are no restrictions on the number of animations playing at the same time, number of blends, or post-processing operations.
NECROTEX can import models such as MD2, MD3, MDL, OBJ,  3DS, and FBX. 




NECRO-TEK Particle Effects

ATOM allows you to recreate effects for use in weapons, explosions, and environments through a tried and true production pipeline.
ATOM is a fully featured particle editor which integrates seamlessly with the NECROTEK Editor. View particle effect modifications and updates in real-time, tune your effects in ATOM and see them update in your levels while you work. It is even possible to update a particle system and see changes propagate over to the Play In Editor feature. ATOM particle effects integrate with all systems within Unreal.
Create libraries of assets and quickly export often utilized effects components between particle systems to quickly “kit bash” effects for rapid visualization and prototyping.
Utilize ATOM Particle Systems with AnimNotifyEvents to view your particle systems timed to animation in real-time, and easily adjust position, orientation, attachment etc. on the fly with no compiling or data transfer to a dev kit or separate system.
Cascade also works seamlessly with the rest of NECROTEK. Quickly generate high quality game cinematics and allow your effects artists to integrate particle systems into complex game play scenarios, give them control over timing, delays, visibility and more!
			Build complex Particle systems by layering emitters using Cascade’s intuitive modular interface
			Be more efficient by exposing a particle system’s particle parameters to make each instance of your effect unique
			Choose between various types of Particle Emission: Sprites, Meshes, Ribbons, Beam and Trails
			Use animated texture pages to display animations on particle sprites
			Control your materials’ exposed parameters from within your particle system
			Use any material, including vertex offset materials and distortion effects, on your particle system
	Accurately control the repeatability of your particle systems using seeded parameters
Energy trails to weapons and movements when attacking






NECRO-TEK Cinematics and Cut Scenes

	Movie director-class control over all of the objects in a scene, as well as cameras and cuts.
			Track-based, non-linear style editing system with support for controlling object movement and animation, playing audio, cutting between cameras, toggling particles, field-of-view and much more.
			Easily created key frames for actors and objects, which can be manipulated directly in-editor.
			Post-processing effects such as fades, depth of field, bloom and color filtering effects can be easily animated and fine-tuned for each camera shot.
			Ability to animate interactive, physical objects in the game such as doors and platforms.
			High resolution frame-dumping allows for saving out pre-rendered source images to create game cinematics that can be played back offline or converted to a standard video format.
	Robust user interface with support for loop ranges, key/time




NECROTEK - Lighting and Shadows System

NECROTEK features the newest and most advanced game lighting and shadow features, including global illumination from NECROTEK LIGHTING. All these features are easily added to your creation through NECROTEK Game Editor.
			Illuminate
	NECROTEK gives you all the options to perfectly light any scene. Ambient occlusion, per-pixel lighting, fill lighting and fully dynamic specular lighting and reflections are all possible.
			NECROTEK LIGHTING
	NECROTEK LIGHTING is an advanced global illumination solver, custom built to fully take advantage of all Unreal Engine 3 has to offer. Light your world with a single sun, giving off soft shadows, and let the diffuse interreflection (color bleeding) do the work.
			Detailed Shadows
		Advanced shadowing with support for four techniques:
	Dynamic characters casting dynamic soft shadows.
	Ultra high-quality and high-performance pre-computed shadow masks.
	Directional light mapping with static shadowing and diffuse normal-mapped lighting. An unlimited number of lights can be pre-computed and stored in a single set of texture maps.
			NECROTEK supports Deferred Rendering to render a vast amount of light efficiently (Direct3D 11 only). Translucent objects are rendered with the forward rendering pipeline.
	NECROTEK supports Billboard reflections (Direct3D 11 only) which allows complex reflections even with static and dynamic shadows with minimal CPU overhead.

	









 */
}
