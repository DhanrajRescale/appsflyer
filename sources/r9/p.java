package r9;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import j9.y;
import l9.u;

/* loaded from: classes.dex */
public final class p implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f33539a;

    /* renamed from: b, reason: collision with root package name */
    public final q9.a f33540b;

    /* renamed from: c, reason: collision with root package name */
    public final q9.a f33541c;

    /* renamed from: d, reason: collision with root package name */
    public final q9.a f33542d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33543e;

    public p(String str, int i10, q9.a aVar, q9.a aVar2, q9.a aVar3, boolean z10) {
        this.f33539a = i10;
        this.f33540b = aVar;
        this.f33541c = aVar2;
        this.f33542d = aVar3;
        this.f33543e = z10;
    }

    @Override // r9.b
    public final l9.d a(y yVar, j9.i iVar, s9.b bVar) {
        return new u(bVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f33540b + ", end: " + this.f33541c + ", offset: " + this.f33542d + UrlTreeKt.componentParamSuffix;
    }
}
