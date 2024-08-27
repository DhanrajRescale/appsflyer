package ej;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import ba.l6;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.subscription.SubscribeToAccessBottomSheetViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lej/p;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/subscription/SubscribeToAccessBottomSheetViewModel;", "Lba/l6;", "<init>", "()V", "ni/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class p extends gd.h<SubscribeToAccessBottomSheetViewModel, l6> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f15521j = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15522i;

    @Override // ao.g, h.h0, androidx.fragment.app.t
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(onCreateDialog, "onCreateDialog(...)");
        onCreateDialog.setOnKeyListener(new o(this, 0));
        return onCreateDialog;
    }

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        this.f17270b = bottomSheetDialogFragmentComponent.r();
        FirebaseAnalytics d10 = bottomSheetDialogFragmentComponent.f14246a.d();
        yk.g.i(d10);
        this.f17273e = d10;
        Analytics o10 = bottomSheetDialogFragmentComponent.f14246a.o();
        yk.g.i(o10);
        this.f17274f = o10;
        ls.n0 h10 = bottomSheetDialogFragmentComponent.f14246a.h();
        yk.g.i(h10);
        this.f17275g = h10;
    }

    @Override // gd.h
    public final int x() {
        return R.layout.bottom_sheet_subscribe_to_access;
    }

    @Override // gd.h
    public final void z(View view) {
        boolean z10;
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        if (arguments != null) {
            z10 = arguments.getBoolean("BACK_PRESS_ALLOWED");
        } else {
            z10 = false;
        }
        this.f15522i = z10;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(!this.f15522i);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("DATA")) != null) {
            ((l6) r()).f5319s.setText(string);
        }
        ((l6) r()).f5320t.setOnClickListener(new ph.a(this, 16));
    }
}
