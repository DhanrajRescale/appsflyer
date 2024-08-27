package vd;

import android.view.View;
import android.widget.ImageView;
import ba.db;
import ba.eb;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.ui.chat.detail.members.GroupMemberItemViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends gd.o {
    public final Function2 A;
    public final boolean B;
    public final boolean C;

    /* renamed from: x, reason: collision with root package name */
    public final String f37975x;

    /* renamed from: y, reason: collision with root package name */
    public final Function1 f37976y;

    /* renamed from: z, reason: collision with root package name */
    public final Function1 f37977z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(androidx.recyclerview.widget.RecyclerView r5, java.lang.String r6, kotlin.jvm.functions.Function1 r7, kotlin.jvm.functions.Function1 r8, kotlin.jvm.functions.Function2 r9, boolean r10, boolean r11) {
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
            int r1 = ba.db.f4467z
            androidx.databinding.DataBinderMapperImpl r1 = m4.d.f27474a
            r1 = 0
            r2 = 0
            r3 = 2131558612(0x7f0d00d4, float:1.8742545E38)
            m4.m r5 = m4.m.g(r0, r3, r5, r2, r1)
            ba.db r5 = (ba.db) r5
            java.lang.String r0 = "inflate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r4.<init>(r5)
            r4.f37975x = r6
            r4.f37976y = r7
            r4.f37977z = r8
            r4.A = r9
            r4.B = r10
            r4.C = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.h.<init>(androidx.recyclerview.widget.RecyclerView, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, boolean, boolean):void");
    }

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new GroupMemberItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (androidx.lifecycle.v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        GroupMemberItemViewModel groupMemberItemViewModel = (GroupMemberItemViewModel) v();
        groupMemberItemViewModel.f9280i.observe(this, new id.a(9, new g(this, 0)));
        GroupMemberItemViewModel groupMemberItemViewModel2 = (GroupMemberItemViewModel) v();
        groupMemberItemViewModel2.f9282k.observe(this, new id.a(9, new g(this, 1)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        eb ebVar = (eb) ((db) this.f17291u);
        ebVar.f4474y = (GroupMemberItemViewModel) v();
        synchronized (ebVar) {
            ebVar.A |= 8;
        }
        ebVar.a(24);
        ebVar.m();
        ((db) this.f17291u).p(this);
        final int i10 = 0;
        this.f22629a.setOnClickListener(new View.OnClickListener(this) { // from class: vd.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f37972b;

            {
                this.f37972b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                h this$0 = this.f37972b;
                switch (i11) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupMember groupMember = (GroupMember) ((GroupMemberItemViewModel) this$0.v()).f9075c.getValue();
                        if (groupMember != null) {
                            this$0.f37976y.invoke(groupMember);
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupMember groupMember2 = (GroupMember) ((GroupMemberItemViewModel) this$0.v()).f9075c.getValue();
                        if (groupMember2 != null) {
                            ImageView menuButton = ((db) this$0.f17291u).f4471v;
                            Intrinsics.checkNotNullExpressionValue(menuButton, "menuButton");
                            this$0.A.invoke(groupMember2, menuButton);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupMember groupMember3 = (GroupMember) ((GroupMemberItemViewModel) this$0.v()).f9075c.getValue();
                        if (groupMember3 != null) {
                            this$0.f37977z.invoke(groupMember3);
                            return;
                        }
                        return;
                }
            }
        });
        final int i11 = 1;
        ((db) this.f17291u).f4471v.setOnClickListener(new View.OnClickListener(this) { // from class: vd.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f37972b;

            {
                this.f37972b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                h this$0 = this.f37972b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupMember groupMember = (GroupMember) ((GroupMemberItemViewModel) this$0.v()).f9075c.getValue();
                        if (groupMember != null) {
                            this$0.f37976y.invoke(groupMember);
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupMember groupMember2 = (GroupMember) ((GroupMemberItemViewModel) this$0.v()).f9075c.getValue();
                        if (groupMember2 != null) {
                            ImageView menuButton = ((db) this$0.f17291u).f4471v;
                            Intrinsics.checkNotNullExpressionValue(menuButton, "menuButton");
                            this$0.A.invoke(groupMember2, menuButton);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupMember groupMember3 = (GroupMember) ((GroupMemberItemViewModel) this$0.v()).f9075c.getValue();
                        if (groupMember3 != null) {
                            this$0.f37977z.invoke(groupMember3);
                            return;
                        }
                        return;
                }
            }
        });
        final int i12 = 2;
        ((db) this.f17291u).f4469t.setOnClickListener(new View.OnClickListener(this) { // from class: vd.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f37972b;

            {
                this.f37972b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i12;
                h this$0 = this.f37972b;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupMember groupMember = (GroupMember) ((GroupMemberItemViewModel) this$0.v()).f9075c.getValue();
                        if (groupMember != null) {
                            this$0.f37976y.invoke(groupMember);
                            return;
                        }
                        return;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupMember groupMember2 = (GroupMember) ((GroupMemberItemViewModel) this$0.v()).f9075c.getValue();
                        if (groupMember2 != null) {
                            ImageView menuButton = ((db) this$0.f17291u).f4471v;
                            Intrinsics.checkNotNullExpressionValue(menuButton, "menuButton");
                            this$0.A.invoke(groupMember2, menuButton);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        GroupMember groupMember3 = (GroupMember) ((GroupMemberItemViewModel) this$0.v()).f9075c.getValue();
                        if (groupMember3 != null) {
                            this$0.f37977z.invoke(groupMember3);
                            return;
                        }
                        return;
                }
            }
        });
    }
}
