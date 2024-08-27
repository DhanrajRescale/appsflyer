package ka;

import b0.p1;
import com.assetgro.stockgro.prod.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m0.b9;

/* loaded from: classes.dex */
public final class c extends iu.k implements hu.c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f22750b = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f22751c = new c(1);

    /* renamed from: d, reason: collision with root package name */
    public static final c f22752d = new c(2);

    /* renamed from: e, reason: collision with root package name */
    public static final c f22753e = new c(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22754a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(3);
        this.f22754a = i10;
    }

    public final void a(p1 Button, t0.n nVar, int i10) {
        g1.l lVar = g1.l.f16404b;
        switch (this.f22754a) {
            case 0:
                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                if ((i10 & 81) == 16) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                b9.b(hl.f.c1(R.string.place_order, nVar), androidx.compose.foundation.layout.a.t(lVar, 10), d2.w0.e(R.color.white, nVar), 0L, null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 1572912, 0, 131000);
                return;
            default:
                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                if ((i10 & 81) == 16) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                b9.b(hl.f.c1(R.string.place_order, nVar), androidx.compose.foundation.layout.a.t(lVar, 10), d2.w0.e(R.color.white, nVar), 0L, null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 1572912, 0, 131000);
                return;
        }
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i10 = this.f22754a;
        switch (i10) {
            case 0:
                a((p1) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 1:
                List it = (List) obj;
                ((Number) obj3).intValue();
                switch (i10) {
                    case 1:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                }
                return Unit.f23355a;
            case 2:
                a((p1) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            default:
                List it2 = (List) obj;
                ((Number) obj3).intValue();
                switch (i10) {
                    case 1:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                }
                return Unit.f23355a;
        }
    }
}
