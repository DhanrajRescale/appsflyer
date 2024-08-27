package d7;

import android.view.View;
import com.assetgro.stockgro.data.model.FileMetaData;
import com.assetgro.stockgro.ui.helpcenter.StockGroHelpCenterActivity;
import com.assetgro.stockgro.ui.helpcenter.StockGroHelpViewModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14094c;

    public /* synthetic */ n(int i10, int i11, Object obj) {
        this.f14092a = i11;
        this.f14094c = obj;
        this.f14093b = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11 = this.f14092a;
        int i12 = this.f14093b;
        Object obj = this.f14094c;
        switch (i11) {
            case 0:
                o oVar = (o) obj;
                int i13 = oVar.f14097f;
                x xVar = oVar.f14098g;
                if (i12 != i13) {
                    xVar.setPlaybackSpeed(oVar.f14096e[i12]);
                }
                xVar.f14146k.dismiss();
                return;
            default:
                StockGroHelpCenterActivity this$0 = (StockGroHelpCenterActivity) obj;
                int i14 = StockGroHelpCenterActivity.f9532l;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                StockGroHelpViewModel stockGroHelpViewModel = (StockGroHelpViewModel) this$0.x();
                ArrayList arrayList = stockGroHelpViewModel.f9538r;
                Integer size = ((FileMetaData) arrayList.get(i12)).getSize();
                if (size != null) {
                    i10 = size.intValue();
                } else {
                    i10 = 0;
                }
                arrayList.remove(i12);
                int i15 = stockGroHelpViewModel.f9535o - 1;
                stockGroHelpViewModel.f9535o = i15;
                stockGroHelpViewModel.f9537q -= i10;
                stockGroHelpViewModel.f9542v.postValue(Integer.valueOf(i15));
                return;
        }
    }
}
