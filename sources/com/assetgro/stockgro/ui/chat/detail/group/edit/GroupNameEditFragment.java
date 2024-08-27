package com.assetgro.stockgro.ui.chat.detail.group.edit;

import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.j0;
import androidx.fragment.app.z1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import androidx.navigation.i;
import ba.yh;
import ca.c;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.edit.GroupNameEditFragment;
import com.assetgro.stockgro.ui.chat.detail.group.edit.GroupNameEditViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.d;
import ea.n0;
import gd.m;
import id.a;
import iu.a0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import q6.l;
import qu.i0;
import sd.b;
import sd.e;
import sd.f;
import vt.v;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/detail/group/edit/GroupNameEditFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/chat/detail/group/edit/GroupNameEditViewModel;", "Lba/yh;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupNameEditFragment extends m<GroupNameEditViewModel, yh> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f9206h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f9207g = new i(a0.a(f.class), new z1(this, 19));

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_group_name_edit;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((GroupNameEditViewModel) r()).f9209o.observe(this, new a(6, new e(this, 0)));
        ((GroupNameEditViewModel) r()).f9212r.observe(this, new a(6, new e(this, 1)));
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        GroupNameEditViewModel groupNameEditViewModel = (GroupNameEditViewModel) r();
        i iVar = this.f9207g;
        String str = ((f) iVar.getValue()).f34586a;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        groupNameEditViewModel.f9213s = str;
        ((yh) q()).f6732u.setText(((f) iVar.getValue()).f34587b);
        f fVar = (f) iVar.getValue();
        String[] strArr = ((f) iVar.getValue()).f34589d;
        if (strArr != null) {
            GroupNameEditViewModel groupNameEditViewModel2 = (GroupNameEditViewModel) r();
            Intrinsics.checkNotNullParameter(strArr, "<set-?>");
            groupNameEditViewModel2.f9210p = strArr;
        }
        final int i10 = 0;
        ((yh) q()).f6736y.setOnClickListener(new View.OnClickListener(this) { // from class: sd.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupNameEditFragment f34583b;

            {
                this.f34583b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                GroupNameEditFragment this$0 = this.f34583b;
                switch (i11) {
                    case 0:
                        int i12 = GroupNameEditFragment.f9206h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String name = w.X(((yh) this$0.q()).f6732u.getText().toString()).toString();
                        List<String> tags = ((yh) this$0.q()).f6731t.getSelectedTagIds();
                        GroupNameEditViewModel groupNameEditViewModel3 = (GroupNameEditViewModel) this$0.r();
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        boolean z10 = false;
                        if ((groupNameEditViewModel3.f9210p.length != 0 || !tags.isEmpty()) && (!tags.containsAll(v.y(groupNameEditViewModel3.f9210p)) || !v.y(groupNameEditViewModel3.f9210p).containsAll(tags))) {
                            z10 = true;
                        }
                        if (Intrinsics.a(((f) this$0.f9207g.getValue()).f34587b, name) && !z10) {
                            l.h(this$0).p();
                            return;
                        }
                        GroupNameEditViewModel groupNameEditViewModel4 = (GroupNameEditViewModel) this$0.r();
                        Intrinsics.checkNotNullParameter(name, "name");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        groupNameEditViewModel4.f9084g.postValue(Boolean.TRUE);
                        yk.g.H(u0.f(groupNameEditViewModel4), null, null, new g(groupNameEditViewModel4, name, tags, null), 3);
                        return;
                    default:
                        int i13 = GroupNameEditFragment.f9206h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        l.h(this$0).p();
                        return;
                }
            }
        });
        final int i11 = 1;
        ((yh) q()).f6730s.setOnClickListener(new View.OnClickListener(this) { // from class: sd.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupNameEditFragment f34583b;

            {
                this.f34583b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                GroupNameEditFragment this$0 = this.f34583b;
                switch (i112) {
                    case 0:
                        int i12 = GroupNameEditFragment.f9206h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        String name = w.X(((yh) this$0.q()).f6732u.getText().toString()).toString();
                        List<String> tags = ((yh) this$0.q()).f6731t.getSelectedTagIds();
                        GroupNameEditViewModel groupNameEditViewModel3 = (GroupNameEditViewModel) this$0.r();
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        boolean z10 = false;
                        if ((groupNameEditViewModel3.f9210p.length != 0 || !tags.isEmpty()) && (!tags.containsAll(v.y(groupNameEditViewModel3.f9210p)) || !v.y(groupNameEditViewModel3.f9210p).containsAll(tags))) {
                            z10 = true;
                        }
                        if (Intrinsics.a(((f) this$0.f9207g.getValue()).f34587b, name) && !z10) {
                            l.h(this$0).p();
                            return;
                        }
                        GroupNameEditViewModel groupNameEditViewModel4 = (GroupNameEditViewModel) this$0.r();
                        Intrinsics.checkNotNullParameter(name, "name");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        groupNameEditViewModel4.f9084g.postValue(Boolean.TRUE);
                        yk.g.H(u0.f(groupNameEditViewModel4), null, null, new g(groupNameEditViewModel4, name, tags, null), 3);
                        return;
                    default:
                        int i13 = GroupNameEditFragment.f9206h;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        l.h(this$0).p();
                        return;
                }
            }
        });
        yh yhVar = (yh) q();
        int i12 = fVar.f34588c;
        yhVar.f6732u.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i12)});
        EditText groupNameEditTextView = ((yh) q()).f6732u;
        Intrinsics.checkNotNullExpressionValue(groupNameEditTextView, "groupNameEditTextView");
        groupNameEditTextView.addTextChangedListener(new b(this, i12, 1));
        yh yhVar2 = (yh) q();
        String string = getString(R.string.text_max_length_group_name);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        yhVar2.f6735x.setText(a3.a.m(new Object[]{Integer.valueOf(i12)}, 1, string, "format(...)"));
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
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
        c factory = new c(a0.a(GroupNameEditViewModel.class), new d(k10, c10, chatRepository, userRepository, 10));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, GroupNameEditViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(GroupNameEditViewModel.class, "<this>", GroupNameEditViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            GroupNameEditViewModel groupNameEditViewModel = (GroupNameEditViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(groupNameEditViewModel);
            this.f17284b = groupNameEditViewModel;
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
