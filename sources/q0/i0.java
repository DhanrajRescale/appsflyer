package q0;

import android.graphics.Rect;
import android.graphics.drawable.RippleDrawable;

/* loaded from: classes.dex */
public final class i0 extends RippleDrawable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f31504a;

    /* renamed from: b, reason: collision with root package name */
    public n1.t f31505b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f31506c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f31507d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i0(boolean r5) {
        /*
            r4 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1 = 0
            if (r5 == 0) goto L10
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r3 = -1
            r2.<init>(r3)
            goto L11
        L10:
            r2 = r1
        L11:
            r4.<init>(r0, r1, r2)
            r4.f31504a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.i0.<init>(boolean):void");
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f31504a) {
            this.f31507d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f31507d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f31507d;
    }
}
