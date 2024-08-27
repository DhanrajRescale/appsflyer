package m9;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class h implements a {

    /* renamed from: a, reason: collision with root package name */
    public final a f27648a;

    /* renamed from: b, reason: collision with root package name */
    public final e f27649b;

    /* renamed from: c, reason: collision with root package name */
    public final i f27650c;

    /* renamed from: d, reason: collision with root package name */
    public final i f27651d;

    /* renamed from: e, reason: collision with root package name */
    public final i f27652e;

    /* renamed from: f, reason: collision with root package name */
    public final i f27653f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27654g = true;

    public h(a aVar, s9.b bVar, q.h hVar) {
        this.f27648a = aVar;
        e a10 = ((bk.c) hVar.f31450b).a();
        this.f27649b = a10;
        a10.a(this);
        bVar.g(a10);
        e a11 = ((q9.a) hVar.f31451c).a();
        this.f27650c = (i) a11;
        a11.a(this);
        bVar.g(a11);
        e a12 = ((q9.a) hVar.f31452d).a();
        this.f27651d = (i) a12;
        a12.a(this);
        bVar.g(a12);
        e a13 = ((q9.a) hVar.f31453e).a();
        this.f27652e = (i) a13;
        a13.a(this);
        bVar.g(a13);
        e a14 = ((q9.a) hVar.f31454f).a();
        this.f27653f = (i) a14;
        a14.a(this);
        bVar.g(a14);
    }

    @Override // m9.a
    public final void a() {
        this.f27654g = true;
        this.f27648a.a();
    }

    public final void b(k9.a aVar) {
        if (!this.f27654g) {
            return;
        }
        this.f27654g = false;
        double floatValue = ((Float) this.f27651d.f()).floatValue() * 0.017453292519943295d;
        float floatValue2 = ((Float) this.f27652e.f()).floatValue();
        float sin = ((float) Math.sin(floatValue)) * floatValue2;
        float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
        int intValue = ((Integer) this.f27649b.f()).intValue();
        aVar.setShadowLayer(((Float) this.f27653f.f()).floatValue(), sin, cos, Color.argb(Math.round(((Float) this.f27650c.f()).floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
    }

    public final void c(x9.c cVar) {
        i iVar = this.f27650c;
        if (cVar == null) {
            iVar.k(null);
        } else {
            iVar.k(new g(cVar));
        }
    }
}
