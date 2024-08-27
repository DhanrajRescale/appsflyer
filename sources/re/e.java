package re;

import android.view.View;
import androidx.lifecycle.v;
import ba.nc;
import ba.oc;
import com.assetgro.stockgro.data.remote.response.SearchGroupsItem;
import com.assetgro.stockgro.ui.chat.search.groups.GroupSearchItemViewModel;
import gd.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends o {

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f33677x;

    /* renamed from: y, reason: collision with root package name */
    public final Function2 f33678y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function1 r6, kotlin.jvm.functions.Function2 r7) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onItemClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "onActionClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = ba.nc.f5554z
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558631(0x7f0d00e7, float:1.8742583E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.nc r5 = (ba.nc) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f33677x = r6
            r4.f33678y = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: re.e.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new GroupSearchItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        GroupSearchItemViewModel groupSearchItemViewModel = (GroupSearchItemViewModel) v();
        groupSearchItemViewModel.f9443j.observe(this, new d(0, new ub.f(this, 15)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        oc ocVar = (oc) ((nc) this.f17291u);
        ocVar.f5561y = (GroupSearchItemViewModel) v();
        synchronized (ocVar) {
            ocVar.A |= 256;
        }
        ocVar.a(24);
        ocVar.m();
        ((nc) this.f17291u).p(this);
        final int i10 = 0;
        this.f22629a.setOnClickListener(new View.OnClickListener(this) { // from class: re.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f33674b;

            {
                this.f33674b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                e this$0 = this.f33674b;
                switch (i11) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        SearchGroupsItem searchGroupsItem = (SearchGroupsItem) ((GroupSearchItemViewModel) this$0.v()).f9075c.getValue();
                        if (searchGroupsItem != null) {
                            this$0.f33677x.invoke(searchGroupsItem);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        SearchGroupsItem searchGroupsItem2 = (SearchGroupsItem) ((GroupSearchItemViewModel) this$0.v()).f9075c.getValue();
                        if (searchGroupsItem2 != null) {
                            int i12 = this$0.f22635g;
                            if (i12 == -1) {
                                i12 = this$0.f22631c;
                            }
                            this$0.f33678y.invoke(searchGroupsItem2, Integer.valueOf(i12));
                            return;
                        }
                        return;
                }
            }
        });
        final int i11 = 1;
        ((nc) this.f17291u).f5559w.setOnClickListener(new View.OnClickListener(this) { // from class: re.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f33674b;

            {
                this.f33674b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                e this$0 = this.f33674b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        SearchGroupsItem searchGroupsItem = (SearchGroupsItem) ((GroupSearchItemViewModel) this$0.v()).f9075c.getValue();
                        if (searchGroupsItem != null) {
                            this$0.f33677x.invoke(searchGroupsItem);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        SearchGroupsItem searchGroupsItem2 = (SearchGroupsItem) ((GroupSearchItemViewModel) this$0.v()).f9075c.getValue();
                        if (searchGroupsItem2 != null) {
                            int i12 = this$0.f22635g;
                            if (i12 == -1) {
                                i12 = this$0.f22631c;
                            }
                            this$0.f33678y.invoke(searchGroupsItem2, Integer.valueOf(i12));
                            return;
                        }
                        return;
                }
            }
        });
    }
}
