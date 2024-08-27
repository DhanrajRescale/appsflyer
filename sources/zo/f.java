package zo;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* loaded from: classes2.dex */
public final class f extends g {
    @Override // to.h
    public final void g(Canvas canvas) {
        if (this.f42596x.f42594v.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f42596x.f42594v);
        } else {
            canvas.clipRect(this.f42596x.f42594v, Region.Op.DIFFERENCE);
        }
        super.g(canvas);
        canvas.restore();
    }
}
