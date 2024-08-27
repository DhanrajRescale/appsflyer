package ug;

import b0.p1;
import com.assetgro.stockgro.prod.R;
import d2.w0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n1.t;
import t0.n;
import t0.r;

/* loaded from: classes.dex */
public final class c extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f37164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37165b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i10, List list) {
        super(3);
        this.f37164a = list;
        this.f37165b = i10;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        p1 TextButton = (p1) obj;
        n nVar = (n) obj2;
        int intValue = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        if ((intValue & 81) == 16) {
            r rVar = (r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        al.d.C((String) this.f37164a.get(this.f37165b), null, w0.e(R.color.black_1A1A1A, nVar), 0L, null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 1572864, 0, 131002);
        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(g1.l.f16404b, 8), nVar);
        androidx.compose.foundation.a.c(w0.u(R.drawable.ic_dropdown_icon, nVar, 6), "Expand dropdown", null, null, null, s0.g.f34069a, kq.e.P(5, t.f28170b), nVar, 1572920, 60);
        return Unit.f23355a;
    }
}
