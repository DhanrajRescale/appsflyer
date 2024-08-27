package c;

import android.os.Bundle;
import c2.j0;
import i0.d2;
import i0.q1;
import i0.s2;
import iu.x;
import j2.e0;
import j2.f0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n1.p;
import p2.c0;
import p2.v;
import t0.l3;
import t0.n0;
import t0.o0;
import t0.t;
import vt.i0;
import z2.r;
import z2.u;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7410b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7411c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7414f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        super(1);
        this.f7409a = i10;
        this.f7410b = obj;
        this.f7411c = obj2;
        this.f7412d = obj3;
        this.f7413e = obj4;
        this.f7414f = obj5;
    }

    public final n0 a(o0 DisposableEffect) {
        int i10 = this.f7409a;
        Object obj = this.f7414f;
        Object obj2 = this.f7412d;
        Object obj3 = this.f7413e;
        Object obj4 = this.f7411c;
        Object obj5 = this.f7410b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                a aVar = (a) obj5;
                aVar.f7405a = ((e.h) obj4).d((String) obj2, (f.a) obj3, new b((l3) obj));
                return new c(aVar, 0);
            default:
                r rVar = (r) obj5;
                rVar.f41960n.addView(rVar, rVar.f41961o);
                rVar.j((Function0) obj4, (u) obj3, (String) obj2, (w2.k) obj);
                return new c(rVar, 11);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f10;
        m1.d dVar;
        e0 e0Var;
        List list;
        int i10 = this.f7409a;
        Object obj2 = this.f7414f;
        Object obj3 = this.f7413e;
        Object obj4 = this.f7412d;
        Object obj5 = this.f7411c;
        Object obj6 = this.f7410b;
        switch (i10) {
            case 0:
                return a((o0) obj);
            case 1:
                j0 j0Var = (j0) ((p1.e) obj);
                j0Var.a();
                float floatValue = ((Number) ((w.d) obj6).d()).floatValue();
                if (floatValue < s0.g.f34069a) {
                    floatValue = 0.0f;
                }
                if (floatValue > 1.0f) {
                    f10 = 1.0f;
                } else {
                    f10 = floatValue;
                }
                if (f10 != s0.g.f34069a) {
                    long j10 = ((c0) obj4).f30523b;
                    int i11 = f0.f20711c;
                    int b10 = ((v) obj5).b((int) (j10 >> 32));
                    s2 d10 = ((q1) obj3).d();
                    if (d10 != null && (e0Var = d10.f19194a) != null) {
                        dVar = e0Var.c(b10);
                    } else {
                        dVar = new m1.d(s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a);
                    }
                    float c02 = j0Var.c0(d2.f18833b);
                    float f11 = c02 / 2;
                    float a10 = kotlin.ranges.d.a(kotlin.ranges.d.c(dVar.f27239a + f11, m1.f.e(j0Var.f7740a.d()) - f11), f11);
                    p1.h.Z(j0Var, (p) obj2, t.g(a10, dVar.f27240b), t.g(a10, dVar.f27242d), c02, f10, 432);
                }
                return Unit.f23355a;
            case 2:
                return a((o0) obj);
            default:
                androidx.navigation.n entry = (androidx.navigation.n) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                ((iu.v) obj6).f20556a = true;
                List list2 = (List) obj5;
                int indexOf = list2.indexOf(entry);
                if (indexOf != -1) {
                    x xVar = (x) obj4;
                    int i12 = indexOf + 1;
                    list = list2.subList(xVar.f20558a, i12);
                    xVar.f20558a = i12;
                } else {
                    list = i0.f38321a;
                }
                ((androidx.navigation.t) obj3).a(entry.f2258b, (Bundle) obj2, entry, list);
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar, Function0 function0, u uVar, String str, w2.k kVar) {
        super(1);
        this.f7409a = 2;
        this.f7410b = rVar;
        this.f7411c = function0;
        this.f7413e = uVar;
        this.f7412d = str;
        this.f7414f = kVar;
    }
}
