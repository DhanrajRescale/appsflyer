package wf;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import androidx.lifecycle.o;
import androidx.viewpager2.widget.ViewPager2;
import ba.t4;
import com.assetgro.stockgro.data.model.KycResponseDto;
import com.assetgro.stockgro.data.model.portfolio.WalletCta;
import com.assetgro.stockgro.data.model.portfolio.WithdrawPreCheckData;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.home.WalletHomeActivity;
import com.assetgro.stockgro.ui.payments.home.WalletHomeViewModel;
import com.assetgro.stockgro.ui.payments.kyc.KycHostActivity;
import com.assetgro.stockgro.ui.payments.kyc.KycWebViewActivity;
import com.assetgro.stockgro.ui.payments.withdrawal.PaymentWithdrawalActivity;
import ek.u;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vt.v;

/* loaded from: classes.dex */
public final class d extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WalletHomeActivity f39044b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(WalletHomeActivity walletHomeActivity, int i10) {
        super(1);
        this.f39043a = i10;
        this.f39044b = walletHomeActivity;
    }

    public final void a(KycResponseDto kycResponseDto) {
        int i10;
        int i11 = this.f39043a;
        WalletHomeActivity walletHomeActivity = this.f39044b;
        switch (i11) {
            case 10:
                String f10 = a3.a.f("Avatar Image: ", ((WalletHomeViewModel) walletHomeActivity.x()).f9081d.getUserAvatar());
                Object[] objArr = new Object[0];
                Intrinsics.checkNotNullParameter("WalletHomeActivity", "tag");
                com.google.android.gms.internal.p002firebaseauthapi.a.g(f10, "s", objArr, "params", "WalletHomeActivity").getClass();
                u.k(objArr);
                ((t4) walletHomeActivity.w()).G.setVisibility(0);
                ((com.bumptech.glide.g) ((com.bumptech.glide.g) com.bumptech.glide.b.c(walletHomeActivity).f(walletHomeActivity).m(((WalletHomeViewModel) walletHomeActivity.x()).f9081d.getUserAvatar()).b()).l(R.drawable.ic_placeholder_user)).z(((t4) walletHomeActivity.w()).f6142a0);
                ((t4) walletHomeActivity.w()).f6143b0.setText(((WalletHomeViewModel) walletHomeActivity.x()).f9081d.getUserDisplayName());
                String status = kycResponseDto.getStatus();
                if (v.o(new String[]{"invalid", "pending"}, status)) {
                    String string = walletHomeActivity.getString(R.string.complete_kyc);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    int color = r3.k.getColor(walletHomeActivity, R.color.wallet_kyc_complete_now_color);
                    boolean z10 = ((WalletHomeViewModel) walletHomeActivity.x()).B;
                    int i12 = 1;
                    if (z10) {
                        i10 = R.drawable.ic_kyc_next_v2;
                    } else if (!z10) {
                        i10 = -1;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    WalletHomeActivity.K(walletHomeActivity, string, color, i10);
                    if (((WalletHomeViewModel) walletHomeActivity.x()).B) {
                        String string2 = walletHomeActivity.getString(R.string.kyc_mandatory_complete_message);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        String string3 = walletHomeActivity.getString(R.string.view_details);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) (string2 + " "));
                        spannableStringBuilder.append((CharSequence) string3);
                        spannableStringBuilder.setSpan(new r2.e(walletHomeActivity, i12), spannableStringBuilder.length() - string3.length(), spannableStringBuilder.length(), 0);
                        return;
                    }
                    return;
                }
                if (Intrinsics.a(status, "in_progress")) {
                    String string4 = walletHomeActivity.getString(R.string.kyc_in_review);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    WalletHomeActivity.K(walletHomeActivity, string4, r3.k.getColor(walletHomeActivity, R.color.chatSenderNameTextColor), R.drawable.ic_kyc_in_progress);
                    return;
                } else if (Intrinsics.a(status, "complete")) {
                    String string5 = walletHomeActivity.getString(R.string.kyc_text);
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    WalletHomeActivity.K(walletHomeActivity, string5, r3.k.getColor(walletHomeActivity, R.color.wallet_kyc_completed_color_new), R.drawable.ic_kyc_completed);
                    return;
                } else {
                    if (Intrinsics.a(status, "reject")) {
                        String string6 = walletHomeActivity.getString(R.string.retry_kyc);
                        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                        WalletHomeActivity.K(walletHomeActivity, string6, r3.k.getColor(walletHomeActivity, R.color.transaction_failed), R.drawable.ic_kyc_retry);
                        return;
                    }
                    return;
                }
            case 11:
                walletHomeActivity.startActivity(new Intent(walletHomeActivity, (Class<?>) KycWebViewActivity.class).putExtra("kycData", kycResponseDto));
                return;
            default:
                WalletHomeViewModel walletHomeViewModel = (WalletHomeViewModel) walletHomeActivity.x();
                qf.b bVar = qf.b.f31935j;
                if (walletHomeViewModel.f9649o.b(bVar)) {
                    String string7 = walletHomeActivity.getString(R.string.kyc_verification);
                    Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                    walletHomeActivity.L(bVar, string7);
                    return;
                }
                walletHomeActivity.startActivity(new Intent(walletHomeActivity, (Class<?>) KycHostActivity.class).putExtra("kycData", kycResponseDto));
                return;
        }
    }

    public final void d(Boolean bool) {
        int i10 = this.f39043a;
        WalletHomeActivity walletHomeActivity = this.f39044b;
        switch (i10) {
            case 4:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    com.kaopiz.kprogresshud.f fVar = walletHomeActivity.f17255c;
                    if (fVar != null) {
                        fVar.d();
                        return;
                    }
                    return;
                }
                com.kaopiz.kprogresshud.f fVar2 = walletHomeActivity.f17255c;
                if (fVar2 != null) {
                    fVar2.b();
                    return;
                }
                return;
            case 5:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((t4) walletHomeActivity.w()).W.setRefreshing(true);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((t4) walletHomeActivity.w()).W.setRefreshing(false);
                        return;
                    }
                    return;
                }
            default:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    walletHomeActivity.startActivityForResult(new Intent(walletHomeActivity, (Class<?>) PaymentWithdrawalActivity.class), 130);
                    return;
                }
                return;
        }
    }

    public final void e(List list) {
        int i10 = this.f39043a;
        WalletHomeActivity walletHomeActivity = this.f39044b;
        switch (i10) {
            case 0:
                if (list != null && !list.isEmpty()) {
                    ((t4) walletHomeActivity.w()).T.setVisibility(0);
                    o lifecycle = walletHomeActivity.getLifecycle();
                    Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                    walletHomeActivity.f9646k = new fj.a(lifecycle, new c(walletHomeActivity, 0));
                    t4 t4Var = (t4) walletHomeActivity.w();
                    fj.a aVar = walletHomeActivity.f9646k;
                    if (aVar != null) {
                        ViewPager2 viewPager2 = t4Var.V;
                        viewPager2.setAdapter(aVar);
                        viewPager2.setClipToPadding(false);
                        viewPager2.setPadding(32, 4, 32, 4);
                        ((t4) walletHomeActivity.w()).U.setViewPager(viewPager2);
                        fj.a aVar2 = walletHomeActivity.f9646k;
                        if (aVar2 != null) {
                            aVar2.u(list);
                            t4 t4Var2 = (t4) walletHomeActivity.w();
                            t4Var2.U.setViewPager(((t4) walletHomeActivity.w()).V);
                            return;
                        }
                        Intrinsics.k("subscriptionBulletInIndexAdapter");
                        throw null;
                    }
                    Intrinsics.k("subscriptionBulletInIndexAdapter");
                    throw null;
                }
                ((t4) walletHomeActivity.w()).T.setVisibility(8);
                return;
            default:
                if (list != null && !list.isEmpty()) {
                    ((t4) walletHomeActivity.w()).f6147s.setVisibility(0);
                    o lifecycle2 = walletHomeActivity.getLifecycle();
                    Intrinsics.checkNotNullExpressionValue(lifecycle2, "<get-lifecycle>(...)");
                    walletHomeActivity.f9647l = new fj.a(lifecycle2, new c(walletHomeActivity, 1));
                    t4 t4Var3 = (t4) walletHomeActivity.w();
                    fj.a aVar3 = walletHomeActivity.f9647l;
                    if (aVar3 != null) {
                        ViewPager2 viewPager22 = t4Var3.f6150v;
                        viewPager22.setAdapter(aVar3);
                        viewPager22.setClipToPadding(false);
                        fj.a aVar4 = walletHomeActivity.f9647l;
                        if (aVar4 != null) {
                            aVar4.u(list);
                            t4 t4Var4 = (t4) walletHomeActivity.w();
                            t4Var4.f6148t.setViewPager(((t4) walletHomeActivity.w()).f6150v);
                            return;
                        }
                        Intrinsics.k("addAdapter");
                        throw null;
                    }
                    Intrinsics.k("addAdapter");
                    throw null;
                }
                ((t4) walletHomeActivity.w()).f6147s.setVisibility(8);
                return;
        }
    }

    public final void f(kj.j jVar) {
        int i10 = this.f39043a;
        WalletHomeActivity walletHomeActivity = this.f39044b;
        switch (i10) {
            case 7:
                if (((Unit) jVar.a()) != null) {
                    int i11 = vf.c.f38027j;
                    Bundle bundle = new Bundle();
                    vf.c cVar = new vf.c();
                    cVar.setArguments(bundle);
                    cVar.show(walletHomeActivity.getSupportFragmentManager(), "PinRetryBottomSheetDialogFragment");
                    return;
                }
                return;
            case 8:
            default:
                walletHomeActivity.finish();
                return;
            case 9:
                String str = (String) jVar.a();
                if (str != null) {
                    int i12 = tf.b.f36008c;
                    String string = walletHomeActivity.getString(R.string.ok);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    WithdrawPreCheckData data = new WithdrawPreCheckData(string, str, false);
                    Intrinsics.checkNotNullParameter(data, "data");
                    tf.b bVar = new tf.b();
                    bVar.setArguments(hl.f.y(new Pair("DATA", data)));
                    bVar.show(walletHomeActivity.getSupportFragmentManager(), "MessageBottomSheet");
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f39043a;
        WalletHomeActivity walletHomeActivity = this.f39044b;
        switch (i10) {
            case 0:
                e((List) obj);
                return Unit.f23355a;
            case 1:
                e((List) obj);
                return Unit.f23355a;
            case 2:
                WithdrawPreCheckData data = (WithdrawPreCheckData) obj;
                int i11 = tf.a.f36006c;
                Intrinsics.c(data);
                Intrinsics.checkNotNullParameter(data, "data");
                tf.a aVar = new tf.a();
                aVar.setArguments(hl.f.y(new Pair("DATA", data)));
                aVar.show(walletHomeActivity.getSupportFragmentManager(), "KnowYourWithdrawLimitBottomSheet");
                return Unit.f23355a;
            case 3:
                WalletCta data2 = (WalletCta) obj;
                int i12 = a.f39037c;
                Intrinsics.c(data2);
                Intrinsics.checkNotNullParameter(data2, "data");
                a aVar2 = new a();
                aVar2.setArguments(hl.f.y(new Pair("DATA", data2)));
                aVar2.show(walletHomeActivity.getSupportFragmentManager(), "WalletAnnouncementActionBottomSheet");
                return Unit.f23355a;
            case 4:
                d((Boolean) obj);
                return Unit.f23355a;
            case 5:
                d((Boolean) obj);
                return Unit.f23355a;
            case 6:
                d((Boolean) obj);
                return Unit.f23355a;
            case 7:
                f((kj.j) obj);
                return Unit.f23355a;
            case 8:
                ((t4) walletHomeActivity.w()).K.setVisibility(0);
                t4 t4Var = (t4) walletHomeActivity.w();
                t4Var.J.setText((CharSequence) ((Pair) obj).f23353a);
                return Unit.f23355a;
            case 9:
                f((kj.j) obj);
                return Unit.f23355a;
            case 10:
                a((KycResponseDto) obj);
                return Unit.f23355a;
            case 11:
                a((KycResponseDto) obj);
                return Unit.f23355a;
            case 12:
                a((KycResponseDto) obj);
                return Unit.f23355a;
            case 13:
                int i13 = yf.c.f41615j;
                Bundle bundle = new Bundle();
                yf.c cVar = new yf.c();
                cVar.setArguments(bundle);
                cVar.show(walletHomeActivity.getSupportFragmentManager(), "KycMandatoryBottomSheetDialogFragment");
                return Unit.f23355a;
            default:
                f((kj.j) obj);
                return Unit.f23355a;
        }
    }
}
