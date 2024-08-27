package dc;

import android.view.View;
import ba.ld;
import com.assetgro.stockgro.ui.subscription.plan.SubscriptionPlanDetailViewModel;
import com.google.android.material.datepicker.a0;
import com.google.android.material.datepicker.d;
import com.google.android.material.datepicker.l;
import com.google.android.material.datepicker.r;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14293a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14294b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14295c;

    public /* synthetic */ b(int i10, Object obj) {
        this.f14293a = i10;
        this.f14295c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f14293a;
        Object obj = this.f14295c;
        switch (i10) {
            case 0:
                SubscriptionPlanDetailViewModel subscriptionPlanDetailViewModel = ((ld) ((a) obj)).A;
                if (subscriptionPlanDetailViewModel != null) {
                    subscriptionPlanDetailViewModel.f10567g.setValue(subscriptionPlanDetailViewModel.f9075c.getValue());
                    return;
                }
                return;
            default:
                a0 a0Var = (a0) obj;
                r a10 = r.a(this.f14294b, a0Var.f11263d.f11290d.f11328b);
                l lVar = a0Var.f11263d;
                d dVar = lVar.f11289c;
                r rVar = dVar.f11266a;
                Calendar calendar = rVar.f11327a;
                Calendar calendar2 = a10.f11327a;
                if (calendar2.compareTo(calendar) < 0) {
                    a10 = rVar;
                } else {
                    r rVar2 = dVar.f11267b;
                    if (calendar2.compareTo(rVar2.f11327a) > 0) {
                        a10 = rVar2;
                    }
                }
                lVar.p(a10);
                lVar.q(1);
                return;
        }
    }
}
