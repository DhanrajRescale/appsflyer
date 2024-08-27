package af;

import android.content.Intent;
import ba.c4;
import com.assetgro.stockgro.data.model.StockGyanGroup;
import com.assetgro.stockgro.ui.drawer.stockgyan.StockGyanGroupsActivity;
import com.assetgro.stockgro.ui.drawer.stockgyan.StockGyanIndexActivity;
import iu.k;
import java.util.List;
import kj.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f396a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockGyanGroupsActivity f397b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(StockGyanGroupsActivity stockGyanGroupsActivity, int i10) {
        super(1);
        this.f396a = i10;
        this.f397b = stockGyanGroupsActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f396a;
        StockGyanGroupsActivity stockGyanGroupsActivity = this.f397b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                c4 c4Var = (c4) stockGyanGroupsActivity.w();
                Intrinsics.c(bool);
                c4Var.f4337t.setRefreshing(bool.booleanValue());
                return Unit.f23355a;
            case 1:
                List list = (List) obj;
                bf.a aVar = stockGyanGroupsActivity.f9500k;
                if (aVar != null) {
                    aVar.u(list);
                    return Unit.f23355a;
                }
                Intrinsics.k("stockGyanGroupsAdapter");
                throw null;
            case 2:
                Boolean bool2 = (Boolean) ((j) obj).a();
                if (bool2 != null && bool2.booleanValue()) {
                    int i11 = StockGyanGroupsActivity.f9499l;
                    stockGyanGroupsActivity.K();
                }
                return Unit.f23355a;
            default:
                StockGyanGroup it = (StockGyanGroup) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Intent intent = new Intent(stockGyanGroupsActivity, (Class<?>) StockGyanIndexActivity.class);
                intent.putExtra("STOCK_GYAN_GROUP", it);
                stockGyanGroupsActivity.startActivity(intent);
                return Unit.f23355a;
        }
    }
}
