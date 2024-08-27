package ge;

import android.view.View;
import ba.d9;
import com.assetgro.stockgro.ui.chat.helper.search.InviteContactViewModel;
import h.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends gd.o {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f17317y = 0;

    /* renamed from: x, reason: collision with root package name */
    public final j f17318x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(androidx.recyclerview.widget.RecyclerView r5, ge.j r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = ba.d9.f4460w
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558580(0x7f0d00b4, float:1.874248E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.d9 r5 = (ba.d9) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f17318x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.i.<init>(androidx.recyclerview.widget.RecyclerView, ge.j):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new InviteContactViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (androidx.lifecycle.v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        InviteContactViewModel inviteContactViewModel = (InviteContactViewModel) v();
        inviteContactViewModel.f9350g.observe(this, new id.a(20, new h(this, 0)));
        ((InviteContactViewModel) v()).f9075c.observe(this, new id.a(20, new h(this, 1)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        m4.m mVar = this.f17291u;
        ((d9) mVar).f4461s.setOnClickListener(new jd.a(this, 11));
        ((d9) mVar).f4461s.setEnabled(false);
        view.postDelayed(new q0(this, 17), 1000L);
    }
}
