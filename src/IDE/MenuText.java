package IDE;

public class MenuText {
	 
	 /*
	  * 
	  * 
	  * 
	  * DOCUMENTATION
	  * 
	  * 
	  * 
	  * 
	  */
	 
	 
	 
	 /*
	  * 
	  * 
	  * 
	  * TOOL BAR: GIMP AND PHOTOSHOP
	  * 
	  * 
	  * 
	  * 
	  */
	 
	 /*
	  * 


GAMEPAD ICON CONTENT WAS TAKEN FROM GAMEMAKER


Edit Menu (GIMP)
copy
copy visible
copy paste
select all
select by color tool (gimp)
opacity
measure distances and angles
cage tool (deform with a cage)




		//marqueeButton.add(marqueeMenuBar);
Marquee
	Rectangle Marquee
	Elliptical Marquee
	Lasso Tool
	Polygonal Lasso Tool
	Polygonal Lasso Tool
	Magnetic Lasso Tool
	Quick Selection Stool
	Magic Wand Tool
	Foreground Select
	Path Selection Tool

Eyederop Menu
	EYedrop 
	Color Sampler
	Ruler Tool
	Note Tool
	Count Tool
	Spot Heal
	Patch Tool
	Content Aware

——

PaintBrush Menu
	Brush
	Pencil
	Airbrush
	Color Replace
	MixerBrush
	History Brush
	Art History Brush
	Pen Tool
	FreeForm Pen
	Add Anchor
	Convert Paint		



Paint Bucket
	Fill Bucket
	Paint Bucket
	3D Material

Extrude Menu
	Extrude
	ExtrudeX
	ExtrudeY
	ExtrudeZ
	Extrude Dialog

Sculpt Tool
	See text array	

Tooltip
	Attach tool tip to object

Layers Tool

	Dialogue Box

Filters
	Dialogue Box

Clone
	Clone
	Clone Multiple
	Clone x Times


Stamp
	Stamp Tool
	Pattern  Stamp Tool
	Reverse Stamp Tool
	Drag and Drop Stamp Tool
	Copy Stamp for Sculpting Tool

Eraser
	eraserTool
	background eraser
	magic eraser
	3D surface eraser
	Crop
	Exacto

2D Primitives
	Rectangle Tool
	Ellipse Tool
	Triangle Tool
	Polygon Tool
	Line Tool
	Rhombus Tool
	Diamond Tool
	Template Tool
	Custom Shape

Blur
	Blur
	Sharpen
	Smudge
	Streak
	Blend
	Motion Blur
	Wind Blur

Dodge

	Dodge Tool
	Burn Tool
	Sponge Tool
	Tear Tool

Text
	Horizontal Type
	Vertical Type
	Horizontal Mask
	Vertical Mask


———————



	  */
	 
	 
	 
/*
 * Actor Services
 * 
 * CreateCharacter
 *  Create Child Class
 *  CreateaEmpty Actor
 *  CreateLightActor
 *  CreateLightMassCharacter
 *  CreateLightMassIMportanceService
 *  Create Pawn Service
 *  Create Sold Modelling Grammar
 */
	 

	 
	 
	 
	 
	 //light map and texture are a part of the material editor
	//the following is part of the animation menu:
	//Animator Controller", "Animation","Animation Override Controller"
	
	//the following are a part of the physics menu
	//"Physics Material", "Physic2D Material",
	//GUI Skin is part of the UIBuilderMenu
	
	public String[] assetsList = 
		{ "Create", "Folder", "C# Script", "Java Script", "Quark Script", "Lua",
				"------", " ------", "Prefab", "Audio Mixer",
				"------", "Material", 
				"Avatar Mask", "------","GUI Skin","Custom FontShader, Variant Collection",
				"------", "Reveal in Finder", "Open", "Import", "New Asset", "Import New Package",
				"Export Package"
		};

	
	/*
	 * 
	 * ASSETS MENU
	 * 
	 * 
	 * (TAKEN FROM UNITY 3D)
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	/*
	 * 
	 * 
	 * 
	 * GAME COMPONENT MENU
	 * 
	 * (TAKEN FROM UNITY 3D)
	 * 
	 * 
	 * 
	 * 
	 */

	String	[] componentStrings = 
		{
				"Mesh", "Attachments", "Particle System","Trail Renderer", "Line Renderer", "Lens Flares",
				"Halo", "Projector", "Rigid Body", "Character Controller", "Box Collider",
				"Sphere Colliders", "Capsule Collider", "Mesh Collider", "Wheel Collider",
				"Terrain Collider", "-------", "Cloth", "Hindged Joint", "Fixed Joint",
				"Spring Joint", "Configurable Joint", "------", "Navigation Mesh", 
				"NURBS Navigation", "-------", "Audio Source", "AUdio Listener",
				"--------", "SkyBox", "-----", "Layout", "Animator", "Animation",
				"Source Control"
		};
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * BASICS MENU (missing Primitives, Lighting, and UI
	 * 
	 * TAKEN FROM UNREAL ENGINE AND MULTIPLE SOURCES
	 * 
	 * 
	 * 
	 * 
	 */

	String [] basicStrings = 
		{
				"Camera",
				"--------------",
				"Visual",
				"Fog",
				"Capture Scene for Reflection",
				"Decal Component",
				"---------------",
				"Meshes",
				"Box",
				"Cone",
				"Cylinder",
				"Curved Stairs",
				"Linear Stairs",
				"SPiral Staires",
				"Sphere",
				"Paint Vertices",
				"----------------",
				"Armature",
				"Lattice",
				"Speaker",
				"Empty Actor",
				"Blocking Volume",
				"Camera Blocking Volume",
				"Cull Distance Volume",
				"KillZVolume",
				"Level Streaming Volume",
				"Lightmass Character",
				"Lightmass Importance",
				"Nav Mesh Bounds Volume",
				"Nav Modifier Volume",
				"Pain Causing VOlume",
				"Physics Volume",
				"Post Process Volume",
				"Precomputed Visibility",
				"Trigger Volume"

		};

	String [] basicToolTips = 
		{
				"Camera",
				"Lighting",
				"---------",
				"Visual Effects",
				"Fog - placeable object that simulates atmospheric light scattering",
				"Capture Scene for Reflection",
				"When used on an object or terrain can modifiy it for more realism",
				"---------------",
				"Meshes",
				"Box - A brush. Designed to use for geometry and gameplay objects",
				"Cone- A brush. Designed to use for geometry and gameplay objects",
				"Cylinder - A brush. Designed to use for geometry and gameplay objects",
				"Curved Stairs - A brush. Designed to use for geometry and gameplay objects",
				"Linear Stairs - A brush. Designed to use for geometry and gameplay objects",
				"SPiral Staires - A brush. Designed to use for geometry and gameplay objects",
				"Sphere -A brush. Designed to use for geometry and gameplay objects",
				"Paint Vertices",
				"A plain vanilla object to represent an object",
				"Invisible Volume used to block other actors",
				"A volume that blocks the camera by default",
				"Optimization tool so that objects at a distance will be removed",
				"Determines when an actor should be killed",
				"An optimization tool that assistes in deciding what should be streaming in the leel",
				"Lightmass Character",
				"Controls the area that lightmass emits photons in",
				"Used to control where Nav Meshess occur in the level",
				"Nav Modifier Volume",
				"Allows applying selected area class to navmesh using volume",
				"A bounding volume that controls actor physics",
				"Used to manipulate post proessing",
				"Stores the visibility of the actor in the world",
				"Used to cause events when a player or chracter enters them"
		};
	String [] basicPrimitivesToolTipText = {

			"Characters are pawns that have mesh, colllision and built in movement logic ",
			"Sprites are two dimensional animated iages",
			"Point Light act like real light bulbs and cast light in all direcetions",
			"Spawn Point - an entry point for a charater or the main character in a game",
			"Cube Static Mesh - a cubic geometry that does not deform or animate.",
			"Sphere Static Mesh - a sphereiceal geomery that does not deform or animate",
			"Cone Static Mesh - a conical geometry that does not deform or animate",
			"A box shaped Trigger - used to generate overlap events in a level",
			"A sphere shaped Trigger - used to generate overlap events in a level",
			"Directional - implements a directional light",
			"Light Actor",
			"Point Light",
			"Casts light in a conical shape similar to a spot light",
			"Sky Light - mimics a light in th far distance such as sunlight or moonlight ",
			" ",
			" "," "," "," "," "," ", " "," "," "," "," ", " "," "," "," "," "


	};
	
	/*
	 * 
	 * 
	 * 
	 * BASICS MENU: PRIMITIVES SUBMENU
	 * TAKEN FROM UNREAL ENGINE AND VARIOUS SOURCES
	 * 
	 */
	
	//part of the primitives menu
	
	
	String [] basicPrimitives = {
			"Character",
			"Sprite",
			"Point Light",
			"Spawn Point",
			"Plane",
			"Cube Static Mesh",
			"Sphere Static Mesh",
			"UV Sphere",
			"Ico Sphere",
			"Cylinder",
			"Cone",
			"Torus",
			"Grid",
			"Warlock",
			"Cone Static Mesh",
			"A box shaped Trigger",
			"A sphere shaped Trigger",
			"Directional",
			"Light Actor",
			"Point Light",
			"Spot Ligh",
			"Sky Light",
			
			"-------------",
			"Create Empty", 
			"Create EmptyChild",
			"-------------",
			"Capsule",
			"Cylinder",
			"------",
			"Plane", 
			"Quad", 
			"------", 
			"Ragdoll", 
			"Terrain",
			"Trees", 
			"Windzone",
			"Force Field",
			"------",
			"3D Text"
	};

	
	/*
	 * 
	 * 
	 * 
	 * BASICS MENU: UI SUBMENU
	 * SOURCE UNKNOWN
	 * 
	 *  .//part of the UI Builder Menu
	 * 
	 */
	
	
	String [] basicUI = {
			"UI Panel",
			"UI Button", 
			"UI Text", 
			"UI Image", 
			"UI Raw Image",
			"UI Slider", 
			"UI Scrollbar", 
			"UI Toggle", 
			"UI Input Field",
			"UI Canvas",
			"UI Event System", 
			"-----"
	};


	
	/*
	 * 
	 * 
	 * 
	 * BASICS MENU: LIGHTING SUBMENU
	 * 
	 * 
	 * TAKEN FROM UNREAL ENGINE AND MULTIPLE SOURCES?
	 * 
	 * 
	 * 
	 */
	
	//part of the lighting menu
	
	String [] basicLighting = {
			"Direction Light",
			"Point Light",
			"Sun",
			"Hemi",
			"Spot Light",
			"Area Light",
			"----------", 
			"Reflection Probe",

			"Light Probe Group",
			"Audio Source", 
			"Audio Reverb Zone", 
			"----------",
			"Particle System"

	};
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * CORE GRAPHICS MENU
	 * 
	 * Taken from Gems Books
	 * 
	 * 
	 * 
	 * 
	 */

	String [] CoreGraphicsAttachment = {
			"AnimationBlender",
			"ASGMGeneratedClother",
			"ASMGenerator",
			"GUI Styler",
			"Animation Blending",
			"ANimator",
			"ASA",
			"ASM",
			"Bullet Time",
			"CLIK3 UI",
			"Clother",
			"Collision Detection",
			"Deferred Rendering",
			"Destroyer",
			"Facial Animation",
			"FMV",
			"Geometric Maintenance",
			"Infinite Point Engine",
			"Level of Detail",
			"Lighting and Shadowing",
			"Manual Shaders",
			"Real Time Damage Control",
			"Occlusion",
			"Picking",
			"Procedural WOrld Generator",
			"Procedural Mapper",
			"Realistic Physics",
			"Real Time Deformation",
			"Reverse Ray Cating",
			"Shader",
			"Shadowing",
			"Solid Modelling Grammar",
			"Static Bitmaps",
			"Terrain Generator"
	};

	String [] CoreGraphicsTooltips = {
			"AnimationBlender",
			"ASGMGeneratedClother",
			"ASMGenerator",
			"In charge of all GUI functions",
			"Combine Physics and Graphics in new ways",
			"This is daemon that updates the animations on all of the characters And all the other animated things.",
			"Uses ASA to construct the appearance of the characters (player and npc)",
			"Adaptive SKeletal Model",
			"Control slow motion of scene and objects",
			"The service that handles all of the GUI options via CLIK3 scripts",
			"Adds an skeleton to the character representing the cloth surrounding a character",
			"Handles collisions and colliders",
			"//NECROTEK supports Deferred Rendering to render a vast amount of light efficiently (Direct3D 11 only). Translucent objects are rendered with the forward rendering pipeline.NECROTEK supports Billboard reflections (Direct3D 11 only) which allows complex reflections even with static and dynamic shadows with minimal CPU overhead.",
			"Alters buildings and terrain by deformation meshes",
			"Hops on and off the queue. Use to animated a character in a scripted event",
			"Displays FMV ",
			"Container for geometry and shaders. Interfaces with the rendering engine.",
			"Raycasts objects in the scene and records miniscule points which it blends to create a realsistic scene.",
			"This service works with the rendering pipeline to control the rendering detail",
			"Ambient, Specular, Diffuse etc. ",
			"Add manual, custom shaders to the world.",
			"Handles and monitors the limbs on characters using id Softwares tag  and severing them. Handles damage to the target via images painted on models",
			"Performs occlusion optimization. Runs as a daemon.",
			"Handles picking things up like sandwiches, treasure, opening doors, etc.",
			"PCWorld generator. Create world procedurally",
			"A service that generates random, procedural maps",
			"Bouncing, falling, Kicing a ball, Killing an enemy",
			"Can build things, destroy things, break down walls, smash glass, etc.",
			"Draws light from light source to players eye",
			"Adds realism to the scene",
			"Advanced shadowing with support for four techniques: Dynamic characters casting dynamic soft shadows Ultra high-quality and high-performance pre-computed shadow masks.Directional light mapping with static shadowing and diffuse normal mapped lighting. An unlimited number of lights can be pre-computed ",
			"Uses a model similar to computer solid modeling’s use of set theory to produce its model via scripting, interpreted language that would combine grammar with CSM to proide a more programmable method of creating graphics.  Graphics can be made using this method via plain language description and modified in the same manner",
			"A service that handles static images in the form of bmp, png, etc.",
			"//Height Map Terrain Generator() Fractal Terrain Generator() MegaTexel World Texture Map"
	};
	
	/*
	 * 
	 * 
	 * 
	 * CORE AI MENU: (ALSO TAKEN FROM GEMS BOOKS)
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	String [] CoreAI = {
			"BossesAI",
			"CharacterGeneration",
			"Combat Battle",
			"Combos", 
			"CreaturesAI",
			"CrowdManager",
			"CrowdSystem",
			"Dialogue",
			"FLINCH",
			"Flocking Engine",
			"Followers",
			"MagicSpells",
			"MiscellaneousPCBehavior",
			"MoodEngine",
			"Navigation",
			"CharacterTactics",
			"NPCDetails",
			"NPCInteraction",
			"PetFollowerSystem",
			"ProceduralStory",
			"Professions",
			"Script and AI",
			"Skills and Abilities",
			"Summoning Creatures",
			"Service Swarm",
			"Service Switching",
			"Weapon Mastery",
			"Enemy Behavior"
	};

	String [] CoreAITooltips  = 
		{

				"Handles all the mechanics of a boss battle",
				"MetaData is used to make unique characters",
				"Runs when in combat  This service manage the entire combat. The combat is a screen with the enemy and the players dotted around the screen",
				"Spawned by Combat service. Handles user input that forms combos", 
				"Creatures can be curious, be aggressive, , they might steal  or ",
				"Handes a crowd ",
				"Flocking technology allows u to simulate crowds of hundreds within a scene.",
				"In charge of all conversations",
				"Runs the FLINCH Algorithm for AI decision making",
				"Flocking Engine",
				"The player character may be followed by pets, wild animals, or enemies",
				"Use a magic spell or ability depending on name and parameters",
				"Miscellaneous things like read a book or get married",
				"Handles mood related behavior",
				"Handles the navigation of AI and NPs and Enemies using either A navigation mesh system, or Bezier curves.",
				"Tactics the other AIs use when in battle",
				"Manages a variety of NPC only behaviors",
				"Handles interaction between a character and another character",
				"Allows for the player to earn followers and pets",
				"Uses the procedural storyline generator",
				"Allows the character to obtain and practice a trade",
				"Script and AI",
				"Can gain new abilities by pinned balloons left behind from killing monsters Also called to find out who has what abilities",
				"Use to spawn an esper, dragon, monster, person, etc..",
				"Service Swarm",
				"Spawned by Combat service. Supports the Switching operation in battles",
				"After using a weapon for so long you gain special abilities with it",
				"Manages the Enemy , such as retreat, fake dead, etc."

		};

	/*
	 * 
	 * 
	 * 
	 * 
	 * MISCELLANEOUS MENU MINUS SPECIAL EFFECTS AND TERRAIN
	 * 
	 * TAKEN FROM UNREAL ENGINE AND VARIOUS SOURCES
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	//part of the advaned primitive menu
	
	String [] Extras = {  //misccellaneous
			"Advanced",
			"Sculpt Terrain",
			"Paint Terrain",
			"Paint Vertices",
			"Circle",
			"Curves",
			"Bezier Curves",
			"Uniform Curves",
			"NURBS Curves",
			"Bezier Patches",
			"Uniform Patches",
			"NURBS Patches",
			"Paths",
			"Level Set Curves"
	};
	/*
	 * 
	 * 
	 * 
	 * MIDDLE TOOLBAR VIEWS BUTTON
	 * SOURCE UNKOWN
	 * 
	 */


	String [] Views = {
			"Lit",
			"Unlit",
			"Wireframe",
			"Detail Lighting",
			"Lighting Only",
			"Light Complexity",
			"Shader Complexity",
			"Stationary Light Overlap",
			"Lightmap Density",
			"Reflections",
			"-------",
			"Player Collision",
			"Visibility Collision",
			"-------",
			"Visualizers",
			"LOD",
			"---------",
			"Exposure"

	};

	/*
	 * 
	 * 
	 * 
	 * 
	 * MIDDLE TOOLBAR SHOW BUTTON
	 * 
	 * 
	 * SOURCE UNKOWN
	 * 
	 */
	String [] Show = {
			"Anti-aliasing",
			"BSP",
			"Collision",
			"Decals",
			"FOg",
			"Grid",
			"Landscape",
			"Navigation",
			"Particle Sprite",
			"SKeletal Meshes",
			"Static Meshes",
			"Translucency",
			"---------",
			"Post PRocessing",
			"Lighting Components",
			"Lighting Features",
			"Developer",
			"Visualize",
			"Adanced",
			"-----",
			"Volumes",
			"Layers",
			"Sprites"	 
	};

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * ADVANCED TOPICS (NOT SURE OF THE SOURCE)
	 * 
	 * ADVANCED MENU
	 * 
	 * 
	 */
	
	
	public String [] advanced = {
			"View Matix Preferences",
			"Projection Matrix Preferences",
			"Intersections",
			"Splines",
			"Voxels",
			"Constructive Solid Geometry",
			"Culling Options",
			"Spacial Sorting Options",
			"Graphics Pipeline",
			"Software Rendering Tools",
			"Light Simulation Options",
			"Mapping Techniques",
			"Surface and Vertex Attributes",
			"Geometric Shadows",
			"Global Illumination",
			"Radiosity Options",
			"Ray Tracing Options",
			"Containment Methods",
			"Volume Rendering",
			"Advanced Collision Detection",
			"Intersection Methods",
			"Advanced Animation",
			"Rotation and Translation Options",
			"Geometric Level of Detail",
			"Advanced Terrain Algorithms",
			"Advanced Physics and Deformable Objects",
			"Special Effects using Shaders",
			"Network and Multiplayer",
			"Numerical Methods",
			"Memory Management"


	};

	String [] advancedTooltips = {

			"An advanced matrix"
	};
	
	/*
	 * 
	 * 
	 * EXTENDED ATTACHMENT MENU - AI
	 * 
	 * SOURCE: UNREAL ENGINE?
	 * 
	 */

	String [] AIExtended = {
			"Game Trees",
			"Search",
			"Navigation Meshes",
			"Flocking and Crowds",
			"Neural Nets",
			"Machine Learning",
			"PathFinding",
			"Finite State Machines",
			"Decision Making",
			"Bots",
			"Planning",
			"Miscellaneous"
	};

	
	/*
	 * 
	 * 
	 * 
	 * 
	 * GRAPHICS EXTENDED MENU - SOURCE?
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	String [] GraphicsExtended = {
			"Particles",
			"Shaders",
			"Surfaces",
			"Textures",
			"Occlusion",
			"AntiAliasing",
			"Normals",
			"Skeletal Animation",
			"Lighting and Shadows",
			"Weather and Ambient Effects",
			"Forest and Terrain",
			"Fluids",
			"Collision Detection",
			"Miscellaneous"
	};
	
	/*
	 * 
	 * 
	 * 
	 * MATH PERFORMANCE DIALOG 
	 * 
	 * 
	 * 
	 * 
	 */

	String [] mathPerformanceStrings =
		{
				"Use Eigensystems",
				"Use Leaset Squares Fitting",
				"Use Root Finding",
				"Use Fast Function Evaluation",
				"Use automatic singletons",
				"Use a function binding interface",
				"Use interpolation methods",
				"Integrate equations of rigid body motion",
				"Use polynomial approximations to trig functions",
				"Use implicit euler integration ",
				"Use Wavelets",
				"Use geniuine random number generation",
				"Interpolate Quaternions",
				"Use shortest Arc Quaternions"

		};

	
	/*
	 * 
	 * 
	 * 
	 * 
	 * GRAPHICS PERFORMANCE DIALOG
	 * 
	 * 
	 * 
	 */
	
	String [] graphicsPerformanceStrings =
		{

				"Use interaction simulation of water surfaces",
				"Optimize vertex submission for opengl",
				"Tweak vertices projected depth value",
				"Use Vector Cameras",
				"Use Camera control techniques",
				"Use fast cylinder frustrum test",
				"Use 3D Collision Detection",
				"Use Multi-resolution maps for interaction Detection",
				"Use Object occlusion",
				"Use loose octrees",
				"Use View independent progressive meshing",
				"UseInterpolated 3D Keyframe Animation",
				"Use fast skinning",
				"Use stitching and skinning",
				"Use Realtime realistic terrain generation",

				"Use Fractal Terrain Generation – Fault Formation",
				"UseFractal Terrain Generation – Midpoint Displacement",
				"Use Fractal Terrain Generation – Particle Disposition",
				"Use 2D Lens Flares",
				"Us 3D hardware for 2D Sprite Effects",
				"Use Motif based static lighting",
				"Simulate real-time lighting using vertex color interpolation",
				"Use Attenuation Maps",
				"Use Advanced Texturing Using Texture Coordinate Generation",
				"Use Hardware Bump Mapping",
				"Use Ground-Plane Shadows",
				"Use Real-Time Shadows on Complex Objects",
				"Use Glossy Prefiltering and the Fresnel Term",
				"Use Refraction Mapping for Liquids in Containers"
		};

	
	
	/*
	 * 
	 * 
	 * AI PERFORMANC DIALOG
	 * 
	 * 
	 * 
	 */
	
	String [] AIPerformanceStrings =
		{
				"Use finitie state machines",
				"Use Game Trees",
				"Use A* for Path Planning",
				"Use A* Speed Optimiztions",
				"Use Navigation Meshes",
				"Enable Flocking",
				"SEnable Neural Nets"

		};

	
	/*
	 * 
	 * 
	 * 
	 * CODE PERFORMANCE DIALOG
	 * 
	 * 
	 * 
	 * 
	 */
	String [] CodePerformanceStringse = 
		{
				"Use handle based resource management",
				"Use fast data loading",
				"Use frame based memory allocation",
				"Use fast bit arrays",
				"Export classes from DLLs",
				"Dynamic Type Information",
				"Use Game Entity Factories",
				"Use Drop-In debug memory manager",
				"Turn on Game Profiler Module",
				"Use Stack Winding",
				"Use self-modyfing Code",
				"User generic tweaker",
				"Turn on bloom filters"


		};

/*
* 
* 
* MISCELLANEOUS MENU  - SPECIAL EFFECTS
* 
* 
* SOURCE UNKOWN
* 
*/
	String [] SpecialEffects = 
		{
				"Lens Flare",
				"Environment Mapping",
				"Bump Mapping",
				"Volumetric Mapping",
				"Protected  Lights",
				"Projected Shadowes",
				"Particle Systems",
				"Morphing",
				"----------",
				"Vertex Colors",
				"Lighting and Materials",
				"Textures",
				"Multi-Textures",
				"Bump Maps",
				"Gloss Maps",
				"Sphere Maps",
				"Cube Maps",
				"Refraction",
				"Planar Refraction",
				"Planar Shadows",
				"Projected Textures",
				"Shadow Maps",
				"Volumetric Fog",
				"Skinning",
				"Fast and Simple Skinning",
				"Iridescence",
				"Water Effects",
				"2D Lens Flare",
				"3D Hardware for 2D Sprites",
				"Motif Based Static Lighting",
				"Simulated Real-Time Lighting",
				"Attenuation Maps",
				"Advanced Texturing using Vertex Color",
				"Hardware Bump Mapping",
				"Ground-Plane Shadoww",
				"Real-time shadows on complex objects",
				"Improving environment map reflections",
				"Convincing Looking Glass",
				"Refraction Mapping for Liquids"

		};
	/*
	 * 
	 * 
	 * 
	 * MISCELLANEOUS - TERRAIN
	 * 
	 * 
	 * SOURCE UNKOWN
	 * 
	 * 
	 */

	String [] TerrainMenu = 
		{
				"Terrain Topology",
				"Vertex Based Simplification",
				"Block Based Simplification",
				"Distant Terrain Assumption",
				"Close Terrain Assumption",
				"No Assumption",
				"Vertex Dependencies",
				"Block Rendering",
				"The Full Algorithm",
				"Other issues",
				"Height Fields from Point Sets",
				"Realtime Realistic Terrain Generation",
				"Fractal - Fault Formation",
				"Fractal - Midpoint Displacement",
				"Fractal - Particle Deposition"

		};

	//=================================

	/*
	 * 
	 * 
	 * 
	 * 
	 * UNKOWN
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	String [] radiosityMenu =
		{

				"Radiosity theory",
				"Form-factor determination",
				"Gauss-Seidel Method", 
				"Progressive Refinement", 
				"Problems with Radiosity ",
				"Artifacts in radiosity images", 
				"Hemicube ",
				"Reconstruction", 
				"Meshing",
				"Adaptive or a posteriori meshing ",
				"A priori meshing"
		};
	//===================================///
	//NOT ON MENUS YET//
	
	/*
	 * 
	 * 
	 * 
	 * 
	 * MENU: FORMAT MENU - SOFTWARE RENDERING
	 * 
	 * 
	 * UNKNOWN SOURCE
	 * 
	 * 
	 */
	
	String [] softwareRendering =
		{

				"Software Rendering ",
				"Vertex Shaders ",
				"Rasterizing ",
				"Edge Buffers ",
				"Scan Line Processing ",
				"Pixel Shaders ",
				"Stencil Buffering ",
				"Depth Buffering ",
				"Alpha Blending ",
				"Color Masking ",
				"Texture Sampling ",
				"Frame Buffers "

		};

	
/*
* 
* 
* 
* 
* FORMAT MENU
* 
* 	
*/
	String [] graphicsPipeline =
		{
				"Graphics Pipeine",
				"Object culling  ",
				"Clipping  ",
				"Back face culling  ",
				"PHIGS and GKS ",
				"Shading Pixels  - Local reflection models ",
				"Shading pixels – Practical Point ",
				"Shading Pixels – light source considerations", 
				"Goraud and Phong shading ",
				"Hidden Surface Removal (Zbuffer and BSP Trees) "

		};

	/*
	 * 
	 * 
	 * FORMAT MENU
	 * 
	 * 
	 */
	
	
	String [] moreRenderingMethods =
		{
				"Volume Rendering",
				"Sem-Transparent ‘gel’ option ",
				"Voxel Classification ",
				"Transforming into the viewing direction ",
				"Semi-Transparent Gel plus surfaces ",
				"Explict extraction of isosurfaces ",
				"Compositing pixesls along a ray ",
				"Structural Limitations in volume rendering" ,
				"Ray Castring (untransformed data) ",
				"Ray Casting (transformed data) ",
				"Voxel Projection Method "

		};

/*
* 
* 
* 
* 
* 
* FORMAT MENU ADVANCED LIGHTING
* 
* 
* 
*/


	String [] advancedLighting =
		{
				///Fromat->Advanced Lighting
				"Simulating Light object interaction local reflection methods",
				"Reflection from an imperfect and a perfect surface ",
				"Bi-directional reflectance distribution function ",
				"Diffuse and specular components ",
				"Perfect Diffuse – empirically spread specualr reflection ",
				"Physically Based Specular Reflection ",
				"Microgeometry of the surface ",
				"Shadowing and masking effects ",
				"Viewing geometry ",
				"The Fresnel term ",
				"Pre-comping BRDFs ",
				"Physically based diffuse component ",
				"Geometric Shadows",

				"Properties of shadows in computer graphics ",
				"Simple shadows on a ground plane ",
				"Shadow Alogirhtms ",
				"Projecting polygons scan./line ",
				"Shadow volumes ",
				"Derviation of shadow polygons from light source transformations ",
				"Shadow algorithns: Z Buffer ",

				"Global Illumination",

				"Global illumination models", 
				"Rendering Equationv ",
				"Radiance, irradiance, and radiance equation ",
				"Path notation ",
				"Whitted Ray Tracing",
				"Radiosity ",
				"Monte Carlo technqiues in global illumination ",
				"Path Tracing ",
				"Distributed ray tracing" ,
				"Two-pass ray tracing ",
				"View dependence and independence and multi-pass methods", 
				"Caching illumination ",
				"Light volumes ",
				"Particle tracing and density estimation"

		};
/*
* 
* 
* 
* 
* FORMAT MENU
* TRICKS OF THE GAME GURUS AND MY NOTES
* PROGRAMMMING OPTIMIZATION DIALOG
* 
*/
	String [] programmingOptimizations =//use ...
		{

				"Program Options",
				"---------------",
				"Reduce memory usage – use as few variables as possible",
				"Use as few for loops and if statements as possible",
				"Use DrawIndexedPrimitive as much as possible. Shares vertices.",
				"If I can, use Triangle Strips, they are more efficient",
				"STRENGTH REDUCTION – Never divide, rarely multiply. Use bit shifts if possible.",
				"Clean inner game loop. (main game loop) Only put what is necessary in the loop",
				"Use as many hardware features as possible",
				"Enumerate Devices (use the fastest device)",
				"Send as many primitives to the renderer as possible (big batch)",
				"Store variables in registers if possible",
				"Instead of using globals using function parameters",
				"Combine if statements into one switch statement if possible?",
				"Use the fastest dimension (i.e., 256x256) texture as possible for the API",
				"Smaller the texture the better",
				"Reuse arrays that are declared",
				"Use NEW and DELETE to free up memory like bitmaps",
				"Make temporary arrays – things like temp bitmaps can go in there",
				"Do not use arrays for things like triangles, use linked list",
				"Use linked lists for Verge Data Format not arrays",
				"Use a third buffer -> flip, blit, double buffer, triple buffer",
				"Call LOOP only while idle",
				"Make graphics code inline (since there is no jump)",
				"Set Camera Matrix before Rendering",

		};

	
	/*
	 * 
	 * 
	 * 
	 * FORMAT MENU
	 * 
	 * 
	 * TRICKS OF THE GAME GURUS AND MY NOTES
	 * PROGRMAMING OPTIMIZATION DIALOG
	 * 
	 */
	
	String [] programmingOptimizations2 = {

			"Unroll loops",
			"Flip Loops (while loop becomes do-while loop)",
			"Do not use FAR pointers, NEAR pointers are always faster",
			"Make loop variables register variables",
			"Don’t use ASSERTS they unroll to if statements",
			"Always use switch instead of if if possible",
			"Use global variables instead of passing large parameters",
			"Do not pass STRUCT into a function",
			"Use compiled sprites",
			"Never use Microsoft Libraries if you can help it",
			"Use vertex buffer",
			"Use stencil buffer",
			"Gracefully degrade special effects that take up a lot of resources",
			"Use interpolation between Vexels instead of a large number of triangles",
			"Use MACROS (similar ot inline, speeds up C/C++)",
			"Replace floats with fixed point math",
			"Turn little files into BIG files. More efficient because of how it handles the file allocation unit.",
			"Instead of blitting a bunch of different bitmaps, blit big one big bitmap (SPEED UP)",
			"Double other functions. Halves rendering functions speeding up game overall",
			"Rendering functions adjusted to 30 frames per second including quartering rasterizing and interpolation between frames.",
			"Only render when necessary, render on idle cycles. ",
			"Use DEFINE macro to save space",
			"Use CONSTANT variables",
			"Remove IF/SWITCH/FOR/WHILE – remove as many as you can. Using either macros or expanded/unrolled loops.",
			"Use assembly if possible",
			"Calculate look-up tables, for example trig functions",
			"Use WORDs and BYTEs if possible",
			"For level of detail number of triangles should remain the same. ;I.e., If twenty feet away uses 20 triangles, 2 feet away 100 triangles, etc… universal across the engine.",
			"Precalculate as many calculations as you can.",
			"Eliminate pixel overdraw. That is, when a pixel is drawn twice.",
			"User faster keyboard functions",
			"Remove type conversions (int) to (float) etc",
			"In the region backfaced removal should be performed.  Or a mip-map can be used." 
	};
	
	/*
	 * UNKOWN
	 * 
	 * 
	 * 
	 * 
	 */
			
			String [] actionMenu = {
				"Move Fixed",
				"Move Free",
				"Move Towards",
				"Speed Horizontal",
				"Speed Vertical",
				"Speed Z Axis",
				"Set Gravity",
				"Reverse Horizontal",
				"Reverse Vertical",
				"Set Direction",
				"Jump to Position",
				"Bounce",
				"Move to Contact",
				"Create Instance",
				"Create Moving",
				"Create Sprite",
				"Change Sprite",
				"Set Alarm",
				"Sleep",
				"Display Message",
				"Restart Game",
				"End Game",
				"Replace...",
				"Set Variable",
				"Test Variable",
				"Set Path",
				"End Path",
				"Path Position",
				"Path Speed"
			};
				
			
			/*
			 * 
			 * 
			 * 
			 * 
			 * SCULPTING TOOLBAR BUTTON
			 * BORROWED FROM ZBRUSH
			 * 
			 * 
			 * 
			 */
			
		//zbrush
		String [] sculptingText = {
				"Adding",
				"Reposition",
				"Scraping",
				"Shaping",
				"Fine Detail",
				"-------------",
				"Standard",
				"Clip Brush",
				"Unclip",
				"Slice",
				"Crease",
				"Trim Curve",
				"-----------",
				"Curve Brush",
				"Groom Brush",
				"Pen Brush",
				"------------",
				"Smooth",
				"Move",
				"Inflat",
				"Elastic",
				"-------------",
				"Displace",
				"Magnify",
				"Blob",
				"Pinch",
				"Flatten",
				"Clay",
				"Morph",
				"Layer",
				"Nudge",
				"Snakehook",
				"Planar",
				"Trim",
				"Polish"
		};




}
