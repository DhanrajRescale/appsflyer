package oi;

import android.content.Intent;
import com.assetgro.stockgro.data.model.StockDto;
import com.assetgro.stockgro.ui.stock.modify.StockModifyHostActivity;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class a extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StockModifyHostActivity f30095b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(StockModifyHostActivity stockModifyHostActivity, int i10) {
        super(1);
        this.f30094a = i10;
        this.f30095b = stockModifyHostActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f30094a;
        StockModifyHostActivity stockModifyHostActivity = this.f30095b;
        switch (i10) {
            case 0:
                Intent intent = new Intent();
                intent.putExtra("STOCK", (StockDto) obj);
                Unit unit = Unit.f23355a;
                stockModifyHostActivity.setResult(-1, intent);
                stockModifyHostActivity.finish();
                return Unit.f23355a;
            default:
                Intent intent2 = new Intent();
                Unit unit2 = Unit.f23355a;
                stockModifyHostActivity.setResult(-1, intent2);
                stockModifyHostActivity.finish();
                return Unit.f23355a;
        }
    }
}
