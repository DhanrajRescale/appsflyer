package je;

import com.assetgro.stockgro.ui.chat.list.UserGroupListViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class k implements le.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserGroupListViewModel f21339a;

    public k(UserGroupListViewModel userGroupListViewModel) {
        this.f21339a = userGroupListViewModel;
    }

    @Override // le.d
    public final void b() {
        Unit unit;
        UserGroupListViewModel userGroupListViewModel = this.f21339a;
        fv.e eVar = userGroupListViewModel.f9400o;
        if (eVar != null) {
            if (!eVar.a()) {
                UserGroupListViewModel.h(userGroupListViewModel);
            }
            unit = Unit.f23355a;
        } else {
            unit = null;
        }
        if (unit == null) {
            UserGroupListViewModel.h(userGroupListViewModel);
        }
    }

    @Override // le.d
    public final void e(boolean z10) {
        if (z10) {
            UserGroupListViewModel.h(this.f21339a);
        }
    }
}
