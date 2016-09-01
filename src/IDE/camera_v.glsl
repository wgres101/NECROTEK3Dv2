#version 430 core

uniform mat4 mv_matrix;
uniform mat4 proj_matrix;
uniform mat4 shadow_matrix;

layout (location = 0) in vec4 position;
layout (location = 1) in vec3 normal;

out vec4 shadow_coord;

uniform vec3 light_pos = vec3(10.0, 10.0, 10.0);
out vec3 N;
out vec3 L;

void main(void)
{
    N = normalize(mat3(mv_matrix) * normal);
    L = normalize(light_pos - (mv_matrix * position).xyz);
    
    shadow_coord = shadow_matrix * position;
    
    gl_Position = proj_matrix * mv_matrix * position;
}