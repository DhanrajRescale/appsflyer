package na;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import ba.pj;
import com.assetgro.stockgro.prod.R;
import iu.k;
import kj.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f28559b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i10) {
        super(1);
        this.f28558a = i10;
        this.f28559b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string;
        int i10 = this.f28558a;
        TextView textView = null;
        d dVar = this.f28559b;
        switch (i10) {
            case 0:
                if (Intrinsics.a((String) obj, "MarketAssetHostFragment")) {
                    int i11 = d.f28560i;
                    Bundle extras = dVar.requireActivity().getIntent().getExtras();
                    if (extras != null && (string = extras.getString("ASSET_CLASS_TYPE")) != null) {
                        ma.a[] aVarArr = ma.a.f27693a;
                        if (Intrinsics.a(string, "stocks")) {
                            ((pj) dVar.q()).f5772t.setSelectedItemId(R.id.stocks_fragment);
                        } else if (Intrinsics.a(string, "option")) {
                            ((pj) dVar.q()).f5772t.setSelectedItemId(R.id.fno_fragment);
                        } else {
                            ((pj) dVar.q()).f5772t.setSelectedItemId(R.id.stocks_fragment);
                        }
                        dVar.requireActivity().getIntent().replaceExtras((Bundle) null);
                    }
                }
                return Unit.f23355a;
            default:
                Integer num = (Integer) obj;
                Intrinsics.c(num);
                int intValue = num.intValue();
                int i12 = d.f28560i;
                View actionView = ((pj) dVar.q()).f5774v.getMenu().findItem(R.id.menu_item_notifications).getActionView();
                if (actionView != null) {
                    textView = (TextView) actionView.findViewById(R.id.cart_badge_notification);
                }
                if (textView != null) {
                    f.u(textView, intValue);
                }
                return Unit.f23355a;
        }
    }
}
