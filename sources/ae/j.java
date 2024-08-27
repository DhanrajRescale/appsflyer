package ae;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.v;
import ba.ox;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.chat.detail.messages.thread.MessageThreadInfoListItemViewModel;
import gd.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends o {
    public static final /* synthetic */ int B = 0;
    public ue.h A;

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f393x;

    /* renamed from: y, reason: collision with root package name */
    public final Function1 f394y;

    /* renamed from: z, reason: collision with root package name */
    public final Function1 f395z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function1 r6, kotlin.jvm.functions.Function1 r7, kotlin.jvm.functions.Function1 r8) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onLongPress"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "onUserInfoClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "onDownloadClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = ba.ox.A
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131559011(0x7f0d0263, float:1.8743354E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.ox r5 = (ba.ox) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f393x = r6
            r4.f394y = r7
            r4.f395z = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.j.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        kq.e k10 = viewHolderComponent.f14246a.k();
        ct.a c10 = viewHolderComponent.f14246a.c();
        UserRepository m10 = viewHolderComponent.f14246a.m();
        yk.g.i(m10);
        this.f17292v = new MessageThreadInfoListItemViewModel(k10, c10, m10);
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        MessageThreadInfoListItemViewModel messageThreadInfoListItemViewModel = (MessageThreadInfoListItemViewModel) v();
        messageThreadInfoListItemViewModel.f9320h.observe(this, new id.a(16, new i(this, 1)));
        ((MessageThreadInfoListItemViewModel) v()).f9075c.observe(this, new id.a(16, new i(this, 2)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = this.f22629a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.A = new ue.h(context);
        view.setOnLongClickListener(new zd.i(this, 1));
        ((ox) this.f17291u).f5702t.setOnClickListener(new jd.a(this, 8));
    }
}
