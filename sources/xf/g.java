package xf;

import android.view.View;
import android.widget.RelativeLayout;
import ba.h9;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.kyc.KycFAQItemViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends gd.o {
    public final void A() {
        m4.m mVar = this.f17291u;
        RelativeLayout relativeLayout = ((h9) mVar).f4914t;
        if (relativeLayout.getVisibility() == 8) {
            relativeLayout.setVisibility(0);
            ((h9) mVar).f4917w.setImageResource(R.drawable.ic_kyc_lessen_faq);
        } else {
            relativeLayout.setVisibility(8);
            ((h9) mVar).f4917w.setImageResource(R.drawable.ic_kyc_expand_faq);
        }
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new KycFAQItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (androidx.lifecycle.v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        KycFAQItemViewModel kycFAQItemViewModel = (KycFAQItemViewModel) v();
        kycFAQItemViewModel.f9665g.observe(this, new re.d(27, new f(this, 0)));
        KycFAQItemViewModel kycFAQItemViewModel2 = (KycFAQItemViewModel) v();
        kycFAQItemViewModel2.f9666h.observe(this, new re.d(27, new f(this, 1)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        m4.m mVar = this.f17291u;
        final int i10 = 0;
        ((h9) mVar).f4917w.setOnClickListener(new View.OnClickListener(this) { // from class: xf.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f40210b;

            {
                this.f40210b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                g this$0 = this.f40210b;
                switch (i11) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A();
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A();
                        return;
                }
            }
        });
        final int i11 = 1;
        ((h9) mVar).f4916v.setOnClickListener(new View.OnClickListener(this) { // from class: xf.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f40210b;

            {
                this.f40210b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                g this$0 = this.f40210b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A();
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.A();
                        return;
                }
            }
        });
        ((h9) mVar).f4914t.setVisibility(8);
    }
}
