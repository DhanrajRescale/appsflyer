package s8;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f34322a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f34323b;

    /* renamed from: c, reason: collision with root package name */
    public final p8.f f34324c;

    public d(Drawable drawable, boolean z10, p8.f fVar) {
        this.f34322a = drawable;
        this.f34323b = z10;
        this.f34324c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (Intrinsics.a(this.f34322a, dVar.f34322a) && this.f34323b == dVar.f34323b && this.f34324c == dVar.f34324c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f34324c.hashCode() + v.e.d(this.f34323b, this.f34322a.hashCode() * 31, 31);
    }
}
