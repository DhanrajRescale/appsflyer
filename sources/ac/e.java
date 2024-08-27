package ac;

import com.assetgro.stockgro.prod.R;
import d2.w0;
import g1.l;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.s3;
import n1.t;
import t0.n;
import t0.r;

/* loaded from: classes.dex */
public final class e extends k implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f328b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f329c = new e(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f330a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(2);
        this.f330a = i10;
    }

    public final void a(n nVar, int i10) {
        switch (this.f330a) {
            case 0:
                if ((i10 & 11) == 2) {
                    r rVar = (r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                    return;
                }
                return;
            default:
                if ((i10 & 11) == 2) {
                    r rVar2 = (r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                s3.a(w0.u(R.drawable.ic_back, nVar, 6), "Back", androidx.compose.foundation.layout.d.m(l.f16404b, kp.j.R(24, nVar)), t.f28173e, nVar, 3128, 0);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f330a) {
            case 0:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
