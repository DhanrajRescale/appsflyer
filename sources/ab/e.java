package ab;

import android.view.View;
import androidx.lifecycle.v;
import ba.j8;
import ba.k8;
import c2.e1;
import com.assetgro.stockgro.feature_onboarding.presentation.login.mobile.CountrySelectItemViewModel;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends gd.o {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f288y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f289x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function1 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            java.lang.String r1 = "onItemClick"
            android.view.LayoutInflater r0 = da.e.g(r5, r0, r6, r1)
            int r1 = ba.j8.f5115w
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558570(0x7f0d00aa, float:1.874246E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.j8 r5 = (ba.j8) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f289x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.e.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1):void");
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
    public final void x() {
        ((CountrySelectItemViewModel) v()).f9075c.observe(this, new f7.i(25, new e1(this, 26)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        k8 k8Var = (k8) ((j8) this.f17291u);
        k8Var.f5119v = (CountrySelectItemViewModel) v();
        synchronized (k8Var) {
            k8Var.f5211x |= 2;
        }
        k8Var.a(24);
        k8Var.m();
        ((j8) this.f17291u).p(this);
        this.f22629a.setOnClickListener(new d7.j(this, 14));
    }
}
