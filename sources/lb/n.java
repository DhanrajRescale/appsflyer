package lb;

import com.assetgro.stockgro.prod.R;
import d2.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.b9;
import m0.s3;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final n f24491b = new n(0);

    /* renamed from: c, reason: collision with root package name */
    public static final n f24492c = new n(1);

    /* renamed from: d, reason: collision with root package name */
    public static final n f24493d = new n(2);

    /* renamed from: e, reason: collision with root package name */
    public static final n f24494e = new n(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24495a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i10) {
        super(2);
        this.f24495a = i10;
    }

    public final void a(t0.n nVar, int i10) {
        switch (this.f24495a) {
            case 0:
                if ((i10 & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                s3.a(w0.u(R.drawable.ic_post_overflow_menu, nVar, 6), "Menu Options", null, 0L, nVar, 56, 12);
                return;
            case 1:
                if ((i10 & 11) == 2) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                s3.a(w0.u(R.drawable.ic_cancel_circle, nVar, 6), "Close", null, n1.t.f28177i, nVar, 3128, 4);
                return;
            case 2:
                if ((i10 & 11) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                b9.b("Write here...", null, n1.t.f28171c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 390, 0, 131066);
                return;
            default:
                if ((i10 & 11) == 2) {
                    t0.r rVar4 = (t0.r) nVar;
                    if (rVar4.G()) {
                        rVar4.V();
                        return;
                    }
                }
                s3.a(w0.u(R.drawable.ic_send_social_feed, nVar, 6), "Send", androidx.compose.foundation.layout.d.m(g1.l.f16404b, kp.j.R(34, nVar)), n1.t.f28177i, nVar, 3128, 0);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f24495a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 2:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
