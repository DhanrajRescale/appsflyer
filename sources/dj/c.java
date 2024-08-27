package dj;

import com.assetgro.stockgro.data.AnalyticEvent;
import iu.k;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f14390b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i10) {
        super(1);
        this.f14389a = i10;
        this.f14390b = dVar;
    }

    public final void a(j jVar) {
        int i10 = this.f14389a;
        d dVar = this.f14390b;
        switch (i10) {
            case 0:
                zi.k kVar = (zi.k) jVar.a();
                if (kVar != null) {
                    dVar.f14391x.invoke(kVar);
                    return;
                }
                return;
            default:
                AnalyticEvent analyticEvent = (AnalyticEvent) jVar.a();
                if (analyticEvent != null) {
                    dVar.f14392y.invoke(analyticEvent);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f14389a) {
            case 0:
                a((j) obj);
                return Unit.f23355a;
            default:
                a((j) obj);
                return Unit.f23355a;
        }
    }
}
