package ik;

import ak.b0;
import ak.e0;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class a implements e0, b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f20088a;

    public a(Drawable drawable) {
        if (drawable != null) {
            this.f20088a = drawable;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // ak.e0
    public final Object get() {
        Drawable drawable = this.f20088a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            return constantState.newDrawable();
        }
        return drawable;
    }
}
