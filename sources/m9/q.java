package m9;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class q extends e {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f27669i;

    /* renamed from: j, reason: collision with root package name */
    public final PointF f27670j;

    /* renamed from: k, reason: collision with root package name */
    public final e f27671k;

    /* renamed from: l, reason: collision with root package name */
    public final e f27672l;

    /* renamed from: m, reason: collision with root package name */
    public x9.c f27673m;

    /* renamed from: n, reason: collision with root package name */
    public x9.c f27674n;

    public q(i iVar, i iVar2) {
        super(Collections.emptyList());
        this.f27669i = new PointF();
        this.f27670j = new PointF();
        this.f27671k = iVar;
        this.f27672l = iVar2;
        j(this.f27642d);
    }

    @Override // m9.e
    public final Object f() {
        return l(s0.g.f34069a);
    }

    @Override // m9.e
    public final /* bridge */ /* synthetic */ Object g(x9.a aVar, float f10) {
        return l(f10);
    }

    @Override // m9.e
    public final void j(float f10) {
        e eVar = this.f27671k;
        eVar.j(f10);
        e eVar2 = this.f27672l;
        eVar2.j(f10);
        this.f27669i.set(((Float) eVar.f()).floatValue(), ((Float) eVar2.f()).floatValue());
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f27639a;
            if (i10 < arrayList.size()) {
                ((a) arrayList.get(i10)).a();
                i10++;
            } else {
                return;
            }
        }
    }

    public final PointF l(float f10) {
        Float f11;
        e eVar;
        x9.a b10;
        float floatValue;
        e eVar2;
        x9.a b11;
        float floatValue2;
        Float f12 = null;
        if (this.f27673m != null && (b11 = (eVar2 = this.f27671k).b()) != null) {
            float d10 = eVar2.d();
            Float f13 = b11.f40121h;
            x9.c cVar = this.f27673m;
            float f14 = b11.f40120g;
            if (f13 == null) {
                floatValue2 = f14;
            } else {
                floatValue2 = f13.floatValue();
            }
            f11 = (Float) cVar.n(f14, floatValue2, (Float) b11.f40115b, (Float) b11.f40116c, f10, f10, d10);
        } else {
            f11 = null;
        }
        if (this.f27674n != null && (b10 = (eVar = this.f27672l).b()) != null) {
            float d11 = eVar.d();
            Float f15 = b10.f40121h;
            x9.c cVar2 = this.f27674n;
            float f16 = b10.f40120g;
            if (f15 == null) {
                floatValue = f16;
            } else {
                floatValue = f15.floatValue();
            }
            f12 = (Float) cVar2.n(f16, floatValue, (Float) b10.f40115b, (Float) b10.f40116c, f10, f10, d11);
        }
        PointF pointF = this.f27669i;
        PointF pointF2 = this.f27670j;
        if (f11 == null) {
            pointF2.set(pointF.x, s0.g.f34069a);
        } else {
            pointF2.set(f11.floatValue(), s0.g.f34069a);
        }
        if (f12 == null) {
            pointF2.set(pointF2.x, pointF.y);
        } else {
            pointF2.set(pointF2.x, f12.floatValue());
        }
        return pointF2;
    }
}
