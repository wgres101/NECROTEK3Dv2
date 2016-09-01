package IDE;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

public class PerformancDialog implements ActionListener, ItemListener {
	

	
	JCheckBox eigensystemD = new JCheckBox("Use Eigensystems");
	JCheckBox leastsquaresD = new JCheckBox("Use Least Squares Fitting");
	JCheckBox rootfindingD = new JCheckBox("Use Root Finding");
	JCheckBox fastfunctionD = new JCheckBox("Use Fast Function Evaluation");
	JCheckBox automaticsingletonsD = new JCheckBox("Use automatic Singletons");
	JCheckBox functionbindingD = new JCheckBox("Use function binding interface");
	JCheckBox interpolationD = new JCheckBox("Use interpolation methods");
	JCheckBox integrateequationD = new JCheckBox("Integrate equation of rigid body motion");
	JCheckBox polynomialapproxD = new JCheckBox("Use poolynomial approximation to trig function");
	JCheckBox impliciteulerD = new JCheckBox("Use implicit euler integration");
	JCheckBox waveletsD = new JCheckBox("Use Wavelets");
	JCheckBox genuinerandomD = new JCheckBox("Use genuinie random number generator");
	JCheckBox interpolatequaternionsD = new JCheckBox("Interpolate Quaternions");
	JCheckBox shortestarcD = new JCheckBox("Use shortest arc quaternion");

	 Object [] list = {eigensystemD, leastsquaresD, rootfindingD,
			fastfunctionD, automaticsingletonsD, functionbindingD, interpolationD,
			integrateequationD, polynomialapproxD, impliciteulerD, waveletsD, genuinerandomD,
			interpolatequaternionsD, shortestarcD };
	 
	JCheckBox interactionWaterSurfaceD = new JCheckBox("Use interaction simulation of water surfaces");
	JCheckBox optimizevertedD	 = new JCheckBox("Optimize vertex submission for opengl");
	JCheckBox tweakverticesD	 = new JCheckBox("Tweak vertices projected depth value");
	JCheckBox vectorCameraD = new JCheckBox("Use Vector Cameras");
	JCheckBox cameraControlD	 = new JCheckBox("Use Camera control techniques");
	JCheckBox fastcylinderD	 = new JCheckBox("Use fast cylinder frustrum test");
	JCheckBox threadedcollisiondetectD	 = new JCheckBox("Use 3D Collision Detection");
	JCheckBox multiresolutionD = new JCheckBox ("Use Multi-resolution maps for interaction Detection");
	JCheckBox objectocclusionD	 = new JCheckBox("Use Object occlusion");
	JCheckBox looseoctreesD	 = new JCheckBox("Use loose octrees");
	JCheckBox indeprogressivemeshingD = new JCheckBox("Use View independent progressive meshing");
	JCheckBox interpolated3DkeyframeD = new JCheckBox("UseInterpolated 3D Keyframe Animation");
	JCheckBox fastskinningD	 = new JCheckBox("Use fast skinning");
	JCheckBox stitchingskinningD	 = new JCheckBox("Use stitching and skinning");
	JCheckBox realtimeterrainD	 = new JCheckBox("Use Realtime realistic terrain generation");

	JCheckBox fractalgenerationfaultD	 = new JCheckBox("Use Fractal Terrain Generation – Fault Formation");
	JCheckBox fractalgenerationMidD	 = new JCheckBox("UseFractal Terrain Generation – Midpoint Displacement");
	JCheckBox fractalgenerationparticlD	 = new JCheckBox("Use Fractal Terrain Generation – Particle Disposition");
	JCheckBox twodlensflareD	 = new JCheckBox("Use 2D Lens Flares");
	JCheckBox threehardware2dspritesD	 = new JCheckBox("Us 3D hardware for 2D Sprite Effects");
	JCheckBox motiflightingD	 = new JCheckBox("Use Motif based static lighting");
	JCheckBox realtimelightingD	 = new JCheckBox("Simulate real-time lighting using vertex color interpolation");
	JCheckBox attenuationmapsD = new JCheckBox("Use Attenuation Maps");
	JCheckBox advancedTexturingD	 = new JCheckBox("Use Advanced Texturing Using Texture Coordinate Generation");
	JCheckBox hardwareBumpMappingD	 = new JCheckBox("Use Hardware Bump Mapping");
	JCheckBox groundPlaneShadowsD = new JCheckBox("Use Ground-Plane Shadows");
	JCheckBox realtimeShadowsComplexD	 = new JCheckBox("Use Real-Time Shadows on Complex Objects");
	JCheckBox glossyprefilteringD = new JCheckBox("Use Glossy Prefiltering and the Fresnel Term");
	JCheckBox refractionMappingForLiquidsD	 = new JCheckBox("Use Refraction Mapping for Liquids in Containers");
	 
	 

	 Object [] lists2 = {interactionWaterSurfaceD, optimizevertedD, tweakverticesD, vectorCameraD,
			 			cameraControlD, fastcylinderD, threadedcollisiondetectD, multiresolutionD, objectocclusionD, looseoctreesD,
	 					objectocclusionD, looseoctreesD, indeprogressivemeshingD, interpolated3DkeyframeD,
	 					fastskinningD, realtimeterrainD, fractalgenerationfaultD, fractalgenerationparticlD,
	 					twodlensflareD, threehardware2dspritesD, motiflightingD, realtimelightingD, 
	 					attenuationmapsD, advancedTexturingD, hardwareBumpMappingD, groundPlaneShadowsD,
	 					realtimeShadowsComplexD, glossyprefilteringD, refractionMappingForLiquidsD };
	 	
	JCheckBox useFiniteStateMachinesD = new JCheckBox("Use Finite State Machines");
	JCheckBox useGameTreesD = new JCheckBox("Use Game Trees");
	JCheckBox useA_StarPathPlanningD = new JCheckBox("Use A* for Path Planning");
	JCheckBox useA_StarSpeedOptimizationD = new JCheckBox("Use A* Speed Optimizaations");
	JCheckBox useNavigationMeshesD = new JCheckBox("Use navigation meshes");
	JCheckBox useFlockingD = new JCheckBox("Enable Flocking");
	JCheckBox useNeuralNetsD = new JCheckBox("Enable Neural Nets");
	 
	Object [] lists3 = { useFiniteStateMachinesD, useGameTreesD, useA_StarPathPlanningD,
			useA_StarSpeedOptimizationD, useNavigationMeshesD, useFlockingD, useNeuralNetsD };
	
	JCheckBox reduceMemoryUsage = new JCheckBox("Reduce memory usage – use few variables");
	JCheckBox reduceloopsUsage = new JCheckBox("Use as few for loops and if statements");
	JCheckBox drawprimitive = new JCheckBox("Use DrawIndexedPrimitive as much as possible");
	JCheckBox usetrianglestrips = new JCheckBox("Use Triangle Strips, they are more efficient");
	JCheckBox strengthreduction = new JCheckBox("STRENGTH REDUCTION – Never divide, rarely multiply");
	JCheckBox cleaninnergameloop = new JCheckBox("Clean inner game loop. (main game loop)");
	JCheckBox usehardware = new JCheckBox("Use as many hardware features as possible");
	JCheckBox enumerate = new JCheckBox("Enumerate Devices (use the fastest device)");
	JCheckBox bigbatch = new JCheckBox("Send as many primitives to the renderer as possible (big batch)");
	JCheckBox globals = new JCheckBox("Instead of using globals use function parameters");
	JCheckBox combineifs = new JCheckBox("Combine if statements into one switch statement if possible?");
	JCheckBox fastesttextures = new JCheckBox("Use the fastest dimension (i.e., 256x256) texture as possible for the API");
	JCheckBox smalltextures = new JCheckBox("Smaller the texture the better");
	JCheckBox reusearrays = new JCheckBox("Reuse arrays that are declared");
	JCheckBox temparrayse = new JCheckBox("Make temporary arrays – things like temp bitmaps can go in there");
	JCheckBox linkedlist = new JCheckBox("Do not use arrays for things like triangles, use linked list");
	JCheckBox dataformat = new JCheckBox("Use linked lists for Verge Data Format not arrays");
	JCheckBox thirdbuffer = new JCheckBox("Use a third buffer -> flip, blit, double buffer, triple buffer");
	JCheckBox looptiming = new JCheckBox("Call LOOP only while idle");
	JCheckBox cameraMatrix = new JCheckBox("Set Camera Matrix before Rendering");
	
	Object [] list4 = { reduceMemoryUsage, reduceloopsUsage, drawprimitive, usetrianglestrips,
			strengthreduction, cleaninnergameloop, usehardware, enumerate, bigbatch, globals,
			combineifs, fastesttextures, smalltextures, reusearrays, temparrayse, 
			linkedlist, dataformat, thirdbuffer, looptiming, cameraMatrix };
	
	
	JCheckBox unrollloop = new JCheckBox("Unroll loops");
	JCheckBox fliploops = new JCheckBox("Flip Loops (while loop becomes do-while loop)");
	JCheckBox assertifs = new JCheckBox("Don’t use ASSERTS they unroll to if statements");
	JCheckBox globalsparams = new JCheckBox("Use global variables instead of passing large parameters");
	JCheckBox compiledsprites = new JCheckBox("Use compiled sprites");
	JCheckBox stencilbuffer = new JCheckBox("Use stencil buffers");
	JCheckBox gracefully = new JCheckBox("Gracefully degrade special effects that take up resources");
	JCheckBox interpolatevexels = new JCheckBox("Use interpolation between Vexels instead of a large number of triangles");
	JCheckBox fixedpoint = new JCheckBox("Replace floats with fixed point math");
	JCheckBox littlefiles = new JCheckBox("Turn little files into big files more efficient FAT");
	JCheckBox blittingbig = new JCheckBox("Instead of blitting a bunch of different bitmaps, blit big one big bitmap");
	JCheckBox doubleup = new JCheckBox("Double up functions. Halves rendering functions");
	JCheckBox renderat30 = new JCheckBox("Render functionc called at a quarter a frame - interpolate between");
	JCheckBox rendernecessary = new JCheckBox("Only render when necessary, render on idle cycles.");
	JCheckBox constant = new JCheckBox("Use final variables");
	JCheckBox removeifs = new JCheckBox("Remove IF/SWITCH/FOR/WHILE – remove as many as you can. Use expanded/unrolled loops.");
	JCheckBox calculatelookup = new JCheckBox("Calculate look-up tables, for example trig functions");
	JCheckBox wordsbytes = new JCheckBox("Use WORDs and BYTEs if possible");
	JCheckBox levelofdetail = new JCheckBox("LOD of t riangles should remain the same per distance");
	JCheckBox precalculate = new JCheckBox("Precalculate as many calculations as you can.");
	JCheckBox pixeloverdraw = new JCheckBox("Eliminate pixel overdraw. That is, when a pixel is drawn twice.");
	JCheckBox keyboard = new JCheckBox("User faster keyboard functions");
	JCheckBox typeconversion = new JCheckBox("Remove type conversions (int) to (float) etc");
	JCheckBox backfaceremoval = new JCheckBox("In the region backfaced removal should be performed.  Or a mip-map can be used.");
	
	
	Object [] list5 = { unrollloop, fliploops, assertifs, globalsparams, compiledsprites,
					stencilbuffer, gracefully, interpolatevexels, fixedpoint, littlefiles,
					blittingbig, doubleup, renderat30, rendernecessary, constant, removeifs,
					calculatelookup, wordsbytes, levelofdetail, precalculate, pixeloverdraw,
					keyboard, typeconversion, backfaceremoval };
	
	 
	public void drawDialogues()
	{
		
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.BLACK);
		
		
		
		
		panel1.setPreferredSize(new Dimension(600,600));
		panel1.setFont(new Font("Arial", Font.BOLD, 10));
		
		
		//create panels`
		
		
		eigensystemD.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		
		panel1.add(eigensystemD, new BoxLayout(eigensystemD, BoxLayout.Y_AXIS));		
		eigensystemD.setAlignmentY(Component.CENTER_ALIGNMENT);
		eigensystemD.setPreferredSize(new Dimension(600,25));		
		eigensystemD.setFont(new Font("Arial", Font.BOLD, 12));
		eigensystemD.setForeground(Color.WHITE);
		
		
		panel1.add(leastsquaresD, new BoxLayout(leastsquaresD, BoxLayout.Y_AXIS));		
		leastsquaresD.setAlignmentY(Component.CENTER_ALIGNMENT);
		leastsquaresD.setPreferredSize(new Dimension(600,25));	
		leastsquaresD.setFont(new Font("Arial", Font.BOLD, 12));
		leastsquaresD.setForeground(Color.WHITE);
	
		panel1.add(rootfindingD, new BoxLayout(rootfindingD, BoxLayout.Y_AXIS));		
		rootfindingD.setAlignmentY(Component.CENTER_ALIGNMENT);
		rootfindingD.setPreferredSize(new Dimension(600,25));	
		rootfindingD.setFont(new Font("Arial", Font.BOLD, 12));
		rootfindingD.setForeground(Color.WHITE);

		panel1.add(fastfunctionD, new BoxLayout(fastfunctionD, BoxLayout.Y_AXIS));		
		fastfunctionD.setAlignmentY(Component.CENTER_ALIGNMENT);
		fastfunctionD.setPreferredSize(new Dimension(600,25));	
		fastfunctionD.setFont(new Font("Arial", Font.BOLD, 12));
		fastfunctionD.setForeground(Color.WHITE);
	
		panel1.add(automaticsingletonsD, new BoxLayout(automaticsingletonsD, BoxLayout.Y_AXIS));		
		automaticsingletonsD.setAlignmentY(Component.CENTER_ALIGNMENT);
		automaticsingletonsD.setPreferredSize(new Dimension(600,25));	
		automaticsingletonsD.setFont(new Font("Arial", Font.BOLD, 12));
		automaticsingletonsD.setForeground(Color.WHITE);
		
		
		panel1.add(functionbindingD, new BoxLayout(functionbindingD, BoxLayout.Y_AXIS));		
		functionbindingD.setAlignmentY(Component.CENTER_ALIGNMENT);
		functionbindingD.setPreferredSize(new Dimension(600,25));	
		functionbindingD.setFont(new Font("Arial", Font.BOLD, 12));
		functionbindingD.setForeground(Color.WHITE);
		
	
		panel1.add(interpolationD, new BoxLayout(interpolationD, BoxLayout.Y_AXIS));		
		interpolationD.setAlignmentY(Component.CENTER_ALIGNMENT);
		interpolationD.setPreferredSize(new Dimension(600,25));	
		interpolationD.setFont(new Font("Arial", Font.BOLD, 12));
		interpolationD.setForeground(Color.WHITE);
	
		panel1.add(integrateequationD, new BoxLayout(integrateequationD, BoxLayout.Y_AXIS));		
		integrateequationD.setAlignmentY(Component.CENTER_ALIGNMENT);
		integrateequationD.setPreferredSize(new Dimension(600,25));	
		integrateequationD.setFont(new Font("Arial", Font.BOLD, 12));
		integrateequationD.setForeground(Color.WHITE);
	
		panel1.add(polynomialapproxD, new BoxLayout(polynomialapproxD, BoxLayout.Y_AXIS));		
		polynomialapproxD.setAlignmentY(Component.CENTER_ALIGNMENT);
		polynomialapproxD.setPreferredSize(new Dimension(600,25));	
		polynomialapproxD.setFont(new Font("Arial", Font.BOLD, 12));
		polynomialapproxD.setForeground(Color.WHITE);

		panel1.add(impliciteulerD, new BoxLayout(impliciteulerD, BoxLayout.Y_AXIS));		
		impliciteulerD.setAlignmentY(Component.CENTER_ALIGNMENT);
		impliciteulerD.setPreferredSize(new Dimension(600,25));	
		impliciteulerD.setFont(new Font("Arial", Font.BOLD, 12));
		impliciteulerD.setForeground(Color.WHITE);
	
	
		panel1.add(genuinerandomD, new BoxLayout(genuinerandomD, BoxLayout.Y_AXIS));		
		genuinerandomD.setAlignmentY(Component.CENTER_ALIGNMENT);
		genuinerandomD.setPreferredSize(new Dimension(600,25));	
		genuinerandomD.setFont(new Font("Arial", Font.BOLD, 12));
		genuinerandomD.setForeground(Color.WHITE);
	
		panel1.add(interpolatequaternionsD, new BoxLayout(interpolatequaternionsD, BoxLayout.Y_AXIS));		
		interpolatequaternionsD.setAlignmentY(Component.CENTER_ALIGNMENT);
		interpolatequaternionsD.setPreferredSize(new Dimension(600,25));	
		interpolatequaternionsD.setFont(new Font("Arial", Font.BOLD, 12));
		interpolatequaternionsD.setForeground(Color.WHITE);
		
		panel1.add(shortestarcD, new BoxLayout(shortestarcD, BoxLayout.Y_AXIS));		
		shortestarcD.setAlignmentY(Component.CENTER_ALIGNMENT);
		shortestarcD.setPreferredSize(new Dimension(600,25));	
		shortestarcD.setFont(new Font("Arial", Font.BOLD, 12));
		shortestarcD.setForeground(Color.WHITE);
		//add to panel 2
		JPanel panel2 = new JPanel();
	
		panel2.setBackground(Color.BLACK);
		panel2.setForeground(Color.WHITE);
		
		panel2.setPreferredSize(new Dimension(600,1200));
		panel2.setFont(new Font("Arial", Font.BOLD, 10));
		
		panel2.add(interactionWaterSurfaceD, new BoxLayout(interactionWaterSurfaceD, BoxLayout.Y_AXIS));		
		interactionWaterSurfaceD.setAlignmentY(Component.CENTER_ALIGNMENT);
		interactionWaterSurfaceD.setPreferredSize(new Dimension(600,25));
		interactionWaterSurfaceD.setFont(new Font("Arial", Font.BOLD, 12));
		interactionWaterSurfaceD.setForeground(Color.WHITE);
		
		panel2.add(optimizevertedD,new BoxLayout(optimizevertedD, BoxLayout.Y_AXIS));
		optimizevertedD.setAlignmentY(Component.CENTER_ALIGNMENT);
		optimizevertedD.setPreferredSize(new Dimension(600,25));
		optimizevertedD.setFont(new Font("Arial", Font.BOLD, 12));
		optimizevertedD.setForeground(Color.WHITE);
		panel2.add(tweakverticesD, new BoxLayout(tweakverticesD, BoxLayout.Y_AXIS));
		tweakverticesD.setAlignmentY(Component.CENTER_ALIGNMENT);
		tweakverticesD.setPreferredSize(new Dimension(600,25));
		tweakverticesD.setFont(new Font("Arial", Font.BOLD, 12));
		tweakverticesD.setForeground(Color.WHITE);
		
		panel2.add(vectorCameraD, new BoxLayout(vectorCameraD, BoxLayout.Y_AXIS));
		vectorCameraD.setAlignmentY(Component.CENTER_ALIGNMENT);
		vectorCameraD.setPreferredSize(new Dimension(600,25));
		vectorCameraD.setFont(new Font("Arial", Font.BOLD, 12));
		vectorCameraD.setForeground(Color.WHITE);
		
		panel2.add(cameraControlD,new BoxLayout(cameraControlD, BoxLayout.Y_AXIS));
		cameraControlD.setAlignmentY(Component.CENTER_ALIGNMENT);
		cameraControlD.setPreferredSize(new Dimension(600,25));
		cameraControlD.setFont(new Font("Arial", Font.BOLD, 12));
		cameraControlD.setForeground(Color.WHITE);
		
		panel2.add(fastcylinderD, new BoxLayout(fastcylinderD, BoxLayout.Y_AXIS));
		fastcylinderD.setAlignmentY(Component.CENTER_ALIGNMENT);
		fastcylinderD.setPreferredSize(new Dimension(600,25));
		fastcylinderD.setFont(new Font("Arial", Font.BOLD, 12));
		fastcylinderD.setForeground(Color.WHITE);
		
		panel2.add(threadedcollisiondetectD,new BoxLayout(threadedcollisiondetectD, BoxLayout.Y_AXIS));
		threadedcollisiondetectD.setAlignmentY(Component.CENTER_ALIGNMENT);
		threadedcollisiondetectD.setPreferredSize(new Dimension(600,25));
		threadedcollisiondetectD.setFont(new Font("Arial", Font.BOLD, 12));
		threadedcollisiondetectD.setForeground(Color.WHITE);
		
		//panel2.setAlignmentY(Component.CENTER_ALIGNMENT);
		panel2.add(multiresolutionD, new BoxLayout(multiresolutionD, BoxLayout.Y_AXIS));
		multiresolutionD.setAlignmentY(Component.CENTER_ALIGNMENT);
		multiresolutionD.setPreferredSize(new Dimension(600, 25));
		multiresolutionD.setFont(new Font("Arial", Font.BOLD, 12));
		multiresolutionD.setForeground(Color.WHITE);
		
		panel2.add(objectocclusionD,BoxLayout.Y_AXIS);
		objectocclusionD.setPreferredSize(new Dimension(600, 25));
		objectocclusionD.setAlignmentY(Component.CENTER_ALIGNMENT);
		objectocclusionD.setFont(new Font("Arial", Font.BOLD, 12));
		objectocclusionD.setForeground(Color.WHITE);
		
		panel2.add(looseoctreesD,BoxLayout.LINE_AXIS);
		looseoctreesD.setPreferredSize(new Dimension(600,25));
		looseoctreesD.setAlignmentY(Component.CENTER_ALIGNMENT);
		looseoctreesD.setFont(new Font("Arial", Font.BOLD, 12));
		looseoctreesD.setForeground(Color.WHITE);
		
		panel2.add(indeprogressivemeshingD,BoxLayout.LINE_AXIS);
		indeprogressivemeshingD.setPreferredSize(new Dimension(600,25));
		indeprogressivemeshingD.setAlignmentY(Component.CENTER_ALIGNMENT);
		indeprogressivemeshingD.setFont(new Font("Arial", Font.BOLD, 12));
		indeprogressivemeshingD.setForeground(Color.WHITE);
		
		
		panel2.add(interpolated3DkeyframeD,BoxLayout.LINE_AXIS);
		interpolated3DkeyframeD.setPreferredSize(new Dimension(600, 25));
		interpolated3DkeyframeD.setAlignmentY(Component.CENTER_ALIGNMENT);
		interpolated3DkeyframeD.setFont(new Font("Arial", Font.BOLD, 12));
		interpolated3DkeyframeD.setForeground(Color.WHITE);
		
		panel2.add(fastskinningD,BoxLayout.LINE_AXIS);
		fastskinningD.setPreferredSize(new Dimension(600, 25));
		fastskinningD.setAlignmentY(Component.CENTER_ALIGNMENT);
		fastskinningD.setFont(new Font("Arial", Font.BOLD, 12));
		fastskinningD.setForeground(Color.WHITE);
		
		panel2.add(realtimeterrainD,BoxLayout.LINE_AXIS);
		realtimeterrainD.setPreferredSize(new Dimension(600, 25));
		realtimeterrainD.setAlignmentY(Component.CENTER_ALIGNMENT);
		realtimeterrainD.setFont(new Font("Arial", Font.BOLD, 12));
		realtimeterrainD.setForeground(Color.WHITE);
		
		panel2.add(fractalgenerationfaultD,BoxLayout.LINE_AXIS);
		fractalgenerationfaultD.setPreferredSize(new Dimension(600, 25));
		fractalgenerationfaultD.setAlignmentY(Component.CENTER_ALIGNMENT);
		fractalgenerationfaultD.setFont(new Font("Arial", Font.BOLD, 12));
		fractalgenerationfaultD.setForeground(Color.WHITE);

		
		panel2.add(fractalgenerationparticlD,BoxLayout.LINE_AXIS);
		fractalgenerationparticlD.setPreferredSize(new Dimension(600,25));
		fractalgenerationparticlD.setAlignmentY(Component.CENTER_ALIGNMENT);
		fractalgenerationparticlD.setFont(new Font("Arial", Font.BOLD, 12));
		fractalgenerationparticlD.setForeground(Color.WHITE);
		
		panel2.add(twodlensflareD,BoxLayout.LINE_AXIS);
		twodlensflareD.setPreferredSize(new Dimension(600, 25));
		twodlensflareD.setFont(new Font("Arial", Font.BOLD, 12));
		twodlensflareD.setForeground(Color.WHITE);
		
		panel2.add(threehardware2dspritesD,BoxLayout.LINE_AXIS);
		threehardware2dspritesD.setPreferredSize(new Dimension(600, 25));
		threehardware2dspritesD.setAlignmentY(Component.CENTER_ALIGNMENT);
		threehardware2dspritesD.setFont(new Font("Arial", Font.BOLD, 12));
		threehardware2dspritesD.setForeground(Color.WHITE);
		
		panel2.add(motiflightingD,BoxLayout.LINE_AXIS);
		motiflightingD.setPreferredSize(new Dimension(600, 25));
		motiflightingD.setAlignmentY(Component.CENTER_ALIGNMENT);
		motiflightingD.setFont(new Font("Arial", Font.BOLD, 12));
		motiflightingD.setForeground(Color.WHITE);
		
		panel2.add(realtimelightingD,BoxLayout.LINE_AXIS);
		realtimelightingD.setPreferredSize(new Dimension(600, 25));
		realtimelightingD.setAlignmentY(Component.CENTER_ALIGNMENT);
		realtimelightingD.setFont(new Font("Arial", Font.BOLD, 12));
		realtimelightingD.setForeground(Color.WHITE);
		
		panel2.add(attenuationmapsD,BoxLayout.LINE_AXIS);
		attenuationmapsD.setPreferredSize(new Dimension(600, 25));
		attenuationmapsD.setAlignmentY(Component.CENTER_ALIGNMENT);
		attenuationmapsD.setFont(new Font("Arial", Font.BOLD, 12));
		attenuationmapsD.setForeground(Color.WHITE);
		
		panel2.add(advancedTexturingD,BoxLayout.LINE_AXIS);
		advancedTexturingD.setPreferredSize(new Dimension(600, 25));
		advancedTexturingD.setAlignmentY(Component.CENTER_ALIGNMENT);
		advancedTexturingD.setFont(new Font("Arial", Font.BOLD, 12));
		advancedTexturingD.setForeground(Color.WHITE);
		
		panel2.add(hardwareBumpMappingD,BoxLayout.LINE_AXIS);
		hardwareBumpMappingD.setPreferredSize(new Dimension(600, 25));
		hardwareBumpMappingD.setAlignmentY(Component.CENTER_ALIGNMENT);
		hardwareBumpMappingD.setFont(new Font("Arial", Font.BOLD, 12));
		hardwareBumpMappingD.setForeground(Color.WHITE);
		
		panel2.add(realtimeShadowsComplexD, BoxLayout.LINE_AXIS);
		realtimeShadowsComplexD.setPreferredSize(new Dimension(600, 25));
		realtimeShadowsComplexD.setAlignmentY(Component.CENTER_ALIGNMENT);
		realtimeShadowsComplexD.setFont(new Font("Arial", Font.BOLD, 12));
		realtimeShadowsComplexD.setForeground(Color.WHITE);
		
		panel2.add(glossyprefilteringD,BoxLayout.LINE_AXIS);
		glossyprefilteringD.setPreferredSize(new Dimension(600, 25));
		glossyprefilteringD.setAlignmentY(Component.CENTER_ALIGNMENT);
		glossyprefilteringD.setFont(new Font("Arial", Font.BOLD, 12));
		glossyprefilteringD.setForeground(Color.WHITE);
		
		panel2.add(refractionMappingForLiquidsD,BoxLayout.LINE_AXIS);
		refractionMappingForLiquidsD.setPreferredSize(new Dimension(600, 25));
		refractionMappingForLiquidsD.setAlignmentY(Component.CENTER_ALIGNMENT);
		refractionMappingForLiquidsD.setFont(new Font("Arial", Font.BOLD, 12));
		refractionMappingForLiquidsD.setForeground(Color.WHITE);
		//AI Performance
		
		
		JPanel panel3 = new JPanel();
		panel3.setPreferredSize(new Dimension(600,600));
		panel3.setBackground(Color.BLACK);
		
		panel3.add(useFiniteStateMachinesD);
		useFiniteStateMachinesD.setPreferredSize(new Dimension(600, 25));
		useFiniteStateMachinesD.setAlignmentY(Component.CENTER_ALIGNMENT);
		useFiniteStateMachinesD.setFont(new Font("Arial", Font.BOLD, 12));
		useFiniteStateMachinesD.setForeground(Color.WHITE);

		panel3.add(useGameTreesD);
		useGameTreesD.setPreferredSize(new Dimension(600, 25));
		useGameTreesD.setAlignmentY(Component.CENTER_ALIGNMENT);
		useGameTreesD.setFont(new Font("Arial", Font.BOLD, 12));
		useGameTreesD.setForeground(Color.WHITE);
		
		panel3.add(useA_StarPathPlanningD);
		useA_StarPathPlanningD.setPreferredSize(new Dimension(600, 25));
		useA_StarPathPlanningD.setAlignmentY(Component.CENTER_ALIGNMENT);
		useA_StarPathPlanningD.setFont(new Font("Arial", Font.BOLD, 12));
		useA_StarPathPlanningD.setForeground(Color.WHITE);
		
		panel3.add(useA_StarSpeedOptimizationD);
		useA_StarSpeedOptimizationD.setPreferredSize(new Dimension(600, 25));
		useA_StarSpeedOptimizationD.setAlignmentY(Component.CENTER_ALIGNMENT);
		useA_StarSpeedOptimizationD.setFont(new Font("Arial", Font.BOLD, 12));
		useA_StarSpeedOptimizationD.setForeground(Color.WHITE);
		
		panel3.add(useNavigationMeshesD);
		useNavigationMeshesD.setPreferredSize(new Dimension(600, 25));
		useNavigationMeshesD.setAlignmentY(Component.CENTER_ALIGNMENT);
		useNavigationMeshesD.setFont(new Font("Arial", Font.BOLD, 12));
		useNavigationMeshesD.setForeground(Color.WHITE);
		
		panel3.add(useFlockingD);
		useFlockingD.setPreferredSize(new Dimension(600, 25));
		useFlockingD.setAlignmentY(Component.CENTER_ALIGNMENT);
		useFlockingD.setFont(new Font("Arial", Font.BOLD, 12));
		useFlockingD.setForeground(Color.WHITE);
		
		panel3.add(useNeuralNetsD);
		useNeuralNetsD.setPreferredSize(new Dimension(600, 25));
		useNeuralNetsD.setAlignmentY(Component.CENTER_ALIGNMENT);
		useNeuralNetsD.setFont(new Font("Arial", Font.BOLD, 12));
		useNeuralNetsD.setForeground(Color.WHITE);
		
		JPanel panel4 = new JPanel();
		panel4.setPreferredSize(new Dimension(600,1200));
		panel4.setBackground(Color.BLACK);
		
		panel4.add(reduceMemoryUsage);
		reduceMemoryUsage.setPreferredSize(new Dimension(600, 25));
		reduceMemoryUsage.setAlignmentY(Component.CENTER_ALIGNMENT);
		reduceMemoryUsage.setFont(new Font("Arial", Font.BOLD, 12));
		reduceMemoryUsage.setForeground(Color.WHITE);
		
		panel4.add(reduceloopsUsage);
		reduceloopsUsage.setPreferredSize(new Dimension(600, 25));
		reduceloopsUsage.setAlignmentY(Component.CENTER_ALIGNMENT);
		reduceloopsUsage.setFont(new Font("Arial", Font.BOLD, 12));
		reduceloopsUsage.setForeground(Color.WHITE);
		
		panel4.add(drawprimitive);
		drawprimitive.setPreferredSize(new Dimension(600, 25));
		drawprimitive.setAlignmentY(Component.CENTER_ALIGNMENT);
		drawprimitive.setFont(new Font("Arial", Font.BOLD, 12));
		drawprimitive.setForeground(Color.WHITE);
		
		panel4.add(usetrianglestrips);
		usetrianglestrips.setPreferredSize(new Dimension(600, 25));
		usetrianglestrips.setAlignmentY(Component.CENTER_ALIGNMENT);
		usetrianglestrips.setFont(new Font("Arial", Font.BOLD, 12));
		usetrianglestrips.setForeground(Color.WHITE);
		
		panel4.add(strengthreduction);
		strengthreduction.setPreferredSize(new Dimension(600, 25));
		strengthreduction.setAlignmentY(Component.CENTER_ALIGNMENT);
		strengthreduction.setFont(new Font("Arial", Font.BOLD, 12));
		strengthreduction.setForeground(Color.WHITE);
		
		panel4.add(cleaninnergameloop);
		cleaninnergameloop.setPreferredSize(new Dimension(600, 25));
		cleaninnergameloop.setAlignmentY(Component.CENTER_ALIGNMENT);
		cleaninnergameloop.setFont(new Font("Arial", Font.BOLD, 12));
		cleaninnergameloop.setForeground(Color.WHITE);
		
		panel4.add(usehardware);
		usehardware.setPreferredSize(new Dimension(600, 25));
		usehardware.setAlignmentY(Component.CENTER_ALIGNMENT);
		usehardware.setFont(new Font("Arial", Font.BOLD, 12));
		usehardware.setForeground(Color.WHITE);
		
		panel4.add(enumerate);
		enumerate.setPreferredSize(new Dimension(600, 25));
		enumerate.setAlignmentY(Component.CENTER_ALIGNMENT);
		enumerate.setFont(new Font("Arial", Font.BOLD, 12));
		enumerate.setForeground(Color.WHITE);
		
		panel4.add(bigbatch);
		bigbatch.setPreferredSize(new Dimension(600, 25));
		bigbatch.setAlignmentY(Component.CENTER_ALIGNMENT);
		bigbatch.setFont(new Font("Arial", Font.BOLD, 12));
		bigbatch.setForeground(Color.WHITE);
		
		panel4.add(globals);
		globals.setPreferredSize(new Dimension(600, 25));
		globals.setAlignmentY(Component.CENTER_ALIGNMENT);
		globals.setFont(new Font("Arial", Font.BOLD, 12));
		globals.setForeground(Color.WHITE);
		
		panel4.add(combineifs);
		combineifs.setPreferredSize(new Dimension(600, 25));
		combineifs.setAlignmentY(Component.CENTER_ALIGNMENT);
		combineifs.setFont(new Font("Arial", Font.BOLD, 12));
		combineifs.setForeground(Color.WHITE);
		
		panel4.add(fastesttextures);
		fastesttextures.setPreferredSize(new Dimension(600, 25));
		fastesttextures.setAlignmentY(Component.CENTER_ALIGNMENT);
		fastesttextures.setFont(new Font("Arial", Font.BOLD, 12));
		fastesttextures.setForeground(Color.WHITE);
		
		panel4.add(combineifs);
		combineifs.setPreferredSize(new Dimension(600, 25));
		combineifs.setAlignmentY(Component.CENTER_ALIGNMENT);
		combineifs.setFont(new Font("Arial", Font.BOLD, 12));
		combineifs.setForeground(Color.WHITE);
		
		panel4.add(smalltextures);
		smalltextures.setPreferredSize(new Dimension(600, 25));
		smalltextures.setAlignmentY(Component.CENTER_ALIGNMENT);
		smalltextures.setFont(new Font("Arial", Font.BOLD, 12));
		smalltextures.setForeground(Color.WHITE);
		
		panel4.add(reusearrays);
		reusearrays.setPreferredSize(new Dimension(600, 25));
		reusearrays.setAlignmentY(Component.CENTER_ALIGNMENT);
		reusearrays.setFont(new Font("Arial", Font.BOLD, 12));
		reusearrays.setForeground(Color.WHITE);
		
		panel4.add(temparrayse);
		temparrayse.setPreferredSize(new Dimension(600, 25));
		temparrayse.setAlignmentY(Component.CENTER_ALIGNMENT);
		temparrayse.setFont(new Font("Arial", Font.BOLD, 12));
		temparrayse.setForeground(Color.WHITE);
		
		panel4.add(linkedlist);
		linkedlist.setPreferredSize(new Dimension(600, 25));
		linkedlist.setAlignmentY(Component.CENTER_ALIGNMENT);
		linkedlist.setFont(new Font("Arial", Font.BOLD, 12));
		linkedlist.setForeground(Color.WHITE);
		
		panel4.add(dataformat);
		dataformat.setPreferredSize(new Dimension(600, 25));
		dataformat.setAlignmentY(Component.CENTER_ALIGNMENT);
		dataformat.setFont(new Font("Arial", Font.BOLD, 12));
		dataformat.setForeground(Color.WHITE);
		
		panel4.add(thirdbuffer);
		thirdbuffer.setPreferredSize(new Dimension(600, 25));
		thirdbuffer.setAlignmentY(Component.CENTER_ALIGNMENT);
		thirdbuffer.setFont(new Font("Arial", Font.BOLD, 12));
		thirdbuffer.setForeground(Color.WHITE);
		
		panel4.add(looptiming);
		looptiming.setPreferredSize(new Dimension(600, 25));
		looptiming.setAlignmentY(Component.CENTER_ALIGNMENT);
		looptiming.setFont(new Font("Arial", Font.BOLD, 12));
		looptiming.setForeground(Color.WHITE);
		
		panel4.add(cameraMatrix);
		cameraMatrix.setPreferredSize(new Dimension(600, 25));
		cameraMatrix.setAlignmentY(Component.CENTER_ALIGNMENT);
		cameraMatrix.setFont(new Font("Arial", Font.BOLD, 12));
		cameraMatrix.setForeground(Color.WHITE);
		
		panel4.add(reduceMemoryUsage);
		reduceMemoryUsage.setPreferredSize(new Dimension(600, 25));
		reduceMemoryUsage.setAlignmentY(Component.CENTER_ALIGNMENT);
		reduceMemoryUsage.setFont(new Font("Arial", Font.BOLD, 12));
		reduceMemoryUsage.setForeground(Color.WHITE);

		
		
		JPanel panel5 = new JPanel();
		panel5.setPreferredSize(new Dimension(600,1200));
		panel5.setBackground(Color.BLACK);
	
		panel5.add(unrollloop);
		unrollloop.setPreferredSize(new Dimension(600, 25));
		unrollloop.setAlignmentY(Component.CENTER_ALIGNMENT);
		unrollloop.setFont(new Font("Arial", Font.BOLD, 12));
		unrollloop.setForeground(Color.WHITE);
		
		panel5.add(fliploops);
		fliploops.setPreferredSize(new Dimension(600, 25));
		fliploops.setAlignmentY(Component.CENTER_ALIGNMENT);
		fliploops.setFont(new Font("Arial", Font.BOLD, 12));
		fliploops.setForeground(Color.WHITE);
		
		panel5.add(assertifs);
		assertifs.setPreferredSize(new Dimension(600, 25));
		assertifs.setAlignmentY(Component.CENTER_ALIGNMENT);
		assertifs.setFont(new Font("Arial", Font.BOLD, 12));
		assertifs.setForeground(Color.WHITE);
		
		panel5.add(globalsparams);
		globalsparams.setPreferredSize(new Dimension(600, 25));
		globalsparams.setAlignmentY(Component.CENTER_ALIGNMENT);
		globalsparams.setFont(new Font("Arial", Font.BOLD, 12));
		globalsparams.setForeground(Color.WHITE);
		
		panel5.add(compiledsprites);
		compiledsprites.setPreferredSize(new Dimension(600, 25));
		compiledsprites.setAlignmentY(Component.CENTER_ALIGNMENT);
		compiledsprites.setFont(new Font("Arial", Font.BOLD, 12));
		compiledsprites.setForeground(Color.WHITE);
		
		panel5.add(stencilbuffer);
		stencilbuffer.setPreferredSize(new Dimension(600, 25));
		stencilbuffer.setAlignmentY(Component.CENTER_ALIGNMENT);
		stencilbuffer.setFont(new Font("Arial", Font.BOLD, 12));
		stencilbuffer.setForeground(Color.WHITE);
		
		panel5.add(gracefully);
		gracefully.setPreferredSize(new Dimension(600, 25));
		gracefully.setAlignmentY(Component.CENTER_ALIGNMENT);
		gracefully.setFont(new Font("Arial", Font.BOLD, 12));
		gracefully.setForeground(Color.WHITE);
		
		panel5.add(interpolatevexels);
		interpolatevexels.setPreferredSize(new Dimension(600, 25));
		interpolatevexels.setAlignmentY(Component.CENTER_ALIGNMENT);
		interpolatevexels.setFont(new Font("Arial", Font.BOLD, 12));
		interpolatevexels.setForeground(Color.WHITE);
		
		panel5.add(fixedpoint);
		fixedpoint.setPreferredSize(new Dimension(600, 25));
		fixedpoint.setAlignmentY(Component.CENTER_ALIGNMENT);
		fixedpoint.setFont(new Font("Arial", Font.BOLD, 12));
		fixedpoint.setForeground(Color.WHITE);

		panel5.add(littlefiles);
		littlefiles.setPreferredSize(new Dimension(600, 25));
		littlefiles.setAlignmentY(Component.CENTER_ALIGNMENT);
		littlefiles.setFont(new Font("Arial", Font.BOLD, 12));
		littlefiles.setForeground(Color.WHITE);

		panel5.add(calculatelookup);
		calculatelookup.setPreferredSize(new Dimension(600, 25));
		calculatelookup.setAlignmentY(Component.CENTER_ALIGNMENT);
		calculatelookup.setFont(new Font("Arial", Font.BOLD, 12));
		calculatelookup.setForeground(Color.WHITE);

		panel5.add(wordsbytes);
		wordsbytes.setPreferredSize(new Dimension(600, 25));
		wordsbytes.setAlignmentY(Component.CENTER_ALIGNMENT);
		wordsbytes.setFont(new Font("Arial", Font.BOLD, 12));
		wordsbytes.setForeground(Color.WHITE);

		panel5.add(levelofdetail);
		levelofdetail.setPreferredSize(new Dimension(600, 25));
		levelofdetail.setAlignmentY(Component.CENTER_ALIGNMENT);
		levelofdetail.setFont(new Font("Arial", Font.BOLD, 12));
		levelofdetail.setForeground(Color.WHITE);

		panel5.add(precalculate);
		precalculate.setPreferredSize(new Dimension(600, 25));
		precalculate.setAlignmentY(Component.CENTER_ALIGNMENT);
		precalculate.setFont(new Font("Arial", Font.BOLD, 12));
		precalculate.setForeground(Color.WHITE);

		panel5.add(pixeloverdraw);
		pixeloverdraw.setPreferredSize(new Dimension(600, 25));
		pixeloverdraw.setAlignmentY(Component.CENTER_ALIGNMENT);
		pixeloverdraw.setFont(new Font("Arial", Font.BOLD, 12));
		pixeloverdraw.setForeground(Color.WHITE);

		panel5.add(keyboard);
		keyboard.setPreferredSize(new Dimension(600, 25));
		keyboard.setAlignmentY(Component.CENTER_ALIGNMENT);
		keyboard.setFont(new Font("Arial", Font.BOLD, 12));
		keyboard.setForeground(Color.WHITE);

		panel5.add(typeconversion);
		typeconversion.setPreferredSize(new Dimension(600, 25));
		typeconversion.setAlignmentY(Component.CENTER_ALIGNMENT);
		typeconversion.setFont(new Font("Arial", Font.BOLD, 12));
		typeconversion.setForeground(Color.WHITE);

		panel5.add(backfaceremoval);
		backfaceremoval.setPreferredSize(new Dimension(600, 25));
		backfaceremoval.setAlignmentY(Component.CENTER_ALIGNMENT);
		backfaceremoval.setFont(new Font("Arial", Font.BOLD, 12));
		backfaceremoval.setForeground(Color.WHITE);

		
	
		/*
		 * String [] CodePerformanceStringse = 
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


		 * 
		 */
		
		
		
		
		/*
		 * 
		 * String [] programmingOptimizations =//use ...
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
	
		 */
		
		//sroll panes
		
		
		
		
		JScrollPane scrollPanel = new JScrollPane(panel1);
		JScrollPane scrollPanel2 = new JScrollPane(panel2);
		JScrollPane scrollPanel3 = new JScrollPane(panel3);
		JScrollPane scrollPanel4 = new JScrollPane(panel4);
		JScrollPane scrollPanel5 = new JScrollPane(panel5);
		
		//scrollPanel.add(panel1);
		scrollPanel.setPreferredSize(new Dimension(600,600));
		scrollPanel.setForeground(Color.WHITE);
		scrollPanel.setBackground(Color.BLACK);
		
		//add panels to tabbedpane
		
		
		//scrollPanel2.add(panel2);
		scrollPanel2.setPreferredSize(new Dimension(600,600));
		scrollPanel2.setForeground(Color.WHITE);
		scrollPanel2.setBackground(Color.BLACK);
	
		//
		//scrollPanel3.add(panel3);
		scrollPanel3.setPreferredSize(new Dimension(600,600));
		scrollPanel3.setForeground(Color.WHITE);
		scrollPanel3.setBackground(Color.BLACK);
		
		//scrollPanel4.add(panel4);
		scrollPanel4.setPreferredSize(new Dimension(600,600));
		scrollPanel4.setForeground(Color.WHITE);
		scrollPanel4.setBackground(Color.BLACK);
		
		//scrollPanel4.add(panel4);
		scrollPanel5.setPreferredSize(new Dimension(600,600));
		scrollPanel5.setForeground(Color.WHITE);
		scrollPanel5.setBackground(Color.BLACK);
		
			
		
		//add tabbed pane to joptionpane.showConfirmDialog
		
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.addTab("Math Performance", scrollPanel);
		tabbedPane.addTab("Graphics Performance", scrollPanel2);
		tabbedPane.addTab("AI Performance", scrollPanel3);
		tabbedPane.addTab("Code Optimization", scrollPanel4);
		tabbedPane.addTab("Optimization", scrollPanel5);
		
		//panel.add(label);
		JOptionPane optionPane = new JOptionPane();
		optionPane.setForeground(Color.WHITE);
		optionPane.setBackground(Color.BLACK);
		//optionPane.setFont(new Font("Arial", Font.BOLD, 10));
		
		//Font f = new Font("Arial", Font.BOLD, 10);
	    //UIManager.put("Label.font", f);
		
		
		optionPane.showConfirmDialog(null, tabbedPane, "Engine Performance Flags", JOptionPane.YES_NO_OPTION);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		drawDialogues();
		System.out.println("Eigensystem" + eigensystemD.isSelected());
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
	
	
