package lf;

import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.homedata.BannerData;
import com.assetgro.stockgro.data.model.homedata.Widget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Widget f24749b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f24750c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AnalyticEvent f24751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Widget widget, Function2 function2, AnalyticEvent analyticEvent, int i10) {
        super(0);
        this.f24748a = i10;
        this.f24749b = widget;
        this.f24750c = function2;
        this.f24751d = analyticEvent;
    }

    public final void a() {
        String redirectionUrl;
        int i10 = this.f24748a;
        AnalyticEvent analyticEvent = this.f24751d;
        Function2 function2 = this.f24750c;
        Widget widget = this.f24749b;
        switch (i10) {
            case 0:
                BannerData bannerData = widget.getBannerData();
                if (bannerData != null && (redirectionUrl = bannerData.getRedirectionUrl()) != null) {
                    function2.invoke(redirectionUrl, analyticEvent);
                    return;
                }
                return;
            default:
                String extraActionBehavior = widget.getExtraActionBehavior();
                if (extraActionBehavior != null) {
                    function2.invoke(extraActionBehavior, analyticEvent);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f24748a) {
            case 0:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
