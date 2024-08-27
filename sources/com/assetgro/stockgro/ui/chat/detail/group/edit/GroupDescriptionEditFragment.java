package com.assetgro.stockgro.ui.chat.detail.group.edit;

import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.j0;
import androidx.fragment.app.z1;
import androidx.lifecycle.h1;
import androidx.navigation.i;
import ba.qh;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.edit.GroupDescriptionEditFragment;
import com.assetgro.stockgro.ui.chat.detail.group.edit.GroupDescriptionEditViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.d;
import ea.n0;
import gd.m;
import id.a;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import kq.e;
import q6.l;
import qu.i0;
import rd.q;
import sd.b;
import sd.c;
import ub.f;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/detail/group/edit/GroupDescriptionEditFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/chat/detail/group/edit/GroupDescriptionEditViewModel;", "Lba/qh;", "<init>", "()V", "sb/b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupDescriptionEditFragment extends m<GroupDescriptionEditViewModel, qh> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f9201h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f9202g = new i(a0.a(c.class), new z1(this, 18));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_group_description_edit;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((GroupDescriptionEditViewModel) r()).f9204o.observe(this, new a(5, new f(this, 6)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        GroupDescriptionEditViewModel groupDescriptionEditViewModel = (GroupDescriptionEditViewModel) r();
        i iVar = this.f9202g;
        String str = ((c) iVar.getValue()).f34579a;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        groupDescriptionEditViewModel.f9205p = str;
        String str2 = ((c) iVar.getValue()).f34580b;
        if (str2 != null) {
            ((qh) q()).f5864t.setText(str2);
        }
        c cVar = (c) iVar.getValue();
        final int i10 = 0;
        ((qh) q()).f5868x.setOnClickListener(new View.OnClickListener(this) { // from class: sd.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupDescriptionEditFragment f34575b;

            {
                this.f34575b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                GroupDescriptionEditFragment this$0 = this.f34575b;
                switch (i11) {
                    case 0:
                        int i12 = GroupDescriptionEditFragment.f9201h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String description = w.X(((qh) this$0.q()).f5864t.getText().toString()).toString();
                        if (!Intrinsics.a(((c) this$0.f9202g.getValue()).f34580b, description)) {
                            GroupDescriptionEditViewModel groupDescriptionEditViewModel2 = (GroupDescriptionEditViewModel) this$0.r();
                            Intrinsics.checkNotNullParameter(description, "description");
                            groupDescriptionEditViewModel2.f9084g.postValue(Boolean.TRUE);
                            nt.h c10 = groupDescriptionEditViewModel2.f9203n.editGroupDescription(groupDescriptionEditViewModel2.f9205p, description).c(((kq.e) groupDescriptionEditViewModel2.f9079b).J());
                            jt.d dVar = new jt.d(new vc.b(groupDescriptionEditViewModel2, 5), new q(24, new ub.f(groupDescriptionEditViewModel2, 7)));
                            c10.a(dVar);
                            groupDescriptionEditViewModel2.f9080c.c(dVar);
                            return;
                        }
                        l.h(this$0).p();
                        return;
                    default:
                        int i13 = GroupDescriptionEditFragment.f9201h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        l.h(this$0).p();
                        return;
                }
            }
        });
        final int i11 = 1;
        ((qh) q()).f5863s.setOnClickListener(new View.OnClickListener(this) { // from class: sd.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupDescriptionEditFragment f34575b;

            {
                this.f34575b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                GroupDescriptionEditFragment this$0 = this.f34575b;
                switch (i112) {
                    case 0:
                        int i12 = GroupDescriptionEditFragment.f9201h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String description = w.X(((qh) this$0.q()).f5864t.getText().toString()).toString();
                        if (!Intrinsics.a(((c) this$0.f9202g.getValue()).f34580b, description)) {
                            GroupDescriptionEditViewModel groupDescriptionEditViewModel2 = (GroupDescriptionEditViewModel) this$0.r();
                            Intrinsics.checkNotNullParameter(description, "description");
                            groupDescriptionEditViewModel2.f9084g.postValue(Boolean.TRUE);
                            nt.h c10 = groupDescriptionEditViewModel2.f9203n.editGroupDescription(groupDescriptionEditViewModel2.f9205p, description).c(((kq.e) groupDescriptionEditViewModel2.f9079b).J());
                            jt.d dVar = new jt.d(new vc.b(groupDescriptionEditViewModel2, 5), new q(24, new ub.f(groupDescriptionEditViewModel2, 7)));
                            c10.a(dVar);
                            groupDescriptionEditViewModel2.f9080c.c(dVar);
                            return;
                        }
                        l.h(this$0).p();
                        return;
                    default:
                        int i13 = GroupDescriptionEditFragment.f9201h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        l.h(this$0).p();
                        return;
                }
            }
        });
        qh qhVar = (qh) q();
        int i12 = cVar.f34581c;
        qhVar.f5864t.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i12)});
        EditText groupDescriptionEditTextView = ((qh) q()).f5864t;
        Intrinsics.checkNotNullExpressionValue(groupDescriptionEditTextView, "groupDescriptionEditTextView");
        groupDescriptionEditTextView.addTextChangedListener(new b(this, i12, 0));
        qh qhVar2 = (qh) q();
        String string = getString(R.string.text_max_length_group_description);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        qhVar2.f5867w.setText(a3.a.m(new Object[]{Integer.valueOf(i12)}, 1, string, "format(...)"));
        qh qhVar3 = (qh) q();
        String string2 = getString(R.string.text_max_length_group_description_error);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        qhVar3.f5866v.setText(a3.a.m(new Object[]{Integer.valueOf(i12)}, 1, string2, "format(...)"));
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        ChatRepository chatRepository = bVar.b();
        g.i(chatRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(GroupDescriptionEditViewModel.class), new d(k10, c10, chatRepository, userRepository, 8));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, GroupDescriptionEditViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(GroupDescriptionEditViewModel.class, "<this>", GroupDescriptionEditViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            GroupDescriptionEditViewModel groupDescriptionEditViewModel = (GroupDescriptionEditViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(groupDescriptionEditViewModel);
            this.f17284b = groupDescriptionEditViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h12 = bVar.h();
            g.i(h12);
            this.f17287e = h12;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
