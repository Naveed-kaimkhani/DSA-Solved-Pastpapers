
/**
 *                  Finding Shortest Path from A->G
 * 
 *                              Algorithm
 * Step#1: Choose a starting vertex and assign infinity path values to all other vertices
 * Step#2: Go to each vertex and update its path length
 * Step#3: If the path length of the adjacent vertex is lesser than new path length, don't update it
 * Step#4: Avoid updating path lengths of already visited vertices
 * Step#5: After each iteration, we pick the unvisited vertex with the least path length
 * Step#6: Repeat until all the vertices have been visited
 */

//Formula to update each value --> min(old,marked value + Edge weight)

/**
 *    A  B  C  D  E  F  G  H  J 
 * A (0) *  *  *  *  *  *  *  *
 * C    6 (4)  *  *  *  *  *  *
 * B   (6)     *  8  7  *  *  *
 * F           15 8 (7) *  *  *
 * E           15 (8)   *  *  9
 * J           15       *  10 (9)
 * H           15       * (10)
 * D          (11)     17
 *                    (15)  
 */
   
    //       Shortest path from A -> G
   //         A->C->E->H->D->G   


/**
 *              Adjacency Matrix Of figure 3
 * 
 *   A    B   C   D   E   F   G   H     J
 * A 0    1   1   0   0   0   0   0     0
 * B 1    0   0   1   0   0   0   0     0  
 * C 1    0   0   0   1   1   0   0     0
 * D 0    1   0   0    0  0   1   1     0 
 * E 0    0   1   0   0   0   0   1     1   
 * F 0    0   1   0   0   0  0    0     1
 * G 0    0   0   1   0   0  0    1     0
 * H 0    0   0   1   1   0  1    0     1  
 * J 0    0   0   0   1   1  0    1     0      
 */
public class Q5 {
    
}
