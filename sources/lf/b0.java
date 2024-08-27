package lf;

import android.view.View;
import c2.x1;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.homedata.ListItem;
import com.assetgro.stockgro.data.model.homedata.Widget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m0.a3;
import t0.e1;

/* loaded from: classes.dex */
public final class b0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24646c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24648e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(View view, x1 x1Var, int i10, e1 e1Var) {
        super(0);
        this.f24644a = 2;
        this.f24645b = view;
        this.f24647d = x1Var;
        this.f24646c = i10;
        this.f24648e = e1Var;
    }

    public final void a() {
        int i10 = this.f24644a;
        int i11 = this.f24646c;
        Object obj = this.f24648e;
        Object obj2 = this.f24647d;
        Object obj3 = this.f24645b;
        switch (i10) {
            case 0:
                ((Function2) obj2).invoke(((ListItem) obj).getRedirectionUrl(), new AnalyticEvent("app_home_card_tapped", dp.b.Z0((Widget) obj3, i11)));
                return;
            case 1:
                ((Function2) obj2).invoke(((ListItem) obj).getRedirectionUrl(), new AnalyticEvent("app_home_card_tapped", dp.b.Z0((Widget) obj3, i11)));
                return;
            default:
                pp.b.q(((View) obj3).getRootView(), (a2.u) ((x1) obj2).f7881a, i11, new a3((e1) obj, 1));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f24644a) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Widget widget, int i10, Function2 function2, ListItem listItem, int i11) {
        super(0);
        this.f24644a = i11;
        this.f24645b = widget;
        this.f24646c = i10;
        this.f24647d = function2;
        this.f24648e = listItem;
    }
}
