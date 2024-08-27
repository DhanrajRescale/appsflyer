package lf;

import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.homedata.Winner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class g0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f24723b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Winner f24724c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AnalyticEvent f24725d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Function2 function2, Winner winner, AnalyticEvent analyticEvent, int i10) {
        super(0);
        this.f24722a = i10;
        this.f24723b = function2;
        this.f24724c = winner;
        this.f24725d = analyticEvent;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        Winner winner = this.f24724c;
        AnalyticEvent analyticEvent = this.f24725d;
        Function2 function2 = this.f24723b;
        int i10 = this.f24722a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        function2.invoke(winner.getRedirectionUrl(), analyticEvent);
                        break;
                    default:
                        function2.invoke(winner.getRedirectionUrl(), analyticEvent);
                        break;
                }
                return Unit.f23355a;
            default:
                switch (i10) {
                    case 0:
                        function2.invoke(winner.getRedirectionUrl(), analyticEvent);
                        break;
                    default:
                        function2.invoke(winner.getRedirectionUrl(), analyticEvent);
                        break;
                }
                return Unit.f23355a;
        }
    }
}
