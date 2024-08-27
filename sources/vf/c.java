package vf;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.h1;
import at.m;
import ba.yl;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.filter.PinRetryBottomSheetViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.d0;
import ea.f0;
import gd.h;
import ha.s;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import qu.i0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvf/c;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/payments/filter/PinRetryBottomSheetViewModel;", "Lba/yl;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends h<PinRetryBottomSheetViewModel, yl> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f38027j = 0;

    /* renamed from: i, reason: collision with root package name */
    public final ut.g f38028i = ut.h.a(new lc.b(this, 25));

    @Override // gd.h, androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new s(3));
        }
    }

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        f0 f0Var = (f0) bottomSheetDialogFragmentComponent.f14247b;
        kq.e schedulerProvider = bottomSheetDialogFragmentComponent.f14246a.k();
        ct.a compositeDisposable = bottomSheetDialogFragmentComponent.f14246a.c();
        PaymentRepository paymentRepository = bottomSheetDialogFragmentComponent.f14246a.i();
        yk.g.i(paymentRepository);
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(paymentRepository, "paymentRepository");
        ca.c factory = new ca.c(a0.a(PinRetryBottomSheetViewModel.class), new d0(schedulerProvider, compositeDisposable, paymentRepository, 1));
        h hVar = f0Var.f15153a;
        h1 d10 = com.google.android.gms.internal.p002firebaseauthapi.a.d(hVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.n(hVar, "owner", d10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(d10, factory, defaultCreationExtras, PinRetryBottomSheetViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(PinRetryBottomSheetViewModel.class, "<this>", PinRetryBottomSheetViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            PinRetryBottomSheetViewModel pinRetryBottomSheetViewModel = (PinRetryBottomSheetViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(pinRetryBottomSheetViewModel);
            this.f17270b = pinRetryBottomSheetViewModel;
            FirebaseAnalytics d11 = bottomSheetDialogFragmentComponent.f14246a.d();
            yk.g.i(d11);
            this.f17273e = d11;
            Analytics o10 = bottomSheetDialogFragmentComponent.f14246a.o();
            yk.g.i(o10);
            this.f17274f = o10;
            n0 h11 = bottomSheetDialogFragmentComponent.f14246a.h();
            yk.g.i(h11);
            this.f17275g = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    @Override // gd.h
    public final int x() {
        return R.layout.fragment_pin_retry_withdrawal;
    }

    @Override // gd.h
    public final void y() {
        super.y();
        ((PinRetryBottomSheetViewModel) t()).f9637h.observe(this, new re.d(24, new b(this, 0)));
        ((PinRetryBottomSheetViewModel) t()).f9070f.observe(this, new re.d(24, new b(this, 1)));
    }

    @Override // gd.h
    public final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        final int i10 = 0;
        ((yl) r()).f6748t.getNext().setOnClickListener(new View.OnClickListener(this) { // from class: vf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f38024b;

            {
                this.f38024b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                c this$0 = this.f38024b;
                switch (i11) {
                    case 0:
                        int i12 = c.f38027j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!TextUtils.isEmpty(((yl) this$0.r()).f6750v.getText()) && String.valueOf(((yl) this$0.r()).f6750v.getText()).length() == 4) {
                            PinRetryBottomSheetViewModel pinRetryBottomSheetViewModel = (PinRetryBottomSheetViewModel) this$0.t();
                            String pin = String.valueOf(((yl) this$0.r()).f6750v.getText());
                            Intrinsics.checkNotNullParameter(pin, "pin");
                            m<BaseResponseDto<Object>> pinVerify = pinRetryBottomSheetViewModel.f9636g.pinVerify(pin);
                            d dVar = new d(0, new e(pinRetryBottomSheetViewModel, 0));
                            pinVerify.getClass();
                            nt.h c10 = new nt.b(new nt.b(new nt.b(pinVerify, dVar, 1), new d(1, new e(pinRetryBottomSheetViewModel, 1)), 2), new d(2, new e(pinRetryBottomSheetViewModel, 2)), 0).c(((kq.e) pinRetryBottomSheetViewModel.f9066b).J());
                            jt.d dVar2 = new jt.d(new d(3, new e(pinRetryBottomSheetViewModel, 3)), new d(4, f.f38033a));
                            c10.a(dVar2);
                            Intrinsics.checkNotNullExpressionValue(dVar2, "subscribe(...)");
                            pinRetryBottomSheetViewModel.f9067c.c(dVar2);
                            return;
                        }
                        Context requireContext = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        hl.f.S0(R.string.enter_pin, requireContext);
                        return;
                    default:
                        int i13 = c.f38027j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                }
            }
        });
        yl ylVar = (yl) r();
        ylVar.f6748t.setNumberClick(new b(this, 2));
        yl ylVar2 = (yl) r();
        final int i11 = 1;
        ylVar2.f6747s.setOnClickListener(new View.OnClickListener(this) { // from class: vf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f38024b;

            {
                this.f38024b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                c this$0 = this.f38024b;
                switch (i112) {
                    case 0:
                        int i12 = c.f38027j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!TextUtils.isEmpty(((yl) this$0.r()).f6750v.getText()) && String.valueOf(((yl) this$0.r()).f6750v.getText()).length() == 4) {
                            PinRetryBottomSheetViewModel pinRetryBottomSheetViewModel = (PinRetryBottomSheetViewModel) this$0.t();
                            String pin = String.valueOf(((yl) this$0.r()).f6750v.getText());
                            Intrinsics.checkNotNullParameter(pin, "pin");
                            m<BaseResponseDto<Object>> pinVerify = pinRetryBottomSheetViewModel.f9636g.pinVerify(pin);
                            d dVar = new d(0, new e(pinRetryBottomSheetViewModel, 0));
                            pinVerify.getClass();
                            nt.h c10 = new nt.b(new nt.b(new nt.b(pinVerify, dVar, 1), new d(1, new e(pinRetryBottomSheetViewModel, 1)), 2), new d(2, new e(pinRetryBottomSheetViewModel, 2)), 0).c(((kq.e) pinRetryBottomSheetViewModel.f9066b).J());
                            jt.d dVar2 = new jt.d(new d(3, new e(pinRetryBottomSheetViewModel, 3)), new d(4, f.f38033a));
                            c10.a(dVar2);
                            Intrinsics.checkNotNullExpressionValue(dVar2, "subscribe(...)");
                            pinRetryBottomSheetViewModel.f9067c.c(dVar2);
                            return;
                        }
                        Context requireContext = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        hl.f.S0(R.string.enter_pin, requireContext);
                        return;
                    default:
                        int i13 = c.f38027j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                }
            }
        });
    }
}
