package ch;

import android.view.View;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ba.r8;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseItemViewModel;
import com.assetgro.stockgro.ui.profile.adapter.FollowerFollowingItemViewModel;
import gd.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends o {

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f8143x;

    /* renamed from: y, reason: collision with root package name */
    public g f8144y;

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
            int r1 = ba.r8.f5936v
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558574(0x7f0d00ae, float:1.8742468E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.r8 r5 = (ba.r8) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f8143x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.e.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        kq.e schedulerProvider = viewHolderComponent.f14246a.k();
        ct.a compositeDisposable = viewHolderComponent.f14246a.c();
        UserRepository userRepository = viewHolderComponent.f14246a.m();
        yk.g.i(userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f17292v = new BaseItemViewModel(schedulerProvider, compositeDisposable);
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        ((FollowerFollowingItemViewModel) v()).f9075c.observe(this, new c(0, new d(this, 0)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        g gVar = new g(u(), new d(this, 1));
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.f8144y = gVar;
        r8 r8Var = (r8) this.f17291u;
        RecyclerView recyclerView = r8Var.f5939u;
        this.f22629a.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        RecyclerView recyclerView2 = r8Var.f5939u;
        g gVar2 = this.f8144y;
        if (gVar2 != null) {
            recyclerView2.setAdapter(gVar2);
        } else {
            Intrinsics.k("innerFollowerFollowingAdapter");
            throw null;
        }
    }
}
