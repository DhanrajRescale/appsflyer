package lg;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.j0;
import ba.im;
import com.assetgro.stockgro.data.model.portfolio.PortfolioHistoryDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.history.PortfolioHistoryViewModel;
import com.assetgro.stockgro.ui.stock.detail.StockDetailHostActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f24838b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i10) {
        super(1);
        this.f24837a = i10;
        this.f24838b = kVar;
    }

    public final void a(Boolean bool) {
        int i10 = this.f24837a;
        k kVar = this.f24838b;
        switch (i10) {
            case 1:
                if (Intrinsics.a(bool, Boolean.TRUE)) {
                    ((im) kVar.q()).f5064x.setRefreshing(true);
                    return;
                } else {
                    if (Intrinsics.a(bool, Boolean.FALSE)) {
                        ((im) kVar.q()).f5064x.setRefreshing(false);
                        return;
                    }
                    return;
                }
            default:
                ((PortfolioHistoryViewModel) kVar.r()).h(((PortfolioHistoryViewModel) kVar.r()).f9824t);
                return;
        }
    }

    public final void d(String text) {
        int i10 = this.f24837a;
        String str = null;
        k kVar = this.f24838b;
        switch (i10) {
            case 2:
                Context context = kVar.requireContext();
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
                Intrinsics.checkNotNullParameter(text, "stockIdentifier");
                Bundle arguments = kVar.getArguments();
                if (arguments != null) {
                    str = arguments.getString("PORTFOLIO_ID");
                }
                j0 activity = kVar.getActivity();
                if (activity != null) {
                    Intent intent = new Intent(activity, (Class<?>) StockDetailHostActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("ADD_TO_PORTFOLIO", activity.getIntent().getBooleanExtra("ADD_TO_PORTFOLIO", false));
                    bundle.putParcelable("PORTFOLIO", activity.getIntent().getParcelableExtra("PORTFOLIO"));
                    bundle.putBoolean("CALL_FROM_PORTFOLIO", activity.getIntent().getBooleanExtra("CALL_FROM_PORTFOLIO", false));
                    bundle.putString("STOCK_NAME", text);
                    bundle.putString("PORTFOLIO_ID", str);
                    intent.putExtras(bundle);
                    kVar.requireActivity().startActivityForResult(intent, 10016);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f24837a) {
            case 0:
                PortfolioHistoryDto portfolioHistoryDto = (PortfolioHistoryDto) obj;
                boolean isEmpty = portfolioHistoryDto.getAllOrders().isEmpty();
                k kVar = this.f24838b;
                if (isEmpty) {
                    ((im) kVar.q()).f5061u.setVisibility(0);
                    ((im) kVar.q()).f5060t.setVisibility(8);
                } else {
                    ((im) kVar.q()).f5061u.setVisibility(8);
                    ((im) kVar.q()).f5060t.setVisibility(0);
                    int i10 = ((PortfolioHistoryViewModel) kVar.r()).f9822r;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    h hVar = kVar.f24840g;
                                    if (hVar != null) {
                                        hVar.u(portfolioHistoryDto.getCancelled());
                                    } else {
                                        Intrinsics.k("portfolioStockHistoryAdapter");
                                        throw null;
                                    }
                                }
                            } else {
                                h hVar2 = kVar.f24840g;
                                if (hVar2 != null) {
                                    hVar2.u(portfolioHistoryDto.getSold());
                                } else {
                                    Intrinsics.k("portfolioStockHistoryAdapter");
                                    throw null;
                                }
                            }
                        } else {
                            h hVar3 = kVar.f24840g;
                            if (hVar3 != null) {
                                hVar3.u(portfolioHistoryDto.getBought());
                            } else {
                                Intrinsics.k("portfolioStockHistoryAdapter");
                                throw null;
                            }
                        }
                    } else {
                        h hVar4 = kVar.f24840g;
                        if (hVar4 != null) {
                            hVar4.u(portfolioHistoryDto.getAllOrders());
                        } else {
                            Intrinsics.k("portfolioStockHistoryAdapter");
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
                a((Boolean) obj);
                return Unit.f23355a;
            default:
                d((String) obj);
                return Unit.f23355a;
        }
    }
}
