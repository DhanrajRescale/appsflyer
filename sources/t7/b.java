package t7;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35443a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f35444b;

    public b() {
        super(Matrix.class, "imageMatrixProperty");
        this.f35444b = new Matrix();
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f35443a) {
            case 0:
                ((Drawable) obj).copyBounds((Rect) this.f35444b);
                Rect rect = (Rect) this.f35444b;
                return new PointF(rect.left, rect.top);
            default:
                ((Matrix) this.f35444b).set(((ImageView) obj).getImageMatrix());
                return (Matrix) this.f35444b;
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f35443a) {
            case 0:
                Drawable drawable = (Drawable) obj;
                PointF pointF = (PointF) obj2;
                drawable.copyBounds((Rect) this.f35444b);
                ((Rect) this.f35444b).offsetTo(Math.round(pointF.x), Math.round(pointF.y));
                drawable.setBounds((Rect) this.f35444b);
                return;
            default:
                ((ImageView) obj).setImageMatrix((Matrix) obj2);
                return;
        }
    }

    public b(int i10) {
        super(PointF.class, "boundsOrigin");
        this.f35444b = new Rect();
    }
}
