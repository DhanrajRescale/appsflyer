package gj;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import ba.hb;
import ba.ib;
import com.assetgro.stockgro.data.model.SubscriptionPackages;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import com.assetgro.stockgro.ui.subscription.plan.SubscriptionPlanOverviewViewModel;
import gd.o;
import kotlin.jvm.internal.Intrinsics;
import r3.k;

/* loaded from: classes.dex */
public final class g extends o {

    /* renamed from: x, reason: collision with root package name */
    public final hu.c f17445x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(androidx.recyclerview.widget.RecyclerView r5, hu.c r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onItemClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = ba.hb.f4921z
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558614(0x7f0d00d6, float:1.8742549E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.hb r5 = (ba.hb) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f17445x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gj.g.<init>(androidx.recyclerview.widget.RecyclerView, hu.c):void");
    }

    public static final void A(ConstraintLayout view, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(view, "view");
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    i11 = R.drawable.subscription_level_zero_card;
                } else {
                    i11 = R.drawable.subscription_level_three_card;
                }
            } else {
                i11 = R.drawable.subscription_level_two_card;
            }
        } else {
            i11 = R.drawable.subscription_level_one_card;
        }
        view.setBackground(k.getDrawable(view.getContext(), i11));
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        kq.e schedulerProvider = viewHolderComponent.f14246a.k();
        ct.a compositeDisposable = viewHolderComponent.f14246a.c();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f17292v = new BaseItemViewModel(schedulerProvider, compositeDisposable);
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ib ibVar = (ib) ((hb) this.f17291u);
        ibVar.f4928y = (SubscriptionPlanOverviewViewModel) v();
        synchronized (ibVar) {
            ibVar.B |= 2;
        }
        ibVar.a(24);
        ibVar.m();
        ((hb) this.f17291u).p(this);
        final int i10 = 0;
        this.f22629a.setOnClickListener(new View.OnClickListener(this) { // from class: gj.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f17444b;

            {
                this.f17444b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                g this$0 = this.f17444b;
                switch (i11) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        SubscriptionPackages subscriptionPackages = (SubscriptionPackages) ((SubscriptionPlanOverviewViewModel) this$0.v()).f9075c.getValue();
                        if (subscriptionPackages != null) {
                            this$0.f17445x.b(Integer.valueOf(this$0.c()), subscriptionPackages, "card_tap");
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        SubscriptionPackages subscriptionPackages2 = (SubscriptionPackages) ((SubscriptionPlanOverviewViewModel) this$0.v()).f9075c.getValue();
                        if (subscriptionPackages2 != null) {
                            this$0.f17445x.b(Integer.valueOf(this$0.c()), subscriptionPackages2, "CTA_click");
                            return;
                        }
                        return;
                }
            }
        });
        final int i11 = 1;
        ((hb) this.f17291u).f4927x.setOnClickListener(new View.OnClickListener(this) { // from class: gj.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f17444b;

            {
                this.f17444b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                g this$0 = this.f17444b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        SubscriptionPackages subscriptionPackages = (SubscriptionPackages) ((SubscriptionPlanOverviewViewModel) this$0.v()).f9075c.getValue();
                        if (subscriptionPackages != null) {
                            this$0.f17445x.b(Integer.valueOf(this$0.c()), subscriptionPackages, "card_tap");
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        SubscriptionPackages subscriptionPackages2 = (SubscriptionPackages) ((SubscriptionPlanOverviewViewModel) this$0.v()).f9075c.getValue();
                        if (subscriptionPackages2 != null) {
                            this$0.f17445x.b(Integer.valueOf(this$0.c()), subscriptionPackages2, "CTA_click");
                            return;
                        }
                        return;
                }
            }
        });
    }
}
