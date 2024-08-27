package hc;

import android.view.View;
import androidx.lifecycle.v;
import ba.ja;
import ba.ka;
import com.assetgro.stockgro.missions.presentation.home.MissionListItemViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends gd.o {

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f18253x;

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
            int r1 = ba.ja.f5123y
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558601(0x7f0d00c9, float:1.8742522E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.ja r5 = (ba.ja) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f18253x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hc.c.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new MissionListItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        MissionListItemViewModel missionListItemViewModel = (MissionListItemViewModel) v();
        missionListItemViewModel.f8910o.observe(this, new eb.c(9, new b(this, 0)));
        MissionListItemViewModel missionListItemViewModel2 = (MissionListItemViewModel) v();
        missionListItemViewModel2.f8908m.observe(this, new eb.c(9, new b(this, 1)));
        MissionListItemViewModel missionListItemViewModel3 = (MissionListItemViewModel) v();
        missionListItemViewModel3.f8909n.observe(this, new eb.c(9, new b(this, 2)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ka kaVar = (ka) ((ja) this.f17291u);
        kaVar.f5129x = (MissionListItemViewModel) v();
        synchronized (kaVar) {
            kaVar.B |= 64;
        }
        kaVar.a(24);
        kaVar.m();
        ((ja) this.f17291u).p(this);
        b action = new b(this, 3);
        int i10 = kj.f.f23221a;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        view.setOnClickListener(new kj.b(200L, action, 1));
    }
}
