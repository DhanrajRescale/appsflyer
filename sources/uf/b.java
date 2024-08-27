package uf;

import android.view.LayoutInflater;
import android.view.View;
import ba.h8;
import ba.sg;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.status.PaymentTransactionBottomSheetViewModel;
import com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import ut.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Luf/b;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/payments/status/PaymentTransactionBottomSheetViewModel;", "Lba/sg;", "<init>", "()V", "de/d", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends h<PaymentTransactionBottomSheetViewModel, sg> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f37160j = 0;

    /* renamed from: i, reason: collision with root package name */
    public final g f37161i = ut.h.a(new lc.b(this, 24));

    public final WithdrawalDetailViewModel B() {
        return (WithdrawalDetailViewModel) this.f37161i.getValue();
    }

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        this.f17270b = bottomSheetDialogFragmentComponent.i();
        FirebaseAnalytics d10 = bottomSheetDialogFragmentComponent.f14246a.d();
        yk.g.i(d10);
        this.f17273e = d10;
        Analytics o10 = bottomSheetDialogFragmentComponent.f14246a.o();
        yk.g.i(o10);
        this.f17274f = o10;
        n0 h10 = bottomSheetDialogFragmentComponent.f14246a.h();
        yk.g.i(h10);
        this.f17275g = h10;
    }

    @Override // gd.h
    public final int x() {
        return R.layout.fragment_confirm_payment_dialog;
    }

    @Override // gd.h
    public final void z(View view) {
        String n10;
        String n11;
        String n12;
        Intrinsics.checkNotNullParameter(view, "view");
        sg sgVar = (sg) r();
        final int i10 = 0;
        sgVar.f6084t.setOnClickListener(new View.OnClickListener(this) { // from class: uf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f37159b;

            {
                this.f37159b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                b this$0 = this.f37159b;
                switch (i11) {
                    case 0:
                        int i12 = b.f37160j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.B().f9761q.postValue(Boolean.TRUE);
                        this$0.dismiss();
                        return;
                    default:
                        int i13 = b.f37160j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                }
            }
        });
        sg sgVar2 = (sg) r();
        final int i11 = 1;
        sgVar2.f6083s.setOnClickListener(new View.OnClickListener(this) { // from class: uf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f37159b;

            {
                this.f37159b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                b this$0 = this.f37159b;
                switch (i112) {
                    case 0:
                        int i12 = b.f37160j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.B().f9761q.postValue(Boolean.TRUE);
                        this$0.dismiss();
                        return;
                    default:
                        int i13 = b.f37160j;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.dismiss();
                        return;
                }
            }
        });
        String str = B().f9767w;
        if (Intrinsics.a(str, "TRANSFER_TO_PAYTM_WALLET")) {
            ((sg) r()).f6085u.removeAllViews();
            h8 r10 = h8.r(LayoutInflater.from(getContext()), ((sg) r()).f6085u);
            Intrinsics.checkNotNullExpressionValue(r10, "inflate(...)");
            r10.f4910t.setText(getResources().getString(R.string.amount));
            WithdrawalDetailViewModel B = B();
            B.getClass();
            ij.h hVar = ij.h.f20067a;
            n12 = ij.h.f20067a.n(1, B.f9762r);
            r10.f4911u.setText(n12);
            ((sg) r()).f6085u.addView(r10.f27491e);
            h8 r11 = h8.r(LayoutInflater.from(getContext()), ((sg) r()).f6085u);
            Intrinsics.checkNotNullExpressionValue(r11, "inflate(...)");
            r11.f4910t.setText(getResources().getString(R.string.text_paytm_number));
            r11.f4911u.setText(B().f9763s);
            r11.f4909s.setVisibility(8);
            ((sg) r()).f6085u.addView(r11.f27491e);
            return;
        }
        if (Intrinsics.a(str, "TRANSFER_TO_UPI")) {
            ((sg) r()).f6085u.removeAllViews();
            h8 r12 = h8.r(LayoutInflater.from(getContext()), ((sg) r()).f6085u);
            Intrinsics.checkNotNullExpressionValue(r12, "inflate(...)");
            r12.f4910t.setText(getResources().getString(R.string.amount));
            WithdrawalDetailViewModel B2 = B();
            B2.getClass();
            ij.h hVar2 = ij.h.f20067a;
            n11 = ij.h.f20067a.n(1, B2.f9762r);
            r12.f4911u.setText(n11);
            ((sg) r()).f6085u.addView(r12.f27491e);
            h8 r13 = h8.r(LayoutInflater.from(getContext()), ((sg) r()).f6085u);
            Intrinsics.checkNotNullExpressionValue(r13, "inflate(...)");
            r13.f4910t.setText(getResources().getString(R.string.text_upi_id));
            r13.f4911u.setText(B().f9764t);
            r13.f4909s.setVisibility(8);
            ((sg) r()).f6085u.addView(r13.f27491e);
            return;
        }
        ((sg) r()).f6085u.removeAllViews();
        h8 r14 = h8.r(LayoutInflater.from(getContext()), ((sg) r()).f6085u);
        Intrinsics.checkNotNullExpressionValue(r14, "inflate(...)");
        r14.f4910t.setText(getResources().getString(R.string.amount));
        WithdrawalDetailViewModel B3 = B();
        B3.getClass();
        ij.h hVar3 = ij.h.f20067a;
        n10 = ij.h.f20067a.n(1, B3.f9762r);
        r14.f4911u.setText(n10);
        ((sg) r()).f6085u.addView(r14.f27491e);
        h8 r15 = h8.r(LayoutInflater.from(getContext()), ((sg) r()).f6085u);
        Intrinsics.checkNotNullExpressionValue(r15, "inflate(...)");
        r15.f4910t.setText(getResources().getString(R.string.text_account_number));
        r15.f4911u.setText(B().f9766v);
        ((sg) r()).f6085u.addView(r15.f27491e);
        h8 r16 = h8.r(LayoutInflater.from(getContext()), ((sg) r()).f6085u);
        Intrinsics.checkNotNullExpressionValue(r16, "inflate(...)");
        r16.f4910t.setText(getResources().getString(R.string.text_ifsc_code));
        r16.f4911u.setText(B().f9765u);
        r16.f4909s.setVisibility(8);
        ((sg) r()).f6085u.addView(r16.f27491e);
    }
}
