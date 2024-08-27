package gc;

import android.view.View;
import androidx.lifecycle.v;
import ba.fa;
import ba.ga;
import com.assetgro.stockgro.missions.presentation.history.MissionHistoryTaskItemViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends gd.o {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f17226y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f17227x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function1 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            java.lang.String r1 = "onItemClick"
            android.view.LayoutInflater r0 = da.e.g(r5, r0, r6, r1)
            int r1 = ba.fa.f4688x
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558599(0x7f0d00c7, float:1.8742518E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.fa r5 = (ba.fa) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f17227x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.f.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new MissionHistoryTaskItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((fa) this.f17291u).p(this);
        ga gaVar = (ga) ((fa) this.f17291u);
        gaVar.f4693w = (MissionHistoryTaskItemViewModel) v();
        synchronized (gaVar) {
            gaVar.A |= 8;
        }
        gaVar.a(24);
        gaVar.m();
        view.setOnClickListener(new d7.j(this, 19));
    }
}
