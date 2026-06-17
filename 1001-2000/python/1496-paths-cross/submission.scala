object Solution {
    def isPathCrossing(path: String): Boolean = {
        var pointX = 0
        var pointY = 0
        // array buffer to keep track of points
        var points = scala.collection.mutable.ArrayBuffer.empty[(Int, Int)]
        var point = (pointX, pointY)
        points +=  point// add origin point
        for(direction <- path){
            if(direction=='N'){
                pointY += 1
            } else if(direction=='S'){
                pointY -= 1
            } else if(direction=='E'){
                pointX += 1
            } else if(direction=='W'){
                pointX -= 1
            }
            point = (pointX, pointY)
            if(!points.contains(point)){
                points +=  point
            } else {
                return(true)
            }
        }
        return(false)
    }
}
