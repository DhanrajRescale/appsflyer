package ab;

import android.widget.CompoundButton;
import ba.o1;
import ba.pk;
import ba.sk;
import ba.u2;
import com.assetgro.stockgro.data.model.ChatChannel;
import com.assetgro.stockgro.feature_onboarding.presentation.login.mobile.MobileLoginFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.register.MobileRegisterFragment;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningActivity;
import com.assetgro.stockgro.ui.arena.detail.pre.LeagueDetailPreJoiningViewModel;
import com.assetgro.stockgro.ui.chat.list.UserGroupListItemViewModel;
import com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailActivity;
import com.assetgro.stockgro.ui.payments.withdrawal.WithdrawalDetailViewModel;
import com.assetgro.stockgro.ui.redemption.offers.details.OfferDetailsActivity;
import com.google.android.material.chip.Chip;
import ek.h0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f293b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f292a = i10;
        this.f293b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        int i10 = this.f292a;
        Object obj = this.f293b;
        switch (i10) {
            case 0:
                MobileLoginFragment this$0 = (MobileLoginFragment) obj;
                int i11 = MobileLoginFragment.f8723k;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((pk) this$0.q()).f5777u.setEnabled(z10);
                ((pk) this$0.q()).f5777u.setAlpha(el.l.s(z10));
                return;
            case 1:
                MobileRegisterFragment this$02 = (MobileRegisterFragment) obj;
                int i12 = MobileRegisterFragment.f8757j;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                ((sk) this$02.q()).f6099w.setEnabled(z10);
                ((sk) this$02.q()).f6099w.setAlpha(el.l.s(z10));
                return;
            case 2:
                LeagueDetailPreJoiningActivity this$03 = (LeagueDetailPreJoiningActivity) obj;
                int i13 = LeagueDetailPreJoiningActivity.f9045l;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                ((LeagueDetailPreJoiningViewModel) this$03.x()).f9057x.setValue(Boolean.valueOf(((o1) this$03.w()).H.isChecked()));
                ((LeagueDetailPreJoiningViewModel) this$03.x()).f9052s.postValue(new kj.j(Boolean.valueOf(z10)));
                ((o1) this$03.w()).B.setEnabled(z10);
                return;
            case 3:
                je.g this$04 = (je.g) obj;
                int i14 = je.g.f21331y;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                ChatChannel chatChannel = (ChatChannel) ((UserGroupListItemViewModel) this$04.v()).f9075c.getValue();
                if (chatChannel != null) {
                    this$04.f21332x.invoke(chatChannel, Boolean.valueOf(z10));
                    return;
                }
                return;
            case 4:
                WithdrawalDetailActivity this$05 = (WithdrawalDetailActivity) obj;
                int i15 = WithdrawalDetailActivity.f9757k;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                ((WithdrawalDetailViewModel) this$05.x()).f9760p.postValue(Boolean.valueOf(z10));
                return;
            case 5:
                OfferDetailsActivity this$06 = (OfferDetailsActivity) obj;
                int i16 = OfferDetailsActivity.f10095k;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                ((u2) this$06.w()).f6263s.C.setEnabled(z10);
                return;
            case 6:
                qj.m onCheckBoxClickedListener = (qj.m) obj;
                Intrinsics.checkNotNullParameter(onCheckBoxClickedListener, "$onCheckBoxClickedListener");
                onCheckBoxClickedListener.o();
                return;
            default:
                Chip chip = (Chip) obj;
                mo.f fVar = chip.f11241j;
                if (fVar != null) {
                    h0 h0Var = (h0) fVar;
                    l7.g gVar = (l7.g) h0Var.f15593b;
                    if (!z10 ? gVar.f(chip, gVar.f24116b) : gVar.a(chip)) {
                        ((l7.g) h0Var.f15593b).e();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f11240i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
                    return;
                }
                return;
        }
    }
}
