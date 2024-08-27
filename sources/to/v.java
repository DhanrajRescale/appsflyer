package to;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public float f36322a;

    /* renamed from: b, reason: collision with root package name */
    public float f36323b;

    /* renamed from: c, reason: collision with root package name */
    public float f36324c;

    /* renamed from: d, reason: collision with root package name */
    public float f36325d;

    /* renamed from: e, reason: collision with root package name */
    public float f36326e;

    /* renamed from: f, reason: collision with root package name */
    public float f36327f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f36328g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f36329h = new ArrayList();

    public v() {
        d(s0.g.f34069a, s0.g.f34069a, 270.0f, s0.g.f34069a);
    }

    public final void a(float f10) {
        float f11 = this.f36326e;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f36324c;
        float f14 = this.f36325d;
        r rVar = new r(f13, f14, f13, f14);
        rVar.f36315f = this.f36326e;
        rVar.f36316g = f12;
        this.f36329h.add(new p(rVar));
        this.f36326e = f10;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f36328g;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) arrayList.get(i10)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [to.s, to.t, java.lang.Object] */
    public final void c(float f10, float f11) {
        ?? tVar = new t();
        tVar.f36317b = f10;
        tVar.f36318c = f11;
        this.f36328g.add(tVar);
        q qVar = new q(tVar, this.f36324c, this.f36325d);
        float b10 = qVar.b() + 270.0f;
        float b11 = qVar.b() + 270.0f;
        a(b10);
        this.f36329h.add(qVar);
        this.f36326e = b11;
        this.f36324c = f10;
        this.f36325d = f11;
    }

    public final void d(float f10, float f11, float f12, float f13) {
        this.f36322a = f10;
        this.f36323b = f11;
        this.f36324c = f10;
        this.f36325d = f11;
        this.f36326e = f12;
        this.f36327f = (f12 + f13) % 360.0f;
        this.f36328g.clear();
        this.f36329h.clear();
    }
}
