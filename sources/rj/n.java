package rj;

import com.assetgro.stockgro.data.model.ReportReason;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f33903b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReportReason f33904c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Function1 function1, ReportReason reportReason, int i10) {
        super(0);
        this.f33902a = i10;
        this.f33903b = function1;
        this.f33904c = reportReason;
    }

    public final void a() {
        int i10 = this.f33902a;
        ReportReason reportReason = this.f33904c;
        Function1 function1 = this.f33903b;
        switch (i10) {
            case 0:
                function1.invoke(reportReason);
                return;
            case 1:
                function1.invoke(reportReason);
                return;
            default:
                function1.invoke(reportReason);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f33902a) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
