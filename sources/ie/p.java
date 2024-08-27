package ie;

import android.view.View;
import com.assetgro.stockgro.ui.chat.host.GroupDetailHostActivity;
import com.assetgro.stockgro.ui.profile.report.ReportEntityActivity;
import com.assetgro.stockgro.ui.profile.user.UserProfileActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.j f19941b;

    public /* synthetic */ p(h.j jVar, int i10) {
        this.f19940a = i10;
        this.f19941b = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f19940a;
        h.j customDialog = this.f19941b;
        switch (i10) {
            case 0:
                int i11 = GroupDetailHostActivity.f9382p;
                Intrinsics.checkNotNullParameter(customDialog, "$customDialog");
                customDialog.dismiss();
                return;
            case 1:
                int i12 = ReportEntityActivity.f10008l;
                Intrinsics.checkNotNullParameter(customDialog, "$customDialog");
                customDialog.dismiss();
                return;
            default:
                int i13 = UserProfileActivity.f10064p;
                Intrinsics.checkNotNullParameter(customDialog, "$customDialog");
                customDialog.dismiss();
                return;
        }
    }
}
