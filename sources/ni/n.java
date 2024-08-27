package ni;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ba.co;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.stock.list.StockListViewModel;
import com.assetgro.stockgro.widget.ArrowSlider;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f28750b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i10) {
        super(1);
        this.f28749a = i10;
        this.f28750b = oVar;
    }

    public final void a(Boolean bool) {
        int i10 = this.f28749a;
        o oVar = this.f28750b;
        switch (i10) {
            case 1:
                SwipeRefreshLayout swipeRefreshLayout = ((co) oVar.q()).f4395s.f6291w;
                Intrinsics.c(bool);
                swipeRefreshLayout.setRefreshing(bool.booleanValue());
                return;
            default:
                ImageView next = ((co) oVar.q()).f4395s.f6287s.getNext();
                Intrinsics.c(bool);
                next.setEnabled(bool.booleanValue());
                ((co) oVar.q()).f4395s.f6287s.getPrev().setEnabled(bool.booleanValue());
                return;
        }
    }

    public final void d(String text) {
        int i10 = this.f28749a;
        o oVar = this.f28750b;
        switch (i10) {
            case 3:
                Context context = oVar.requireContext();
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
                if (Intrinsics.a(text, "StockListFragment")) {
                    ((StockListViewModel) oVar.r()).j();
                    return;
                }
                jt.e eVar = ((StockListViewModel) oVar.r()).A;
                if (eVar != null) {
                    ft.b.b(eVar);
                    return;
                }
                return;
        }
    }

    public final void e(List list) {
        int i10 = this.f28749a;
        o oVar = this.f28750b;
        switch (i10) {
            case 0:
                ArrowSlider pagerView = ((co) oVar.q()).f4395s.f6287s;
                Intrinsics.checkNotNullExpressionValue(pagerView, "pagerView");
                oVar.F(pagerView);
                TextView title = ((co) oVar.q()).f4395s.f6287s.getTitle();
                String string = oVar.getString(R.string.stock_pager_title_text);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(((StockListViewModel) oVar.r()).f10260u), Integer.valueOf(((StockListViewModel) oVar.r()).f10261v)}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                title.setText(format);
                if (((StockListViewModel) oVar.r()).f10260u == 1) {
                    ((co) oVar.q()).f4395s.f6287s.getPrev().setVisibility(4);
                    ((co) oVar.q()).f4395s.f6287s.getNext().setVisibility(0);
                } else if (((StockListViewModel) oVar.r()).f10260u == ((StockListViewModel) oVar.r()).f10261v) {
                    ((co) oVar.q()).f4395s.f6287s.getPrev().setVisibility(0);
                    ((co) oVar.q()).f4395s.f6287s.getNext().setVisibility(4);
                } else {
                    ((co) oVar.q()).f4395s.f6287s.getPrev().setVisibility(0);
                    ((co) oVar.q()).f4395s.f6287s.getNext().setVisibility(0);
                }
                ((StockListViewModel) oVar.r()).f10256q.postValue(Boolean.TRUE);
                a aVar = oVar.f28754i;
                if (aVar != null) {
                    aVar.u(list);
                    return;
                } else {
                    Intrinsics.k("stockAdapter");
                    throw null;
                }
            default:
                qv.a.a(new Object[0]);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f28749a) {
            case 0:
                e((List) obj);
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
                e((List) obj);
                return Unit.f23355a;
            case 5:
                o oVar = this.f28750b;
                if (((StockListViewModel) oVar.r()).C) {
                    ((co) oVar.q()).f4395s.f6288t.setVisibility(8);
                }
                return Unit.f23355a;
            default:
                d((String) obj);
                return Unit.f23355a;
        }
    }
}
