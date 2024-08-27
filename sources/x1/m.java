package x1;

import c2.b2;
import com.assetgro.stockgro.data.model.ReportReason;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ iu.z f39885b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i10, iu.z zVar) {
        super(1);
        this.f39884a = i10;
        this.f39885b = zVar;
    }

    public final Boolean a(n nVar) {
        int i10 = this.f39884a;
        iu.z zVar = this.f39885b;
        switch (i10) {
            case 0:
                Object obj = zVar.f20560a;
                if (obj == null && nVar.f39894p) {
                    zVar.f20560a = nVar;
                } else if (obj != null && nVar.f39893o && nVar.f39894p) {
                    zVar.f20560a = nVar;
                }
                return Boolean.TRUE;
            default:
                if (nVar.f39893o && nVar.f39894p) {
                    zVar.f20560a = nVar;
                }
                return Boolean.TRUE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f39884a;
        iu.z zVar = this.f39885b;
        switch (i10) {
            case 0:
                return a((n) obj);
            case 1:
                n nVar = (n) obj;
                b2 b2Var = b2.f7662a;
                if (nVar.f39894p) {
                    zVar.f20560a = nVar;
                    if (nVar.f39893o) {
                        return b2.f7663b;
                    }
                    return b2Var;
                }
                return b2Var;
            case 2:
                return a((n) obj);
            case 3:
                ReportReason innerReportReason = (ReportReason) obj;
                Intrinsics.checkNotNullParameter(innerReportReason, "innerReportReason");
                ((g1) zVar.f20560a).setValue(innerReportReason);
                return Unit.f23355a;
            default:
                ((Throwable) obj).printStackTrace();
                zVar.f20560a = new androidx.work.q(androidx.work.k.f2621c);
                return Unit.f23355a;
        }
    }
}
