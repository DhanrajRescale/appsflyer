package de;

import android.view.View;
import androidx.lifecycle.v;
import ba.p8;
import ba.q8;
import com.assetgro.stockgro.ui.chat.discover.horizontal.HorizontalGroupsItemViewModel;
import gd.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f14315y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f14316x;

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
            int r1 = ba.p8.f5728w
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558573(0x7f0d00ad, float:1.8742466E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.p8 r5 = (ba.p8) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f14316x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.c.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new HorizontalGroupsItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        q8 q8Var = (q8) ((p8) this.f17291u);
        q8Var.f5732v = (HorizontalGroupsItemViewModel) v();
        synchronized (q8Var) {
            q8Var.f5841x |= 8;
        }
        q8Var.a(24);
        q8Var.m();
        ((p8) this.f17291u).p(this);
        view.setOnClickListener(new jd.a(this, 9));
    }
}
