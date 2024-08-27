package gj;

import android.view.View;
import androidx.lifecycle.v;
import ba.kd;
import ba.ld;
import com.assetgro.stockgro.ui.subscription.plan.SubscriptionPlanDetailViewModel;
import gd.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: x, reason: collision with root package name */
    public final Function2 f17441x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function2 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onItemClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = ba.kd.B
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558643(0x7f0d00f3, float:1.8742608E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.kd r5 = (ba.kd) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f17441x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gj.c.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function2):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new SubscriptionPlanDetailViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        ((SubscriptionPlanDetailViewModel) v()).f10568h.observe(this, new bj.c(13, new qg.a(this, 25)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ld ldVar = (ld) ((kd) this.f17291u);
        ldVar.A = (SubscriptionPlanDetailViewModel) v();
        synchronized (ldVar) {
            ldVar.E |= 2;
        }
        ldVar.a(24);
        ldVar.m();
        ((kd) this.f17291u).p(this);
    }
}
