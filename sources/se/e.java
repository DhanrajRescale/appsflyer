package se;

import android.view.View;
import androidx.lifecycle.v;
import ba.pc;
import ba.qc;
import com.assetgro.stockgro.ui.chat.search.history.SearchHistoryItemViewModel;
import gd.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends o {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f34601y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f34602x;

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
            int r1 = ba.pc.f5757u
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558632(0x7f0d00e8, float:1.8742585E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.pc r5 = (ba.pc) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f34602x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: se.e.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new SearchHistoryItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        qc qcVar = (qc) ((pc) this.f17291u);
        qcVar.f5759t = (SearchHistoryItemViewModel) v();
        synchronized (qcVar) {
            qcVar.f5843v |= 2;
        }
        qcVar.a(24);
        qcVar.m();
        ((pc) this.f17291u).p(this);
        this.f22629a.setOnClickListener(new jd.a(this, 17));
    }
}
