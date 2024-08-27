package ej;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.h1;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.subscription.ManageSubscriptionActivity;
import com.assetgro.stockgro.ui.subscription.SubscriptionRenewPlanDialogViewModel;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lej/p0;", "Lgd/k;", "Lcom/assetgro/stockgro/ui/subscription/SubscriptionRenewPlanDialogViewModel;", "<init>", "()V", "ni/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class p0 extends gd.k<SubscriptionRenewPlanDialogViewModel> {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f15523c = 0;

    @Override // gd.k
    public final void q(da.a dialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(dialogFragmentComponent, "dialogFragmentComponent");
        ea.g0 g0Var = (ea.g0) dialogFragmentComponent.f14247b;
        kq.e schedulerProvider = dialogFragmentComponent.f14246a.k();
        ct.a compositeDisposable = dialogFragmentComponent.f14246a.c();
        g0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        ca.c factory = new ca.c(iu.a0.a(SubscriptionRenewPlanDialogViewModel.class), new ea.b0(schedulerProvider, compositeDisposable, 18));
        gd.k owner = g0Var.f15161a;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
        h1 store = owner.getViewModelStore();
        Intrinsics.checkNotNullParameter(owner, "owner");
        y4.c defaultCreationExtras = owner.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(store, factory, defaultCreationExtras, SubscriptionRenewPlanDialogViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(SubscriptionRenewPlanDialogViewModel.class, "<this>", SubscriptionRenewPlanDialogViewModel.class, "modelClass", "modelClass");
        String s7 = qu.i0.s(b10);
        if (s7 != null) {
            SubscriptionRenewPlanDialogViewModel subscriptionRenewPlanDialogViewModel = (SubscriptionRenewPlanDialogViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(subscriptionRenewPlanDialogViewModel);
            this.f17279a = subscriptionRenewPlanDialogViewModel;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    @Override // gd.k
    public final int r() {
        return R.layout.layout_subscription_renew_plan;
    }

    @Override // gd.k
    public final void s(View view) {
        String string;
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        Dialog dialog = getDialog();
        final int i10 = 0;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("DATA")) != null) {
            View view2 = this.f17280b;
            if (view2 != null) {
                ((TextView) view2.findViewById(R.id.plan_expiry_text)).setText(Html.fromHtml(string));
            } else {
                Intrinsics.k("dialogView");
                throw null;
            }
        }
        View view3 = this.f17280b;
        if (view3 != null) {
            ((MaterialButton) view3.findViewById(R.id.primary_action)).setOnClickListener(new View.OnClickListener(this) { // from class: ej.o0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p0 f15520b;

                {
                    this.f15520b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    int i11 = i10;
                    p0 this$0 = this.f15520b;
                    switch (i11) {
                        case 0:
                            int i12 = p0.f15523c;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.dismiss();
                            Intent intent = new Intent(this$0.requireActivity(), (Class<?>) ManageSubscriptionActivity.class);
                            intent.putExtra("DEEPLINK", "PLAN_CONFIRMATION");
                            this$0.startActivity(intent);
                            return;
                        default:
                            int i13 = p0.f15523c;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.dismiss();
                            return;
                    }
                }
            });
            View view4 = this.f17280b;
            if (view4 != null) {
                final int i11 = 1;
                ((MaterialButton) view4.findViewById(R.id.secondary_action)).setOnClickListener(new View.OnClickListener(this) { // from class: ej.o0

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ p0 f15520b;

                    {
                        this.f15520b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view42) {
                        int i112 = i11;
                        p0 this$0 = this.f15520b;
                        switch (i112) {
                            case 0:
                                int i12 = p0.f15523c;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.dismiss();
                                Intent intent = new Intent(this$0.requireActivity(), (Class<?>) ManageSubscriptionActivity.class);
                                intent.putExtra("DEEPLINK", "PLAN_CONFIRMATION");
                                this$0.startActivity(intent);
                                return;
                            default:
                                int i13 = p0.f15523c;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.dismiss();
                                return;
                        }
                    }
                });
                return;
            } else {
                Intrinsics.k("dialogView");
                throw null;
            }
        }
        Intrinsics.k("dialogView");
        throw null;
    }
}
