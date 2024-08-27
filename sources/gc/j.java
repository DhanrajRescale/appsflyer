package gc;

import android.view.View;
import androidx.lifecycle.v;
import ba.ha;
import com.assetgro.stockgro.missions.presentation.history.MissionHistoryTimelineItemViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends gd.o {

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f17239x;

    /* renamed from: y, reason: collision with root package name */
    public e f17240y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function1 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            java.lang.String r1 = "onItemClick"
            android.view.LayoutInflater r0 = da.e.g(r5, r0, r6, r1)
            int r1 = ba.ha.f4918u
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558600(0x7f0d00c8, float:1.874252E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.ha r5 = (ba.ha) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f17239x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.j.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new MissionHistoryTimelineItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        MissionHistoryTimelineItemViewModel missionHistoryTimelineItemViewModel = (MissionHistoryTimelineItemViewModel) v();
        missionHistoryTimelineItemViewModel.f8880g.observe(this, new eb.c(7, new i(this, 0)));
        MissionHistoryTimelineItemViewModel missionHistoryTimelineItemViewModel2 = (MissionHistoryTimelineItemViewModel) v();
        missionHistoryTimelineItemViewModel2.f8881h.observe(this, new eb.c(7, new i(this, 1)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        e eVar = new e(u(), new i(this, 2));
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f17240y = eVar;
        ((ha) this.f17291u).f4920t.setAdapter(eVar);
    }
}
