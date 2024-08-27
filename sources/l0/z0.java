package l0;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import t0.g1;
import x.c2;
import x.e2;
import x.g2;
import x.r1;

/* loaded from: classes.dex */
public final class z0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.b f23879b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f23880c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(w2.b bVar, g1 g1Var, int i10) {
        super(1);
        this.f23878a = i10;
        this.f23879b = bVar;
        this.f23880c = g1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c2 c2Var;
        int i10 = this.f23878a;
        g1 g1Var = this.f23880c;
        w2.b bVar = this.f23879b;
        switch (i10) {
            case 0:
                long j10 = ((w2.g) obj).f38790a;
                g1Var.setValue(new w2.j(hl.f.k(bVar.m0(w2.g.b(j10)), bVar.m0(w2.g.a(j10)))));
                return Unit.f23355a;
            default:
                g1.l lVar = g1.l.f16404b;
                d0.i0 i0Var = new d0.i0((Function0) obj, 1);
                z0 z0Var = new z0(bVar, g1Var, 0);
                if (r1.a()) {
                    if (Build.VERSION.SDK_INT == 28) {
                        c2Var = e2.f39543a;
                    } else {
                        c2Var = g2.f39567a;
                    }
                    c2 c2Var2 = c2Var;
                    long j11 = w2.g.f38788c;
                    if (r1.a()) {
                        return new MagnifierElement(i0Var, null, z0Var, Float.NaN, true, j11, Float.NaN, Float.NaN, true, c2Var2);
                    }
                    return d2.w0.s(lVar, lVar);
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }
}
