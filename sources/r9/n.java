package r9;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import j9.y;
import l9.s;

/* loaded from: classes.dex */
public final class n implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f33525a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33526b;

    /* renamed from: c, reason: collision with root package name */
    public final bk.c f33527c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33528d;

    public n(String str, int i10, bk.c cVar, boolean z10) {
        this.f33525a = str;
        this.f33526b = i10;
        this.f33527c = cVar;
        this.f33528d = z10;
    }

    @Override // r9.b
    public final l9.d a(y yVar, j9.i iVar, s9.b bVar) {
        return new s(yVar, bVar, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.f33525a);
        sb2.append(", index=");
        return a3.a.i(sb2, this.f33526b, UrlTreeKt.componentParamSuffixChar);
    }
}
