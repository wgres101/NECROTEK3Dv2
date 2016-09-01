package IDE;

import java.awt.Font;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class InsertMenu {

	
	public JMenu init()
	{
		JMenu insertMenu = new JMenu("Insert");
		insertMenu.setFont(new Font("Arial", Font.BOLD, 10));
		
		JMenuItem necrofile = new JMenuItem("NecroTek 3D Verge File Format ,vrg");
		necrofile.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem studio = new JMenuItem("3D Studio .3ds");
		studio.setFont(new Font("Arial", Font.BOLD, 10));
	

		JMenuItem fbx = new JMenuItem("Autodesk .fbx");
		fbx.setFont(new Font("Arial", Font.BOLD, 10));
		
		JMenuItem daefbx = new JMenuItem("DAE FBX   .dae");
		daefbx.setFont(new Font("Arial", Font.BOLD, 10));
		
		JMenuItem wavefront = new JMenuItem("WaveFront .obj");
		wavefront.setFont(new Font("Arial", Font.BOLD, 10));
		
		JMenuItem blend = new JMenuItem("Blender .blend");
		blend.setFont(new Font("Arial", Font.BOLD, 10));
		
		JMenuItem max = new JMenuItem("3D Studio Max  .max");
		max.setFont(new Font("Arial", Font.BOLD, 10));
		
		JMenuItem dxf = new JMenuItem("DXF AutoCad .dxf");
		dxf.setFont(new Font("Arial", Font.BOLD, 10));

		JMenuItem maya = new JMenuItem("Maya .MB");
		maya.setFont(new Font("Arial", Font.BOLD, 10));
		
		JMenuItem maayascii = new JMenuItem("Maya ASCII .MA");
		maayascii.setFont(new Font("Arial", Font.BOLD, 10));
		
		JMenuItem mel = new JMenuItem("MEL .MEL");
		mel.setFont(new Font("Arial", Font.BOLD, 10));
		
		JMenuItem threeds = new JMenuItem("Legacy 3D Studio .3ds");
		threeds.setFont(new Font("Arial", Font.BOLD, 10));
		
		JMenuItem torque = new JMenuItem("Torque Game Engine .DTS");
		torque.setFont(new Font("Arial", Font.BOLD, 10));
		
		JMenuItem collada = new JMenuItem("Collada Default: DAE");
		collada.setFont(new Font("Arial", Font.BOLD, 10));
		
		
		JMenuItem motioncapture = new JMenuItem("Motion Campture: .BVH");
		motioncapture.setFont(new Font("Arial", Font.BOLD, 10));
		
		
		JMenuItem stanford = new JMenuItem("Stanford: .PLY");
		stanford.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem xthreed = new JMenuItem("X3D Extensible 3D .X3D");
		xthreed.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem stl = new JMenuItem("Stereolithography .STL");
		stl.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem ailllustrator = new JMenuItem("Adobe Illustrator .ai");
		ailllustrator.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem cinema4d = new JMenuItem("Cinema 4D  .c4d");
		cinema4d.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem modo = new JMenuItem("Modo  ");
		modo.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem svg = new JMenuItem("Scalable Vector Graphics");
		svg.setFont(new Font("Arial", Font.BOLD, 10));
		insertMenu.add(studio);
	
		insertMenu.add(fbx);
		insertMenu.add(wavefront);

		
		JMenuItem gTF = new JMenuItem("gTF File  .glb");
		gTF.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem gTF2 = new JMenuItem("gTF File  gltf ");
		gTF2.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem thtrrdsmaxase = new JMenuItem("3DS Max ASE   .ase");
		thtrrdsmaxase.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem industryfc = new JMenuItem("Industry Foundation Classes  .ifc");
		industryfc.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem XGL = new JMenuItem("XGL   .xgl");
		XGL.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem XGL2 = new JMenuItem("XGL   .zgl");
		XGL2.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem stanfordmodel = new JMenuItem("Stanford Polygon Library   .ply");
		stanfordmodel.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem lightwave = new JMenuItem("LightWave  .lwo");
		lightwave.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem lightwavescene = new JMenuItem("LightWave Scene .lwo");
		lightwavescene.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem directX = new JMenuItem ("DirectX .x");
		directX.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem milkshape3d = new JMenuItem("Milkshape 3D.ms3d");
		milkshape3d.setFont(new Font("Arial", Font.BOLD, 10));
		
		JMenuItem truespaceobject = new JMenuItem("trueSpace object  .cob");
		truespaceobject.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem truespacescene = new JMenuItem("trueSpace scene  .scn");
		truespacescene.setFont(new Font("Arial", Font.BOLD, 10));
		
		
		///use seperator
		
		JMenuItem ogrexml = new JMenuItem("OGRE XML");
		ogrexml.setFont(new Font("Arial", Font.BOLD, 10));
		
		JMenuItem irrengine = new JMenuItem("Irrlicht .irrmesh");
		irrengine.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem irrscene = new JMenuItem("Irrlicht Scene  .irr");
		irrscene.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem mdl = new JMenuItem("Quake 1 Model Format .MDL");
		mdl.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem md2 = new JMenuItem("Quake 2 Model Format .MD2");
		md2.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem md3 = new JMenuItem("Quake 3 Model Format .MD3");
		md3.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem mdc = new JMenuItem(("Return to Castle Wolfenstein .mdc"));
		mdc.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem md5 = new JMenuItem("Doom 3 Model Format .md5");
		md5.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem valvemodel = new JMenuItem("Valve Model smd .smd");
		valvemodel.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem valvemodel2 = new JMenuItem("Valve Model vta .vta");
		valvemodel2.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem openGameEngine = new JMenuItem("Open Game Engine Exchange .ogex");
		openGameEngine.setFont(new Font("Arial", Font.BOLD, 10));
		JMenuItem unreal = new JMenuItem("Unreal .3d");
		unreal.setFont(new Font("Arial", Font.BOLD, 10));
		
		
		
		///add to menu
		
		insertMenu.add(necrofile);
		insertMenu.addSeparator();
		insertMenu.add(studio);
		insertMenu.add(fbx);
		insertMenu.add(daefbx);
		insertMenu.add(wavefront);
		insertMenu.add(blend);
		insertMenu.add(max);
		insertMenu.add(dxf);
		insertMenu.add(maya);
		insertMenu.add(maayascii);
		insertMenu.add(mel);
		insertMenu.add(threeds);
		insertMenu.add(torque);
		insertMenu.add(collada);
		insertMenu.add(motioncapture);
		insertMenu.add(stanford);
		insertMenu.add(xthreed);
		insertMenu.add(stl);
		insertMenu.add(ailllustrator);
		insertMenu.add(cinema4d);
		insertMenu.add(modo);
		insertMenu.add(svg);
		insertMenu.add(gTF);
		insertMenu.add(gTF2);
		insertMenu.add(thtrrdsmaxase);
		insertMenu.add(industryfc);
		insertMenu.add(XGL);
		insertMenu.add(XGL2);
		insertMenu.add(stanfordmodel);
		insertMenu.add(lightwave);
		insertMenu.add(lightwavescene);
		insertMenu.add(directX);
		insertMenu.add(milkshape3d);
		insertMenu.add(truespaceobject);
		insertMenu.add(truespacescene);
		
		
		///use seperator
		
		insertMenu.addSeparator();
		
		
		insertMenu.add(ogrexml);
		insertMenu.add(irrengine);
		insertMenu.add(irrscene);
		insertMenu.add(mdl);
		insertMenu.add(md2);
		insertMenu.add(md3);
		insertMenu.add(md5);
		insertMenu.add(valvemodel);
		insertMenu.add(valvemodel2);
		insertMenu.add(openGameEngine);
		insertMenu.add(unreal);
		
		return insertMenu;
	}
}
