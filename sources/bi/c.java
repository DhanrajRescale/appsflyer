package bi;

import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.v;
import ba.w7;
import ba.x7;
import com.assetgro.stockgro.ui.social.domain.model.User;
import com.assetgro.stockgro.ui.social.presentation.block.BlockUserListItemViewModel;
import gd.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends o {
    public final Function2 A;

    /* renamed from: x, reason: collision with root package name */
    public final String f6983x;

    /* renamed from: y, reason: collision with root package name */
    public final Function1 f6984y;

    /* renamed from: z, reason: collision with root package name */
    public final Function1 f6985z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(androidx.recyclerview.widget.RecyclerView r5, java.lang.String r6, kotlin.jvm.functions.Function1 r7, kotlin.jvm.functions.Function1 r8, kotlin.jvm.functions.Function2 r9) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "onUserProfileClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "onUserChatClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "onUserMenuClicked"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = ba.w7.f6508y
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558561(0x7f0d00a1, float:1.8742441E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.w7 r5 = (ba.w7) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f6983x = r6
            r4.f6984y = r7
            r4.f6985z = r8
            r4.A = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.c.<init>(androidx.recyclerview.widget.RecyclerView, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new BlockUserListItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        BlockUserListItemViewModel blockUserListItemViewModel = (BlockUserListItemViewModel) v();
        blockUserListItemViewModel.f10118i.observe(this, new ch.c(23, new qg.a(this, 15)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        x7 x7Var = (x7) ((w7) this.f17291u);
        x7Var.f6514x = (BlockUserListItemViewModel) v();
        synchronized (x7Var) {
            x7Var.f6620z |= 8;
        }
        x7Var.a(24);
        x7Var.m();
        ((w7) this.f17291u).p(this);
        final int i10 = 0;
        this.f22629a.setOnClickListener(new View.OnClickListener(this) { // from class: bi.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f6982b;

            {
                this.f6982b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                c this$0 = this.f6982b;
                switch (i11) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        User user = (User) ((BlockUserListItemViewModel) this$0.v()).f9075c.getValue();
                        if (user != null) {
                            this$0.f6984y.invoke(user);
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        User user2 = (User) ((BlockUserListItemViewModel) this$0.v()).f9075c.getValue();
                        if (user2 != null) {
                            ImageView menuButton = ((w7) this$0.f17291u).f6512v;
                            Intrinsics.checkNotNullExpressionValue(menuButton, "menuButton");
                            this$0.A.invoke(user2, menuButton);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        User user3 = (User) ((BlockUserListItemViewModel) this$0.v()).f9075c.getValue();
                        if (user3 != null) {
                            this$0.f6985z.invoke(user3);
                            return;
                        }
                        return;
                }
            }
        });
        final int i11 = 1;
        ((w7) this.f17291u).f6512v.setOnClickListener(new View.OnClickListener(this) { // from class: bi.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f6982b;

            {
                this.f6982b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                c this$0 = this.f6982b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        User user = (User) ((BlockUserListItemViewModel) this$0.v()).f9075c.getValue();
                        if (user != null) {
                            this$0.f6984y.invoke(user);
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        User user2 = (User) ((BlockUserListItemViewModel) this$0.v()).f9075c.getValue();
                        if (user2 != null) {
                            ImageView menuButton = ((w7) this$0.f17291u).f6512v;
                            Intrinsics.checkNotNullExpressionValue(menuButton, "menuButton");
                            this$0.A.invoke(user2, menuButton);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        User user3 = (User) ((BlockUserListItemViewModel) this$0.v()).f9075c.getValue();
                        if (user3 != null) {
                            this$0.f6985z.invoke(user3);
                            return;
                        }
                        return;
                }
            }
        });
        final int i12 = 2;
        ((w7) this.f17291u).f6509s.setOnClickListener(new View.OnClickListener(this) { // from class: bi.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f6982b;

            {
                this.f6982b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i12;
                c this$0 = this.f6982b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        User user = (User) ((BlockUserListItemViewModel) this$0.v()).f9075c.getValue();
                        if (user != null) {
                            this$0.f6984y.invoke(user);
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        User user2 = (User) ((BlockUserListItemViewModel) this$0.v()).f9075c.getValue();
                        if (user2 != null) {
                            ImageView menuButton = ((w7) this$0.f17291u).f6512v;
                            Intrinsics.checkNotNullExpressionValue(menuButton, "menuButton");
                            this$0.A.invoke(user2, menuButton);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        User user3 = (User) ((BlockUserListItemViewModel) this$0.v()).f9075c.getValue();
                        if (user3 != null) {
                            this$0.f6985z.invoke(user3);
                            return;
                        }
                        return;
                }
            }
        });
    }
}
