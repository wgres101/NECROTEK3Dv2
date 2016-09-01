package IDE;

public class DataObject {
    /** Origin of object. */
    double dX, dY;

    /** Width and height of object. */
    double dWidth, dHeight;
    
    /** RGB color components. */
    float [] afColor;

    public DataObject() {
    }

    public float getX() {
        return( (float)dX );
    }

    public void setX( double dXParam ) {
        dX = dXParam;
    }

    public float getY() {
        return( (float)dY );
    }

    public void setY( double dYParam ) {
        dY = dYParam;
    }

    public float getWidth() {
        return( (float)dWidth );
    }

    public void setWidth( double dWidthParam ) {
        dWidth = dWidthParam;
    }

    public float getHeight() {
        return( (float)dHeight );
    }

    public void setHeight( double dHeightParam ) {
        dHeight = dHeightParam;
    }

    public float [] getColor() {
        return( afColor );
    }

    public void setColor( float [] afColorParam ) {
        afColor = afColorParam;
    }
}
