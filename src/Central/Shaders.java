package Central;

public class Shaders {
	/**************SHADERS********************/
	
	public static String vertexShaderString =
			/* Introducing the OpenGL ES 2 Vertex shader
			     *
			     * The main loop inside the vertex shader gets executed
			     * one time for each vertex.
			     *
			     *      vertex -> *       uniform data -> mat4 projection = ( 1, 0, 0, 0,
			     *      (0,1,0)  / \                                          0, 1, 0, 0,
			     *              / . \  <- origo (0,0,0)                       0, 0, 1, 0,
			     *             /     \                                        0, 0,-1, 1 );
			     *  vertex -> *-------* <- vertex
			     *  (-1,-1,0)             (1,-1,0) <- attribute data can be used
			     *                        (0, 0,1)    for color, position, normals etc.
			     *
			     * The vertex shader recive input data in form of
			     * "uniform" data that are common to all vertex
			     * and
			     * "attribute" data that are individual to each vertex.
			     * One vertex can have several "attribute" data sources enabled.
			     *
			     * The vertex shader produce output used by the fragment shader.
			     * gl_Position are expected to get set to the final vertex position.
			     * You can also send additional user defined
			    * "varying" data to the fragment shader.
			    *
			    * Model Translate, Scale and Rotate are done here by matrix-multiplying a
			    * projection matrix against each vertex position.
			    *
			    * The whole vertex shader program are a String containing GLSL ES language
			    * http://www.khronos.org/registry/gles/specs/2.0/GLSL_ES_Specification_1.0.17.pdf
			    * sent to the GPU driver for compilation.
			   // For GLSL 1 and 1.1 code i highly recomend to not include a
			   // GLSL ES language #version line, GLSL ES section 3.4
			   // Many GPU drivers refuse to compile the shader if #version is different from
			   // the drivers internal GLSL version.
			    //
			   // This demo use GLSL version 1.1 (the implicit version)
			   */
			     "#if __VERSION__ >= 130\n" + // GLSL 130+ uses in and out
			   "  #define attribute in\n" + // instead of attribute and varying
			   "  #define varying out\n" +  // used by OpenGL 3 core and later.
			   "#endif\n" +
			   
			   "#ifdef GL_ES \n" +
			   "precision mediump float; \n" + // Precision Qualifiers
			   "precision mediump int; \n" +   // GLSL ES section 4.5.2
			   "#endif \n" +
			   
			   "uniform mat4    uniform_Projection; \n" + // Incomming data used by
			   "attribute vec4  attribute_Position; \n" + // the vertex shader
			   "attribute vec4  attribute_Color; \n" +    // uniform and attributes
			   "varying vec4    varying_Color; \n" + // Outgoing varying data
			                                         // sent to the fragment shader
			   "void main(void) \n" +
			   "{ \n" +
			    "  varying_Color = attribute_Color; \n" +
			   "  gl_Position = uniform_Projection * attribute_Position; \n" +
			   "} ";
			   
			   /* Introducing the OpenGL ES 2 Fragment shader
			    *
			    * The main loop of the fragment shader gets executed for each visible
			    * pixel fragment on the render buffer.
			    *
			    *       vertex-> *
			    *      (0,1,-1) /f\
			    *              /ffF\ <- This fragment F gl_FragCoord get interpolated
			    *             /fffff\                   to (0.25,0.25,-1) based on the
			    *   vertex-> *fffffff* <-vertex         three vertex gl_Position.
			   *  (-1,-1,-1)           (1,-1,-1)
			    *
			    *
			    * All incomming "varying" and gl_FragCoord data to the fragment shader
			    * gets interpolated based on the vertex positions.
			    *
			    * The fragment shader produce and store the final color data output into
			    * gl_FragColor.
			    *
			    * Is up to you to set the final colors and calculate lightning here based on
			    * supplied position, color and normal data.
			    *
			    * The whole fragment shader program are a String containing GLSL ES language
			    * http://www.khronos.org/registry/gles/specs/2.0/GLSL_ES_Specification_1.0.17.pdf
			    * sent to the GPU driver for compilation.
			    */
			   public static String fragmentShaderString = 
			   "#if __VERSION__ >= 130\n" +
			   "  #define varying in\n" +
			   "  out vec4 mgl_FragColor;\n" +
			   "  #define texture2D texture\n" +
			   "  #define gl_FragColor mgl_FragColor\n" +
			   "#endif\n" +
			   
			   "#ifdef GL_ES \n" +
			    "precision mediump float; \n" +
			   "precision mediump int; \n" +
			   "#endif \n" +
			   
			   "varying   vec4    varying_Color; \n" + //incomming varying data to the
			                                           //frament shader
			                                           //sent from the vertex shader
			   "void main (void) \n" +
			   "{ \n" +
			   "  gl_FragColor = varying_Color; \n" +
			   "} ";
	
}
