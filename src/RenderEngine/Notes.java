package RenderEngine;

public interface Notes {
/*
 * 
 * NECROTEK Rendering Engine


Level of detail is used for vertices. Only a certain number of vertices will be submitted to the pipeline according to the distance
32 Blended Color and Transparency Support
Final Frame Blending (takes the final frame before blitting and blends it)
Final Frame Blurring 
Realistic Shadows
Translucent and Animated Textures (example shoot guy and blood bleeds  from the wound
Realistic Liquid and Objet Distortion
Mirror Support
Multi-pass Rendering (takes a procedural texture and applies it at different rotations  and scales, very cool)
Environment mapping from blended procedural textures
Lens flare support 
Z-buffering
W & S Buffering
Specular Highlighting
Multitexturing
Texture blending and blurring
Particle System
BMP Animation and 3D Sprite Engine
Realistic Reflection System, not just mirrors reflect. (Reflection maps with Procedural Texturing)
Edge and Screen Antialiasing
First person and 3rd person camera support
Second rendering pass for things like caustics (underwater effects) and haze (sky areas)
Verge Liquid Motion Ruses endering Technique allows for interpolation btween frames, slowing down number of triangle rasterizations
Vexel Support
Uses very light distance fog to blend the far away LOD reduced polygons.
Patchy Planar Rendering (puddles, etc)
Dark Light Support
Tri-linear mipmap filtering (blends two mip maps together to avoid banding) Banding is where you can see mipmaps come together
Bilinear texture filtering  - Blends nearest 4 pixels in a texture with weighted averages to remove pixilation.
Back-face culling Cullls polygons with normals facing away from player
Compiled Procedural Textures – A texture is taken, then compiles a texture to a similar texture.

NECROTEK Rendering Engine


Level of detail is used for vertices. Only a certain number of vertices will be submitted to the pipeline according to the distance
32 Blended Color and Transparency Support
Final Frame Blending (takes the final frame before blitting and blends it)
Final Frame Blurring 
Realistic Shadows
Translucent and Animated Textures (example shoot guy and blood bleeds  from the wound
Realistic Liquid and Objet Distortion
Mirror Support
Multi-pass Rendering (takes a procedural texture and applies it at different rotations  and scales, very cool)
Environment mapping from blended procedural textures
Lens flare support 
Z-buffering
W & S Buffering
Specular Highlighting
Multitexturing
Texture blending and blurring
Particle System
BMP Animation and 3D Sprite Engine
Realistic Reflection System, not just mirrors reflect. (Reflection maps with Procedural Texturing)
Edge and Screen Antialiasing
First person and 3rd person camera support
Second rendering pass for things like caustics (underwater effects) and haze (sky areas)
Verge Liquid Motion Ruses endering Technique allows for interpolation btween frames, slowing down number of triangle rasterizations
Vexel Support
Uses very light distance fog to blend the far away LOD reduced polygons.
Patchy Planar Rendering (puddles, etc)
Dark Light Support
Tri-linear mipmap filtering (blends two mip maps together to avoid banding) Banding is where you can see mipmaps come together
Bilinear texture filtering  - Blends nearest 4 pixels in a texture with weighted averages to remove pixilation.
Back-face culling Cullls polygons with normals facing away from player
Compiled Procedural Textures – A texture is taken, then compiles a texture to a similar texture.
Uses a streaming algorithm. Resources are streamed in as they are needed.  For example, textures.
MegaTextures – Use one megatexture to cover the terrain
Patch Textures – Able to paint over megatextures with smaller textures
Use height maps to render terrain in real time
Use fractals for infinite detail



 *NECROTEK Advanced Occlusion Engine (Unity?)

Display only what is on screen using special algorithms.

By using your Scene’s static geometry to auto-generate data in a format that can be effectively accessed at runtime, Unity can
 identify what is visible and what is not for each camera in your game. Create complex game worlds full of detail, and rest assured 
 that your users spend time rendering only the details that they can actually see.
 
 
 * To improve performance Unity automatically combines your small geometry into batches at runtime. You can also batch larger static objects by 
 * creating geometry batches at build-time.
 * 
 * 
 * NECROTEK TIMEKEEPER

As the game progresses, seasons change. Also the time of day will change. Weather and level conditions are also supported.
 And can be forced to change via level entitites. The results of a level can be manipulated by the rendering engine. For example,
  one might not be able to enter a castle because the moat is flooded. This event can be pinned to the locals conversations. 
  Conditions can have very unique effects such as sludge dripping down the side of a wall.





Rendering Pipeline

1.	Determine visible region files and level of detail for maps. Regions are the uppermost part of the world tree. They consists of region files that are swapped inand out of the game depending on their visibility. The most distant regions have meshes that are altered by LOD (level of detail) .
2.	Each region consist of various Sectors. In this stage, once the region files have been swapped in the visible sectors are analyzed.
3.	With the sector data loaded, LOD information is loaded and distant models are reduced so that their polygons are a lower number. 
4.	FOV is calculated. Visible leafs from the BSP tree. The rendering pipeline uses a dynamic BSP tree where the BSP tree has already been calculated but the scene can be manipulated and the effects of the manipulation can be applied directly to the BSP file. In this case, triangles flagged in #3 are pumped into something called a Sorting Buffer.
5.	The sorting buffer breaks down triangles into overlapping and non overlapping polygons. If a polygon is non-overlapping then it can be sorted out using the painters algorithm
6.	After the painters algorithm processes the triangles from #3, the triangles are sent off to the rasterizer. Here hardware Z-Buffering completes the occlusion routines.

MAP FILE FORMAT

	MAIN HEADER
		Number of Lumps
		Size of Lumps

	LUMP HEADER
		Number of Sublumps
		Size of this lump
		Lump Data


	REGION HEADER
		Number of Regions
		List of Regions
		Size of a Region
		
	REGION
		Region Data
		Number of Sectors
		List of Sectors
		Size of Sectors

	SECTOR
		Sector Data
		Sector ID

 * 
 */
}
