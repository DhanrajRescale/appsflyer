package lf;

import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.homedata.ListItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f24769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ListItem f24770c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AnalyticEvent f24771d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i10, AnalyticEvent analyticEvent, ListItem listItem, Function2 function2) {
        super(0);
        this.f24768a = i10;
        this.f24769b = function2;
        this.f24770c = listItem;
        this.f24771d = analyticEvent;
    }

    public final void a() {
        int i10 = this.f24768a;
        Function2 function2 = this.f24769b;
        AnalyticEvent analyticEvent = this.f24771d;
        ListItem listItem = this.f24770c;
        switch (i10) {
            case 0:
                function2.invoke(listItem.getRedirectionUrl(), analyticEvent);
                return;
            case 1:
                function2.invoke(listItem.getRedirectionUrl(), analyticEvent);
                return;
            case 2:
                function2.invoke(listItem.getImageUrl(), analyticEvent);
                return;
            case 3:
                function2.invoke(listItem.getImageUrl(), analyticEvent);
                return;
            case 4:
                function2.invoke(listItem.getRedirectionUrl(), analyticEvent);
                return;
            default:
                function2.invoke(listItem.getRedirectionUrl(), analyticEvent);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f24768a) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                a();
                return Unit.f23355a;
            case 2:
                a();
                return Unit.f23355a;
            case 3:
                a();
                return Unit.f23355a;
            case 4:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
