package com.assetgro.stockgro.ui.payments.kyc;

import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.j0;
import androidx.lifecycle.o;
import androidx.navigation.t;
import ba.ki;
import com.assetgro.stockgro.data.model.KycSupportTicketResponseDto;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.f;
import ga.a;
import gd.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import nt.h;
import q6.l;
import r2.e;
import re.d;
import xf.b;
import xf.c;
import xf.i;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/payments/kyc/KycFAQFragment;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/payments/kyc/KycFAQViewModel;", "Lba/ki;", "<init>", "()V", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class KycFAQFragment extends m<KycFAQViewModel, ki> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f9663h = 0;

    /* renamed from: g, reason: collision with root package name */
    public b f9664g;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_kyc_faq;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((KycFAQViewModel) r()).f9084g.observe(this, new d(26, new c(this, 0)));
        ((KycFAQViewModel) r()).f9668o.observe(this, new d(26, new c(this, 1)));
        ((KycFAQViewModel) r()).f9670q.observe(this, new d(26, new c(this, 2)));
        ((KycFAQViewModel) r()).f9672s.observe(this, new d(26, new c(this, 3)));
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [gd.d, java.lang.Object, xf.b] */
    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        j0 activity = getActivity();
        Intrinsics.d(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        vl.b r10 = ((h.m) activity).r();
        if (r10 != null) {
            r10.l0(getString(R.string.text_help_center));
        }
        o parentLifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(parentLifecycle, "<get-lifecycle>(...)");
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
        ?? dVar = new gd.d(parentLifecycle, new a(7));
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f9664g = dVar;
        ki kiVar = (ki) q();
        b bVar = this.f9664g;
        if (bVar != null) {
            kiVar.f5252t.setAdapter(bVar);
            ki kiVar2 = (ki) q();
            kiVar2.f5253u.setOnClickListener(new p004if.c(this, 10));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.text_chat_with_stockgro));
            spannableStringBuilder.setSpan(new e(this, 2), 0, spannableStringBuilder.length(), 0);
            ((ki) q()).f5251s.setMovementMethod(LinkMovementMethod.getInstance());
            ((ki) q()).f5251s.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
            KycFAQViewModel kycFAQViewModel = (KycFAQViewModel) r();
            kycFAQViewModel.f9084g.postValue(Boolean.TRUE);
            h c10 = kycFAQViewModel.f9667n.getKycFaqs().c(((kq.e) kycFAQViewModel.f9079b).J());
            jt.d dVar2 = new jt.d(new vf.d(16, new i(kycFAQViewModel, 0)), new vf.d(17, new i(kycFAQViewModel, 1)));
            c10.a(dVar2);
            kycFAQViewModel.f9080c.c(dVar2);
            return;
        }
        Intrinsics.k("kycFAQAdapter");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onActivityResult(int i10, int i11, Intent intent) {
        KycSupportTicketResponseDto kycSupportTicketResponseDto;
        if (i11 == -1 && i10 == 10001) {
            KycSupportTicketResponseDto ticketData = null;
            if (intent != null) {
                kycSupportTicketResponseDto = (KycSupportTicketResponseDto) intent.getParcelableExtra("DATA");
            } else {
                kycSupportTicketResponseDto = null;
            }
            if (kycSupportTicketResponseDto instanceof KycSupportTicketResponseDto) {
                ticketData = kycSupportTicketResponseDto;
            }
            if (ticketData != null) {
                t h10 = l.h(this);
                Intrinsics.checkNotNullParameter(ticketData, "ticketData");
                h10.o(new xf.d(ticketData));
                return;
            }
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        this.f17284b = fragmentComponent.d();
        da.b bVar = fragmentComponent.f14279b;
        FirebaseAnalytics d10 = bVar.d();
        g.i(d10);
        this.f17285c = d10;
        Analytics o10 = bVar.o();
        g.i(o10);
        this.f17286d = o10;
        n0 h10 = bVar.h();
        g.i(h10);
        this.f17287e = h10;
    }
}
