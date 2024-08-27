package u9;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class h implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h f37000a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final tr.e f37001b = tr.e.y("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p9.b] */
    @Override // u9.i0
    public final Object i(v9.c cVar, float f10) {
        String str;
        cVar.b();
        String str2 = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = true;
        int i13 = 3;
        String str3 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (cVar.g()) {
            switch (cVar.H(f37001b)) {
                case 0:
                    str2 = cVar.v();
                    continue;
                case 1:
                    str = str2;
                    str3 = cVar.v();
                    break;
                case 2:
                    str = str2;
                    f11 = (float) cVar.l();
                    break;
                case 3:
                    str = str2;
                    int n10 = cVar.n();
                    if (n10 <= 2 && n10 >= 0) {
                        i13 = w.k.g(3)[n10];
                        break;
                    } else {
                        i13 = 3;
                        break;
                    }
                case 4:
                    i10 = cVar.n();
                    continue;
                case 5:
                    f12 = (float) cVar.l();
                    continue;
                case 6:
                    f13 = (float) cVar.l();
                    continue;
                case 7:
                    i11 = p.a(cVar);
                    continue;
                case 8:
                    i12 = p.a(cVar);
                    continue;
                case 9:
                    f14 = (float) cVar.l();
                    continue;
                case 10:
                    z10 = cVar.j();
                    continue;
                case 11:
                    cVar.a();
                    pointF = new PointF(((float) cVar.l()) * f10, ((float) cVar.l()) * f10);
                    cVar.c();
                    continue;
                case 12:
                    cVar.a();
                    str = str2;
                    pointF2 = new PointF(((float) cVar.l()) * f10, ((float) cVar.l()) * f10);
                    cVar.c();
                    break;
                default:
                    cVar.I();
                    cVar.J();
                    continue;
            }
            str2 = str;
        }
        cVar.d();
        ?? obj = new Object();
        obj.f30771a = str2;
        obj.f30772b = str3;
        obj.f30773c = f11;
        obj.f30774d = i13;
        obj.f30775e = i10;
        obj.f30776f = f12;
        obj.f30777g = f13;
        obj.f30778h = i11;
        obj.f30779i = i12;
        obj.f30780j = f14;
        obj.f30781k = z10;
        obj.f30782l = pointF;
        obj.f30783m = pointF2;
        return obj;
    }
}
