package jc;

import ab.k;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import ba.eo;
import ba.fg;
import ba.go;
import ba.hl;
import ba.jo;
import ba.pk;
import ba.sk;
import ba.zo;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.feature_onboarding.presentation.login.mobile.MobileLoginFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.register.MobileRegisterFragment;
import com.assetgro.stockgro.feature_onboarding.presentation.register.NameRegisterFragment;
import com.assetgro.stockgro.missions.presentation.widget.MissionInputView;
import com.assetgro.stockgro.ui.payments.recharge.RechargeWalletActivity;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderFragment;
import com.assetgro.stockgro.ui.stock.modify.buy.ModifyBuyOrderFragment;
import com.assetgro.stockgro.ui.stock.modify.short_sell.ModifyShortSellOrderFragment;
import com.assetgro.stockgro.ui.stock.shortSell.order.StockShortSellOrderFragment;
import com.assetgro.stockgro.widget.InputView;
import com.assetgro.stockgro.widget.MultipleCountryInputView;
import gd.m;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import qj.c0;
import qj.d0;
import qj.r;
import qj.s;
import vt.v;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21296a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21297b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f21296a = i10;
        this.f21297b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11 = this.f21296a;
        Object obj = this.f21297b;
        switch (i11) {
            case 0:
                MissionInputView this$0 = (MissionInputView) obj;
                int i12 = MissionInputView.f8932x;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!v.o(new Integer[]{5, 6}, Integer.valueOf(i10))) {
                    return false;
                }
                textView.getText().toString();
                this$0.getClass();
                return true;
            case 1:
                vg.c this$02 = (vg.c) obj;
                int i13 = vg.c.f38040j;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (!v.o(new Integer[]{5, 6, 2}, Integer.valueOf(i10))) {
                    return false;
                }
                if (!TextUtils.isEmpty(textView.getText())) {
                    ((fg) this$02.r()).f4708z.callOnClick();
                }
                return true;
            case 2:
                InputView this$03 = (InputView) obj;
                int i14 = InputView.G;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                if (!v.o(new Integer[]{5, 6}, Integer.valueOf(i10))) {
                    return false;
                }
                String obj2 = textView.getText().toString();
                this$03.f10642w = obj2;
                r rVar = this$03.onInputViewAction;
                if (rVar != null) {
                    rVar.f(obj2);
                }
                s sVar = this$03.onInputViewActionDone;
                if (sVar != null) {
                    eb.f fVar = (eb.f) sVar;
                    int i15 = fVar.f15308a;
                    Object obj3 = fVar.f15309b;
                    switch (i15) {
                        case 0:
                            ((sk) ((MobileRegisterFragment) obj3).q()).f6099w.callOnClick();
                            break;
                        case 1:
                            ((hl) ((NameRegisterFragment) obj3).q()).f4953u.callOnClick();
                            break;
                        case 2:
                            AnalyticEvent analyticEvent = new AnalyticEvent("add_money_field_activity", new HashMap());
                            RechargeWalletActivity rechargeWalletActivity = (RechargeWalletActivity) obj3;
                            rechargeWalletActivity.A(analyticEvent);
                            rechargeWalletActivity.D(analyticEvent);
                            break;
                        case 3:
                            StockOrderFragment stockOrderFragment = (StockOrderFragment) obj3;
                            Object parent = ((jo) stockOrderFragment.q()).f5160s.M.getParent().getParent();
                            Intrinsics.d(parent, "null cannot be cast to non-null type android.view.View");
                            ((jo) stockOrderFragment.q()).f5160s.J.v(((jo) stockOrderFragment.q()).f5160s.M.getTop() + ((View) parent).getTop());
                            break;
                        case 4:
                            ModifyBuyOrderFragment modifyBuyOrderFragment = (ModifyBuyOrderFragment) obj3;
                            Object parent2 = ((eo) modifyBuyOrderFragment.q()).f4629s.H.getParent().getParent();
                            Intrinsics.d(parent2, "null cannot be cast to non-null type android.view.View");
                            ((eo) modifyBuyOrderFragment.q()).f4629s.E.v(((eo) modifyBuyOrderFragment.q()).f4629s.H.getTop() + ((View) parent2).getTop());
                            break;
                        case 5:
                            ModifyShortSellOrderFragment modifyShortSellOrderFragment = (ModifyShortSellOrderFragment) obj3;
                            Object parent3 = ((go) modifyShortSellOrderFragment.q()).f4834s.J.getParent().getParent();
                            Intrinsics.d(parent3, "null cannot be cast to non-null type android.view.View");
                            ((go) modifyShortSellOrderFragment.q()).f4834s.G.v(((go) modifyShortSellOrderFragment.q()).f4834s.J.getTop() + ((View) parent3).getTop());
                            break;
                        default:
                            StockShortSellOrderFragment stockShortSellOrderFragment = (StockShortSellOrderFragment) obj3;
                            Object parent4 = ((zo) stockShortSellOrderFragment.q()).f6870s.N.getParent().getParent();
                            Intrinsics.d(parent4, "null cannot be cast to non-null type android.view.View");
                            ((zo) stockShortSellOrderFragment.q()).f6870s.K.v(((zo) stockShortSellOrderFragment.q()).f6870s.N.getTop() + ((View) parent4).getTop());
                            break;
                    }
                }
                return true;
            case 3:
                MultipleCountryInputView this$04 = (MultipleCountryInputView) obj;
                int i16 = MultipleCountryInputView.D;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                if (!v.o(new Integer[]{5, 6}, Integer.valueOf(i10))) {
                    return false;
                }
                String obj4 = textView.getText().toString();
                this$04.f10660w = obj4;
                c0 c0Var = this$04.onInputViewAction;
                if (c0Var != null) {
                    ((k) c0Var).a(obj4);
                }
                d0 d0Var = this$04.onInputViewActionDone;
                if (d0Var != null) {
                    k kVar = (k) d0Var;
                    int i17 = kVar.f299a;
                    m mVar = kVar.f300b;
                    switch (i17) {
                        case 0:
                            ((pk) ((MobileLoginFragment) mVar).q()).f5777u.callOnClick();
                            break;
                        default:
                            ((sk) ((MobileRegisterFragment) mVar).q()).f6097u.getFocus();
                            break;
                    }
                }
                return true;
            default:
                jm.b bVar = (jm.b) obj;
                if (keyEvent != null && keyEvent.getKeyCode() == 66) {
                    if (keyEvent.getAction() == 1) {
                        bVar.h();
                    }
                } else {
                    if (i10 != 6) {
                        return false;
                    }
                    bVar.h();
                }
                return true;
        }
    }
}
