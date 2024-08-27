package je;

import android.view.View;
import androidx.lifecycle.v;
import ba.t8;
import com.assetgro.stockgro.ui.chat.list.UserGroupListItemViewModel;
import gd.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends o {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f21331y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Function2 f21332x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function2 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = ba.t8.f6166v
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558575(0x7f0d00af, float:1.874247E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.t8 r5 = (ba.t8) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f21332x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je.g.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function2):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new UserGroupListItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        UserGroupListItemViewModel userGroupListItemViewModel = (UserGroupListItemViewModel) v();
        userGroupListItemViewModel.f9396g.observe(this, new id.a(27, new f(this, 0)));
        UserGroupListItemViewModel userGroupListItemViewModel2 = (UserGroupListItemViewModel) v();
        userGroupListItemViewModel2.f9398i.observe(this, new id.a(27, new f(this, 1)));
        UserGroupListItemViewModel userGroupListItemViewModel3 = (UserGroupListItemViewModel) v();
        userGroupListItemViewModel3.f9397h.observe(this, new id.a(27, new f(this, 2)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f22629a.setOnClickListener(new jd.a(this, 13));
        ((t8) this.f17291u).f6167s.setOnCheckedChangeListener(new ab.g(this, 3));
    }
}
