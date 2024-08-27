package r9;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import j9.y;
import l9.q;

/* loaded from: classes.dex */
public final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33506a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f33507b;

    /* renamed from: c, reason: collision with root package name */
    public final q9.a f33508c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33509d;

    /* renamed from: e, reason: collision with root package name */
    public final q9.e f33510e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f33511f;

    public i(String str, q9.a aVar, q9.a aVar2, q9.d dVar, boolean z10) {
        this.f33507b = str;
        this.f33508c = aVar;
        this.f33510e = aVar2;
        this.f33511f = dVar;
        this.f33509d = z10;
    }

    @Override // r9.b
    public final l9.d a(y yVar, j9.i iVar, s9.b bVar) {
        switch (this.f33506a) {
            case 0:
                return new l9.p(yVar, bVar, this);
            default:
                return new q(yVar, bVar, this);
        }
    }

    public final String toString() {
        switch (this.f33506a) {
            case 0:
                return "RectangleShape{position=" + this.f33510e + ", size=" + ((q9.e) this.f33511f) + UrlTreeKt.componentParamSuffixChar;
            default:
                return super.toString();
        }
    }

    public i(String str, q9.e eVar, bk.c cVar, q9.a aVar, boolean z10) {
        this.f33507b = str;
        this.f33510e = eVar;
        this.f33511f = cVar;
        this.f33508c = aVar;
        this.f33509d = z10;
    }
}
