package hf;

import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.ui.home.homepage.domain.SectionHomeDomain;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f18390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SectionHomeDomain f18391c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Function1 function1, SectionHomeDomain sectionHomeDomain, int i10) {
        super(2);
        this.f18389a = i10;
        this.f18390b = function1;
        this.f18391c = sectionHomeDomain;
    }

    public final void a(String deeplink, AnalyticEvent analyticEvent) {
        int i10 = this.f18389a;
        Function1 function1 = this.f18390b;
        SectionHomeDomain sectionHomeDomain = this.f18391c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                function1.invoke(new g(deeplink, analyticEvent, sectionHomeDomain.getSectionId()));
                return;
            case 1:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                function1.invoke(new g(deeplink, analyticEvent, sectionHomeDomain.getSectionId()));
                return;
            case 2:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                function1.invoke(new g(deeplink, analyticEvent, sectionHomeDomain.getSectionId()));
                return;
            case 3:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                function1.invoke(new g(deeplink, analyticEvent, sectionHomeDomain.getSectionId()));
                return;
            case 4:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                function1.invoke(new g(deeplink, analyticEvent, sectionHomeDomain.getSectionId()));
                return;
            default:
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                function1.invoke(new g(deeplink, analyticEvent, sectionHomeDomain.getSectionId()));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f18389a) {
            case 0:
                a((String) obj, (AnalyticEvent) obj2);
                return Unit.f23355a;
            case 1:
                a((String) obj, (AnalyticEvent) obj2);
                return Unit.f23355a;
            case 2:
                a((String) obj, (AnalyticEvent) obj2);
                return Unit.f23355a;
            case 3:
                a((String) obj, (AnalyticEvent) obj2);
                return Unit.f23355a;
            case 4:
                a((String) obj, (AnalyticEvent) obj2);
                return Unit.f23355a;
            default:
                a((String) obj, (AnalyticEvent) obj2);
                return Unit.f23355a;
        }
    }
}
