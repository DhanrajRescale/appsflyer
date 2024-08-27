package ld;

import com.assetgro.stockgro.data.model.ReportReason;
import iu.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import t0.g1;

/* loaded from: classes.dex */
public final class r extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f24584b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hu.c f24585c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f24586d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(z zVar, hu.c cVar, z zVar2, int i10) {
        super(0);
        this.f24583a = i10;
        this.f24584b = zVar;
        this.f24585c = cVar;
        this.f24586d = zVar2;
    }

    public final void a() {
        String code;
        String code2;
        int i10 = this.f24583a;
        hu.c cVar = this.f24585c;
        z zVar = this.f24586d;
        z zVar2 = this.f24584b;
        switch (i10) {
            case 0:
                ReportReason reportReason = (ReportReason) ((g1) zVar2.f20560a).getValue();
                if (reportReason != null && (code = reportReason.getCode()) != null) {
                    cVar.b(zVar.f20560a, code, Boolean.FALSE);
                    return;
                }
                return;
            default:
                ReportReason reportReason2 = (ReportReason) ((g1) zVar2.f20560a).getValue();
                if (reportReason2 != null && (code2 = reportReason2.getCode()) != null) {
                    cVar.b(zVar.f20560a, code2, Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f24583a) {
            case 0:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
