package g7;

import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k3 f16801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f16802b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k3 k3Var, m mVar, yt.a aVar) {
        super(2, aVar);
        this.f16801a = k3Var;
        this.f16802b = mVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f16801a, this.f16802b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        int b10;
        int i10;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        k3 k3Var = this.f16801a;
        a4 a4Var = k3Var.f16875f;
        a4 newList = k3Var.f16874e;
        k7.w diffCallback = this.f16802b.f16898a;
        Intrinsics.checkNotNullParameter(a4Var, "<this>");
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        z2 z2Var = (z2) a4Var;
        k7.s e10 = k7.w.e(new b4(a4Var, newList, diffCallback, z2Var.f17162b, ((z2) newList).f17162b));
        Intrinsics.checkNotNullExpressionValue(e10, "PlaceholderPaddedList<T>…    },\n        true\n    )");
        boolean z10 = false;
        Iterable k10 = kotlin.ranges.d.k(0, z2Var.f17162b);
        if (!(k10 instanceof Collection) || !((Collection) k10).isEmpty()) {
            nu.f it = k10.iterator();
            while (true) {
                if (!it.f29173c) {
                    break;
                }
                b10 = it.b();
                i10 = e10.f22563e;
                if (b10 < 0 || b10 >= i10) {
                    break;
                }
                int i11 = e10.f22560b[b10];
                if ((i11 & 15) != 0 && (i11 >> 4) != -1) {
                    z10 = true;
                    break;
                }
            }
            throw new IndexOutOfBoundsException(da.e.m("Index out of bounds - passed position = ", b10, ", old list size = ", i10));
        }
        return new z3(e10, z10);
    }
}
