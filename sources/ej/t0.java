package ej;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import ba.n6;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.subscription.ManageSubscriptionActivity;
import com.assetgro.stockgro.ui.subscription.SubscribeToAccessBottomSheetViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lej/t0;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/subscription/SubscribeToAccessBottomSheetViewModel;", "Lba/n6;", "<init>", "()V", "ni/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class t0 extends gd.h<SubscribeToAccessBottomSheetViewModel, n6> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f15547i = 0;

    @Override // ao.g, h.h0, androidx.fragment.app.t
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(onCreateDialog, "onCreateDialog(...)");
        onCreateDialog.setOnKeyListener(new o(this, 1));
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
        return R.layout.bottom_sheet_subscription_upgrade_plan;
    }

    @Override // gd.h
    public final void z(View view) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("DATA")) != null) {
            ((n6) r()).f5525s.setText(string);
        }
        final int i10 = 0;
        ((n6) r()).f5527u.setOnClickListener(new View.OnClickListener(this) { // from class: ej.s0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f15544b;

            {
                this.f15544b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Serializable serializable;
                int i11 = i10;
                t0 this$0 = this.f15544b;
                switch (i11) {
                    case 0:
                        int i12 = t0.f15547i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                    default:
                        int i13 = t0.f15547i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        Bundle arguments2 = this$0.getArguments();
                        AnalyticEvent analyticEvent = null;
                        if (arguments2 != null) {
                            serializable = arguments2.getSerializable("ANALYTIC_EVENT");
                        } else {
                            serializable = null;
                        }
                        if (serializable instanceof AnalyticEvent) {
                            analyticEvent = (AnalyticEvent) serializable;
                        }
                        if (analyticEvent != null) {
                            Intrinsics.checkNotNullParameter(analyticEvent, "analyticEvent");
                            this$0.v(analyticEvent);
                            this$0.w(analyticEvent);
                        }
                        this$0.startActivity(new Intent(this$0.requireActivity(), (Class<?>) ManageSubscriptionActivity.class));
                        return;
                }
            }
        });
        final int i11 = 1;
        ((n6) r()).f5526t.setOnClickListener(new View.OnClickListener(this) { // from class: ej.s0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f15544b;

            {
                this.f15544b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Serializable serializable;
                int i112 = i11;
                t0 this$0 = this.f15544b;
                switch (i112) {
                    case 0:
                        int i12 = t0.f15547i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.requireActivity().finish();
                        return;
                    default:
                        int i13 = t0.f15547i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        Bundle arguments2 = this$0.getArguments();
                        AnalyticEvent analyticEvent = null;
                        if (arguments2 != null) {
                            serializable = arguments2.getSerializable("ANALYTIC_EVENT");
                        } else {
                            serializable = null;
                        }
                        if (serializable instanceof AnalyticEvent) {
                            analyticEvent = (AnalyticEvent) serializable;
                        }
                        if (analyticEvent != null) {
                            Intrinsics.checkNotNullParameter(analyticEvent, "analyticEvent");
                            this$0.v(analyticEvent);
                            this$0.w(analyticEvent);
                        }
                        this$0.startActivity(new Intent(this$0.requireActivity(), (Class<?>) ManageSubscriptionActivity.class));
                        return;
                }
            }
        });
    }
}
