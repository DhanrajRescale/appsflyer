package p8;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f30743a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30744b;

    public g(BitmapDrawable bitmapDrawable, boolean z10) {
        this.f30743a = bitmapDrawable;
        this.f30744b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (Intrinsics.a(this.f30743a, gVar.f30743a) && this.f30744b == gVar.f30744b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30744b) + (this.f30743a.hashCode() * 31);
    }
}
