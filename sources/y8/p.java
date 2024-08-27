package y8;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f41406a;

    /* renamed from: b, reason: collision with root package name */
    public final j f41407b;

    /* renamed from: c, reason: collision with root package name */
    public final p8.f f41408c;

    /* renamed from: d, reason: collision with root package name */
    public final w8.c f41409d;

    /* renamed from: e, reason: collision with root package name */
    public final String f41410e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f41411f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f41412g;

    public p(Drawable drawable, j jVar, p8.f fVar, w8.c cVar, String str, boolean z10, boolean z11) {
        this.f41406a = drawable;
        this.f41407b = jVar;
        this.f41408c = fVar;
        this.f41409d = cVar;
        this.f41410e = str;
        this.f41411f = z10;
        this.f41412g = z11;
    }

    @Override // y8.k
    public final Drawable a() {
        return this.f41406a;
    }

    @Override // y8.k
    public final j b() {
        return this.f41407b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (Intrinsics.a(this.f41406a, pVar.f41406a)) {
                if (Intrinsics.a(this.f41407b, pVar.f41407b) && this.f41408c == pVar.f41408c && Intrinsics.a(this.f41409d, pVar.f41409d) && Intrinsics.a(this.f41410e, pVar.f41410e) && this.f41411f == pVar.f41411f && this.f41412g == pVar.f41412g) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f41408c.hashCode() + ((this.f41407b.hashCode() + (this.f41406a.hashCode() * 31)) * 31)) * 31;
        int i11 = 0;
        w8.c cVar = this.f41409d;
        if (cVar != null) {
            i10 = cVar.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str = this.f41410e;
        if (str != null) {
            i11 = str.hashCode();
        }
        return Boolean.hashCode(this.f41412g) + v.e.d(this.f41411f, (i12 + i11) * 31, 31);
    }
}
