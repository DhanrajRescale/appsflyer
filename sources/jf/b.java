package jf;

import android.widget.TextView;
import androidx.fragment.app.d1;
import ba.a4;
import com.assetgro.stockgro.data.model.CardInteraction;
import com.assetgro.stockgro.data.model.StockGyanCard;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.home.stockgyan.gyan.StockGyanActivity;
import com.assetgro.stockgro.ui.home.stockgyan.gyan.StockGyanViewModel;
import iu.k;
import java.util.HashMap;
import java.util.List;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vt.p0;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockGyanActivity f21343b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(StockGyanActivity stockGyanActivity, int i10) {
        super(1);
        this.f21342a = i10;
        this.f21343b = stockGyanActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f21342a;
        StockGyanActivity stockGyanActivity = this.f21343b;
        switch (i10) {
            case 0:
                CardInteraction cardInteraction = (CardInteraction) obj;
                List list = (List) ((StockGyanViewModel) stockGyanActivity.x()).f9569p.getValue();
                if (list != null && ((StockGyanCard) list.get(((a4) stockGyanActivity.w()).f4165w.getCurrentItem())).getId().equals(cardInteraction.getCardId())) {
                    Integer totalLikes = cardInteraction.getTotalLikes();
                    if (totalLikes != null) {
                        ((a4) stockGyanActivity.w()).f4166x.setText(String.valueOf(totalLikes.intValue()));
                    }
                    if (cardInteraction.isLiked()) {
                        ((a4) stockGyanActivity.w()).f4161s.setImageResource(R.drawable.ic_like);
                    } else {
                        ((a4) stockGyanActivity.w()).f4161s.setImageResource(R.drawable.ic_like_unselected);
                    }
                }
                return Unit.f23355a;
            case 1:
                List list2 = (List) obj;
                ((a4) stockGyanActivity.w()).f4162t.setVisibility(0);
                d1 supportFragmentManager = stockGyanActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                Intrinsics.c(list2);
                stockGyanActivity.f9566k = new e(supportFragmentManager, list2);
                a4 a4Var = (a4) stockGyanActivity.w();
                e eVar = stockGyanActivity.f9566k;
                if (eVar != null) {
                    a4Var.f4165w.setAdapter(eVar);
                    a4 a4Var2 = (a4) stockGyanActivity.w();
                    a4Var2.f4164v.setViewPager(((a4) stockGyanActivity.w()).f4165w);
                    if (list2.size() > 0) {
                        StockGyanCard stockGyanCard = (StockGyanCard) list2.get(0);
                        HashMap hashMap = ((StockGyanViewModel) stockGyanActivity.x()).f9570q;
                        Intrinsics.c(stockGyanCard);
                        if (hashMap.containsKey(stockGyanCard.getId())) {
                            CardInteraction cardInteraction2 = (CardInteraction) p0.e(stockGyanCard.getId(), ((StockGyanViewModel) stockGyanActivity.x()).f9570q);
                            Integer totalLikes2 = cardInteraction2.getTotalLikes();
                            if (totalLikes2 != null) {
                                int intValue = totalLikes2.intValue();
                                if (intValue > 0) {
                                    a4 a4Var3 = (a4) stockGyanActivity.w();
                                    String valueOf = String.valueOf(intValue);
                                    TextView textView = a4Var3.f4166x;
                                    textView.setText(valueOf);
                                    textView.setVisibility(0);
                                } else {
                                    ((a4) stockGyanActivity.w()).f4166x.setVisibility(8);
                                }
                            }
                            if (cardInteraction2.isLiked()) {
                                ((a4) stockGyanActivity.w()).f4161s.setImageResource(R.drawable.ic_like);
                            } else {
                                ((a4) stockGyanActivity.w()).f4161s.setImageResource(R.drawable.ic_like_unselected);
                            }
                        }
                    }
                    return Unit.f23355a;
                }
                Intrinsics.k("stockGyanAdapter");
                throw null;
            default:
                Boolean bool = (Boolean) ((j) obj).a();
                if (bool != null && bool.booleanValue()) {
                    int i11 = StockGyanActivity.f9565l;
                    stockGyanActivity.K();
                }
                return Unit.f23355a;
        }
    }
}
