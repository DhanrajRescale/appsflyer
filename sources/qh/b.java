package qh;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import ba.u2;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.payments.recharge.RechargeWalletActivity;
import com.assetgro.stockgro.ui.redemption.offers.details.OfferDetailsActivity;
import com.google.android.material.button.MaterialButton;
import iu.k;
import java.util.Arrays;
import java.util.List;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OfferDetailsActivity f31958b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(OfferDetailsActivity offerDetailsActivity, int i10) {
        super(1);
        this.f31957a = i10;
        this.f31958b = offerDetailsActivity;
    }

    public final void a(Boolean bool) {
        int i10 = this.f31957a;
        int i11 = 8;
        OfferDetailsActivity offerDetailsActivity = this.f31958b;
        switch (i10) {
            case 1:
                MaterialButton materialButton = ((u2) offerDetailsActivity.w()).f6263s.C;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    i11 = 0;
                }
                materialButton.setVisibility(i11);
                return;
            case 2:
                MaterialButton materialButton2 = ((u2) offerDetailsActivity.w()).f6263s.f5460t;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    i11 = 0;
                }
                materialButton2.setVisibility(i11);
                return;
            case 3:
                MaterialButton materialButton3 = ((u2) offerDetailsActivity.w()).f6263s.C;
                Intrinsics.c(bool);
                materialButton3.setEnabled(bool.booleanValue());
                if (!bool.booleanValue()) {
                    ((u2) offerDetailsActivity.w()).f6263s.E.setChecked(false);
                    ((u2) offerDetailsActivity.w()).f6263s.E.setEnabled(false);
                    ((u2) offerDetailsActivity.w()).f6263s.C.setAlpha(0.5f);
                    ((u2) offerDetailsActivity.w()).f6263s.f5464x.setVisibility(0);
                    ((u2) offerDetailsActivity.w()).f6263s.f5464x.setText(offerDetailsActivity.getString(R.string.text_insufficient_stockgro_bonus));
                    return;
                }
                return;
            case 4:
            case 6:
            case 8:
            case 10:
            case 11:
            default:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    ((u2) offerDetailsActivity.w()).f6264t.setVisibility(0);
                    return;
                } else {
                    ((u2) offerDetailsActivity.w()).f6264t.setVisibility(8);
                    return;
                }
            case 5:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    offerDetailsActivity.setResult(-1);
                    offerDetailsActivity.finish();
                    return;
                }
                return;
            case 7:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    ((u2) offerDetailsActivity.w()).f6263s.f5459s.setVisibility(0);
                    ((u2) offerDetailsActivity.w()).f6263s.f5465y.setVisibility(8);
                    return;
                } else {
                    ((u2) offerDetailsActivity.w()).f6263s.f5459s.setVisibility(8);
                    ((u2) offerDetailsActivity.w()).f6263s.f5465y.setVisibility(0);
                    return;
                }
            case 9:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    ((u2) offerDetailsActivity.w()).f6263s.J.setVisibility(0);
                    return;
                } else {
                    ((u2) offerDetailsActivity.w()).f6263s.J.setVisibility(8);
                    return;
                }
            case 12:
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    String string = offerDetailsActivity.getString(R.string.text_redeemed_successfully);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    offerDetailsActivity.K("SUCCESS", string);
                    return;
                } else {
                    String string2 = offerDetailsActivity.getString(R.string.text_redemption_failed);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    offerDetailsActivity.K("FAILED", string2);
                    return;
                }
        }
    }

    public final void d(String text) {
        int i10 = this.f31957a;
        OfferDetailsActivity context = this.f31958b;
        switch (i10) {
            case 0:
                ((u2) context.w()).f6263s.I.setText(text);
                return;
            case 6:
                Intrinsics.c(text);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(text, "text");
                if (text.length() != 0) {
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                    return;
                }
                return;
            case 14:
                ((u2) context.w()).f6263s.B.setText(text);
                return;
            case 15:
                ((u2) context.w()).f6263s.f5463w.setText(text);
                return;
            case 16:
                ((u2) context.w()).f6263s.G.setText(text);
                TextView textView = ((u2) context.w()).f6263s.A;
                String string = context.getString(R.string.text_price_details);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String format = String.format(string, Arrays.copyOf(new Object[]{text}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                textView.setText(format);
                return;
            case 17:
                ((u2) context.w()).f6263s.f5462v.setText(text);
                return;
            case 18:
                ((u2) context.w()).f6263s.f5461u.setText(text);
                return;
            default:
                ((u2) context.w()).f6263s.H.setText(text);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f31957a;
        OfferDetailsActivity offerDetailsActivity = this.f31958b;
        switch (i10) {
            case 0:
                d((String) obj);
                return Unit.f23355a;
            case 1:
                a((Boolean) obj);
                return Unit.f23355a;
            case 2:
                a((Boolean) obj);
                return Unit.f23355a;
            case 3:
                a((Boolean) obj);
                return Unit.f23355a;
            case 4:
                Bundle bundle = (Bundle) ((j) obj).a();
                if (bundle != null) {
                    Intent intent = new Intent(offerDetailsActivity, (Class<?>) RechargeWalletActivity.class);
                    intent.putExtras(bundle);
                    offerDetailsActivity.startActivityForResult(intent, 10021);
                }
                return Unit.f23355a;
            case 5:
                a((Boolean) obj);
                return Unit.f23355a;
            case 6:
                d((String) obj);
                return Unit.f23355a;
            case 7:
                a((Boolean) obj);
                return Unit.f23355a;
            case 8:
                ((u2) offerDetailsActivity.w()).f6263s.D.setVisibility(0);
                ((u2) offerDetailsActivity.w()).f6263s.f5459s.setVisibility(0);
                return Unit.f23355a;
            case 9:
                a((Boolean) obj);
                return Unit.f23355a;
            case 10:
                Integer num = (Integer) obj;
                if (num != null && num.intValue() == 1) {
                    ((u2) offerDetailsActivity.w()).f6263s.f5466z.setText(offerDetailsActivity.getString(R.string.text_offer_limit_reached));
                } else if (num != null && num.intValue() == 2) {
                    ((u2) offerDetailsActivity.w()).f6263s.f5466z.setText(offerDetailsActivity.getString(R.string.text_offer_unavailable));
                } else if (num != null) {
                    num.intValue();
                }
                return Unit.f23355a;
            case 11:
                List messages = (List) obj;
                int i11 = ph.b.f31085j;
                Intrinsics.c(messages);
                Intrinsics.checkNotNullParameter(messages, "messages");
                Bundle bundle2 = new Bundle();
                ph.b bVar = new ph.b();
                bVar.setArguments(bundle2);
                bVar.f31086i = messages;
                bVar.setCancelable(false);
                bVar.show(offerDetailsActivity.getSupportFragmentManager(), "AlertBottomSheetDialogFragment");
                return Unit.f23355a;
            case 12:
                a((Boolean) obj);
                return Unit.f23355a;
            case 13:
                a((Boolean) obj);
                return Unit.f23355a;
            case 14:
                d((String) obj);
                return Unit.f23355a;
            case 15:
                d((String) obj);
                return Unit.f23355a;
            case 16:
                d((String) obj);
                return Unit.f23355a;
            case 17:
                d((String) obj);
                return Unit.f23355a;
            case 18:
                d((String) obj);
                return Unit.f23355a;
            default:
                d((String) obj);
                return Unit.f23355a;
        }
    }
}
