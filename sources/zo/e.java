package zo;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class e extends to.g {

    /* renamed from: v, reason: collision with root package name */
    public final RectF f42594v;

    public e(to.l lVar, RectF rectF) {
        super(lVar);
        this.f42594v = rectF;
    }

    @Override // to.g, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.invalidateSelf();
        return gVar;
    }

    public e(e eVar) {
        super(eVar);
        this.f42594v = eVar.f42594v;
    }
}
