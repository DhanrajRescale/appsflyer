package ye;

import android.view.View;
import androidx.lifecycle.v;
import com.assetgro.stockgro.ui.drawer.invite.InvitedFriendItemViewModel;
import gd.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends o {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f41611x = 0;

    @Override // gd.o
    public final void w(da.a viewHolderComponent) {
        Intrinsics.checkNotNullParameter(viewHolderComponent, "viewHolderComponent");
        this.f17292v = new InvitedFriendItemViewModel(viewHolderComponent.f14246a.k(), viewHolderComponent.f14246a.c());
        this.f17293w = (v) ((xs.b) viewHolderComponent.f14248c).get();
    }

    @Override // gd.o
    public final void x() {
        super.x();
        InvitedFriendItemViewModel invitedFriendItemViewModel = (InvitedFriendItemViewModel) v();
        invitedFriendItemViewModel.f9492g.observe(this, new re.d(4, new g(this, 0)));
        InvitedFriendItemViewModel invitedFriendItemViewModel2 = (InvitedFriendItemViewModel) v();
        invitedFriendItemViewModel2.f9494i.observe(this, new re.d(4, new g(this, 1)));
        InvitedFriendItemViewModel invitedFriendItemViewModel3 = (InvitedFriendItemViewModel) v();
        invitedFriendItemViewModel3.f9493h.observe(this, new re.d(4, new g(this, 2)));
    }

    @Override // gd.o
    public final void y(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f22629a.setOnClickListener(new jd.a(this, 24));
    }
}
