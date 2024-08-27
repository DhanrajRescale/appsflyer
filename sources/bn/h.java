package bn;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

/* loaded from: classes2.dex */
public abstract class h extends c {

    /* renamed from: h, reason: collision with root package name */
    public Path f7172h;

    public final void o(Canvas canvas, Path path, Drawable drawable) {
        DisplayMetrics displayMetrics = cn.h.f8264a;
        int save = canvas.save();
        canvas.clipPath(path);
        RectF rectF = ((cn.i) this.f3178b).f8275b;
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }
}
