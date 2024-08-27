package gd;

import com.assetgro.stockgro.data.AnalyticEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f17282b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i10) {
        super(1);
        this.f17281a = i10;
        this.f17282b = mVar;
    }

    public final void a(kj.h hVar) {
        int i10 = this.f17281a;
        m mVar = this.f17282b;
        switch (i10) {
            case 0:
                String str = (String) hVar.f23224b;
                if (str != null) {
                    mVar.G(str);
                    return;
                }
                return;
            default:
                Integer num = (Integer) hVar.f23224b;
                if (num != null) {
                    String string = mVar.getString(num.intValue());
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    mVar.G(string);
                    return;
                }
                return;
        }
    }

    public final void d(kj.j jVar) {
        int i10 = this.f17281a;
        m mVar = this.f17282b;
        switch (i10) {
            case 2:
                AnalyticEvent analyticEvent = (AnalyticEvent) jVar.a();
                if (analyticEvent != null) {
                    mVar.x(analyticEvent);
                    return;
                }
                return;
            case 3:
                AnalyticEvent analyticEvent2 = (AnalyticEvent) jVar.a();
                if (analyticEvent2 != null) {
                    mVar.B(analyticEvent2);
                    return;
                }
                return;
            case 4:
                AnalyticEvent analyticEvent3 = (AnalyticEvent) jVar.a();
                if (analyticEvent3 != null) {
                    mVar.z(analyticEvent3);
                    return;
                }
                return;
            default:
                AnalyticEvent analyticEvent4 = (AnalyticEvent) jVar.a();
                if (analyticEvent4 != null) {
                    mVar.A(analyticEvent4);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f17281a) {
            case 0:
                a((kj.h) obj);
                return Unit.f23355a;
            case 1:
                a((kj.h) obj);
                return Unit.f23355a;
            case 2:
                d((kj.j) obj);
                return Unit.f23355a;
            case 3:
                d((kj.j) obj);
                return Unit.f23355a;
            case 4:
                d((kj.j) obj);
                return Unit.f23355a;
            default:
                d((kj.j) obj);
                return Unit.f23355a;
        }
    }
}
