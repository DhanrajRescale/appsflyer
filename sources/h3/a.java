package h3;

import g3.k;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a extends g3.g {
    public final /* synthetic */ int n0;

    /* renamed from: o0, reason: collision with root package name */
    public final float f17912o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k kVar, int i10) {
        super(kVar, 4);
        this.n0 = i10;
        if (i10 != 1) {
            this.f17912o0 = 0.5f;
        } else {
            super(kVar, 4);
            this.f17912o0 = 0.5f;
        }
    }

    @Override // g3.g, g3.b, g3.h
    public final void a() {
        ArrayList arrayList = this.f16495m0;
        int i10 = this.n0;
        k kVar = this.f16493k0;
        switch (i10) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    g3.b b10 = kVar.b(it.next());
                    b10.h();
                    Object obj = this.N;
                    if (obj != null) {
                        b10.p(obj);
                    } else {
                        Object obj2 = this.O;
                        if (obj2 != null) {
                            b10.f16455j0 = 6;
                            b10.O = obj2;
                        } else {
                            b10.p(k.f16503k);
                        }
                    }
                    Object obj3 = this.P;
                    if (obj3 != null) {
                        b10.f16455j0 = 7;
                        b10.P = obj3;
                    } else {
                        Object obj4 = this.Q;
                        if (obj4 != null) {
                            b10.j(obj4);
                        } else {
                            b10.j(k.f16503k);
                        }
                    }
                    float f10 = this.f17912o0;
                    if (f10 != 0.5f) {
                        b10.f16450h = f10;
                    }
                }
                return;
            default:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    g3.b b11 = kVar.b(it2.next());
                    b11.i();
                    Object obj5 = this.R;
                    if (obj5 != null) {
                        b11.q(obj5);
                    } else {
                        Object obj6 = this.S;
                        if (obj6 != null) {
                            b11.f16455j0 = 10;
                            b11.S = obj6;
                        } else {
                            b11.q(k.f16503k);
                        }
                    }
                    Object obj7 = this.U;
                    if (obj7 != null) {
                        b11.f16455j0 = 12;
                        b11.U = obj7;
                    } else {
                        Object obj8 = this.V;
                        if (obj8 != null) {
                            b11.f(obj8);
                        } else {
                            b11.f(k.f16503k);
                        }
                    }
                    float f11 = this.f17912o0;
                    if (f11 != 0.5f) {
                        b11.f16452i = f11;
                    }
                }
                return;
        }
    }
}
