package ce;

import android.view.View;
import androidx.lifecycle.e0;
import androidx.lifecycle.v;
import ba.l8;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import com.assetgro.stockgro.ui.chat.discover.category.DiscoverCategoryItemViewModel;
import gd.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;

/* loaded from: classes.dex */
public final class d extends o {

    /* renamed from: x, reason: collision with root package name */
    public final Function2 f8122x;

    /* renamed from: y, reason: collision with root package name */
    public de.a f8123y;

    /* renamed from: z, reason: collision with root package name */
    public fe.b f8124z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function2 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onItemClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = ba.l8.f5323v
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558571(0x7f0d00ab, float:1.8742462E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.l8 r5 = (ba.l8) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f8122x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.d.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function2):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        kq.e schedulerProvider = viewHolderComponent.f14246a.k();
        ct.a compositeDisposable = viewHolderComponent.f14246a.c();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        BaseItemViewModel baseItemViewModel = new BaseItemViewModel(schedulerProvider, compositeDisposable);
        e0 e0Var = baseItemViewModel.f9075c;
        i0.C(e0Var, e.f8127d);
        i0.C(e0Var, e.f8126c);
        i0.C(e0Var, e.f8125b);
        this.f17292v = baseItemViewModel;
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        ((DiscoverCategoryItemViewModel) v()).f9075c.observe(this, new id.a(18, new c(this, 0)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        de.a aVar = new de.a(u(), new c(this, 1));
        this.f8123y = aVar;
        l8 l8Var = (l8) this.f17291u;
        l8Var.f5325t.f5799s.setAdapter(aVar);
        fe.b bVar = new fe.b(u(), new c(this, 2));
        this.f8124z = bVar;
        l8Var.f5326u.f4236u.setAdapter(bVar);
    }
}
