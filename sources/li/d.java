package li;

import android.content.Intent;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.maintenance.MaintenanceWindowActivity;
import com.assetgro.stockgro.ui.stock.detail.StockDetailHostActivity;
import iu.k;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockDetailHostActivity f24860b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(StockDetailHostActivity stockDetailHostActivity, int i10) {
        super(1);
        this.f24859a = i10;
        this.f24860b = stockDetailHostActivity;
    }

    public final void a(j jVar) {
        int i10 = this.f24859a;
        StockDetailHostActivity stockDetailHostActivity = this.f24860b;
        switch (i10) {
            case 2:
                stockDetailHostActivity.finish();
                return;
            default:
                Boolean bool = (Boolean) jVar.a();
                if (bool != null && bool.booleanValue()) {
                    int i11 = StockDetailHostActivity.f10190l;
                    stockDetailHostActivity.getClass();
                    Intent intent = new Intent(stockDetailHostActivity, (Class<?>) MaintenanceWindowActivity.class);
                    intent.putExtra("DATA", qf.b.f31938m);
                    intent.putExtra("SHOW_TOOLBAR", true);
                    intent.putExtra("TOOLBAR_TITLE", stockDetailHostActivity.getString(R.string.text_market));
                    stockDetailHostActivity.startActivity(intent);
                    stockDetailHostActivity.finish();
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f24859a;
        StockDetailHostActivity stockDetailHostActivity = this.f24860b;
        switch (i10) {
            case 0:
                Intent intent = new Intent();
                intent.putExtra("STOCK", (StockDto) obj);
                Unit unit = Unit.f23355a;
                stockDetailHostActivity.setResult(-1, intent);
                stockDetailHostActivity.finish();
                return Unit.f23355a;
            case 1:
                Intent intent2 = new Intent();
                Unit unit2 = Unit.f23355a;
                stockDetailHostActivity.setResult(-1, intent2);
                stockDetailHostActivity.finish();
                return Unit.f23355a;
            case 2:
                a((j) obj);
                return Unit.f23355a;
            default:
                a((j) obj);
                return Unit.f23355a;
        }
    }
}
