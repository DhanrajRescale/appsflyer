package y8;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f41331a;

    /* renamed from: b, reason: collision with root package name */
    public final j f41332b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f41333c;

    public e(Drawable drawable, j jVar, Throwable th2) {
        this.f41331a = drawable;
        this.f41332b = jVar;
        this.f41333c = th2;
    }

    @Override // y8.k
    public final Drawable a() {
        return this.f41331a;
    }

    @Override // y8.k
    public final j b() {
        return this.f41332b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (Intrinsics.a(this.f41331a, eVar.f41331a)) {
                if (Intrinsics.a(this.f41332b, eVar.f41332b) && Intrinsics.a(this.f41333c, eVar.f41333c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        Drawable drawable = this.f41331a;
        if (drawable != null) {
            i10 = drawable.hashCode();
        } else {
            i10 = 0;
        }
        return this.f41333c.hashCode() + ((this.f41332b.hashCode() + (i10 * 31)) * 31);
    }
}
