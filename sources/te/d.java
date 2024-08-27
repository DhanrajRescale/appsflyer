package te;

import android.view.View;
import androidx.lifecycle.v;
import ba.rc;
import ba.sc;
import com.assetgro.stockgro.data.remote.response.SearchUsersItem;
import com.assetgro.stockgro.ui.chat.search.user.UserSearchItemViewModel;
import gd.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends o {

    /* renamed from: x, reason: collision with root package name */
    public final Function1 f35997x;

    /* renamed from: y, reason: collision with root package name */
    public final Function2 f35998y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(androidx.recyclerview.widget.RecyclerView r5, kotlin.jvm.functions.Function1 r6, kotlin.jvm.functions.Function2 r7) {
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
            int r1 = ba.rc.f5957x
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558633(0x7f0d00e9, float:1.8742587E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.rc r5 = (ba.rc) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f35997x = r6
            r4.f35998y = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: te.d.<init>(androidx.recyclerview.widget.RecyclerView, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new UserSearchItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        sc scVar = (sc) ((rc) this.f17291u);
        scVar.f5962w = (UserSearchItemViewModel) v();
        synchronized (scVar) {
            scVar.f6059y |= 64;
        }
        scVar.a(24);
        scVar.m();
        ((rc) this.f17291u).p(this);
        final int i10 = 0;
        this.f22629a.setOnClickListener(new View.OnClickListener(this) { // from class: te.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f35996b;

            {
                this.f35996b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                d this$0 = this.f35996b;
                switch (i11) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        SearchUsersItem searchUsersItem = (SearchUsersItem) ((UserSearchItemViewModel) this$0.v()).f9075c.getValue();
                        if (searchUsersItem != null) {
                            this$0.f35997x.invoke(searchUsersItem);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        SearchUsersItem searchUsersItem2 = (SearchUsersItem) ((UserSearchItemViewModel) this$0.v()).f9075c.getValue();
                        if (searchUsersItem2 != null) {
                            int i12 = this$0.f22635g;
                            if (i12 == -1) {
                                i12 = this$0.f22631c;
                            }
                            this$0.f35998y.invoke(searchUsersItem2, Integer.valueOf(i12));
                            return;
                        }
                        return;
                }
            }
        });
        final int i11 = 1;
        ((rc) this.f17291u).f5958s.setOnClickListener(new View.OnClickListener(this) { // from class: te.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f35996b;

            {
                this.f35996b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                d this$0 = this.f35996b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        SearchUsersItem searchUsersItem = (SearchUsersItem) ((UserSearchItemViewModel) this$0.v()).f9075c.getValue();
                        if (searchUsersItem != null) {
                            this$0.f35997x.invoke(searchUsersItem);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        SearchUsersItem searchUsersItem2 = (SearchUsersItem) ((UserSearchItemViewModel) this$0.v()).f9075c.getValue();
                        if (searchUsersItem2 != null) {
                            int i12 = this$0.f22635g;
                            if (i12 == -1) {
                                i12 = this$0.f22631c;
                            }
                            this$0.f35998y.invoke(searchUsersItem2, Integer.valueOf(i12));
                            return;
                        }
                        return;
                }
            }
        });
    }
}
