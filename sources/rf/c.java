package rf;

import android.view.View;
import androidx.lifecycle.v;
import com.assetgro.stockgro.ui.notifications.NotificationItemViewModel;
import gd.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f33690y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f33691x;

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
            int r1 = ba.va.f6412w
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558607(0x7f0d00cf, float:1.8742535E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.va r5 = (ba.va) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f33691x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.c.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new NotificationItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        NotificationItemViewModel notificationItemViewModel = (NotificationItemViewModel) v();
        notificationItemViewModel.f9615g.observe(this, new re.d(18, new b(this, 0)));
        NotificationItemViewModel notificationItemViewModel2 = (NotificationItemViewModel) v();
        notificationItemViewModel2.f9616h.observe(this, new re.d(18, new b(this, 1)));
        NotificationItemViewModel notificationItemViewModel3 = (NotificationItemViewModel) v();
        notificationItemViewModel3.f9618j.observe(this, new re.d(18, new b(this, 2)));
        NotificationItemViewModel notificationItemViewModel4 = (NotificationItemViewModel) v();
        notificationItemViewModel4.f9617i.observe(this, new re.d(18, new b(this, 3)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnClickListener(new p004if.c(this, 5));
    }
}
