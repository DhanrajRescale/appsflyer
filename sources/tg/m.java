package tg;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.j0;
import ba.mm;
import com.assetgro.stockgro.data.model.BottomSheetItem;
import com.assetgro.stockgro.data.model.portfolio.orders.PortfolioOrdersDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.orders.PortfolioOrdersViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockDetailHostActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f36064b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(o oVar, int i10) {
        super(1);
        this.f36063a = i10;
        this.f36064b = oVar;
    }

    public final void a(Boolean bool) {
        int i10 = this.f36063a;
        o oVar = this.f36064b;
        switch (i10) {
            case 1:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((mm) oVar.q()).f5487x.setRefreshing(true);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((mm) oVar.q()).f5487x.setRefreshing(false);
                        return;
                    }
                    return;
                }
            default:
                ((PortfolioOrdersViewModel) oVar.r()).h(((PortfolioOrdersViewModel) oVar.r()).f9920s);
                return;
        }
    }

    public final void d(String text) {
        int i10 = this.f36063a;
        String str = null;
        o oVar = this.f36064b;
        switch (i10) {
            case 2:
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
            case 3:
                if (Intrinsics.a(text, oVar.getString(R.string.text_success))) {
                    Context context2 = oVar.requireContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                    String text2 = oVar.getString(R.string.text_order_cancel_successful);
                    Intrinsics.checkNotNullExpressionValue(text2, "getString(...)");
                    Intrinsics.checkNotNullParameter(context2, "context");
                    Intrinsics.checkNotNullParameter(text2, "text");
                    if (text2.length() != 0) {
                        Toast makeText2 = Toast.makeText(context2, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                        Object systemService2 = context2.getSystemService("layout_inflater");
                        Intrinsics.d(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
                        View inflate2 = ((LayoutInflater) systemService2).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                        w.k.c(text2, (TextView) inflate2.findViewById(R.id.message), makeText2, inflate2);
                    }
                }
                ((PortfolioOrdersViewModel) oVar.r()).f9923v = new BottomSheetItem("All Orders", HttpUrl.FRAGMENT_ENCODE_SET);
                ((PortfolioOrdersViewModel) oVar.r()).h(((PortfolioOrdersViewModel) oVar.r()).f9920s);
                return;
            case 4:
            default:
                Intrinsics.checkNotNullParameter(text, "stockIdentifier");
                Bundle arguments = oVar.getArguments();
                if (arguments != null) {
                    str = arguments.getString("PORTFOLIO_ID");
                }
                j0 activity = oVar.getActivity();
                if (activity != null) {
                    Intent intent = new Intent(activity, (Class<?>) StockDetailHostActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("ADD_TO_PORTFOLIO", activity.getIntent().getBooleanExtra("ADD_TO_PORTFOLIO", false));
                    bundle.putParcelable("PORTFOLIO", activity.getIntent().getParcelableExtra("PORTFOLIO"));
                    bundle.putBoolean("CALL_FROM_PORTFOLIO", activity.getIntent().getBooleanExtra("CALL_FROM_PORTFOLIO", false));
                    bundle.putString("STOCK_NAME", text);
                    bundle.putString("PORTFOLIO_ID", str);
                    intent.putExtras(bundle);
                    oVar.requireActivity().startActivityForResult(intent, 10016);
                    return;
                }
                return;
            case 5:
                ((PortfolioOrdersViewModel) oVar.r()).f9918q.postValue(text);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f36063a) {
            case 0:
                PortfolioOrdersDto portfolioOrdersDto = (PortfolioOrdersDto) obj;
                boolean isEmpty = portfolioOrdersDto.getAllOrders().isEmpty();
                o oVar = this.f36064b;
                if (isEmpty) {
                    ((mm) oVar.q()).f5483t.setVisibility(0);
                    ((mm) oVar.q()).f5484u.setVisibility(8);
                    if (Intrinsics.a(((PortfolioOrdersViewModel) oVar.r()).f9923v.getDisplayName(), "All Orders")) {
                        ((mm) oVar.q()).f5486w.setVisibility(8);
                    }
                } else {
                    ((mm) oVar.q()).f5483t.setVisibility(8);
                    ((mm) oVar.q()).f5484u.setVisibility(0);
                    ((mm) oVar.q()).f5486w.setVisibility(0);
                    int i10 = ((PortfolioOrdersViewModel) oVar.r()).f9925x;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                k kVar = oVar.f36068g;
                                if (kVar != null) {
                                    kVar.u(portfolioOrdersDto.getSold());
                                } else {
                                    Intrinsics.k("portfolioStockOrderAdapter");
                                    throw null;
                                }
                            }
                        } else {
                            k kVar2 = oVar.f36068g;
                            if (kVar2 != null) {
                                kVar2.u(portfolioOrdersDto.getBought());
                            } else {
                                Intrinsics.k("portfolioStockOrderAdapter");
                                throw null;
                            }
                        }
                    } else {
                        k kVar3 = oVar.f36068g;
                        if (kVar3 != null) {
                            kVar3.u(portfolioOrdersDto.getAllOrders());
                        } else {
                            Intrinsics.k("portfolioStockOrderAdapter");
                            throw null;
                        }
                    }
                }
                return Unit.f23355a;
            case 1:
                a((Boolean) obj);
                return Unit.f23355a;
            case 2:
                d((String) obj);
                return Unit.f23355a;
            case 3:
                d((String) obj);
                return Unit.f23355a;
            case 4:
                a((Boolean) obj);
                return Unit.f23355a;
            case 5:
                d((String) obj);
                return Unit.f23355a;
            default:
                d((String) obj);
                return Unit.f23355a;
        }
    }
}
