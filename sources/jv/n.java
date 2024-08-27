package jv;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class n implements e {

    /* renamed from: a, reason: collision with root package name */
    public final lv.m f21708a;

    /* renamed from: b, reason: collision with root package name */
    public final z f21709b;

    /* renamed from: c, reason: collision with root package name */
    public final u f21710c;

    /* renamed from: d, reason: collision with root package name */
    public volatile i f21711d;

    public n(lv.m mVar, z zVar, u uVar) {
        this.f21708a = mVar;
        this.f21709b = zVar;
        this.f21710c = uVar;
    }

    @Override // jv.e
    public final boolean a(e5.o oVar, StringBuilder sb2) {
        Long e10 = oVar.e(this.f21708a);
        if (e10 == null) {
            return false;
        }
        String a10 = this.f21710c.a(this.f21708a, e10.longValue(), this.f21709b, (Locale) oVar.f15031d);
        if (a10 == null) {
            if (this.f21711d == null) {
                this.f21711d = new i(this.f21708a, 1, 19, 1);
            }
            return this.f21711d.a(oVar, sb2);
        }
        sb2.append(a10);
        return true;
    }

    public final String toString() {
        z zVar = z.f21739a;
        lv.m mVar = this.f21708a;
        z zVar2 = this.f21709b;
        if (zVar2 == zVar) {
            return "Text(" + mVar + ")";
        }
        return "Text(" + mVar + "," + zVar2 + ")";
    }
}
