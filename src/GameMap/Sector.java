package GameMap;

import SceneGraph.SceneGraphNode;

//A sector ids an isolated space, like a room, usually enclosed
//and easier to render. Each sector in NecroTek is subdivided into
//octrees


public class Sector extends SceneGraphNode{
	Octree octree = new Octree();
}
