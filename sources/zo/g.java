package zo;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public abstract class g extends to.h {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f42595y = 0;

    /* renamed from: x, reason: collision with root package name */
    public e f42596x;

    public g(e eVar) {
        super(eVar);
        this.f42596x = eVar;
    }

    @Override // to.h, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f42596x = new e(this.f42596x);
        return this;
    }

    public final void v(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f42596x.f42594v;
        if (f10 != rectF.left || f11 != rectF.top || f12 != rectF.right || f13 != rectF.bottom) {
            rectF.set(f10, f11, f12, f13);
            invalidateSelf();
        }
    }
}
