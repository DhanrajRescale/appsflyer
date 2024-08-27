package td;

import android.app.Dialog;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoV2Fragment;
import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z implements qj.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupInfoV2Fragment f35991b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f35992c;

    public /* synthetic */ z(GroupInfoV2Fragment groupInfoV2Fragment, String str, int i10) {
        this.f35990a = i10;
        this.f35991b = groupInfoV2Fragment;
        this.f35992c = str;
    }

    @Override // qj.m
    public final void e(Dialog dialog) {
        switch (this.f35990a) {
            case 0:
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 1:
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            default:
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
        }
    }

    @Override // qj.m
    public final void m(Dialog dialog) {
        int i10 = this.f35990a;
        String toBlock = this.f35992c;
        GroupInfoV2Fragment groupInfoV2Fragment = this.f35991b;
        switch (i10) {
            case 0:
                GroupInfoViewModel groupInfoViewModel = (GroupInfoViewModel) groupInfoV2Fragment.r();
                Intrinsics.checkNotNullParameter(toBlock, "toBlock");
                groupInfoViewModel.f9084g.postValue(Boolean.TRUE);
                yk.g.H(androidx.lifecycle.u0.f(groupInfoViewModel), null, null, new f0(groupInfoViewModel, true, toBlock, null), 3);
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 1:
                ((GroupInfoViewModel) groupInfoV2Fragment.r()).i(toBlock, "Rogue");
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            default:
                GroupInfoViewModel groupInfoViewModel2 = (GroupInfoViewModel) groupInfoV2Fragment.r();
                Intrinsics.checkNotNullParameter(toBlock, "userId");
                groupInfoViewModel2.f9084g.postValue(Boolean.TRUE);
                yk.g.H(androidx.lifecycle.u0.f(groupInfoViewModel2), null, null, new v0(groupInfoViewModel2, toBlock, null), 3);
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
        }
    }

    @Override // qj.m
    public final void o() {
    }
}
