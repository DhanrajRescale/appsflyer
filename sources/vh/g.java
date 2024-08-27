package vh;

import android.graphics.RectF;
import au.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n1.p0;
import qu.f0;
import t0.g1;
import ut.n;

/* loaded from: classes.dex */
public final class g extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1 f38076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f38077b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f38078c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(g1 g1Var, g1 g1Var2, g1 g1Var3, yt.a aVar) {
        super(2, aVar);
        this.f38076a = g1Var;
        this.f38077b = g1Var2;
        this.f38078c = g1Var3;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new g(this.f38076a, this.f38077b, this.f38078c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        n.b(obj);
        m1.c cVar = (m1.c) this.f38076a.getValue();
        if (cVar != null) {
            long j10 = cVar.f27237a;
            float d10 = m1.c.d(j10) - 60.0f;
            float e10 = m1.c.e(j10) - 60.0f;
            float d11 = m1.c.d(j10) + 60.0f;
            float e11 = m1.c.e(j10) + 60.0f;
            n1.h hVar = (n1.h) ((p0) this.f38077b.getValue());
            if (hVar.f28139b == null) {
                hVar.f28139b = new RectF();
            }
            RectF rectF = hVar.f28139b;
            Intrinsics.c(rectF);
            rectF.set(d10, e10, d11, e11);
            RectF rectF2 = hVar.f28139b;
            Intrinsics.c(rectF2);
            hVar.f28138a.addOval(rectF2, androidx.compose.ui.graphics.a.l(1));
            g1 g1Var = this.f38078c;
            g1Var.setValue(new Float(((Number) g1Var.getValue()).floatValue() + 3600.0f));
        }
        return Unit.f23355a;
    }
}
