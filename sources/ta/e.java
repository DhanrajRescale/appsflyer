package ta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import ba.dk;
import com.assetgro.stockgro.feature_market.presentation.market.asset.stocks.list.MarketStocksListViewModel;
import com.assetgro.stockgro.prod.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f35644b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(h hVar, int i10) {
        super(1);
        this.f35643a = i10;
        this.f35644b = hVar;
    }

    public final void a(Boolean bool) {
        int i10 = this.f35643a;
        int i11 = 0;
        h hVar = this.f35644b;
        switch (i10) {
            case 0:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((dk) hVar.q()).f4501y.setRefreshing(true);
                    return;
                } else {
                    ((dk) hVar.q()).f4501y.setRefreshing(false);
                    return;
                }
            case 1:
                dk dkVar = (dk) hVar.q();
                Intrinsics.c(bool);
                if (!bool.booleanValue()) {
                    i11 = 8;
                }
                dkVar.f4497u.setVisibility(i11);
                ((MarketStocksListViewModel) hVar.r()).f9084g.postValue(Boolean.TRUE);
                return;
            default:
                ImageView next = ((dk) hVar.q()).f4496t.getNext();
                Intrinsics.c(bool);
                next.setEnabled(bool.booleanValue());
                ((dk) hVar.q()).f4496t.getPrev().setEnabled(bool.booleanValue());
                return;
        }
    }

    public final void d(String text) {
        int i10 = this.f35643a;
        h hVar = this.f35644b;
        switch (i10) {
            case 3:
                Context context = hVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
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
            default:
                if (Intrinsics.a(text, "MarketStocksListFragment")) {
                    ((MarketStocksListViewModel) hVar.r()).k(k.f35664g);
                    return;
                } else {
                    ((MarketStocksListViewModel) hVar.r()).k(k.f35665h);
                    return;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f35643a) {
            case 0:
                a((Boolean) obj);
                return Unit.f23355a;
            case 1:
                a((Boolean) obj);
                return Unit.f23355a;
            case 2:
                a((Boolean) obj);
                return Unit.f23355a;
            case 3:
                d((String) obj);
                return Unit.f23355a;
            case 4:
                qv.a.a(new Object[0]);
                return Unit.f23355a;
            default:
                d((String) obj);
                return Unit.f23355a;
        }
    }
}
