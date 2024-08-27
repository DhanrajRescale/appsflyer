package fj;

import android.view.View;
import androidx.lifecycle.v;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import com.assetgro.stockgro.ui.subscription.nudge.SubscriptionNudgeItemViewModel;
import gd.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yk.g;

/* loaded from: classes.dex */
public final class e extends o {

    /* renamed from: x, reason: collision with root package name */
    public final Function2 f16142x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function2 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onItemClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = ba.id.f5028t
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558642(0x7f0d00f2, float:1.8742606E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.id r5 = (ba.id) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f16142x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fj.e.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function2):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        kq.e schedulerProvider = viewHolderComponent.f14246a.k();
        ct.a compositeDisposable = viewHolderComponent.f14246a.c();
        UserRepository userRepository = viewHolderComponent.f14246a.m();
        g.i(userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f17292v = new BaseItemViewModel(schedulerProvider, compositeDisposable);
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        ((SubscriptionNudgeItemViewModel) v()).f9075c.observe(this, new bj.c(12, new qg.a(this, 24)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
