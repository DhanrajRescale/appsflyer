package r9;

import j9.y;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f33461a;

    /* renamed from: b, reason: collision with root package name */
    public final q9.e f33462b;

    /* renamed from: c, reason: collision with root package name */
    public final bk.c f33463c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33464d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33465e;

    public a(String str, q9.e eVar, bk.c cVar, boolean z10, boolean z11) {
        this.f33461a = str;
        this.f33462b = eVar;
        this.f33463c = cVar;
        this.f33464d = z10;
        this.f33465e = z11;
    }

    @Override // r9.b
    public final l9.d a(y yVar, j9.i iVar, s9.b bVar) {
        return new l9.g(yVar, bVar, this);
    }
}
