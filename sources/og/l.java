package og;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ba.km;
import com.assetgro.stockgro.data.model.ShowInfoData;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioHoldingsViewModel;
import kotlin.jvm.internal.Intrinsics;
import lf.i0;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30057a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f30058b;

    public /* synthetic */ l(o oVar, int i10) {
        this.f30057a = i10;
        this.f30058b = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12 = this.f30057a;
        o this$0 = this.f30058b;
        switch (i12) {
            case 0:
                int i13 = o.f30062j;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((PortfolioHoldingsViewModel) this$0.r()).f9842v = !((PortfolioHoldingsViewModel) this$0.r()).f9842v;
                ImageView imageView = ((km) this$0.q()).C.f4525t;
                if (((PortfolioHoldingsViewModel) this$0.r()).f9842v) {
                    i10 = R.drawable.ic_chart;
                } else {
                    i10 = R.drawable.ic_list;
                }
                imageView.setImageResource(i10);
                LinearLayout linearLayout = ((km) this$0.q()).C.f4528w;
                int i14 = 8;
                if (((PortfolioHoldingsViewModel) this$0.r()).f9842v) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                linearLayout.setVisibility(i11);
                LinearLayout linearLayout2 = ((km) this$0.q()).C.f4527v;
                if (!((PortfolioHoldingsViewModel) this$0.r()).f9842v) {
                    i14 = 0;
                }
                linearLayout2.setVisibility(i14);
                return;
            case 1:
                int i15 = o.f30062j;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Bundle bundle = new Bundle();
                qg.c cVar = new qg.c();
                cVar.setArguments(bundle);
                cVar.show(this$0.getChildFragmentManager(), "HoldingsSortBottomSheetDialogFragment");
                return;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i16 = i0.f24733j;
                kq.e.L(new ShowInfoData(this$0.getString(R.string.what_is_modeled_data_question), this$0.getString(R.string.what_is_modeled_data_answer), this$0.getString(R.string.modeled_data_button), R.drawable.ic_modeled_data, 0, false, 48, null)).show(this$0.getChildFragmentManager(), "ShowInfoDataBottomSheetFragment");
                return;
        }
    }
}
