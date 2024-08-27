package fe;

import android.view.View;
import androidx.lifecycle.v;
import ba.md;
import ba.nd;
import com.assetgro.stockgro.ui.chat.discover.vertical.VerticalGroupsItemViewModel;
import gd.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f16045y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f16046x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function1 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            java.lang.String r1 = "onItemClick"
            android.view.LayoutInflater r0 = da.e.g(r5, r0, r6, r1)
            int r1 = ba.md.f5452y
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558645(0x7f0d00f5, float:1.8742612E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.md r5 = (ba.md) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f16046x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fe.c.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new VerticalGroupsItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        nd ndVar = (nd) ((md) this.f17291u);
        ndVar.f5458x = (VerticalGroupsItemViewModel) v();
        synchronized (ndVar) {
            ndVar.f5562z |= 16;
        }
        ndVar.a(24);
        ndVar.m();
        ((md) this.f17291u).p(this);
        ((md) this.f17291u).f5453s.setOnClickListener(new jd.a(this, 10));
    }
}
